package com.clearspring.analytics.stream.membership;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.clearspring.analytics.stream.membership.BitSetSerializer;
import com.clearspring.analytics.stream.membership.BloomFilter;
import com.clearspring.analytics.stream.membership.BloomFilterSerializer;
import com.clearspring.analytics.stream.membership.DataOutputBuffer;
import com.clearspring.analytics.stream.membership.Filter;
import com.clearspring.analytics.stream.membership.ICompactSerializer;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.BitSet;

@RunWith(PowerMockRunner.class)
public class BloomFilterTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilterSerializer.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNotNullOutputNotNull3()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final BloomFilterSerializer bloomFilterSerializer = new BloomFilterSerializer();
    final DataInputStream dis = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_828);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 3);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dis, "in", byteArrayInputStream);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = bloomFilterSerializer.deserialize(dis);

    // Assert side effects
    Assert.assertNotNull(dis);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilterSerializer.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNotNullOutputNotNull()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final BloomFilterSerializer bloomFilterSerializer = new BloomFilterSerializer();
    final DataInputStream dis = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 6);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dis, "in", byteArrayInputStream);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(bitSet).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = bloomFilterSerializer.deserialize(dis);

    // Assert side effects
    Assert.assertNotNull(dis);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeInputNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;

    // Act
    final Filter actual = bloomFilter.merge(null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeInput1OutputNotNull() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final BloomFilter bloomFilter1 = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet1 = new BitSet();
    bitSet1.set(0);
    Reflector.setField(bloomFilter1, "filter_", bitSet1);
    bloomFilter1.hashCount = 0;
    final Filter[] filters = {bloomFilter1};

    // Act
    final Filter actual = bloomFilter.merge(filters);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeInput1OutputIllegalArgumentException2() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final Filter[] filters = {null};

    // Act
    thrown.expect(IllegalArgumentException.class);
    bloomFilter.merge(filters);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeInput1OutputIllegalArgumentException() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final BloomFilter bloomFilter1 = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet1 = new BitSet();
    bitSet1.set(0);
    Reflector.setField(bloomFilter1, "filter_", bitSet1);
    bloomFilter1.hashCount = -2_147_483_648;
    final Filter[] filters = {bloomFilter1};

    // Act
    thrown.expect(IllegalArgumentException.class);
    bloomFilter.merge(filters);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeInput0OutputNotNull() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final Filter[] filters = {};

    // Act
    final Filter actual = bloomFilter.merge(filters);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilterSerializer.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNotNullOutputNotNull6()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final BloomFilterSerializer bloomFilterSerializer = new BloomFilterSerializer();
    final DataInputStream dis = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 18);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 14);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dis, "in", byteArrayInputStream);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = bloomFilterSerializer.deserialize(dis);

    // Assert side effects
    Assert.assertNotNull(dis);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilterSerializer.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNotNullOutputNotNull5()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final BloomFilterSerializer bloomFilterSerializer = new BloomFilterSerializer();
    final DataInputStream dis = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 8192);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)1, (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dis, "in", byteArrayInputStream);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = bloomFilterSerializer.deserialize(dis);

    // Assert side effects
    Assert.assertNotNull(dis);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilterSerializer.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNotNullOutputNotNull4()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final BloomFilterSerializer bloomFilterSerializer = new BloomFilterSerializer();
    final DataInputStream dis = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_828);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 3);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dis, "in", byteArrayInputStream);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = bloomFilterSerializer.deserialize(dis);

    // Assert side effects
    Assert.assertNotNull(dis);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroNotNullOutputNotNull() {

    // Arrange
    final BitSet filter = new BitSet(0);

    // Act, creating object to test constructor
    final BloomFilter actual = new BloomFilter(0, filter);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilterSerializer.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNotNullOutputNotNull000999e07335f357e40()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final BloomFilterSerializer bloomFilterSerializer = new BloomFilterSerializer();
    final DataInputStream dis = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 7);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 3);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dis, "in", byteArrayInputStream);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = bloomFilterSerializer.deserialize(dis);

    // Assert side effects
    Assert.assertNotNull(dis);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilter.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInput30OutputNotNull00080f9d8191e330ec3() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilter.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInput30OutputNotNull() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final BitSet bitSet = new BitSet();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(bitSet).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilter.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInput20OutputNotNull() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilter.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInput10OutputNotNull() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)2, (byte)2, (byte)2, (byte)0, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(bitSet).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(33_686_016, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @Test
  public void alwaysMatchingBloomFilterOutputNotNull() {

    // Act
    final BloomFilter actual = BloomFilter.alwaysMatchingBloomFilter();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilter.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInput9OutputNotNull() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)2, (byte)2, (byte)2, (byte)0, (byte)1,
                          (byte)1, (byte)1, (byte)1, (byte)1};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(bitSet).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(33_686_016, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilter.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInput7OutputNotNull() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final BitSet bitSet = new BitSet();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(bitSet).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomFilter.class, ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInput5OutputNotNull() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getHashCount());
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.clearspring.analytics.stream.membership.BloomFilter");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addAllInputNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(5);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final BloomFilter other = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet1 = new BitSet();
    Reflector.setField(other, "filter_", bitSet1);
    other.hashCount = 1;

    // Act
    bloomFilter.addAll(other);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addAllInputNotNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final BloomFilter other = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet1 = new BitSet();
    Reflector.setField(other, "filter_", bitSet1);
    other.hashCount = 1;

    // Act
    bloomFilter.addAll(other);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addAllInputNotNullOutputVoid5() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final BloomFilter other = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet1 = new BitSet();
    Reflector.setField(other, "filter_", bitSet1);
    other.hashCount = 0;

    // Act
    bloomFilter.addAll(other);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addAllInputNotNullOutputIllegalArgumentException0010c6af22b6b2af515()
      throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final BloomFilter other = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet1 = new BitSet();
    Reflector.setField(other, "filter_", bitSet1);
    other.hashCount = 0;

    // Act
    thrown.expect(IllegalArgumentException.class);
    bloomFilter.addAll(other);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void serializerOutputNotNull() {

    // Act
    final ICompactSerializer<BloomFilter> actual = BloomFilter.serializer();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, BloomFilter.class, DataOutputBuffer.class,
                   DataOutputStream.class, BitSetSerializer.class})
  @Test
  public void
  serializeInputNotNullOutput000053f9f10f0856c0a7() throws Exception, InvocationTargetException {

    // Arrange
    final BloomFilter filter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    Reflector.setField(filter, "filter_", null);
    filter.hashCount = 0;
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);
    final DataOutputBuffer dataOutputBuffer = PowerMockito.mock(DataOutputBuffer.class);
    final byte[] myByteArray = {};
    PowerMockito.when(dataOutputBuffer.getData()).thenReturn(myByteArray);
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 0);
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray1);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    PowerMockito.whenNew(DataOutputBuffer.class).withNoArguments().thenReturn(dataOutputBuffer);

    // Act
    final byte[] actual = BloomFilter.serialize(filter);

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void addAllInputNotNullOutputVoid000845cb3cbafa36a07() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final BloomFilter other = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet1 = new BitSet();
    Reflector.setField(other, "filter_", bitSet1);
    other.hashCount = 0;

    // Act
    bloomFilter.addAll(other);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addAllInputNotNullOutputVoid00131c6c5364b832937() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final BloomFilter other = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet1 = new BitSet();
    Reflector.setField(other, "filter_", bitSet1);
    other.hashCount = 1;

    // Act
    bloomFilter.addAll(other);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, Throwable.class})
  @Test
  public void deserializeInput0OutputNull001bac817d2f59551e0() throws Exception {

    // Arrange
    final byte[] bytes = {};
    final EOFException eOFException = PowerMockito.mock(EOFException.class);
    Reflector.setField(eOFException, "cause", eOFException);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.whenNew(EOFException.class).withNoArguments().thenReturn(eOFException);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, Throwable.class})
  @Test
  public void deserializeInput0OutputNull2() throws Exception {

    // Arrange
    final byte[] bytes = {};
    final EOFException eOFException = PowerMockito.mock(EOFException.class);
    Reflector.setField(eOFException, "cause", eOFException);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.whenNew(EOFException.class).withNoArguments().thenReturn(eOFException);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, Throwable.class})
  @Test
  public void deserializeInput2OutputNull() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0};
    final EOFException eOFException = PowerMockito.mock(EOFException.class);
    Reflector.setField(eOFException, "cause", eOFException);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.whenNew(EOFException.class).withNoArguments().thenReturn(eOFException);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, Throwable.class})
  @Test
  public void deserializeInput2OutputNull2() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)1};
    final EOFException eOFException = PowerMockito.mock(EOFException.class);
    Reflector.setField(eOFException, "cause", eOFException);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.whenNew(EOFException.class).withNoArguments().thenReturn(eOFException);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, Throwable.class})
  @Test
  public void deserializeInput2OutputNull3() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)2, (byte)-128};
    final EOFException eOFException = PowerMockito.mock(EOFException.class);
    Reflector.setField(eOFException, "cause", eOFException);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.whenNew(EOFException.class).withNoArguments().thenReturn(eOFException);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, Throwable.class})
  @Test
  public void deserializeInput2OutputNull001722207efcb4bb7a6() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)-1, (byte)-1};
    final EOFException eOFException = PowerMockito.mock(EOFException.class);
    Reflector.setField(eOFException, "cause", eOFException);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.whenNew(EOFException.class).withNoArguments().thenReturn(eOFException);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, Throwable.class})
  @Test
  public void deserializeInput3OutputNull() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)-1, (byte)0, (byte)1};
    final EOFException eOFException = PowerMockito.mock(EOFException.class);
    Reflector.setField(eOFException, "cause", eOFException);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.whenNew(EOFException.class).withNoArguments().thenReturn(eOFException);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, Throwable.class})
  @Test
  public void deserializeInput3OutputNull2() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)-1, (byte)-1, (byte)0};
    final EOFException eOFException = PowerMockito.mock(EOFException.class);
    Reflector.setField(eOFException, "cause", eOFException);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.whenNew(EOFException.class).withNoArguments().thenReturn(eOFException);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, Throwable.class})
  @Test
  public void deserializeInput3OutputNull3() throws Exception {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0};
    final EOFException eOFException = PowerMockito.mock(EOFException.class);
    Reflector.setField(eOFException, "cause", eOFException);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.whenNew(EOFException.class).withNoArguments().thenReturn(eOFException);

    // Act
    final BloomFilter actual = BloomFilter.deserialize(bytes);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void addAllInputNotNullOutputIllegalArgumentException000978586563c5b19ed()
      throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    Reflector.setField(bloomFilter, "filter_", null);
    bloomFilter.hashCount = 1;
    final BloomFilter other = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    Reflector.setField(other, "filter_", null);
    other.hashCount = 0;

    // Act
    thrown.expect(IllegalArgumentException.class);
    bloomFilter.addAll(other);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputTrue2() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final String key = "\u7909\uc22a\u0c79\u00e2\u0000";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputFalse6() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(1);
    bitSet.set(7);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 15;
    final String key = "\u31ab\u55be\ub122\u45c0\u0b22\u31ac\u1516";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void addInputNotNullOutputVoid6() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(9);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final String key = "\u5edf\u7b3f\u007f\ua240\u8c68\uc9a5\uaca8";

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void addInputNotNullOutputVoid5() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final String key =
        "\ua674\ua4d4\u2070\u80ef\u10d7\u81d1\u4f3d\ua877\u9c4d\u0000\u0000\u0000\u0000\u978b\u487d";

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void addInputNotNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(1);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final String key = "\u4cfb\u9590\u8053\uabc3\u3bde\u47b6\ud5c3";

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void addInputNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final String key = "\u2489";

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void addInputNotNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final String key = "\u8464";

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void addInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final String key = "\ua01b\u8c14\u6001";

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputTrue4() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final String key = "\u18d6\u0111";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputTrue3() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final String key = "\ubab6\u9067\ua53e\u55ff\u64a1\ua4f2\u8242\u4afa\uadb4\ubc18\u92b0";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void addInputNotNullOutputVoid7() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final String key = "\uc96b";

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputTrue() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final String key = "\u0097\u5b07";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputFalse8() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(1);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 2;
    final String key = "\u0f1a\u27f2";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void addInputNotNullOutputVoid8() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(1);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final String key = "\u2792\ud500";

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputFalse7() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final String key = "\u5ffa\u7efe";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputFalse() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 3;
    final String key = "\u67b0\u8e5a\u1302";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputFalse2() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(1);
    bitSet.set(2);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 3;
    final String key = "\u4fdd\u7894";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputFalse3() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 7;
    final String key = "\u2d86";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputFalse4() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 7;
    final String key = "\uc230\ud083\u7f02\uc14e\u138f\u1cfe\u5e3a";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isPresentInputNotNullOutputFalse5() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(1);
    bitSet.set(9);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 2;
    final String key = "\ud63d\u464c\u1e2b\ua82c\u4164\u30ec\u0f00";

    // Act
    final boolean actual = bloomFilter.isPresent(key);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput9OutputFalse() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(1);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 2;
    final byte[] key = {(byte)-65,  (byte)-10, (byte)-123, (byte)-69, (byte)74,
                        (byte)-102, (byte)-65, (byte)81,   (byte)-17};

    // Act and Assert result
    Assert.assertFalse(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput0OutputVoid2() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 3;
    final byte[] key = {};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput11OutputFalse2() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(1);
    bitSet.set(3);
    bitSet.set(5);
    bitSet.set(7);
    bitSet.set(9);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 2;
    final byte[] key = {(byte)-1,  (byte)106, (byte)-69, (byte)50,  (byte)-30, (byte)69,
                        (byte)-52, (byte)40,  (byte)122, (byte)-51, (byte)26};

    // Act and Assert result
    Assert.assertFalse(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput11OutputFalse() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(2);
    bitSet.set(6);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 12;
    final byte[] key = {(byte)57,  (byte)-30, (byte)115, (byte)-55,  (byte)54, (byte)49,
                        (byte)-47, (byte)80,  (byte)-50, (byte)-104, (byte)103};

    // Act and Assert result
    Assert.assertFalse(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput0OutputVoid3() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(1);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 2;
    final byte[] key = {};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput12OutputFalse() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 3;
    final byte[] key = {(byte)-80, (byte)-28, (byte)85,   (byte)68, (byte)59,  (byte)110,
                        (byte)-40, (byte)30,  (byte)-119, (byte)42, (byte)127, (byte)-10};

    // Act and Assert result
    Assert.assertFalse(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput4OutputFalse() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(2);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final byte[] key = {(byte)84, (byte)-67, (byte)73, (byte)64};

    // Act and Assert result
    Assert.assertFalse(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput18OutputTrue2() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final byte[] key = {(byte)105, (byte)30,  (byte)30,  (byte)-76, (byte)-74, (byte)-10,
                        (byte)-85, (byte)40,  (byte)61,  (byte)52,  (byte)48,  (byte)77,
                        (byte)-94, (byte)106, (byte)-47, (byte)5,   (byte)-70, (byte)99};

    // Act and Assert result
    Assert.assertTrue(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput3OutputVoid() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(4);
    bitSet.set(5);
    bitSet.set(10);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final byte[] key = {(byte)-79, (byte)81, (byte)82};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput4OutputVoid() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(2);
    bitSet.set(6);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final byte[] key = {(byte)-47, (byte)-6, (byte)61, (byte)-127};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput7OutputFalse() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(134_217_728);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final byte[] key = {(byte)77, (byte)3, (byte)-91, (byte)90, (byte)125, (byte)110, (byte)-107};

    // Act and Assert result
    Assert.assertFalse(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput7OutputVoid() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final byte[] key = {(byte)95, (byte)-87, (byte)25, (byte)-6, (byte)-37, (byte)3, (byte)122};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput7OutputTrue2() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(45_759);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final byte[] key = {(byte)-42, (byte)18, (byte)-6, (byte)-12, (byte)-77, (byte)-38, (byte)-34};

    // Act and Assert result
    Assert.assertTrue(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput8OutputFalse() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 1;
    final byte[] key = {(byte)68,  (byte)-39, (byte)-121, (byte)54,
                        (byte)-73, (byte)-30, (byte)4,    (byte)-82};

    // Act and Assert result
    Assert.assertFalse(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput0OutputTrue() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {};

    // Act and Assert result
    Assert.assertTrue(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput18OutputTrue() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(5);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {(byte)-109, (byte)-31,  (byte)-31, (byte)47,  (byte)-121, (byte)-32,
                        (byte)-55,  (byte)-106, (byte)95,  (byte)-76, (byte)-115, (byte)-11,
                        (byte)-36,  (byte)41,   (byte)-34, (byte)-98, (byte)-126, (byte)127};

    // Act and Assert result
    Assert.assertTrue(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput7OutputTrue() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(-2_013_265_889);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {(byte)77, (byte)3, (byte)-91, (byte)90, (byte)125, (byte)110, (byte)-107};

    // Act and Assert result
    Assert.assertTrue(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput6OutputTrue() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {(byte)-108, (byte)-28, (byte)-109, (byte)29, (byte)-14, (byte)91};

    // Act and Assert result
    Assert.assertTrue(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput4OutputTrue() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(2);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {(byte)84, (byte)-67, (byte)73, (byte)64};

    // Act and Assert result
    Assert.assertTrue(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPresentInput8OutputTrue() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {(byte)68,  (byte)-39, (byte)55, (byte)121,
                        (byte)-72, (byte)58,  (byte)40, (byte)-121};

    // Act and Assert result
    Assert.assertTrue(bloomFilter.isPresent(key));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput7OutputVoid2() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {(byte)84, (byte)43, (byte)79, (byte)-67, (byte)-32, (byte)-50, (byte)-91};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput0OutputVoid() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput10OutputVoid() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {(byte)-115, (byte)110, (byte)-128, (byte)-92, (byte)-43,
                        (byte)51,   (byte)-33, (byte)-59,  (byte)67,  (byte)91};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput19OutputVoid() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {(byte)39,  (byte)-31, (byte)-66, (byte)-34, (byte)110, (byte)-11, (byte)-16,
                        (byte)-68, (byte)38,  (byte)-37, (byte)85,  (byte)47,  (byte)-52, (byte)119,
                        (byte)96,  (byte)-89, (byte)101, (byte)21,  (byte)65};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInput2OutputVoid() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;
    final byte[] key = {(byte)-117, (byte)113};

    // Act
    bloomFilter.add(key);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void clearOutputVoid() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;

    // Act
    bloomFilter.clear();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void bucketsOutputZero() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;

    // Act and Assert result
    Assert.assertEquals(0, bloomFilter.buckets());
  }

  // Test written by Diffblue Cover.
  @Test
  public void emptyBucketsOutputZero000819097483759d3c0() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;

    // Act and Assert result
    Assert.assertEquals(0, bloomFilter.emptyBuckets());
  }

  // Test written by Diffblue Cover.
  @Test
  public void filterOutputNull() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    Reflector.setField(bloomFilter, "filter_", null);
    bloomFilter.hashCount = 0;

    // Act and Assert result
    Assert.assertNull(bloomFilter.filter());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    final BitSet bitSet = new BitSet();
    Reflector.setField(bloomFilter, "filter_", bitSet);
    bloomFilter.hashCount = 0;

    // Act and Assert result
    Assert.assertEquals("{}", bloomFilter.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void tserializerOutputNotNull() throws InvocationTargetException {

    // Arrange
    final BloomFilter bloomFilter = (BloomFilter)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.BloomFilter");
    Reflector.setField(bloomFilter, "filter_", null);
    bloomFilter.hashCount = 0;

    // Act
    final ICompactSerializer actual = bloomFilter.tserializer();

    // Assert result
    Assert.assertNotNull(actual);
  }
}
