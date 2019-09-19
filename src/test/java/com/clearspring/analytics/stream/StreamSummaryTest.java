package com.clearspring.analytics.stream;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.clearspring.analytics.stream.Counter;
import com.clearspring.analytics.stream.StreamSummary.Bucket;
import com.clearspring.analytics.stream.StreamSummary;
import com.clearspring.analytics.util.DoublyLinkedList;
import com.clearspring.analytics.util.ExternalizableUtil;
import com.clearspring.analytics.util.ListNode2;
import com.clearspring.analytics.util.Pair;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(PowerMockRunner.class)
public class StreamSummaryTest {

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ObjectInput.class, StreamSummary.class,
                   ExternalizableUtil.class, ObjectOutput.class})
  @Test
  public void
  toBytesOutput0() throws Exception, IOException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final byte[] actual = streamSummary.toBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ExternalizableUtil.class, StreamSummary.class,
                   ObjectOutput.class})
  @Test
  public void
  toBytesOutput0000fcfc8d8764c45099() throws Exception, IOException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    final byte[] actual = streamSummary.toBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, ObjectInput.class, StreamSummary.class,
                   ExternalizableUtil.class, ObjectOutput.class})
  @Test
  public void
  toBytesOutput02() throws Exception, InvocationTargetException, IOException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 1_441_151_880_758_558_719L;
    counter.item = null;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 1_441_151_880_758_558_719L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream1, readObjectMethod).withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final byte[] actual = streamSummary.toBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid00038d479b7f5fa8225()
      throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid2() throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = 0;
    counter.bucketNode = null;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid3()
      throws Exception, InvocationTargetException, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 9_223_367_638_808_264_703L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 9_223_367_638_808_264_702L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(objectInputStream, readObjectMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid4()
      throws Exception, InvocationTargetException, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(3))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter2 = new Counter();
    counter2.error = 0L;
    counter2.count = 9_223_367_638_808_264_703L;
    counter2.item = null;
    counter2.bucketNode = null;
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 9_223_367_638_808_264_703L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 9_223_367_638_808_264_702L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1).doReturn(counter2))
        .when(objectInputStream, readObjectMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid9()
      throws Exception, InvocationTargetException, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -275_282_819_314_089_855L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid10()
      throws Exception, InvocationTargetException, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 0L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -275_282_819_314_089_855L;
    counter.item = 264_224_763;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(objectInputStream, readObjectMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid11()
      throws Exception, InvocationTargetException, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = -275_282_819_314_089_855L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -275_282_819_314_089_855L;
    counter.item = 264_224_763;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(objectInputStream, readObjectMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid12() throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    counter.bucketNode = null;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput1OutputVoid() throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {(byte)0};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = -1_251_173_726_225_956_833L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -1_251_173_726_225_956_833L;
    counter.item = null;
    counter.bucketNode = null;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(objectInputStream, readObjectMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput1OutputVoid2() throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {(byte)0};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = -5_862_859_744_653_344_737L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -1_251_173_726_225_956_833L;
    counter.item = null;
    counter.bucketNode = null;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(objectInputStream, readObjectMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void constructorInput0OutputVoid2()
      throws Exception, InvocationTargetException, IOException, ClassNotFoundException {

    // Arrange
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 4_398_046_511_104L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(objectInputStream, readObjectMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    final StreamSummary actual = new StreamSummary(bytes);

    // Assert side effects
    Assert.assertNotNull(actual.bucketList);
  }

  // Test written by Diffblue Cover.

  @Test
  public void topKInputZeroOutput000068c707bc894506c9() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final int k = 0;

    // Act
    final List<Counter> actual = streamSummary.topK(k);

    // Assert result
    final ArrayList<Counter> arrayList = new ArrayList<Counter>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void constructorInput0OutputVoid3()
      throws Exception, InvocationTargetException, IOException, ClassNotFoundException {

    // Arrange
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(3))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter2 = new Counter();
    counter2.error = 0L;
    counter2.count = 962_050_684_071_907_807L;
    counter2.item = null;
    counter2.bucketNode = null;
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 962_050_684_071_907_807L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 962_050_684_071_645_663L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1).doReturn(counter2))
        .when(objectInputStream, readObjectMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    final StreamSummary actual = new StreamSummary(bytes);

    // Assert side effects
    Assert.assertNotNull(actual.bucketList);
  }

  // Test written by Diffblue Cover.

  @Test
  public void peekInputZeroOutput0000295d7a43c7aa3874() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final int k = 0;

    // Act
    final List actual = streamSummary.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid0002571fc1ea0549fbc()
      throws ClassNotFoundException, IOException, Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(in, readIntMethod)
        .withNoArguments();

    // Act
    streamSummary.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid3()
      throws ClassNotFoundException, IOException, Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(in, readIntMethod)
        .withNoArguments();

    // Act
    streamSummary.readExternal(in);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid4()
      throws ClassNotFoundException, IOException, Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -8_070_450_532_247_928_832L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode2 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList1 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList1, "head", listNode2);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode2);
    streamSummary1.bucketList = doublyLinkedList1;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    listNode21.setValue(counter);
    Reflector.setField(listNode21, "prev", null);
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", listNode21);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", listNode21);
    bucket.counterList = doublyLinkedList2;
    Reflector.setField(bucket, "count", -8_070_450_532_247_928_832L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(in, readObjectMethod).withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(in, readIntMethod)
        .withNoArguments();

    // Act
    streamSummary.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid5()
      throws ClassNotFoundException, IOException, Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -8_070_450_532_247_928_832L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList1 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 2);
    Reflector.setField(doublyLinkedList1, "tail", listNode2);
    streamSummary1.bucketList = doublyLinkedList1;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 0L;
    counter1.item = null;
    counter1.bucketNode = listNode21;
    listNode22.setValue(counter1);
    Reflector.setField(listNode22, "prev", null);
    hashMap.put(null, listNode22);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", listNode22);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", listNode22);
    bucket.counterList = doublyLinkedList2;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", listNode2);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList3 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(counter);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(doublyLinkedList3, "head", listNode23);
    Reflector.setField(doublyLinkedList3, "size", 1);
    Reflector.setField(doublyLinkedList3, "tail", listNode23);
    bucket1.counterList = doublyLinkedList3;
    Reflector.setField(bucket1, "count", -8_070_450_532_247_928_832L);
    listNode2.setValue(bucket1);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(in, readObjectMethod)
        .withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(in, readIntMethod)
        .withNoArguments();

    // Act
    streamSummary.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid6()
      throws ClassNotFoundException, IOException, Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -8_070_450_532_247_928_832L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode2 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList1 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList1, "head", listNode2);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode2);
    streamSummary1.bucketList = doublyLinkedList1;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = -8_070_450_532_247_928_832L;
    counter1.item = null;
    counter1.bucketNode = listNode2;
    listNode21.setValue(counter1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", listNode21);
    listNode22.setValue(counter);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "prev", listNode22);
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", listNode21);
    Reflector.setField(doublyLinkedList2, "size", 2);
    Reflector.setField(doublyLinkedList2, "tail", listNode22);
    bucket.counterList = doublyLinkedList2;
    Reflector.setField(bucket, "count", -8_070_450_532_247_928_832L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(in, readObjectMethod)
        .withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(in, readIntMethod)
        .withNoArguments();

    // Act
    streamSummary.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid7()
      throws ClassNotFoundException, IOException, Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 1_229_210_579_566_199_018L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", listNode21);
    Reflector.setField(doublyLinkedList, "size", 2);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary1.bucketList = doublyLinkedList;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 1_229_210_854_444_105_962L;
    counter1.item = null;
    counter1.bucketNode = listNode21;
    listNode22.setValue(counter1);
    Reflector.setField(listNode22, "prev", null);
    hashMap.put(null, listNode22);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", listNode22);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode22);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 1_229_210_854_444_105_962L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", listNode2);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(counter);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(doublyLinkedList2, "head", listNode23);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", listNode23);
    bucket1.counterList = doublyLinkedList2;
    Reflector.setField(bucket1, "count", 1_229_210_579_566_199_018L);
    listNode2.setValue(bucket1);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(in, readObjectMethod)
        .withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(in, readIntMethod)
        .withNoArguments();

    // Act
    streamSummary.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid8()
      throws ClassNotFoundException, IOException, Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 1_229_210_579_566_199_018L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode2 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary1.bucketList = doublyLinkedList;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 1_229_210_579_566_199_018L;
    counter1.item = null;
    counter1.bucketNode = listNode2;
    listNode21.setValue(counter1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", listNode21);
    listNode22.setValue(counter);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "prev", listNode22);
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 2);
    Reflector.setField(doublyLinkedList1, "tail", listNode22);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 1_229_210_579_566_199_018L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    ((PowerMockitoStubber)PowerMockito.doReturn(counter).doReturn(counter1))
        .when(in, readObjectMethod)
        .withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(2))
        .when(in, readIntMethod)
        .withNoArguments();

    // Act
    streamSummary.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid9()
      throws ClassNotFoundException, IOException, Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode2 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary1.bucketList = doublyLinkedList;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    listNode21.setValue(counter);
    Reflector.setField(listNode21, "prev", null);
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(in, readObjectMethod).withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(in, readIntMethod)
        .withNoArguments();

    // Act
    streamSummary.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputTrue3() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(536_870_913));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullPositiveOutputVoid2() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -4_611_686_020_574_609_407L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 3_458_764_513_820_540_928L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket1.counterList = doublyLinkedList2;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList3 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary1.bucketList = doublyLinkedList3;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket2, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList4 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket2.counterList = doublyLinkedList4;
    Reflector.setField(bucket2, "count", 0L);
    listNode23.setValue(bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    listNode24.setValue(null);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(counterNode, "prev", listNode24);

    // Act
    streamSummary.incrementCounter(counterNode, 2_147_483_647);

    // Assert side effects
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(-4_611_686_018_427_125_760L,
                        ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getNext()
             .getValue())
            .counterList);
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getPrev());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullPositiveOutputVoid3() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 4_611_686_018_427_387_904L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", -2_147_483_647);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket1.counterList = doublyLinkedList2;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList3 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary1.bucketList = doublyLinkedList3;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket2, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList4 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket2.counterList = doublyLinkedList4;
    Reflector.setField(bucket2, "count", 0L);
    listNode23.setValue(bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    listNode24.setValue(null);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(counterNode, "prev", listNode24);

    // Act
    streamSummary.incrementCounter(counterNode, 2_097_152);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(2_097_152L,
                        ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getNext()
             .getValue())
            .counterList);
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getPrev());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)counterNode)
                                                           .getValue())
                                               .bucketNode)
             .getPrev())
            .getNext());
    Assert.assertNotNull(
        ((ListNode2<StreamSummary
                        .Bucket>)((ListNode2<
                                   StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)
                                                                                    counterNode)
                                                                          .getValue())
                                                              .bucketNode)
                                      .getPrev()))
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary
              .Bucket)((ListNode2<
                           StreamSummary
                               .Bucket>)((ListNode2<
                                          StreamSummary
                                              .Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)
                                                                                  counterNode)
                                                                        .getValue())
                                                            .bucketNode)
                                             .getPrev()))
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)counterNode)
                                                           .getValue())
                                               .bucketNode)
             .getPrev())
            .getPrev());
    Assert.assertNull(
        ((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)counterNode)
                                                           .getValue())
                                               .bucketNode)
             .getPrev())
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)counterNode)
                                                           .getValue())
                                               .bucketNode)
             .getPrev())
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary
              .Bucket)((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)
                                                                                   counterNode)
                                                                         .getValue())
                                                             .bucketNode)
                           .getPrev())
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)counterNode)
                                                           .getValue())
                                               .bucketNode)
             .getPrev())
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullPositiveOutputVoid4() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 4_611_809_159_434_600_448L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 4_611_826_753_767_735_550L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket1.counterList = doublyLinkedList2;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(null);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    listNode24.setValue(null);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(counterNode, "prev", listNode24);

    // Act
    streamSummary.incrementCounter(counterNode, 2_147_352_830);

    // Assert side effects
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(4_611_809_161_581_953_278L,
                        ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getNext()
             .getValue())
            .counterList);
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getPrev());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullPositiveOutputVoid5() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -4_611_562_877_420_175_360L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -9_223_231_301_514_428_162L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket1.counterList = doublyLinkedList2;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(null);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    listNode24.setValue(null);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(counterNode, "prev", listNode24);

    // Act
    streamSummary.incrementCounter(counterNode, 2_147_352_830);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(-4_611_562_875_272_822_530L,
                        ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertEquals(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev(),
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev()
            .getNext());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev()
            .getValue());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullPositiveOutputVoid6() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 70_368_748_552_579L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 70_368_748_553_603L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket1.counterList = doublyLinkedList2;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList3 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary1.bucketList = doublyLinkedList3;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket2, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList4 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket2.counterList = doublyLinkedList4;
    Reflector.setField(bucket2, "count", 0L);
    listNode23.setValue(bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    listNode24.setValue(null);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(counterNode, "prev", listNode24);

    // Act
    streamSummary.incrementCounter(counterNode, 2_098_176);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(70_368_750_650_755L,
                        ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertEquals(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev(),
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullPositiveOutputVoid7() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 0L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    listNode22.setValue(null);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(null);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(counterNode, "next", listNode23);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -4_755_730_837_754_691_197L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode24 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket2.counterList = doublyLinkedList1;
    Reflector.setField(bucket2, "count", -144_044_819_327_302_269L);
    listNode25.setValue(bucket2);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode24, "next", listNode25);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket3, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket3.counterList = doublyLinkedList2;
    Reflector.setField(bucket3, "count", 0L);
    listNode24.setValue(bucket3);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList3 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary1.bucketList = doublyLinkedList3;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket4, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList4 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket4.counterList = doublyLinkedList4;
    Reflector.setField(bucket4, "count", 0L);
    listNode26.setValue(bucket4);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(listNode24, "prev", listNode26);
    counter.bucketNode = listNode24;
    counterNode.setValue(counter);
    final ListNode2 listNode27 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode27, "next", null);
    listNode27.setValue(null);
    Reflector.setField(listNode27, "prev", null);
    Reflector.setField(counterNode, "prev", listNode27);

    // Act
    streamSummary.incrementCounter(counterNode, 2_098_176);

    // Assert side effects
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(-4_755_730_837_752_593_021L,
                        ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getNext()
             .getValue())
            .counterList);
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getPrev());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void topKInputZeroOutput03() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -9_223_372_036_854_775_808L;
    counter.item = null;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final int k = 0;
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final Method readObjectMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream1, readObjectMethod1).withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = -9_223_372_036_854_775_808L;
    counter1.item = null;
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    streamSummary1.bucketList = doublyLinkedList2;
    streamSummary1.capacity = 0;
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(streamSummary1, "counterMap", hashMap1);
    Reflector.setField(bucket1, "this$0", streamSummary1);
    final DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    bucket1.counterList = doublyLinkedList3;
    Reflector.setField(bucket1, "count", 0L);
    Reflector.setField(listNode24, "value", bucket1);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(listNode23, "next", listNode24);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    streamSummary2.bucketList = doublyLinkedList4;
    streamSummary2.capacity = 0;
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(streamSummary2, "counterMap", hashMap2);
    Reflector.setField(bucket2, "this$0", streamSummary2);
    final DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    bucket2.counterList = doublyLinkedList5;
    Reflector.setField(bucket2, "count", 0L);
    Reflector.setField(listNode23, "value", bucket2);
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList6, "head", null);
    Reflector.setField(doublyLinkedList6, "size", 0);
    Reflector.setField(doublyLinkedList6, "tail", null);
    streamSummary3.bucketList = doublyLinkedList6;
    streamSummary3.capacity = 0;
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap3);
    Reflector.setField(bucket3, "this$0", streamSummary3);
    final DoublyLinkedList doublyLinkedList7 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList7, "head", null);
    Reflector.setField(doublyLinkedList7, "size", 0);
    Reflector.setField(doublyLinkedList7, "tail", null);
    bucket3.counterList = doublyLinkedList7;
    Reflector.setField(bucket3, "count", 0L);
    Reflector.setField(listNode25, "value", bucket3);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode23, "prev", listNode25);
    Reflector.setField(listNode22, "next", listNode23);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary4 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList8 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList8, "head", null);
    Reflector.setField(doublyLinkedList8, "size", 0);
    Reflector.setField(doublyLinkedList8, "tail", null);
    streamSummary4.bucketList = doublyLinkedList8;
    streamSummary4.capacity = 0;
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(streamSummary4, "counterMap", hashMap4);
    Reflector.setField(bucket4, "this$0", streamSummary4);
    final DoublyLinkedList doublyLinkedList9 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList9, "head", null);
    Reflector.setField(doublyLinkedList9, "size", 0);
    Reflector.setField(doublyLinkedList9, "tail", null);
    bucket4.counterList = doublyLinkedList9;
    Reflector.setField(bucket4, "count", 0L);
    Reflector.setField(listNode22, "value", bucket4);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode27 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode27, "next", null);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary5 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList10 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList10, "head", null);
    Reflector.setField(doublyLinkedList10, "size", 0);
    Reflector.setField(doublyLinkedList10, "tail", null);
    streamSummary5.bucketList = doublyLinkedList10;
    streamSummary5.capacity = 0;
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(streamSummary5, "counterMap", hashMap5);
    Reflector.setField(bucket5, "this$0", streamSummary5);
    final DoublyLinkedList doublyLinkedList11 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList11, "head", null);
    Reflector.setField(doublyLinkedList11, "size", 0);
    Reflector.setField(doublyLinkedList11, "tail", null);
    bucket5.counterList = doublyLinkedList11;
    Reflector.setField(bucket5, "count", 0L);
    Reflector.setField(listNode27, "value", bucket5);
    Reflector.setField(listNode27, "prev", null);
    Reflector.setField(listNode26, "next", listNode27);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary6 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList12 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList12, "head", null);
    Reflector.setField(doublyLinkedList12, "size", 0);
    Reflector.setField(doublyLinkedList12, "tail", null);
    streamSummary6.bucketList = doublyLinkedList12;
    streamSummary6.capacity = 0;
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(streamSummary6, "counterMap", hashMap6);
    Reflector.setField(bucket6, "this$0", streamSummary6);
    final DoublyLinkedList doublyLinkedList13 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList13, "head", null);
    Reflector.setField(doublyLinkedList13, "size", 0);
    Reflector.setField(doublyLinkedList13, "tail", null);
    bucket6.counterList = doublyLinkedList13;
    Reflector.setField(bucket6, "count", 0L);
    Reflector.setField(listNode26, "value", bucket6);
    final ListNode2 listNode28 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode28, "next", null);
    final StreamSummary.Bucket bucket7 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary7 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList14 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList14, "head", null);
    Reflector.setField(doublyLinkedList14, "size", 0);
    Reflector.setField(doublyLinkedList14, "tail", null);
    streamSummary7.bucketList = doublyLinkedList14;
    streamSummary7.capacity = 0;
    final HashMap hashMap7 = new HashMap();
    hashMap7.put(0, null);
    Reflector.setField(streamSummary7, "counterMap", hashMap7);
    Reflector.setField(bucket7, "this$0", streamSummary7);
    final DoublyLinkedList doublyLinkedList15 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList15, "head", null);
    Reflector.setField(doublyLinkedList15, "size", 0);
    Reflector.setField(doublyLinkedList15, "tail", null);
    bucket7.counterList = doublyLinkedList15;
    Reflector.setField(bucket7, "count", 0L);
    Reflector.setField(listNode28, "value", bucket7);
    Reflector.setField(listNode28, "prev", null);
    Reflector.setField(listNode26, "prev", listNode28);
    Reflector.setField(listNode22, "prev", listNode26);
    counter1.bucketNode = listNode22;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter1).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final List<Counter> actual = streamSummary.topK(k);

    // Assert result
    final ArrayList<Counter> arrayList = new ArrayList<Counter>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void topKInputZeroOutput02() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final int k = 0;
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    streamSummary1.bucketList = doublyLinkedList1;
    streamSummary1.capacity = 0;
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(streamSummary1, "counterMap", hashMap1);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket.counterList = doublyLinkedList2;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode22, "value", bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary2.bucketList = doublyLinkedList3;
    streamSummary2.capacity = 0;
    Reflector.setField(streamSummary2, "counterMap", null);
    Reflector.setField(bucket1, "this$0", streamSummary2);
    final DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket1.counterList = doublyLinkedList4;
    Reflector.setField(bucket1, "count", 0L);
    Reflector.setField(listNode21, "value", bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    streamSummary3.bucketList = doublyLinkedList5;
    streamSummary3.capacity = 0;
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap2);
    Reflector.setField(bucket2, "this$0", streamSummary3);
    final DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList6, "head", null);
    Reflector.setField(doublyLinkedList6, "size", 0);
    Reflector.setField(doublyLinkedList6, "tail", null);
    bucket2.counterList = doublyLinkedList6;
    Reflector.setField(bucket2, "count", 0L);
    Reflector.setField(listNode23, "value", bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary4 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList7 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList7, "head", null);
    Reflector.setField(doublyLinkedList7, "size", 0);
    Reflector.setField(doublyLinkedList7, "tail", null);
    streamSummary4.bucketList = doublyLinkedList7;
    streamSummary4.capacity = 0;
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(streamSummary4, "counterMap", hashMap3);
    Reflector.setField(bucket3, "this$0", streamSummary4);
    final DoublyLinkedList doublyLinkedList8 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList8, "head", null);
    Reflector.setField(doublyLinkedList8, "size", 0);
    Reflector.setField(doublyLinkedList8, "tail", null);
    bucket3.counterList = doublyLinkedList8;
    Reflector.setField(bucket3, "count", 0L);
    Reflector.setField(listNode2, "value", bucket3);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary5 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList9 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList9, "head", null);
    Reflector.setField(doublyLinkedList9, "size", 0);
    Reflector.setField(doublyLinkedList9, "tail", null);
    streamSummary5.bucketList = doublyLinkedList9;
    streamSummary5.capacity = 0;
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(streamSummary5, "counterMap", hashMap4);
    Reflector.setField(bucket4, "this$0", streamSummary5);
    final DoublyLinkedList doublyLinkedList10 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList10, "head", null);
    Reflector.setField(doublyLinkedList10, "size", 0);
    Reflector.setField(doublyLinkedList10, "tail", null);
    bucket4.counterList = doublyLinkedList10;
    Reflector.setField(bucket4, "count", 0L);
    Reflector.setField(listNode25, "value", bucket4);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode24, "next", listNode25);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary6 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList11 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList11, "head", null);
    Reflector.setField(doublyLinkedList11, "size", 0);
    Reflector.setField(doublyLinkedList11, "tail", null);
    streamSummary6.bucketList = doublyLinkedList11;
    streamSummary6.capacity = 0;
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(streamSummary6, "counterMap", hashMap5);
    Reflector.setField(bucket5, "this$0", streamSummary6);
    final DoublyLinkedList doublyLinkedList12 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList12, "head", null);
    Reflector.setField(doublyLinkedList12, "size", 0);
    Reflector.setField(doublyLinkedList12, "tail", null);
    bucket5.counterList = doublyLinkedList12;
    Reflector.setField(bucket5, "count", 0L);
    Reflector.setField(listNode24, "value", bucket5);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary7 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList13 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList13, "head", null);
    Reflector.setField(doublyLinkedList13, "size", 0);
    Reflector.setField(doublyLinkedList13, "tail", null);
    streamSummary7.bucketList = doublyLinkedList13;
    streamSummary7.capacity = 0;
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(streamSummary7, "counterMap", hashMap6);
    Reflector.setField(bucket6, "this$0", streamSummary7);
    final DoublyLinkedList doublyLinkedList14 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList14, "head", null);
    Reflector.setField(doublyLinkedList14, "size", 0);
    Reflector.setField(doublyLinkedList14, "tail", null);
    bucket6.counterList = doublyLinkedList14;
    Reflector.setField(bucket6, "count", 0L);
    Reflector.setField(listNode26, "value", bucket6);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(listNode24, "prev", listNode26);
    Reflector.setField(listNode2, "prev", listNode24);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final List<Counter> actual = streamSummary.topK(k);

    // Assert result
    final ArrayList<Counter> arrayList = new ArrayList<Counter>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid3() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 0L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", 0L);
    listNode22.setValue(bucket2);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 0);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket3, "this$0", null);
    bucket3.counterList = null;
    Reflector.setField(bucket3, "count", 0L);
    listNode24.setValue(bucket3);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(listNode23, "next", listNode24);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket4, "this$0", null);
    bucket4.counterList = null;
    Reflector.setField(bucket4, "count", 0L);
    listNode23.setValue(bucket4);
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket5, "this$0", null);
    bucket5.counterList = null;
    Reflector.setField(bucket5, "count", 0L);
    listNode25.setValue(bucket5);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode23, "prev", listNode25);
    Reflector.setField(doublyLinkedList, "tail", listNode23);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    listNode26.setValue(null);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(counterNode, "next", listNode26);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode27 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode27, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket6, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket6.counterList = doublyLinkedList1;
    Reflector.setField(bucket6, "count", 0L);
    listNode27.setValue(bucket6);
    final ListNode2 listNode28 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode28, "next", null);
    final StreamSummary.Bucket bucket7 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList2 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    streamSummary1.bucketList = doublyLinkedList2;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket7, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList3 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    bucket7.counterList = doublyLinkedList3;
    Reflector.setField(bucket7, "count", 0L);
    listNode28.setValue(bucket7);
    Reflector.setField(listNode28, "prev", null);
    Reflector.setField(listNode27, "prev", listNode28);
    counter.bucketNode = listNode27;
    counterNode.setValue(counter);
    final ListNode2 listNode29 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode29, "next", null);
    listNode29.setValue(null);
    Reflector.setField(listNode29, "prev", null);
    Reflector.setField(counterNode, "prev", listNode29);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void topKInputZeroOutput0() throws Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final int k = 0;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final List<Counter> actual = streamSummary.topK(k);

    // Assert result
    final ArrayList<Counter> arrayList = new ArrayList<Counter>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid5() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 0L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", 0L);
    listNode22.setValue(bucket2);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 0);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket3, "this$0", null);
    bucket3.counterList = null;
    Reflector.setField(bucket3, "count", 0L);
    listNode24.setValue(bucket3);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(listNode23, "next", listNode24);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket4, "this$0", null);
    bucket4.counterList = null;
    Reflector.setField(bucket4, "count", 0L);
    listNode23.setValue(bucket4);
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket5, "this$0", null);
    bucket5.counterList = null;
    Reflector.setField(bucket5, "count", 0L);
    listNode25.setValue(bucket5);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode23, "prev", listNode25);
    Reflector.setField(doublyLinkedList, "tail", listNode23);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    listNode26.setValue(null);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(counterNode, "next", listNode26);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode27 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode27, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    streamSummary1.bucketList = null;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket6, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 2);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket6.counterList = doublyLinkedList1;
    Reflector.setField(bucket6, "count", 0L);
    listNode27.setValue(bucket6);
    Reflector.setField(listNode27, "prev", null);
    counter.bucketNode = listNode27;
    counterNode.setValue(counter);
    final ListNode2 listNode28 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode28, "next", null);
    listNode28.setValue(null);
    Reflector.setField(listNode28, "prev", null);
    Reflector.setField(counterNode, "prev", listNode28);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)counterNode)
                                                           .getValue())
                                               .bucketNode)
             .getPrev())
            .getNext());
    Assert.assertNotNull(
        ((ListNode2<StreamSummary
                        .Bucket>)((ListNode2<
                                   StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)
                                                                                    counterNode)
                                                                          .getValue())
                                                              .bucketNode)
                                      .getPrev()))
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary
              .Bucket)((ListNode2<
                           StreamSummary
                               .Bucket>)((ListNode2<
                                          StreamSummary
                                              .Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)
                                                                                  counterNode)
                                                                        .getValue())
                                                            .bucketNode)
                                             .getPrev()))
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)counterNode)
                                                           .getValue())
                                               .bucketNode)
             .getPrev())
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid6() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 0L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", 0L);
    listNode22.setValue(bucket2);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 0);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket3, "this$0", null);
    bucket3.counterList = null;
    Reflector.setField(bucket3, "count", 0L);
    listNode24.setValue(bucket3);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(listNode23, "next", listNode24);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket4, "this$0", null);
    bucket4.counterList = null;
    Reflector.setField(bucket4, "count", 0L);
    listNode23.setValue(bucket4);
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket5, "this$0", null);
    bucket5.counterList = null;
    Reflector.setField(bucket5, "count", 0L);
    listNode25.setValue(bucket5);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode23, "prev", listNode25);
    Reflector.setField(doublyLinkedList, "tail", listNode23);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    listNode26.setValue(null);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(counterNode, "next", listNode26);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode27 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode27, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    streamSummary1.bucketList = null;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket6, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket6.counterList = doublyLinkedList1;
    Reflector.setField(bucket6, "count", 0L);
    listNode27.setValue(bucket6);
    final ListNode2 listNode28 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode28, "next", null);
    final StreamSummary.Bucket bucket7 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList2 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    streamSummary2.bucketList = doublyLinkedList2;
    streamSummary2.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(streamSummary2, "counterMap", hashMap);
    Reflector.setField(bucket7, "this$0", streamSummary2);
    final DoublyLinkedList<Counter> doublyLinkedList3 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    bucket7.counterList = doublyLinkedList3;
    Reflector.setField(bucket7, "count", 0L);
    listNode28.setValue(bucket7);
    Reflector.setField(listNode28, "prev", null);
    Reflector.setField(listNode27, "prev", listNode28);
    counter.bucketNode = listNode27;
    counterNode.setValue(counter);
    final ListNode2 listNode29 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode29, "next", null);
    listNode29.setValue(null);
    Reflector.setField(listNode29, "prev", null);
    Reflector.setField(counterNode, "prev", listNode29);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid7() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 0L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", 0L);
    listNode22.setValue(bucket2);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 0);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket3, "this$0", null);
    bucket3.counterList = null;
    Reflector.setField(bucket3, "count", 0L);
    listNode24.setValue(bucket3);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(listNode23, "next", listNode24);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket4, "this$0", null);
    bucket4.counterList = null;
    Reflector.setField(bucket4, "count", 0L);
    listNode23.setValue(bucket4);
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket5, "this$0", null);
    bucket5.counterList = null;
    Reflector.setField(bucket5, "count", 0L);
    listNode25.setValue(bucket5);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode23, "prev", listNode25);
    Reflector.setField(doublyLinkedList, "tail", listNode23);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    listNode26.setValue(null);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(counterNode, "next", listNode26);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode27 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode28 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode28, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList1 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    streamSummary1.bucketList = doublyLinkedList1;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket6, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket6.counterList = doublyLinkedList2;
    Reflector.setField(bucket6, "count", -9_223_372_036_854_775_808L);
    listNode28.setValue(bucket6);
    Reflector.setField(listNode28, "prev", null);
    Reflector.setField(listNode27, "next", listNode28);
    final StreamSummary.Bucket bucket7 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    streamSummary2.bucketList = null;
    streamSummary2.capacity = 0;
    Reflector.setField(streamSummary2, "counterMap", null);
    Reflector.setField(bucket7, "this$0", streamSummary2);
    final DoublyLinkedList<Counter> doublyLinkedList3 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 1);
    Reflector.setField(doublyLinkedList3, "tail", null);
    bucket7.counterList = doublyLinkedList3;
    Reflector.setField(bucket7, "count", 0L);
    listNode27.setValue(bucket7);
    final ListNode2 listNode29 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode29, "next", null);
    final StreamSummary.Bucket bucket8 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList4 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    streamSummary3.bucketList = doublyLinkedList4;
    streamSummary3.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap);
    Reflector.setField(bucket8, "this$0", streamSummary3);
    final DoublyLinkedList<Counter> doublyLinkedList5 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    bucket8.counterList = doublyLinkedList5;
    Reflector.setField(bucket8, "count", 0L);
    listNode29.setValue(bucket8);
    Reflector.setField(listNode29, "prev", null);
    Reflector.setField(listNode27, "prev", listNode29);
    counter.bucketNode = listNode27;
    counterNode.setValue(counter);
    final ListNode2 listNode210 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode210, "next", null);
    listNode210.setValue(null);
    Reflector.setField(listNode210, "prev", null);
    Reflector.setField(counterNode, "prev", listNode210);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertEquals(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev(),
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid8() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 0L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", 0L);
    listNode22.setValue(bucket2);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(null);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(counterNode, "next", listNode23);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 4_194_304L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode24 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList1 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    streamSummary1.bucketList = doublyLinkedList1;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket3, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket3.counterList = doublyLinkedList2;
    Reflector.setField(bucket3, "count", 4_611_686_018_427_387_904L);
    listNode25.setValue(bucket3);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode24, "next", listNode25);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    streamSummary2.bucketList = null;
    streamSummary2.capacity = 0;
    Reflector.setField(streamSummary2, "counterMap", null);
    Reflector.setField(bucket4, "this$0", streamSummary2);
    final DoublyLinkedList<Counter> doublyLinkedList3 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 1);
    Reflector.setField(doublyLinkedList3, "tail", null);
    bucket4.counterList = doublyLinkedList3;
    Reflector.setField(bucket4, "count", 0L);
    listNode24.setValue(bucket4);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList4 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    streamSummary3.bucketList = doublyLinkedList4;
    streamSummary3.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap);
    Reflector.setField(bucket5, "this$0", streamSummary3);
    final DoublyLinkedList<Counter> doublyLinkedList5 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    bucket5.counterList = doublyLinkedList5;
    Reflector.setField(bucket5, "count", 0L);
    listNode26.setValue(bucket5);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(listNode24, "prev", listNode26);
    counter.bucketNode = listNode24;
    counterNode.setValue(counter);
    final ListNode2 listNode27 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode27, "next", null);
    listNode27.setValue(null);
    Reflector.setField(listNode27, "prev", null);
    Reflector.setField(counterNode, "prev", listNode27);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(4_194_304L,
                        ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getNext()
             .getValue())
            .counterList);
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getNext()
            .getPrev());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid00134db79f203dd7d31()
      throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 2);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    listNode22.setValue(null);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(counterNode, "prev", listNode22);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)counterNode)
                                                           .getValue())
                                               .bucketNode)
             .getPrev())
            .getNext());
    Assert.assertNotNull(
        ((ListNode2<StreamSummary
                        .Bucket>)((ListNode2<
                                   StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)
                                                                                    counterNode)
                                                                          .getValue())
                                                              .bucketNode)
                                      .getPrev()))
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary
              .Bucket)((ListNode2<
                           StreamSummary
                               .Bucket>)((ListNode2<
                                          StreamSummary
                                              .Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)
                                                                                  counterNode)
                                                                        .getValue())
                                                            .bucketNode)
                                             .getPrev()))
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2<StreamSummary.Bucket>)((ListNode2)((Counter)((ListNode2<Counter>)counterNode)
                                                           .getValue())
                                               .bucketNode)
             .getPrev())
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid10() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList2 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    streamSummary1.bucketList = doublyLinkedList2;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket1, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList3 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    bucket1.counterList = doublyLinkedList3;
    Reflector.setField(bucket1, "count", 0L);
    listNode22.setValue(bucket1);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "prev", listNode22);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(null);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(counterNode, "prev", listNode23);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void topKInputPositiveOutput1() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -9_223_372_036_854_775_808L;
    counter.item = null;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final int k = 1;
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final Method readObjectMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream1, readObjectMethod1).withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = -9_223_372_036_854_775_808L;
    counter1.item = null;
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    streamSummary1.bucketList = doublyLinkedList2;
    streamSummary1.capacity = 0;
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(streamSummary1, "counterMap", hashMap1);
    Reflector.setField(bucket1, "this$0", streamSummary1);
    final DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    bucket1.counterList = doublyLinkedList3;
    Reflector.setField(bucket1, "count", 0L);
    Reflector.setField(listNode24, "value", bucket1);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(listNode23, "next", listNode24);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    streamSummary2.bucketList = doublyLinkedList4;
    streamSummary2.capacity = 0;
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(streamSummary2, "counterMap", hashMap2);
    Reflector.setField(bucket2, "this$0", streamSummary2);
    final DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    bucket2.counterList = doublyLinkedList5;
    Reflector.setField(bucket2, "count", 0L);
    Reflector.setField(listNode23, "value", bucket2);
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList6, "head", null);
    Reflector.setField(doublyLinkedList6, "size", 0);
    Reflector.setField(doublyLinkedList6, "tail", null);
    streamSummary3.bucketList = doublyLinkedList6;
    streamSummary3.capacity = 0;
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap3);
    Reflector.setField(bucket3, "this$0", streamSummary3);
    final DoublyLinkedList doublyLinkedList7 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList7, "head", null);
    Reflector.setField(doublyLinkedList7, "size", 0);
    Reflector.setField(doublyLinkedList7, "tail", null);
    bucket3.counterList = doublyLinkedList7;
    Reflector.setField(bucket3, "count", 0L);
    Reflector.setField(listNode25, "value", bucket3);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode23, "prev", listNode25);
    Reflector.setField(listNode22, "next", listNode23);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary4 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList8 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList8, "head", null);
    Reflector.setField(doublyLinkedList8, "size", 0);
    Reflector.setField(doublyLinkedList8, "tail", null);
    streamSummary4.bucketList = doublyLinkedList8;
    streamSummary4.capacity = 0;
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(streamSummary4, "counterMap", hashMap4);
    Reflector.setField(bucket4, "this$0", streamSummary4);
    final DoublyLinkedList doublyLinkedList9 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList9, "head", null);
    Reflector.setField(doublyLinkedList9, "size", 0);
    Reflector.setField(doublyLinkedList9, "tail", null);
    bucket4.counterList = doublyLinkedList9;
    Reflector.setField(bucket4, "count", 0L);
    Reflector.setField(listNode22, "value", bucket4);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode27 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode27, "next", null);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary5 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList10 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList10, "head", null);
    Reflector.setField(doublyLinkedList10, "size", 0);
    Reflector.setField(doublyLinkedList10, "tail", null);
    streamSummary5.bucketList = doublyLinkedList10;
    streamSummary5.capacity = 0;
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(streamSummary5, "counterMap", hashMap5);
    Reflector.setField(bucket5, "this$0", streamSummary5);
    final DoublyLinkedList doublyLinkedList11 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList11, "head", null);
    Reflector.setField(doublyLinkedList11, "size", 0);
    Reflector.setField(doublyLinkedList11, "tail", null);
    bucket5.counterList = doublyLinkedList11;
    Reflector.setField(bucket5, "count", 0L);
    Reflector.setField(listNode27, "value", bucket5);
    Reflector.setField(listNode27, "prev", null);
    Reflector.setField(listNode26, "next", listNode27);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary6 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList12 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList12, "head", null);
    Reflector.setField(doublyLinkedList12, "size", 0);
    Reflector.setField(doublyLinkedList12, "tail", null);
    streamSummary6.bucketList = doublyLinkedList12;
    streamSummary6.capacity = 0;
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(streamSummary6, "counterMap", hashMap6);
    Reflector.setField(bucket6, "this$0", streamSummary6);
    final DoublyLinkedList doublyLinkedList13 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList13, "head", null);
    Reflector.setField(doublyLinkedList13, "size", 0);
    Reflector.setField(doublyLinkedList13, "tail", null);
    bucket6.counterList = doublyLinkedList13;
    Reflector.setField(bucket6, "count", 0L);
    Reflector.setField(listNode26, "value", bucket6);
    final ListNode2 listNode28 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode28, "next", null);
    final StreamSummary.Bucket bucket7 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary7 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList14 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList14, "head", null);
    Reflector.setField(doublyLinkedList14, "size", 0);
    Reflector.setField(doublyLinkedList14, "tail", null);
    streamSummary7.bucketList = doublyLinkedList14;
    streamSummary7.capacity = 0;
    final HashMap hashMap7 = new HashMap();
    hashMap7.put(0, null);
    Reflector.setField(streamSummary7, "counterMap", hashMap7);
    Reflector.setField(bucket7, "this$0", streamSummary7);
    final DoublyLinkedList doublyLinkedList15 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList15, "head", null);
    Reflector.setField(doublyLinkedList15, "size", 0);
    Reflector.setField(doublyLinkedList15, "tail", null);
    bucket7.counterList = doublyLinkedList15;
    Reflector.setField(bucket7, "count", 0L);
    Reflector.setField(listNode28, "value", bucket7);
    Reflector.setField(listNode28, "prev", null);
    Reflector.setField(listNode26, "prev", listNode28);
    Reflector.setField(listNode22, "prev", listNode26);
    counter1.bucketNode = listNode22;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter1).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final List<Counter> actual = streamSummary.topK(k);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertEquals(0L, actual.get(0).getError());
    Assert.assertEquals(-9_223_372_036_854_775_808L, actual.get(0).getCount());
    Assert.assertNull(actual.get(0).getItem());
    Assert.assertNotNull(actual.get(0).bucketNode);
    Assert.assertNull(((ListNode2)actual.get(0).bucketNode).getNext());
    Assert.assertNotNull(((ListNode2)actual.get(0).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)actual.get(0).bucketNode).getValue()).counterList);
    Assert.assertNull(((ListNode2)actual.get(0).bucketNode).getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid12() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -9_223_372_036_854_775_808L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket1.counterList = doublyLinkedList2;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList3 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary1.bucketList = doublyLinkedList3;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket2, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList4 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket2.counterList = doublyLinkedList4;
    Reflector.setField(bucket2, "count", 0L);
    listNode23.setValue(bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    listNode24.setValue(null);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(counterNode, "prev", listNode24);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getNext());
    Assert.assertNotNull(
        ((ListNode2<StreamSummary.Bucket>)((Counter)((ListNode2<Counter>)counterNode).getValue())
             .bucketNode)
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2<StreamSummary.Bucket>)((Counter)((ListNode2<Counter>)
                                                                                counterNode)
                                                                      .getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev().getNext());
    Assert.assertNotNull(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev().getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((Counter)((ListNode2<Counter>)counterNode).getValue())
             .bucketNode.getPrev()
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev().getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev(),
        ((Counter)((ListNode2<Counter>)counterNode).getValue())
            .bucketNode.getPrev()
            .getPrev()
            .getNext());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue())
                             .bucketNode.getPrev()
                             .getPrev()
                             .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((Counter)((ListNode2<Counter>)counterNode).getValue())
             .bucketNode.getPrev()
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue())
                          .bucketNode.getPrev()
                          .getPrev()
                          .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid13() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    listNode22.setValue(null);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "prev", listNode22);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(null);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(counterNode, "prev", listNode23);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeOutputTrue() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(-48_234_497, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(-48_234_497));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeOutputTrue2() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -2_147_483_648);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 562_949_953_421_313L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", 0L);
    listNode22.setValue(bucket2);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(-48_234_497, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(-48_234_497));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeOutputTrue3() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -2_147_483_648);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", -9_222_809_086_901_354_495L);
    listNode2.setValue(bucket);
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "prev", listNode21);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(-48_234_497, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(-48_234_497));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerInputNegativePositiveOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = -5_188_146_770_730_811_392L;
    counter.count = -5_187_865_295_754_100_741L;
    counter.item = -5;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -5_187_865_295_754_100_741L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 3;
    final HashMap hashMap = new HashMap();
    hashMap.put(-5, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = -5;
    final int incrementCount = 6;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(3).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final boolean actual = streamSummary.offer(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerInputNegativePositiveOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -5_188_146_770_730_811_392L;
    counter.item = -1;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -5_188_146_770_730_811_392L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    hashMap.put(-1, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = -5;
    final int incrementCount = 1;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(1).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final boolean actual = streamSummary.offer(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullNegativeOutputTrue() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", -2_147_483_648);
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", -4_261_266_013L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode21);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 131_072;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(null, -2_113_782_365));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullOutputTrue() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 2);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(null));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullOutputTrue2() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 2);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 2_199_023_255_552L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(null));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullPositiveOutputTrue() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 131_072;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(null, 2_146_303_813));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullPositiveOutputTrue2() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -2_147_483_648);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    listNode21.setValue(null);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 2_181_184_929L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 131_072;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(null, 33_701_281));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerInputPositiveOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -4_611_756_387_171_565_694L;
    counter.item = 3;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -4_611_756_387_171_565_694L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(3, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 3;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final boolean actual = streamSummary.offer(item);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerInputPositiveOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -4_611_756_387_171_565_678L;
    counter.item = 2;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -4_611_756_387_171_565_678L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(2, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 3;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final boolean actual = streamSummary.offer(item);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerInputPositiveOutputTrue2() throws Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 334_849_283;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(1).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final boolean actual = streamSummary.offer(item);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void constructorInput0OutputVoid() throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    final StreamSummary actual = new StreamSummary(bytes);

    // Assert side effects
    Assert.assertNotNull(actual.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositivePositiveOutputTrue() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(2, 34_078_720));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroPositiveOutputTrue() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -2_147_483_648);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", -9_223_372_035_781_033_983L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 3L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", 0L);
    listNode22.setValue(bucket2);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    final ListNode2<Counter> listNode23 =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -4_600_989_968_238_641_149L;
    counter.item = null;
    counter.bucketNode = null;
    listNode23.setValue(counter);
    Reflector.setField(listNode23, "prev", null);
    hashMap.put(null, listNode23);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(0, 1_073_741_825));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerInputZeroZeroOutputTrue() throws Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 0;
    final int incrementCount = 0;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(1).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final boolean actual = streamSummary.offer(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerInputZeroZeroOutputTrue2() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 0;
    final int incrementCount = 0;
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(1).doReturn(0))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -9_223_372_036_854_775_808L;
    counter.item = 0;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    streamSummary1.bucketList = doublyLinkedList1;
    streamSummary1.capacity = 0;
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(streamSummary1, "counterMap", hashMap1);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket.counterList = doublyLinkedList2;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode22, "value", bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary2.bucketList = doublyLinkedList3;
    streamSummary2.capacity = 0;
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(streamSummary2, "counterMap", hashMap2);
    Reflector.setField(bucket1, "this$0", streamSummary2);
    final DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket1.counterList = doublyLinkedList4;
    Reflector.setField(bucket1, "count", 0L);
    Reflector.setField(listNode21, "value", bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    streamSummary3.bucketList = doublyLinkedList5;
    streamSummary3.capacity = 0;
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap3);
    Reflector.setField(bucket2, "this$0", streamSummary3);
    final DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList6, "head", null);
    Reflector.setField(doublyLinkedList6, "size", 0);
    Reflector.setField(doublyLinkedList6, "tail", null);
    bucket2.counterList = doublyLinkedList6;
    Reflector.setField(bucket2, "count", 0L);
    Reflector.setField(listNode23, "value", bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary4 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList7 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList7, "head", null);
    Reflector.setField(doublyLinkedList7, "size", 0);
    Reflector.setField(doublyLinkedList7, "tail", null);
    streamSummary4.bucketList = doublyLinkedList7;
    streamSummary4.capacity = 0;
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(streamSummary4, "counterMap", hashMap4);
    Reflector.setField(bucket3, "this$0", streamSummary4);
    final DoublyLinkedList doublyLinkedList8 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList8, "head", null);
    Reflector.setField(doublyLinkedList8, "size", 0);
    Reflector.setField(doublyLinkedList8, "tail", null);
    bucket3.counterList = doublyLinkedList8;
    Reflector.setField(bucket3, "count", 0L);
    Reflector.setField(listNode2, "value", bucket3);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary5 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList9 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList9, "head", null);
    Reflector.setField(doublyLinkedList9, "size", 0);
    Reflector.setField(doublyLinkedList9, "tail", null);
    streamSummary5.bucketList = doublyLinkedList9;
    streamSummary5.capacity = 0;
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(streamSummary5, "counterMap", hashMap5);
    Reflector.setField(bucket4, "this$0", streamSummary5);
    final DoublyLinkedList doublyLinkedList10 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList10, "head", null);
    Reflector.setField(doublyLinkedList10, "size", 0);
    Reflector.setField(doublyLinkedList10, "tail", null);
    bucket4.counterList = doublyLinkedList10;
    Reflector.setField(bucket4, "count", 0L);
    Reflector.setField(listNode25, "value", bucket4);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode24, "next", listNode25);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary6 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList11 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList11, "head", null);
    Reflector.setField(doublyLinkedList11, "size", 0);
    Reflector.setField(doublyLinkedList11, "tail", null);
    streamSummary6.bucketList = doublyLinkedList11;
    streamSummary6.capacity = 0;
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(streamSummary6, "counterMap", hashMap6);
    Reflector.setField(bucket5, "this$0", streamSummary6);
    final DoublyLinkedList doublyLinkedList12 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList12, "head", null);
    Reflector.setField(doublyLinkedList12, "size", 0);
    Reflector.setField(doublyLinkedList12, "tail", null);
    bucket5.counterList = doublyLinkedList12;
    Reflector.setField(bucket5, "count", 0L);
    Reflector.setField(listNode24, "value", bucket5);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary7 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList13 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList13, "head", null);
    Reflector.setField(doublyLinkedList13, "size", 0);
    Reflector.setField(doublyLinkedList13, "tail", null);
    streamSummary7.bucketList = doublyLinkedList13;
    streamSummary7.capacity = 0;
    final HashMap hashMap7 = new HashMap();
    hashMap7.put(0, null);
    Reflector.setField(streamSummary7, "counterMap", hashMap7);
    Reflector.setField(bucket6, "this$0", streamSummary7);
    final DoublyLinkedList doublyLinkedList14 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList14, "head", null);
    Reflector.setField(doublyLinkedList14, "size", 0);
    Reflector.setField(doublyLinkedList14, "tail", null);
    bucket6.counterList = doublyLinkedList14;
    Reflector.setField(bucket6, "count", 0L);
    Reflector.setField(listNode26, "value", bucket6);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(listNode24, "prev", listNode26);
    Reflector.setField(listNode2, "prev", listNode24);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final boolean actual = streamSummary.offer(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroZeroOutputTrue3() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    final ListNode2<Counter> listNode2 =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -9_205_920_588_298_715_135L;
    counter.item = null;
    counter.bucketNode = null;
    listNode2.setValue(counter);
    Reflector.setField(listNode2, "prev", null);
    hashMap.put(null, listNode2);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(0, 0));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroZeroOutputTrue4() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -2_147_483_648);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 17_451_448_556_060_672L);
    listNode2.setValue(bucket);
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "prev", listNode21);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    final ListNode2<Counter> listNode22 =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -9_205_920_588_298_715_135L;
    counter.item = null;
    counter.bucketNode = null;
    listNode22.setValue(counter);
    Reflector.setField(listNode22, "prev", null);
    hashMap.put(null, listNode22);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertTrue(streamSummary.offer(0, 0));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnAllInputNullNegativeOutputNotNull() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -1);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 9_223_372_033_633_550_339L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act
    final Pair actual = streamSummary.offerReturnAll(null, -1_073_741_817);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertTrue(actual.left);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnAllInputNullPositiveOutputNotNull() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -1);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 1_004_535_739L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act
    final Pair actual = streamSummary.offerReturnAll(null, 2_078_277_562);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertTrue(actual.left);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnAllInputNullZeroOutputNotNull() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act
    final Pair actual = streamSummary.offerReturnAll(null, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertTrue(actual.left);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerReturnAllInputPositiveNegativeOutputNotNull()
      throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = 102_531;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 3;
    final HashMap hashMap = new HashMap();
    hashMap.put(102531, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 102_531;
    final int incrementCount = -2_147_483_647;
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(3).doReturn(1))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final Method readObjectMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream1, readObjectMethod1).withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 1L;
    counter1.item = 1;
    counter1.bucketNode = null;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter1).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final Pair actual = streamSummary.offerReturnAll(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertFalse(actual.left);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerReturnAllInputPositiveNegativeOutputNotNull2()
      throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = -2_147_483_645;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 1_073_778_818;
    final int incrementCount = -2_147_483_647;
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_147_483_645).doReturn(1))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final Method readObjectMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream1, readObjectMethod1).withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 1L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter1).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final Pair actual = streamSummary.offerReturnAll(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertTrue(actual.left);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnAllInputPositiveNegativeOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    listNode21.setValue(null);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", -2_147_483_648);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 1_073_872_895L);
    listNode23.setValue(bucket1);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode22, "next", listNode23);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", -3_221_094_401L);
    listNode22.setValue(bucket2);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket3, "this$0", null);
    bucket3.counterList = null;
    Reflector.setField(bucket3, "count", 0L);
    listNode24.setValue(bucket3);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(listNode22, "prev", listNode24);
    Reflector.setField(doublyLinkedList, "tail", listNode22);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(75_497_472, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act
    final Pair actual = streamSummary.offerReturnAll(75_497_472, -1_073_610_753);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertTrue(actual.left);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnAllInputPositiveZeroOutputNotNull() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(1, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act
    final Pair actual = streamSummary.offerReturnAll(1, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertTrue(actual.left);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnAllInputPositiveZeroOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -2_147_483_648);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", -9_223_372_036_854_775_808L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", -2_147_483_648L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", 0L);
    listNode22.setValue(bucket2);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    hashMap.put(75_497_472, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act
    final Pair actual = streamSummary.offerReturnAll(75_497_472, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertTrue(actual.left);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnAllInputZeroZeroOutputNotNull() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary(2);

    // Act
    final Pair actual = streamSummary.offerReturnAll(0, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertTrue(actual.left);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerReturnAllInputZeroZeroOutputNotNull2() throws Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 2;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 0;
    final int incrementCount = 0;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final Pair actual = streamSummary.offerReturnAll(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertTrue(actual.left);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerReturnDroppedInputNegativeNegativeOutputNull() throws Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = -1_226_505_941;
    final int incrementCount = -2_147_483_561;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(1).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final Object actual = streamSummary.offerReturnDropped(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnDroppedInputNullNegativeOutputNull() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -1);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", -144_115_188_075_869_439L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 5;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertNull(streamSummary.offerReturnDropped(null, -13_535));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnDroppedInputNullPositiveOutputNull() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -1);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 144_115_190_223_325_953L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 5;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertNull(streamSummary.offerReturnDropped(null, 2_147_470_113));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnDroppedInputNullZeroOutputNull() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertNull(streamSummary.offerReturnDropped(null, 0));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnDroppedInputPositiveNegativeOutputNull() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -1);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", -281_203_065L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertNull(streamSummary.offerReturnDropped(268_435_456, -281_268_601));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnDroppedInputPositiveNegativeOutputNull2()
      throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", -1);
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", -1_152_921_504_888_050_041L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertNull(streamSummary.offerReturnDropped(268_435_456, -281_268_601));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnDroppedInputPositiveZeroOutputNull() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertNull(streamSummary.offerReturnDropped(268_435_456, 0));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerReturnDroppedInputZeroPositiveOutputNull()
      throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 0;
    final int incrementCount = 3;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final Object actual = streamSummary.offerReturnDropped(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void offerReturnDroppedInputZeroPositiveOutputNull2()
      throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = 0;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(0, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final Object item = 0;
    final int incrementCount = 3;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final Object actual = streamSummary.offerReturnDropped(item, incrementCount);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerReturnDroppedInputZeroZeroOutputNull() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 1;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);

    // Act and Assert result
    Assert.assertNull(streamSummary.offerReturnDropped(0, 0));

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid7() throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void peekInputPositiveOutput1() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -9_223_372_036_854_775_808L;
    counter.item = null;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final int k = 3;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final List actual = streamSummary.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void peekInputZeroOutput0() throws Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final int k = 0;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final List actual = streamSummary.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void peekInputZeroOutput02() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final int k = 0;
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    streamSummary1.bucketList = doublyLinkedList1;
    streamSummary1.capacity = 0;
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(streamSummary1, "counterMap", hashMap1);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket.counterList = doublyLinkedList2;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode22, "value", bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary2.bucketList = doublyLinkedList3;
    streamSummary2.capacity = 0;
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(streamSummary2, "counterMap", hashMap2);
    Reflector.setField(bucket1, "this$0", streamSummary2);
    final DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket1.counterList = doublyLinkedList4;
    Reflector.setField(bucket1, "count", 0L);
    Reflector.setField(listNode21, "value", bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    streamSummary3.bucketList = doublyLinkedList5;
    streamSummary3.capacity = 0;
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap3);
    Reflector.setField(bucket2, "this$0", streamSummary3);
    final DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList6, "head", null);
    Reflector.setField(doublyLinkedList6, "size", 0);
    Reflector.setField(doublyLinkedList6, "tail", null);
    bucket2.counterList = doublyLinkedList6;
    Reflector.setField(bucket2, "count", 0L);
    Reflector.setField(listNode23, "value", bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary4 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList7 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList7, "head", null);
    Reflector.setField(doublyLinkedList7, "size", 0);
    Reflector.setField(doublyLinkedList7, "tail", null);
    streamSummary4.bucketList = doublyLinkedList7;
    streamSummary4.capacity = 0;
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(streamSummary4, "counterMap", hashMap4);
    Reflector.setField(bucket3, "this$0", streamSummary4);
    final DoublyLinkedList doublyLinkedList8 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList8, "head", null);
    Reflector.setField(doublyLinkedList8, "size", 0);
    Reflector.setField(doublyLinkedList8, "tail", null);
    bucket3.counterList = doublyLinkedList8;
    Reflector.setField(bucket3, "count", 0L);
    Reflector.setField(listNode2, "value", bucket3);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary5 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList9 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList9, "head", null);
    Reflector.setField(doublyLinkedList9, "size", 0);
    Reflector.setField(doublyLinkedList9, "tail", null);
    streamSummary5.bucketList = doublyLinkedList9;
    streamSummary5.capacity = 0;
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(streamSummary5, "counterMap", hashMap5);
    Reflector.setField(bucket4, "this$0", streamSummary5);
    final DoublyLinkedList doublyLinkedList10 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList10, "head", null);
    Reflector.setField(doublyLinkedList10, "size", 0);
    Reflector.setField(doublyLinkedList10, "tail", null);
    bucket4.counterList = doublyLinkedList10;
    Reflector.setField(bucket4, "count", 0L);
    Reflector.setField(listNode25, "value", bucket4);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode24, "next", listNode25);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary6 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList11 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList11, "head", null);
    Reflector.setField(doublyLinkedList11, "size", 0);
    Reflector.setField(doublyLinkedList11, "tail", null);
    streamSummary6.bucketList = doublyLinkedList11;
    streamSummary6.capacity = 0;
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(streamSummary6, "counterMap", hashMap6);
    Reflector.setField(bucket5, "this$0", streamSummary6);
    final DoublyLinkedList doublyLinkedList12 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList12, "head", null);
    Reflector.setField(doublyLinkedList12, "size", 0);
    Reflector.setField(doublyLinkedList12, "tail", null);
    bucket5.counterList = doublyLinkedList12;
    Reflector.setField(bucket5, "count", 0L);
    Reflector.setField(listNode24, "value", bucket5);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary7 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList13 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList13, "head", null);
    Reflector.setField(doublyLinkedList13, "size", 0);
    Reflector.setField(doublyLinkedList13, "tail", null);
    streamSummary7.bucketList = doublyLinkedList13;
    streamSummary7.capacity = 0;
    final HashMap hashMap7 = new HashMap();
    hashMap7.put(0, null);
    Reflector.setField(streamSummary7, "counterMap", hashMap7);
    Reflector.setField(bucket6, "this$0", streamSummary7);
    final DoublyLinkedList doublyLinkedList14 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList14, "head", null);
    Reflector.setField(doublyLinkedList14, "size", 0);
    Reflector.setField(doublyLinkedList14, "tail", null);
    bucket6.counterList = doublyLinkedList14;
    Reflector.setField(bucket6, "count", 0L);
    Reflector.setField(listNode26, "value", bucket6);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(listNode24, "prev", listNode26);
    Reflector.setField(listNode2, "prev", listNode24);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final List actual = streamSummary.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void peekInputZeroOutput03() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -9_223_372_036_854_775_808L;
    counter.item = null;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final int k = 0;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final List actual = streamSummary.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid8()
      throws Exception, InvocationTargetException, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 6_125_757_510_338_174_415L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary1.bucketList = doublyLinkedList;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    streamSummary2.bucketList = doublyLinkedList2;
    streamSummary2.capacity = 0;
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(streamSummary2, "counterMap", hashMap1);
    Reflector.setField(bucket1, "this$0", streamSummary2);
    final DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    bucket1.counterList = doublyLinkedList3;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    streamSummary3.bucketList = doublyLinkedList4;
    streamSummary3.capacity = 0;
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap2);
    Reflector.setField(bucket2, "this$0", streamSummary3);
    final DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    bucket2.counterList = doublyLinkedList5;
    Reflector.setField(bucket2, "count", 0L);
    listNode23.setValue(bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary4 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList6, "head", null);
    Reflector.setField(doublyLinkedList6, "size", 0);
    Reflector.setField(doublyLinkedList6, "tail", null);
    streamSummary4.bucketList = doublyLinkedList6;
    streamSummary4.capacity = 0;
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(streamSummary4, "counterMap", hashMap3);
    Reflector.setField(bucket3, "this$0", streamSummary4);
    final DoublyLinkedList doublyLinkedList7 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList7, "head", null);
    Reflector.setField(doublyLinkedList7, "size", 0);
    Reflector.setField(doublyLinkedList7, "tail", null);
    bucket3.counterList = doublyLinkedList7;
    Reflector.setField(bucket3, "count", 0L);
    listNode2.setValue(bucket3);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    listNode25.setValue(null);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode24, "next", listNode25);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary5 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList8 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList8, "head", null);
    Reflector.setField(doublyLinkedList8, "size", 0);
    Reflector.setField(doublyLinkedList8, "tail", null);
    streamSummary5.bucketList = doublyLinkedList8;
    streamSummary5.capacity = 0;
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(streamSummary5, "counterMap", hashMap4);
    Reflector.setField(bucket4, "this$0", streamSummary5);
    final DoublyLinkedList doublyLinkedList9 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList9, "head", null);
    Reflector.setField(doublyLinkedList9, "size", 0);
    Reflector.setField(doublyLinkedList9, "tail", null);
    bucket4.counterList = doublyLinkedList9;
    Reflector.setField(bucket4, "count", 0L);
    listNode24.setValue(bucket4);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary6 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList10 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList10, "head", null);
    Reflector.setField(doublyLinkedList10, "size", 0);
    Reflector.setField(doublyLinkedList10, "tail", null);
    streamSummary6.bucketList = doublyLinkedList10;
    streamSummary6.capacity = 0;
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(streamSummary6, "counterMap", hashMap5);
    Reflector.setField(bucket5, "this$0", streamSummary6);
    final DoublyLinkedList doublyLinkedList11 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList11, "head", null);
    Reflector.setField(doublyLinkedList11, "size", 0);
    Reflector.setField(doublyLinkedList11, "tail", null);
    bucket5.counterList = doublyLinkedList11;
    Reflector.setField(bucket5, "count", 0L);
    listNode26.setValue(bucket5);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(listNode24, "prev", listNode26);
    Reflector.setField(listNode2, "prev", listNode24);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroOutputNotNull() {

    // Act, creating object to test constructor
    final StreamSummary actual = new StreamSummary(0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.bucketList);
    Assert.assertEquals(0, actual.capacity);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void constructorInput0OutputIllegalArgumentException()
      throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2_147_483_644))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    final StreamSummary actual = new StreamSummary(bytes);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid2()
      throws ClassNotFoundException, IOException, Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -3_038_451_991_459_646_113L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode2 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary1.bucketList = doublyLinkedList;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    listNode21.setValue(counter);
    Reflector.setField(listNode21, "prev", null);
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", -3_038_451_991_459_646_113L);
    listNode2.setValue(bucket);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(in, readObjectMethod).withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(in, readIntMethod)
        .withNoArguments();

    // Act
    streamSummary.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.StreamSummary$Bucket"},
                  value = {StreamSummary.class, ObjectInput.class})
  @Test
  public void
  constructorInputNotNullNegativeOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary this$0 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    this$0.bucketList = doublyLinkedList;
    this$0.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(this$0, "counterMap", hashMap);
    final long count = -576_460_752_303_423_490L;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = -576_460_752_303_423_490L;
    counter.item = 0;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    streamSummary.bucketList = doublyLinkedList1;
    streamSummary.capacity = 0;
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(streamSummary, "counterMap", hashMap1);
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket.counterList = doublyLinkedList2;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode22, "value", bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary1.bucketList = doublyLinkedList3;
    streamSummary1.capacity = 0;
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(streamSummary1, "counterMap", hashMap2);
    Reflector.setField(bucket1, "this$0", streamSummary1);
    final DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket1.counterList = doublyLinkedList4;
    Reflector.setField(bucket1, "count", 0L);
    Reflector.setField(listNode21, "value", bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    streamSummary2.bucketList = doublyLinkedList5;
    streamSummary2.capacity = 0;
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(streamSummary2, "counterMap", hashMap3);
    Reflector.setField(bucket2, "this$0", streamSummary2);
    final DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList6, "head", null);
    Reflector.setField(doublyLinkedList6, "size", 0);
    Reflector.setField(doublyLinkedList6, "tail", null);
    bucket2.counterList = doublyLinkedList6;
    Reflector.setField(bucket2, "count", 0L);
    Reflector.setField(listNode23, "value", bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList7 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList7, "head", null);
    Reflector.setField(doublyLinkedList7, "size", 0);
    Reflector.setField(doublyLinkedList7, "tail", null);
    streamSummary3.bucketList = doublyLinkedList7;
    streamSummary3.capacity = 0;
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap4);
    Reflector.setField(bucket3, "this$0", streamSummary3);
    final DoublyLinkedList doublyLinkedList8 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList8, "head", null);
    Reflector.setField(doublyLinkedList8, "size", 0);
    Reflector.setField(doublyLinkedList8, "tail", null);
    bucket3.counterList = doublyLinkedList8;
    Reflector.setField(bucket3, "count", 0L);
    Reflector.setField(listNode2, "value", bucket3);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary4 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList9 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList9, "head", null);
    Reflector.setField(doublyLinkedList9, "size", 0);
    Reflector.setField(doublyLinkedList9, "tail", null);
    streamSummary4.bucketList = doublyLinkedList9;
    streamSummary4.capacity = 0;
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(streamSummary4, "counterMap", hashMap5);
    Reflector.setField(bucket4, "this$0", streamSummary4);
    final DoublyLinkedList doublyLinkedList10 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList10, "head", null);
    Reflector.setField(doublyLinkedList10, "size", 0);
    Reflector.setField(doublyLinkedList10, "tail", null);
    bucket4.counterList = doublyLinkedList10;
    Reflector.setField(bucket4, "count", 0L);
    Reflector.setField(listNode25, "value", bucket4);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode24, "next", listNode25);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary5 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList11 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList11, "head", null);
    Reflector.setField(doublyLinkedList11, "size", 0);
    Reflector.setField(doublyLinkedList11, "tail", null);
    streamSummary5.bucketList = doublyLinkedList11;
    streamSummary5.capacity = 0;
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(streamSummary5, "counterMap", hashMap6);
    Reflector.setField(bucket5, "this$0", streamSummary5);
    final DoublyLinkedList doublyLinkedList12 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList12, "head", null);
    Reflector.setField(doublyLinkedList12, "size", 0);
    Reflector.setField(doublyLinkedList12, "tail", null);
    bucket5.counterList = doublyLinkedList12;
    Reflector.setField(bucket5, "count", 0L);
    Reflector.setField(listNode24, "value", bucket5);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary6 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList13 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList13, "head", null);
    Reflector.setField(doublyLinkedList13, "size", 0);
    Reflector.setField(doublyLinkedList13, "tail", null);
    streamSummary6.bucketList = doublyLinkedList13;
    streamSummary6.capacity = 0;
    final HashMap hashMap7 = new HashMap();
    hashMap7.put(0, null);
    Reflector.setField(streamSummary6, "counterMap", hashMap7);
    Reflector.setField(bucket6, "this$0", streamSummary6);
    final DoublyLinkedList doublyLinkedList14 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList14, "head", null);
    Reflector.setField(doublyLinkedList14, "size", 0);
    Reflector.setField(doublyLinkedList14, "tail", null);
    bucket6.counterList = doublyLinkedList14;
    Reflector.setField(bucket6, "count", 0L);
    Reflector.setField(listNode26, "value", bucket6);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(listNode24, "prev", listNode26);
    Reflector.setField(listNode2, "prev", listNode24);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    final StreamSummary.Bucket actual = this$0.new Bucket(count);

    // Assert side effects
    Assert.assertNotNull(actual.counterList);
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullZeroOutputVoid() {

    // Arrange
    final StreamSummary this$0 = new StreamSummary();
    this$0.bucketList = null;
    this$0.capacity = 0;
    Reflector.setField(this$0, "counterMap", null);
    final long count = 0L;

    // Act, creating object to test constructor
    final StreamSummary.Bucket actual = this$0.new Bucket(count);

    // Assert side effects
    Assert.assertNotNull(actual.counterList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.StreamSummary$Bucket"},
                  value = {StreamSummary.class, ObjectInput.class})
  @Test
  public void
  constructorInputNotNullZeroOutputVoid2() throws Exception {

    // Arrange
    final StreamSummary this$0 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    this$0.bucketList = doublyLinkedList;
    this$0.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(this$0, "counterMap", hashMap);
    final long count = 0L;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act, creating object to test constructor
    final StreamSummary.Bucket actual = this$0.new Bucket(count);

    // Assert side effects
    Assert.assertNotNull(actual.counterList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid5() throws Exception, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream2 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod2 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream2, readIntMethod2)
        .withNoArguments();
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1)
        .thenReturn(objectInputStream2);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void fromBytesInput0OutputVoid6()
      throws Exception, InvocationTargetException, IOException, ClassNotFoundException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final byte[] bytes = {};
    final ObjectInputStream objectInputStream2 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod2 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream2, readIntMethod2)
        .withNoArguments();
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 445_091_171_635_534_404L;
    counter.item = null;
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary1.bucketList = doublyLinkedList;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket, "this$0", streamSummary1);
    final DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode22, "value", bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary2 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 0);
    Reflector.setField(doublyLinkedList2, "tail", null);
    streamSummary2.bucketList = doublyLinkedList2;
    streamSummary2.capacity = 0;
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(streamSummary2, "counterMap", hashMap1);
    Reflector.setField(bucket1, "this$0", streamSummary2);
    final DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    bucket1.counterList = doublyLinkedList3;
    Reflector.setField(bucket1, "count", 0L);
    Reflector.setField(listNode21, "value", bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary3 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    streamSummary3.bucketList = doublyLinkedList4;
    streamSummary3.capacity = 0;
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(streamSummary3, "counterMap", hashMap2);
    Reflector.setField(bucket2, "this$0", streamSummary3);
    final DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList5, "head", null);
    Reflector.setField(doublyLinkedList5, "size", 0);
    Reflector.setField(doublyLinkedList5, "tail", null);
    bucket2.counterList = doublyLinkedList5;
    Reflector.setField(bucket2, "count", 0L);
    Reflector.setField(listNode23, "value", bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary4 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList6, "head", null);
    Reflector.setField(doublyLinkedList6, "size", 0);
    Reflector.setField(doublyLinkedList6, "tail", null);
    streamSummary4.bucketList = doublyLinkedList6;
    streamSummary4.capacity = 0;
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(streamSummary4, "counterMap", hashMap3);
    Reflector.setField(bucket3, "this$0", streamSummary4);
    final DoublyLinkedList doublyLinkedList7 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList7, "head", null);
    Reflector.setField(doublyLinkedList7, "size", 0);
    Reflector.setField(doublyLinkedList7, "tail", null);
    bucket3.counterList = doublyLinkedList7;
    Reflector.setField(bucket3, "count", 0L);
    Reflector.setField(listNode2, "value", bucket3);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary5 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList8 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList8, "head", null);
    Reflector.setField(doublyLinkedList8, "size", 0);
    Reflector.setField(doublyLinkedList8, "tail", null);
    streamSummary5.bucketList = doublyLinkedList8;
    streamSummary5.capacity = 0;
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(streamSummary5, "counterMap", hashMap4);
    Reflector.setField(bucket4, "this$0", streamSummary5);
    final DoublyLinkedList doublyLinkedList9 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList9, "head", null);
    Reflector.setField(doublyLinkedList9, "size", 0);
    Reflector.setField(doublyLinkedList9, "tail", null);
    bucket4.counterList = doublyLinkedList9;
    Reflector.setField(bucket4, "count", 0L);
    Reflector.setField(listNode25, "value", bucket4);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode24, "next", listNode25);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary6 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList10 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList10, "head", null);
    Reflector.setField(doublyLinkedList10, "size", 0);
    Reflector.setField(doublyLinkedList10, "tail", null);
    streamSummary6.bucketList = doublyLinkedList10;
    streamSummary6.capacity = 0;
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(streamSummary6, "counterMap", hashMap5);
    Reflector.setField(bucket5, "this$0", streamSummary6);
    final DoublyLinkedList doublyLinkedList11 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList11, "head", null);
    Reflector.setField(doublyLinkedList11, "size", 0);
    Reflector.setField(doublyLinkedList11, "tail", null);
    bucket5.counterList = doublyLinkedList11;
    Reflector.setField(bucket5, "count", 0L);
    Reflector.setField(listNode24, "value", bucket5);
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary7 = new StreamSummary();
    final DoublyLinkedList doublyLinkedList12 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList12, "head", null);
    Reflector.setField(doublyLinkedList12, "size", 0);
    Reflector.setField(doublyLinkedList12, "tail", null);
    streamSummary7.bucketList = doublyLinkedList12;
    streamSummary7.capacity = 0;
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(streamSummary7, "counterMap", hashMap6);
    Reflector.setField(bucket6, "this$0", streamSummary7);
    final DoublyLinkedList doublyLinkedList13 = new DoublyLinkedList();
    Reflector.setField(doublyLinkedList13, "head", null);
    Reflector.setField(doublyLinkedList13, "size", 0);
    Reflector.setField(doublyLinkedList13, "tail", null);
    bucket6.counterList = doublyLinkedList13;
    Reflector.setField(bucket6, "count", 0L);
    Reflector.setField(listNode26, "value", bucket6);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(listNode24, "prev", listNode26);
    Reflector.setField(listNode2, "prev", listNode24);
    counter.bucketNode = listNode2;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream1, readObjectMethod).withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1)
        .thenReturn(objectInputStream2);

    // Act
    streamSummary.fromBytes(bytes);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void getCapacityOutputZero2() throws Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final int actual = streamSummary.getCapacity();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void getCapacityOutputZero3() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(null, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream1, readObjectMethod).withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final int actual = streamSummary.getCapacity();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void sizeOutputPositive() throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", streamSummary);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = -1;
    counter.bucketNode = listNode2;
    Reflector.setField(listNode21, "value", counter);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(doublyLinkedList1, "head", listNode21);
    Reflector.setField(doublyLinkedList1, "size", 1);
    Reflector.setField(doublyLinkedList1, "tail", listNode21);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    Reflector.setField(listNode2, "value", bucket);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", listNode2);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(-1, listNode21);
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final int actual = streamSummary.size();

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectInput.class})
  @Test
  public void sizeOutputZero() throws Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final ObjectInputStream objectInputStream1 = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod1 = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream1, readIntMethod1)
        .withNoArguments();
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream)
        .thenReturn(objectInputStream1);

    // Act
    final int actual = streamSummary.size();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullPositiveOutputVoid() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 4_611_686_016_280_166_401L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 3_458_764_513_820_540_928L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket1.counterList = doublyLinkedList2;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList3 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary1.bucketList = doublyLinkedList3;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket2, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList4 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket2.counterList = doublyLinkedList4;
    Reflector.setField(bucket2, "count", 0L);
    listNode23.setValue(bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    listNode24.setValue(null);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(counterNode, "prev", listNode24);

    // Act
    streamSummary.incrementCounter(counterNode, 2_147_483_647);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(4_611_686_018_427_650_048L,
                        ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getNext());
    Assert.assertNotNull(
        ((ListNode2<StreamSummary.Bucket>)((Counter)((ListNode2<Counter>)counterNode).getValue())
             .bucketNode)
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2<StreamSummary.Bucket>)((Counter)((ListNode2<Counter>)
                                                                                counterNode)
                                                                      .getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev().getNext());
    Assert.assertNotNull(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev().getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((Counter)((ListNode2<Counter>)counterNode).getValue())
             .bucketNode.getPrev()
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev().getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode.getPrev(),
        ((Counter)((ListNode2<Counter>)counterNode).getValue())
            .bucketNode.getPrev()
            .getPrev()
            .getNext());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue())
                             .bucketNode.getPrev()
                             .getPrev()
                             .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((Counter)((ListNode2<Counter>)counterNode).getValue())
             .bucketNode.getPrev()
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue())
                          .bucketNode.getPrev()
                          .getPrev()
                          .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void topKInputNegativeOutputIllegalArgumentException() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();

    // Act
    thrown.expect(IllegalArgumentException.class);
    streamSummary.topK(-2_147_483_648);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputNegativeOutputIllegalArgumentException() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();

    // Act
    thrown.expect(IllegalArgumentException.class);
    streamSummary.peek(-2_147_483_648);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid000ca7708893335116b()
      throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    bucket.counterList = doublyLinkedList;
    Reflector.setField(bucket, "count", 0L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 2);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket1.counterList = doublyLinkedList1;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    Reflector.setField(listNode21, "prev", null);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(null);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(counterNode, "prev", listNode23);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid11() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket.counterList = doublyLinkedList1;
    Reflector.setField(bucket, "count", 0L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket1.counterList = doublyLinkedList2;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList3 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary1.bucketList = doublyLinkedList3;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket2, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList4 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket2.counterList = doublyLinkedList4;
    Reflector.setField(bucket2, "count", 0L);
    listNode23.setValue(bucket2);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(listNode21, "prev", listNode23);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    listNode24.setValue(null);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(counterNode, "prev", listNode24);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid4() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    streamSummary.bucketList = null;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    Reflector.setField(counterNode, "next", listNode2);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode21 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    bucket.counterList = doublyLinkedList;
    Reflector.setField(bucket, "count", 0L);
    listNode22.setValue(bucket);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode21, "next", listNode22);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    streamSummary1.bucketList = null;
    streamSummary1.capacity = 0;
    Reflector.setField(streamSummary1, "counterMap", null);
    Reflector.setField(bucket1, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 2);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket1.counterList = doublyLinkedList1;
    Reflector.setField(bucket1, "count", 0L);
    listNode21.setValue(bucket1);
    Reflector.setField(listNode21, "prev", null);
    counter.bucketNode = listNode21;
    counterNode.setValue(counter);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode23, "next", null);
    listNode23.setValue(null);
    Reflector.setField(listNode23, "prev", null);
    Reflector.setField(counterNode, "prev", listNode23);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void incrementCounterInputNotNullZeroOutputVoid2() throws InvocationTargetException {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode21, "next", null);
    final StreamSummary.Bucket bucket = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", null);
    bucket.counterList = null;
    Reflector.setField(bucket, "count", 0L);
    listNode21.setValue(bucket);
    Reflector.setField(listNode21, "prev", null);
    Reflector.setField(listNode2, "next", listNode21);
    final StreamSummary.Bucket bucket1 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket1, "this$0", null);
    bucket1.counterList = null;
    Reflector.setField(bucket1, "count", 0L);
    listNode2.setValue(bucket1);
    final ListNode2 listNode22 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode22, "next", null);
    final StreamSummary.Bucket bucket2 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket2, "this$0", null);
    bucket2.counterList = null;
    Reflector.setField(bucket2, "count", 0L);
    listNode22.setValue(bucket2);
    Reflector.setField(listNode22, "prev", null);
    Reflector.setField(listNode2, "prev", listNode22);
    Reflector.setField(doublyLinkedList, "head", listNode2);
    Reflector.setField(doublyLinkedList, "size", 1);
    final ListNode2 listNode23 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode24 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode24, "next", null);
    final StreamSummary.Bucket bucket3 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket3, "this$0", null);
    bucket3.counterList = null;
    Reflector.setField(bucket3, "count", 0L);
    listNode24.setValue(bucket3);
    Reflector.setField(listNode24, "prev", null);
    Reflector.setField(listNode23, "next", listNode24);
    final StreamSummary.Bucket bucket4 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket4, "this$0", null);
    bucket4.counterList = null;
    Reflector.setField(bucket4, "count", 0L);
    listNode23.setValue(bucket4);
    final ListNode2 listNode25 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode25, "next", null);
    final StreamSummary.Bucket bucket5 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket5, "this$0", null);
    bucket5.counterList = null;
    Reflector.setField(bucket5, "count", 0L);
    listNode25.setValue(bucket5);
    Reflector.setField(listNode25, "prev", null);
    Reflector.setField(listNode23, "prev", listNode25);
    Reflector.setField(doublyLinkedList, "tail", listNode23);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);
    final ListNode2<Counter> counterNode =
        (ListNode2<Counter>)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode26 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode26, "next", null);
    listNode26.setValue(null);
    Reflector.setField(listNode26, "prev", null);
    Reflector.setField(counterNode, "next", listNode26);
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode27 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    final ListNode2 listNode28 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode28, "next", null);
    final StreamSummary.Bucket bucket6 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket6, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList1, "head", null);
    Reflector.setField(doublyLinkedList1, "size", 0);
    Reflector.setField(doublyLinkedList1, "tail", null);
    bucket6.counterList = doublyLinkedList1;
    Reflector.setField(bucket6, "count", 0L);
    listNode28.setValue(bucket6);
    Reflector.setField(listNode28, "prev", null);
    Reflector.setField(listNode27, "next", listNode28);
    final StreamSummary.Bucket bucket7 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket7, "this$0", null);
    final DoublyLinkedList<Counter> doublyLinkedList2 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList2, "head", null);
    Reflector.setField(doublyLinkedList2, "size", 1);
    Reflector.setField(doublyLinkedList2, "tail", null);
    bucket7.counterList = doublyLinkedList2;
    Reflector.setField(bucket7, "count", 0L);
    listNode27.setValue(bucket7);
    final ListNode2 listNode29 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode29, "next", null);
    final StreamSummary.Bucket bucket8 = (StreamSummary.Bucket)Reflector.getInstance(
        "com.clearspring.analytics.stream.StreamSummary$Bucket");
    final StreamSummary streamSummary1 = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList3 =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList3, "head", null);
    Reflector.setField(doublyLinkedList3, "size", 0);
    Reflector.setField(doublyLinkedList3, "tail", null);
    streamSummary1.bucketList = doublyLinkedList3;
    streamSummary1.capacity = 0;
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(streamSummary1, "counterMap", hashMap);
    Reflector.setField(bucket8, "this$0", streamSummary1);
    final DoublyLinkedList<Counter> doublyLinkedList4 = new DoublyLinkedList<Counter>();
    Reflector.setField(doublyLinkedList4, "head", null);
    Reflector.setField(doublyLinkedList4, "size", 0);
    Reflector.setField(doublyLinkedList4, "tail", null);
    bucket8.counterList = doublyLinkedList4;
    Reflector.setField(bucket8, "count", 0L);
    listNode29.setValue(bucket8);
    Reflector.setField(listNode29, "prev", null);
    Reflector.setField(listNode27, "prev", listNode29);
    counter.bucketNode = listNode27;
    counterNode.setValue(counter);
    final ListNode2 listNode210 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode210, "next", null);
    listNode210.setValue(null);
    Reflector.setField(listNode210, "prev", null);
    Reflector.setField(counterNode, "prev", listNode210);

    // Act
    streamSummary.incrementCounter(counterNode, 0);

    // Assert side effects
    Assert.assertNotNull(streamSummary.bucketList);
    Assert.assertNotNull(counterNode);
    Assert.assertNull(counterNode.getNext());
    Assert.assertNotNull(((ListNode2<Counter>)counterNode).getValue());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getError());
    Assert.assertEquals(0L, ((Counter)((ListNode2<Counter>)counterNode).getValue()).getCount());
    Assert.assertNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).getItem());
    Assert.assertNotNull(((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getValue())
            .counterList);
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode).getPrev());
    Assert.assertEquals(
        ((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode,
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getNext());
    Assert.assertNotNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue())
                                    .bucketNode)
             .getPrev()
             .getValue())
            .counterList);
    Assert.assertNull(
        ((ListNode2)((Counter)((ListNode2<Counter>)counterNode).getValue()).bucketNode)
            .getPrev()
            .getPrev());
    Assert.assertNull(counterNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputZeroOutput00002fe531b0950e504a() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);

    // Act
    final List actual = streamSummary.peek(0);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void topKInputZeroOutput000034570b88d4cab474() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);

    // Act
    final List<Counter> actual = streamSummary.topK(0);

    // Assert result
    final ArrayList<Counter> arrayList = new ArrayList<Counter>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCapacityOutputZero() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();

    // Act and Assert result
    Assert.assertEquals(0, streamSummary.getCapacity());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull2() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 1);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);

    // Act and Assert result
    Assert.assertEquals("]", streamSummary.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    Reflector.setField(streamSummary, "counterMap", null);

    // Act and Assert result
    Assert.assertEquals("[]", streamSummary.toString());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid0009c5bf33a1699a7da()
      throws IOException, Exception {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final DoublyLinkedList<StreamSummary.Bucket> doublyLinkedList =
        new DoublyLinkedList<StreamSummary.Bucket>();
    Reflector.setField(doublyLinkedList, "head", null);
    Reflector.setField(doublyLinkedList, "size", 0);
    Reflector.setField(doublyLinkedList, "tail", null);
    streamSummary.bucketList = doublyLinkedList;
    streamSummary.capacity = 0;
    final HashMap hashMap = new HashMap();
    Reflector.setField(streamSummary, "counterMap", hashMap);
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    streamSummary.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }
}
