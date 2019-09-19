package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.Counter;
import com.clearspring.analytics.stream.StreamSummary.Bucket;
import com.clearspring.analytics.stream.StreamSummary;
import com.clearspring.analytics.util.ListNode2;
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
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class CounterTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullZeroOutputNotNull() {

    // Arrange
    final StreamSummary streamSummary = new StreamSummary();
    final StreamSummary.Bucket streamSummary$Bucket = streamSummary.new Bucket(0L);
    final ListNode2<StreamSummary.Bucket> bucket =
        new ListNode2<StreamSummary.Bucket>(streamSummary$Bucket);

    // Act, creating object to test constructor
    final Counter actual = new Counter(bucket, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.error);
    Assert.assertEquals(0L, actual.count);
    Assert.assertEquals(0, actual.item);
    Assert.assertNotNull(actual.bucketNode);
    Assert.assertNull(actual.bucketNode.getNext());
    Assert.assertNotNull(((ListNode2<StreamSummary.Bucket>)actual.bucketNode).getValue());
    Assert.assertNotNull(
        ((StreamSummary.Bucket)((ListNode2<StreamSummary.Bucket>)actual.bucketNode).getValue())
            .counterList);
    Assert.assertNull(actual.bucketNode.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCountOutputZero() {

    // Arrange
    final Counter counter = new Counter();

    // Act and Assert result
    Assert.assertEquals(0L, counter.getCount());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getErrorOutputZero() {

    // Arrange
    final Counter counter = new Counter();

    // Act and Assert result
    Assert.assertEquals(0L, counter.getError());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getItemOutputNull() {

    // Arrange
    final Counter counter = new Counter();

    // Act and Assert result
    Assert.assertNull(counter.getItem());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull00087d0da7933e2d89d() {

    // Arrange
    final Counter counter = new Counter();

    // Act and Assert result
    Assert.assertEquals("null:0:0", counter.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final Counter actual = new Counter();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.error);
    Assert.assertEquals(0L, actual.count);
    Assert.assertNull(actual.item);
    Assert.assertNull(actual.bucketNode);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull2() {

    // Arrange
    final Counter counter = new Counter();
    counter.error = 9L;
    counter.count = 0L;
    counter.item = 3;
    counter.bucketNode = null;

    // Act and Assert result
    Assert.assertEquals("3:0:9", counter.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull7() {

    // Arrange
    final Counter counter = new Counter();
    counter.error = 7L;
    counter.count = 7L;
    counter.item = 1000;
    counter.bucketNode = null;

    // Act and Assert result
    Assert.assertEquals("1000:7:7", counter.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull3() {

    // Arrange
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 5L;
    counter.item = -21;
    counter.bucketNode = null;

    // Act and Assert result
    Assert.assertEquals("-21:5:0", counter.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull4() {

    // Arrange
    final Counter counter = new Counter();
    counter.error = 1L;
    counter.count = 7L;
    counter.item = 1;
    counter.bucketNode = null;

    // Act and Assert result
    Assert.assertEquals("1:7:1", counter.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull6() {

    // Arrange
    final Counter counter = new Counter();
    counter.error = 7L;
    counter.count = -6L;
    counter.item = 1;
    counter.bucketNode = null;

    // Act and Assert result
    Assert.assertEquals("1:-6:7", counter.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final Counter counter = new Counter();
    counter.error = -7L;
    counter.count = 7L;
    counter.item = null;
    final ListNode2<StreamSummary.Bucket> listNode2 =
        (ListNode2<StreamSummary.Bucket>)Reflector.getInstance(
            "com.clearspring.analytics.util.ListNode2");
    Reflector.setField(listNode2, "next", null);
    listNode2.setValue(null);
    Reflector.setField(listNode2, "prev", null);
    counter.bucketNode = listNode2;

    // Act and Assert result
    Assert.assertEquals("null:7:-7", counter.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull8() {

    // Arrange
    final Counter counter = new Counter();
    counter.error = 5L;
    counter.count = 9L;
    counter.item = null;
    counter.bucketNode = null;

    // Act and Assert result
    Assert.assertEquals("null:9:5", counter.toString());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Counter.class, ObjectInput.class})
  @Test
  public void readExternalInputNotNullOutputVoid()
      throws ClassNotFoundException, IOException, Exception {

    // Arrange
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    counter.bucketNode = null;
    final ObjectInput in = PowerMockito.mock(ObjectInput.class);
    final Method readLongMethod = DTUMemberMatcher.method(ObjectInput.class, "readLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(in, readLongMethod)
        .withNoArguments();
    final Counter counter1 = new Counter();
    counter1.error = 0L;
    counter1.count = 0L;
    counter1.item = null;
    counter1.bucketNode = null;
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter1).when(in, readObjectMethod).withNoArguments();

    // Act
    counter.readExternal(in);

    // Assert side effects
    Assert.assertNotNull(counter.getItem());
    Assert.assertEquals(0L, ((Counter)counter.getItem()).getError());
    Assert.assertEquals(0L, ((Counter)counter.getItem()).getCount());
    Assert.assertNull(((Counter)counter.getItem()).getItem());
    Assert.assertNull(((Counter)counter.getItem()).bucketNode);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Counter.class, ObjectOutput.class})
  @Test
  public void writeExternalInputNotNullOutputVoid() throws IOException, Exception {

    // Arrange
    final Counter counter = new Counter();
    counter.error = 0L;
    counter.count = 0L;
    counter.item = null;
    counter.bucketNode = null;
    final ObjectOutput out = PowerMockito.mock(ObjectOutput.class);

    // Act
    counter.writeExternal(out);

    // The method returns void, testing that no exception is thrown
  }
}
