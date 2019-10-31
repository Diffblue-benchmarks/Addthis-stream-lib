package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.Counter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Counter_getItemTest_2_Test {
  @Test
  public void getItemTest() throws Exception {
    // Arrange
    Counter<Object> counter = new Counter<Object>();

    // Act
    Object actual = counter.getItem();

    // Assert
    Assert.assertEquals(null, actual);
    Object item = counter.getItem();
    String toStringResult = counter.toString();
    long error = counter.getError();
    Assert.assertEquals(null, item);
    Assert.assertEquals(0L, counter.getCount());
    Assert.assertEquals(0L, error);
    Assert.assertEquals("null:0:0", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
