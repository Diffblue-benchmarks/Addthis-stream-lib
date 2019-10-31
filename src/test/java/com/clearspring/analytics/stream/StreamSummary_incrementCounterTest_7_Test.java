package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.Counter;
import com.clearspring.analytics.stream.StreamSummary;
import com.clearspring.analytics.util.ListNode2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamSummary_incrementCounterTest_7_Test {
  @Test
  public void incrementCounterTest() throws Exception {
    // Arrange
    StreamSummary<Object> streamSummary = new StreamSummary<Object>();
    Counter<Object> counter = new Counter<Object>();
    ListNode2<Counter<Object>> listNode2 = new ListNode2<Counter<Object>>(counter);
    int incrementCount = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    streamSummary.incrementCounter(listNode2, incrementCount);
    String toStringResult = listNode2.toString();
    ListNode2<Counter<Object>> prev = listNode2.getPrev();
    Counter<Object> value = listNode2.getValue();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, listNode2.getNext());
    Assert.assertSame(counter, value);
    Object item = value.getItem();
    String toStringResult1 = value.toString();
    long error = value.getError();
    Assert.assertEquals(null, prev);
    Assert.assertEquals(0L, value.getCount());
    Assert.assertEquals(0L, error);
    Assert.assertEquals("null:0:0", toStringResult1);
    Assert.assertEquals(null, item);
    Assert.assertEquals(0, streamSummary.getCapacity());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
