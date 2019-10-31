package com.clearspring.analytics.util;

import com.clearspring.analytics.stream.Counter;
import com.clearspring.analytics.util.ExternalizableUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExternalizableUtil_toBytesTest_1_Test {
  @Test
  public void toBytesTest() throws Exception {
    // Arrange
    Counter<Object> counter = new Counter<Object>();

    // Act
    byte[] actual = ExternalizableUtil.toBytes(counter);

    // Assert
    Assert.assertEquals(23, actual.length);
    Assert.assertEquals((byte) -84, actual[0]);
    Assert.assertEquals((byte) -19, actual[1]);
    Assert.assertEquals((byte) 0, actual[2]);
    Assert.assertEquals((byte) 5, actual[3]);
    Assert.assertEquals((byte) 112, actual[4]);
    Assert.assertEquals((byte) 119, actual[5]);
    Assert.assertEquals((byte) 0, actual[17]);
    Assert.assertEquals((byte) 0, actual[18]);
    Assert.assertEquals((byte) 0, actual[19]);
    Assert.assertEquals((byte) 0, actual[20]);
    Assert.assertEquals((byte) 0, actual[21]);
    Assert.assertEquals((byte) 0, actual[22]);
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
