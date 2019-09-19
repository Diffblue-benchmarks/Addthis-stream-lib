package com.clearspring.analytics.stream.cardinality;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.clearspring.analytics.stream.cardinality.AdaptiveCounting.Builder;
import com.clearspring.analytics.stream.cardinality.AdaptiveCounting;
import com.clearspring.analytics.stream.cardinality.CardinalityMergeException;
import com.clearspring.analytics.stream.cardinality.CountThenEstimate.CountThenEstimateMergeException;
import com.clearspring.analytics.stream.cardinality.CountThenEstimate;
import com.clearspring.analytics.stream.cardinality.ICardinality;
import com.clearspring.analytics.stream.cardinality.LinearCounting;
import com.clearspring.analytics.util.ExternalizableUtil;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

@RunWith(PowerMockRunner.class)
public class CountThenEstimateTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ExternalizableUtil.class, CountThenEstimate.class,
                   ObjectOutput.class})
  @Test
  public void
  getBytesOutput07() throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    final byte[] actual = countThenEstimate.getBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ExternalizableUtil.class, CountThenEstimate.class,
                   ObjectOutput.class})
  @Test
  public void
  getBytesOutput0000ccf75d49ad411010() throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 16);
    countThenEstimate.builder = builder;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1000;
    countThenEstimate.tipped = false;
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    final byte[] actual = countThenEstimate.getBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ExternalizableUtil.class, CountThenEstimate.class,
                   ObjectOutput.class})
  @Test
  public void
  getBytesOutput00001a90ce1f2b440138() throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    final byte[] actual = countThenEstimate.getBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ExternalizableUtil.class, CountThenEstimate.class,
                   ObjectOutput.class})
  @Test
  public void
  getBytesOutput00018ffedf0306c5322c() throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    final byte[] actual = countThenEstimate.getBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ExternalizableUtil.class, CountThenEstimate.class,
                   ObjectOutput.class})
  @Test
  public void
  getBytesOutput04() throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(null);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    final byte[] actual = countThenEstimate.getBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ExternalizableUtil.class, CountThenEstimate.class,
                   ObjectOutput.class})
  @Test
  public void
  getBytesOutput0002e8ed7ce27e4c3f50() throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(null);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    final byte[] actual = countThenEstimate.getBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ExternalizableUtil.class, CountThenEstimate.class,
                   ObjectOutput.class})
  @Test
  public void
  getBytesOutput06() throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(0);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    final byte[] actual = countThenEstimate.getBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void offerHashedInputZeroOutputUnsupportedOperationException000bec5535d6a1d5cb3()
      throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 16);
    countThenEstimate.builder = builder;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1000;
    countThenEstimate.tipped = false;
    final long hashedLong = 0L;

    // Act
    thrown.expect(UnsupportedOperationException.class);
    countThenEstimate.offerHashed(hashedLong);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void offerHashedInputZeroOutputUnsupportedOperationException0001cb68452ada48284()
      throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 16);
    countThenEstimate.builder = builder;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1000;
    countThenEstimate.tipped = false;
    final int hashedInt = 0;

    // Act
    thrown.expect(UnsupportedOperationException.class);
    countThenEstimate.offerHashed(hashedInt);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void sizeofOutputNegative0007d10df0052f4a86e() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 16);
    countThenEstimate.builder = builder;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1000;
    countThenEstimate.tipped = false;

    // Act
    final int actual = countThenEstimate.sizeof();

    // Assert result
    Assert.assertEquals(-1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull000555c93eac035383c() {

    // Act, creating object to test constructor
    final CountThenEstimate actual = new CountThenEstimate();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.builder);
    Assert.assertEquals(16, ((Builder)actual.builder).k);
    Assert.assertNull(actual.estimator);
    final HashSet<Object> hashSet = new HashSet<Object>();
    Assert.assertEquals(hashSet, actual.counter);
    Assert.assertEquals(1000, actual.tippingPoint);
    Assert.assertFalse(actual.tipped);
  }

  // Test written by Diffblue Cover.

  @Test
  public void offerInputZeroOutputTrue000604048df653e0d2d() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 16);
    countThenEstimate.builder = builder;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1000;
    countThenEstimate.tipped = false;
    final Object o = 0;

    // Act
    final boolean actual = countThenEstimate.offer(o);

    // Assert side effects
    final HashSet<Object> hashSet1 = new HashSet<Object>();
    hashSet1.add(0);
    Assert.assertEquals(hashSet1, countThenEstimate.counter);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void cardinalityOutputZero0005d05c4c75c6cf804() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 16);
    countThenEstimate.builder = builder;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1000;
    countThenEstimate.tipped = false;

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void tippedOutputFalse000f1fe7fec4227b85f() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 16);
    countThenEstimate.builder = builder;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1000;
    countThenEstimate.tipped = false;

    // Act
    final boolean actual = countThenEstimate.tipped();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void mergeEstimatorsInput3OutputNotNull0017a2573d7f3a56ae3()
      throws InvocationTargetException, CardinalityMergeException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 16);
    countThenEstimate.builder = builder;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1000;
    countThenEstimate.tipped = false;
    final CountThenEstimate countThenEstimate1 = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder1 = new Builder();
    Reflector.setField(builder1, "k", 16);
    countThenEstimate1.builder = builder1;
    countThenEstimate1.estimator = null;
    final HashSet<Object> hashSet1 = new HashSet<Object>();
    countThenEstimate1.counter = hashSet1;
    countThenEstimate1.tippingPoint = 1000;
    countThenEstimate1.tipped = false;
    final CountThenEstimate countThenEstimate2 = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder2 = new Builder();
    Reflector.setField(builder2, "k", 16);
    countThenEstimate2.builder = builder2;
    countThenEstimate2.estimator = null;
    final HashSet<Object> hashSet2 = new HashSet<Object>();
    countThenEstimate2.counter = hashSet2;
    countThenEstimate2.tippingPoint = 1000;
    countThenEstimate2.tipped = false;
    final CountThenEstimate[] estimators = {countThenEstimate, countThenEstimate1,
                                            countThenEstimate2};

    // Act
    final CountThenEstimate actual = CountThenEstimate.mergeEstimators(estimators);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.builder);
    Assert.assertEquals(16, ((Builder)actual.builder).k);
    Assert.assertNull(actual.estimator);
    final HashSet<Object> hashSet3 = new HashSet<Object>();
    Assert.assertEquals(hashSet3, actual.counter);
    Assert.assertEquals(1000, actual.tippingPoint);
    Assert.assertFalse(actual.tipped);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeInputNullOutputNotNull()
      throws CardinalityMergeException, InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    countThenEstimate.estimator = null;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;

    // Act
    final ICardinality actual = countThenEstimate.merge(null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(((CountThenEstimate)actual).builder);
    Assert.assertNull(((CountThenEstimate)actual).estimator);
    Assert.assertNull(((CountThenEstimate)actual).counter);
    Assert.assertEquals(0, ((CountThenEstimate)actual).tippingPoint);
    Assert.assertTrue(((CountThenEstimate)actual).tipped);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeInputNullOutputNotNull2()
      throws CardinalityMergeException, InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;

    // Act
    final ICardinality actual = countThenEstimate.merge(null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(((CountThenEstimate)actual).builder);
    Assert.assertNotNull(((CountThenEstimate)actual).estimator);
    Assert.assertEquals(0.0, ((AdaptiveCounting)((CountThenEstimate)actual).estimator).B_s, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)((CountThenEstimate)actual).estimator).b_e);
    Assert.assertNull(((AdaptiveCounting)((CountThenEstimate)actual).estimator).M);
    Assert.assertEquals(0, ((AdaptiveCounting)((CountThenEstimate)actual).estimator).Rsum);
    Assert.assertEquals(0.0, ((AdaptiveCounting)((CountThenEstimate)actual).estimator).Ca, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)((CountThenEstimate)actual).estimator).m);
    Assert.assertEquals(0, ((AdaptiveCounting)((CountThenEstimate)actual).estimator).k);
    Assert.assertNull(((CountThenEstimate)actual).counter);
    Assert.assertEquals(0, ((CountThenEstimate)actual).tippingPoint);
    Assert.assertTrue(((CountThenEstimate)actual).tipped);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final CountThenEstimate.CountThenEstimateMergeException actual =
        new CountThenEstimate.CountThenEstimateMergeException("foo");

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputZeroOutputUnsupportedOperationException() {

    // Arrange
    final CountThenEstimate countThenEstimate = new CountThenEstimate();

    // Act
    thrown.expect(UnsupportedOperationException.class);
    countThenEstimate.offerHashed(0L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputZeroOutputUnsupportedOperationException2() {

    // Arrange
    final CountThenEstimate countThenEstimate = new CountThenEstimate();

    // Act
    thrown.expect(UnsupportedOperationException.class);
    countThenEstimate.offerHashed(0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectInput.class, CountThenEstimate.class})
  @Test
  public void constructorInput0OutputIllegalArgumentException2()
      throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readBooleanMethod = DTUMemberMatcher.method(ObjectInput.class, "readBoolean");
    PowerMockito.doReturn(false).when(objectInputStream, readBooleanMethod).withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2_147_483_648))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 0);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(builder).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    final CountThenEstimate actual = new CountThenEstimate(bytes);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectInput.class, CountThenEstimate.class})
  @Test
  public void constructorInput0OutputIllegalArgumentException()
      throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readBooleanMethod = DTUMemberMatcher.method(ObjectInput.class, "readBoolean");
    PowerMockito.doReturn(false).when(objectInputStream, readBooleanMethod).withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2_147_483_648))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    final CountThenEstimate actual = new CountThenEstimate(bytes);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void offerInputNullOutputIllegalArgumentException() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 16_384);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)2};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 16_777_229);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = -2_147_483_644;
    countThenEstimate.tipped = false;
    final Object o = null;

    // Act
    thrown.expect(IllegalArgumentException.class);
    countThenEstimate.offer(o);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void offerInputPositiveOutputIllegalArgumentException() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 55_424);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)-128};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 319;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", -268_435_421);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final Object o = 2;

    // Act
    thrown.expect(IllegalArgumentException.class);
    countThenEstimate.offer(o);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void offerInputPositiveOutputIllegalArgumentException2() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 1_073_797_577);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)65,   (byte)0, (byte)-128, (byte)0,
                                (byte)-128, (byte)0, (byte)1,    (byte)0};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 192;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 66);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = -2_147_483_634;
    countThenEstimate.tipped = false;
    final Object o = 8;

    // Act
    thrown.expect(IllegalArgumentException.class);
    countThenEstimate.offer(o);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, Math.class})
  @Test
  public void cardinalityOutputZero4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 0);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 2;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = -2;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;
    PowerMockito.when(Math.pow(anyDouble(), anyDouble())).thenReturn(0.0);

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, Math.class})
  @Test
  public void cardinalityOutputZero5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 65_536;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = -0x1p+125 /* -4.25353e+37 */;
    adaptiveCounting.m = 131_072;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;
    PowerMockito.when(Math.round(anyDouble())).thenReturn(0L);
    PowerMockito.when(Math.log(anyDouble())).thenReturn(-0.0);

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid001f6be19cd4854eae5()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    countThenEstimate.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, Math.class})
  @Test
  public void cardinalityOutputZero7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 1;
    final byte[] myByteArray = {(byte)0};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 512;
    adaptiveCounting.Ca = -0x1p+185 /* -4.90399e+55 */;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;
    PowerMockito.when(Math.round(anyDouble())).thenReturn(0L);
    PowerMockito.when(Math.log(anyDouble())).thenReturn(0x1p-639 /* 4.38362e-193 */);

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, Math.class})
  @Test
  public void cardinalityOutputZero8() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = -64;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = -0x1p+185 /* -4.90399e+55 */;
    adaptiveCounting.m = 2;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;
    PowerMockito.when(Math.pow(anyDouble(), anyDouble())).thenReturn(0.0);

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, Math.class})
  @Test
  public void cardinalityOutputZero9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 0);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 1_619_235_781;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = -0x1p+185 /* -4.90399e+55 */;
    adaptiveCounting.m = 628_304_195;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;
    PowerMockito.when(Math.round(anyDouble())).thenReturn(0L);
    PowerMockito.when(Math.log(anyDouble())).thenReturn(-0x1.1b914d8367cp-22 /* -2.64093e-07 */);

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid2()
      throws IOException, Exception, InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    countThenEstimate.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid001ab3290bda80b9935()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(null);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    countThenEstimate.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, Math.class})
  @Test
  public void cardinalityOutputZero11() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 16_777_472;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;
    PowerMockito.when(Math.round(anyDouble())).thenReturn(0L);
    PowerMockito.when(Math.log(anyDouble())).thenReturn(0x1p-644 /* 1.36988e-194 */);

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void tippedOutputFalse() {

    // Arrange
    final CountThenEstimate countThenEstimate = new CountThenEstimate();

    // Act and Assert result
    Assert.assertFalse(countThenEstimate.tipped());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid3()
      throws IOException, Exception, InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(null);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    countThenEstimate.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectInput.class, CountThenEstimate.class})
  @Test
  public void constructorInput0OutputEOFException()
      throws Exception, EOFException, IOException, ClassNotFoundException {

    // Arrange
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readByteMethod = DTUMemberMatcher.method(ObjectInput.class, "readByte");
    PowerMockito.doReturn((byte)3).when(objectInputStream, readByteMethod).withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    PowerMockito.doReturn(3).when(objectInputStream, readIntMethod).withNoArguments();
    final Method readBooleanMethod = DTUMemberMatcher.method(ObjectInput.class, "readBoolean");
    PowerMockito.doReturn(true).when(objectInputStream, readBooleanMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    thrown.expect(EOFException.class);
    final CountThenEstimate actual = new CountThenEstimate(bytes);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid7()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(0);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    countThenEstimate.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid6()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(null);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    countThenEstimate.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectInput.class, CountThenEstimate.class})
  @Test
  public void constructorInput0OutputVoid() throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readByteMethod = DTUMemberMatcher.method(ObjectInput.class, "readByte");
    PowerMockito.doReturn((byte)1).when(objectInputStream, readByteMethod).withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    PowerMockito.doReturn(0).when(objectInputStream, readIntMethod).withNoArguments();
    final Method readBooleanMethod = DTUMemberMatcher.method(ObjectInput.class, "readBoolean");
    PowerMockito.doReturn(true).when(objectInputStream, readBooleanMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    final CountThenEstimate actual = new CountThenEstimate(bytes);

    // Assert side effects
    Assert.assertNotNull(actual.estimator);
    Assert.assertEquals(0, ((LinearCounting)actual.estimator).count);
    Assert.assertNotNull(((LinearCounting)actual.estimator).map);
    Assert.assertEquals(0, ((LinearCounting)actual.estimator).length);
    Assert.assertTrue(actual.tipped);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectInput.class, CountThenEstimate.class})
  @Test
  public void constructorInput1OutputIOException()
      throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final byte[] bytes = {(byte)0};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readByteMethod = DTUMemberMatcher.method(ObjectInput.class, "readByte");
    PowerMockito.doReturn((byte)9).when(objectInputStream, readByteMethod).withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    PowerMockito.doReturn(98_304).when(objectInputStream, readIntMethod).withNoArguments();
    final Method readBooleanMethod = DTUMemberMatcher.method(ObjectInput.class, "readBoolean");
    PowerMockito.doReturn(true).when(objectInputStream, readBooleanMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    thrown.expect(IOException.class);
    final CountThenEstimate actual = new CountThenEstimate(bytes);
  }

  // Test written by Diffblue Cover.
  @Test
  public void cardinalityOutputZero() {

    // Arrange
    final CountThenEstimate countThenEstimate = new CountThenEstimate();

    // Act and Assert result
    Assert.assertEquals(0L, countThenEstimate.cardinality());
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeofOutputNegative() {

    // Arrange
    final CountThenEstimate countThenEstimate = new CountThenEstimate();

    // Act and Assert result
    Assert.assertEquals(-1, countThenEstimate.sizeof());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid()
      throws ClassNotFoundException, IOException, Exception, InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    countThenEstimate.estimator = null;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    PowerMockito.doReturn(0).when(in, readIntMethod).withNoArguments();
    final Method readByteMethod = DTUMemberMatcher.method(ObjectInput.class, "readByte");
    PowerMockito.doReturn((byte)1).when(in, readByteMethod).withNoArguments();
    final Method readBooleanMethod = DTUMemberMatcher.method(ObjectInput.class, "readBoolean");
    PowerMockito.doReturn(true).when(in, readBooleanMethod).withNoArguments();

    // Act
    countThenEstimate.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(countThenEstimate.estimator);
    Assert.assertEquals(0, ((LinearCounting)countThenEstimate.estimator).count);
    Assert.assertNotNull(((LinearCounting)countThenEstimate.estimator).map);
    Assert.assertEquals(0, ((LinearCounting)countThenEstimate.estimator).length);
    Assert.assertTrue(countThenEstimate.tipped);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroNotNullOutputNotNull() {

    // Arrange
    final Builder builder = new Builder();

    // Act, creating object to test constructor
    final CountThenEstimate actual = new CountThenEstimate(0, builder);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.builder);
    Assert.assertEquals(16, ((Builder)actual.builder).k);
    Assert.assertNull(actual.estimator);
    final HashSet<Object> hashSet = new HashSet<Object>();
    Assert.assertEquals(hashSet, actual.counter);
    Assert.assertEquals(0, actual.tippingPoint);
    Assert.assertFalse(actual.tipped);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid8()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    countThenEstimate.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputTrue() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 55_424);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)-128};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 63;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", -268_435_421);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(2);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1;
    countThenEstimate.tipped = true;

    // Act and Assert result
    Assert.assertTrue(countThenEstimate.offer(2));

    // Assert side effects
    Assert.assertNotNull(countThenEstimate.estimator);
    Assert.assertEquals(0.0, ((AdaptiveCounting)countThenEstimate.estimator).B_s, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).b_e);
    Assert.assertArrayEquals(new byte[] {(byte)65},
                             ((AdaptiveCounting)countThenEstimate.estimator).M);
    Assert.assertEquals(256, ((AdaptiveCounting)countThenEstimate.estimator).Rsum);
    Assert.assertEquals(0.0, ((AdaptiveCounting)countThenEstimate.estimator).Ca, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).m);
    Assert.assertEquals(-268_435_421, ((AdaptiveCounting)countThenEstimate.estimator).k);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputIOException()
      throws ClassNotFoundException, IOException, Exception, InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    countThenEstimate.estimator = null;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    PowerMockito.doReturn(0).when(in, readIntMethod).withNoArguments();
    final Method readByteMethod = DTUMemberMatcher.method(ObjectInput.class, "readByte");
    PowerMockito.doReturn((byte)9).when(in, readByteMethod).withNoArguments();
    final Method readBooleanMethod = DTUMemberMatcher.method(ObjectInput.class, "readBoolean");
    PowerMockito.doReturn(true).when(in, readBooleanMethod).withNoArguments();
    try {

      // Act
      thrown.expect(IOException.class);
      countThenEstimate.readExternal(in);
    } catch (IOException ex) {

      // Assert side effects
      Assert.assertTrue(countThenEstimate.tipped);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputTrue3() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 0);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)2};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 16_777_229);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = -2_147_483_644;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertTrue(countThenEstimate.offer(9));

    // Assert side effects
    Assert.assertNull(countThenEstimate.builder);
    Assert.assertNotNull(countThenEstimate.estimator);
    Assert.assertEquals(0.051, ((AdaptiveCounting)countThenEstimate.estimator).B_s, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).b_e);
    Assert.assertArrayEquals(new byte[] {(byte)1},
                             ((AdaptiveCounting)countThenEstimate.estimator).M);
    Assert.assertEquals(1, ((AdaptiveCounting)countThenEstimate.estimator).Rsum);
    Assert.assertEquals(0.0, ((AdaptiveCounting)countThenEstimate.estimator).Ca, 0.0);
    Assert.assertEquals(1, ((AdaptiveCounting)countThenEstimate.estimator).m);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).k);
    Assert.assertNull(countThenEstimate.counter);
    Assert.assertTrue(countThenEstimate.tipped);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputTrue4() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)-127, (byte)0, (byte)-128, (byte)0,
                                (byte)-128, (byte)0, (byte)1,    (byte)0};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 66);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = -2_147_483_634;
    countThenEstimate.tipped = true;

    // Act and Assert result
    Assert.assertTrue(countThenEstimate.offer(7));

    // Assert side effects
    Assert.assertNotNull(countThenEstimate.estimator);
    Assert.assertEquals(0.0, ((AdaptiveCounting)countThenEstimate.estimator).B_s, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).b_e);
    Assert.assertArrayEquals(
        new byte[] {(byte)65, (byte)0, (byte)-128, (byte)0, (byte)-128, (byte)0, (byte)1, (byte)0},
        ((AdaptiveCounting)countThenEstimate.estimator).M);
    Assert.assertEquals(192, ((AdaptiveCounting)countThenEstimate.estimator).Rsum);
    Assert.assertEquals(0.0, ((AdaptiveCounting)countThenEstimate.estimator).Ca, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).m);
    Assert.assertEquals(66, ((AdaptiveCounting)countThenEstimate.estimator).k);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroOutputTrue3() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", -65_794);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)2};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 16_777_231);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(786_432);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = -2_147_483_644;
    countThenEstimate.tipped = true;

    // Act and Assert result
    Assert.assertTrue(countThenEstimate.offer(0));

    // Assert side effects
    Assert.assertNotNull(countThenEstimate.estimator);
    Assert.assertEquals(0.0, ((AdaptiveCounting)countThenEstimate.estimator).B_s, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).b_e);
    Assert.assertArrayEquals(new byte[] {(byte)65},
                             ((AdaptiveCounting)countThenEstimate.estimator).M);
    Assert.assertEquals(63, ((AdaptiveCounting)countThenEstimate.estimator).Rsum);
    Assert.assertEquals(0.0, ((AdaptiveCounting)countThenEstimate.estimator).Ca, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).m);
    Assert.assertEquals(16_777_231, ((AdaptiveCounting)countThenEstimate.estimator).k);
  }

  // Test written by Diffblue Cover.

  @Test
  public void offerInputPositiveOutputTrue6() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 0);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)65,   (byte)0, (byte)-128, (byte)0,
                                (byte)-128, (byte)0, (byte)1,    (byte)0};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 192;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 66);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;
    final Object o = 8;

    // Act
    final boolean actual = countThenEstimate.offer(o);

    // Assert side effects
    Assert.assertNull(countThenEstimate.builder);
    Assert.assertNotNull(countThenEstimate.estimator);
    Assert.assertEquals(0.051, ((AdaptiveCounting)countThenEstimate.estimator).B_s, 0.0);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).b_e);
    Assert.assertArrayEquals(new byte[] {(byte)1},
                             ((AdaptiveCounting)countThenEstimate.estimator).M);
    Assert.assertEquals(1, ((AdaptiveCounting)countThenEstimate.estimator).Rsum);
    Assert.assertEquals(0.0, ((AdaptiveCounting)countThenEstimate.estimator).Ca, 0.0);
    Assert.assertEquals(1, ((AdaptiveCounting)countThenEstimate.estimator).m);
    Assert.assertEquals(0, ((AdaptiveCounting)countThenEstimate.estimator).k);
    Assert.assertNull(countThenEstimate.counter);
    Assert.assertTrue(countThenEstimate.tipped);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, Math.class})
  @Test
  public void cardinalityOutputZero3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 0);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = -256;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = -2;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;
    PowerMockito.when(Math.round(anyDouble())).thenReturn(0L);
    PowerMockito.when(Math.log(anyDouble())).thenReturn(0.0);

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroOutputTrue() {

    // Arrange
    final CountThenEstimate countThenEstimate = new CountThenEstimate();

    // Act and Assert result
    Assert.assertTrue(countThenEstimate.offer(0));

    // Assert side effects
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(0);
    Assert.assertEquals(hashSet, countThenEstimate.counter);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid0006534b3449897e4e7() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.clearspring.analytics.stream.cardinality.CountThenEstimate");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CountThenEstimate.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid0003c5356654802fd85()
      throws IOException, Exception, InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    countThenEstimate.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeofOutputZero3() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;

    // Act and Assert result
    Assert.assertEquals(0, countThenEstimate.sizeof());
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeofOutputZero000d8b1dd7dc9bd8135() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;

    // Act and Assert result
    Assert.assertEquals(0, countThenEstimate.sizeof());
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeofOutputZero2() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = true;

    // Act and Assert result
    Assert.assertEquals(0, countThenEstimate.sizeof());
  }

  // Test written by Diffblue Cover.
  @Test
  public void cardinalityOutputPositive2() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 0);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 2;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = -2;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(null);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertEquals(1L, countThenEstimate.cardinality());
  }

  // Test written by Diffblue Cover.

  @Test
  public void cardinalityOutputZero10() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 0);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 1_619_235_781;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = -0x1p+185 /* -4.90399e+55 */;
    adaptiveCounting.m = 628_304_195;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void cardinalityOutputZero12() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void cardinalityOutputPositive() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 0);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = -256;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = -2;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(0);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertEquals(1L, countThenEstimate.cardinality());
  }

  // Test written by Diffblue Cover.

  @Test
  public void cardinalityOutputPositive3() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 1;
    final byte[] myByteArray = {(byte)0};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 512;
    adaptiveCounting.Ca = -0x1p+185 /* -4.90399e+55 */;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(null);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(1L, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void cardinalityOutputPositive4() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = -64;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = -0x1p+185 /* -4.90399e+55 */;
    adaptiveCounting.m = 2;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(0);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(1L, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void cardinalityOutputZero6() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 65_536;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = -0x1p+125 /* -4.25353e+37 */;
    adaptiveCounting.m = 131_072;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act
    final long actual = countThenEstimate.cardinality();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void offerInputPositiveOutputTrue5() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 1_073_797_577);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)65,   (byte)0, (byte)-128, (byte)0,
                                (byte)-128, (byte)0, (byte)1,    (byte)0};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 192;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 66);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1;
    countThenEstimate.tipped = false;
    final Object o = 8;

    // Act
    final boolean actual = countThenEstimate.offer(o);

    // Assert side effects
    final HashSet<Object> hashSet1 = new HashSet<Object>();
    hashSet1.add(8);
    Assert.assertEquals(hashSet1, countThenEstimate.counter);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroOutputFalse() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", -68_866);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)2};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 16_777_231);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(0);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = -2_147_483_644;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertFalse(countThenEstimate.offer(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputTrue2() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 55_424);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)-128};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 319;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", -268_435_421);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 1;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertTrue(countThenEstimate.offer(2));

    // Assert side effects
    final HashSet<Object> hashSet1 = new HashSet<Object>();
    hashSet1.add(2);
    Assert.assertEquals(hashSet1, countThenEstimate.counter);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputFalse() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", 55_424);
    countThenEstimate.builder = builder;
    countThenEstimate.estimator = null;
    final HashSet<Object> hashSet = new HashSet<Object>();
    hashSet.add(9);
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = -2_147_483_646;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertFalse(countThenEstimate.offer(9));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullOutputTrue() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    final Builder builder = new Builder();
    Reflector.setField(builder, "k", -68_866);
    countThenEstimate.builder = builder;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {(byte)2};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 16_777_231);
    countThenEstimate.estimator = adaptiveCounting;
    final HashSet<Object> hashSet = new HashSet<Object>();
    countThenEstimate.counter = hashSet;
    countThenEstimate.tippingPoint = 4;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertTrue(countThenEstimate.offer(null));

    // Assert side effects
    final HashSet<Object> hashSet1 = new HashSet<Object>();
    hashSet1.add(null);
    Assert.assertEquals(hashSet1, countThenEstimate.counter);
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeofOutputNegative001789bc5aa69e6e1bc() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    adaptiveCounting.M = null;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertEquals(-1, countThenEstimate.sizeof());
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeofOutputNegative5() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    countThenEstimate.estimator = null;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertEquals(-1, countThenEstimate.sizeof());
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeofOutputNegative4() throws InvocationTargetException {

    // Arrange
    final CountThenEstimate countThenEstimate = (CountThenEstimate)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate");
    countThenEstimate.builder = null;
    final AdaptiveCounting adaptiveCounting = (AdaptiveCounting)Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.AdaptiveCounting");
    Reflector.setField(adaptiveCounting, "B_s", 0.0);
    adaptiveCounting.b_e = 0;
    final byte[] myByteArray = {};
    adaptiveCounting.M = myByteArray;
    adaptiveCounting.Rsum = 0;
    adaptiveCounting.Ca = 0.0;
    adaptiveCounting.m = 0;
    Reflector.setField(adaptiveCounting, "k", 0);
    countThenEstimate.estimator = adaptiveCounting;
    countThenEstimate.counter = null;
    countThenEstimate.tippingPoint = 0;
    countThenEstimate.tipped = false;

    // Act and Assert result
    Assert.assertEquals(-1, countThenEstimate.sizeof());
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeEstimatorsInputNullOutputNull() throws CardinalityMergeException {

    // Act and Assert result
    Assert.assertNull(CountThenEstimate.mergeEstimators(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeEstimatorsInput0OutputNull000347872c61b7a7d28()
      throws CardinalityMergeException {

    // Arrange
    final CountThenEstimate[] estimators = {};

    // Act and Assert result
    Assert.assertNull(CountThenEstimate.mergeEstimators(estimators));
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeEstimatorsInput0OutputNull2() throws CardinalityMergeException {

    // Arrange
    final CountThenEstimate[] estimators = {};

    // Act and Assert result
    Assert.assertNull(CountThenEstimate.mergeEstimators(estimators));
  }
}
