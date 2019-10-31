package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.CountThenEstimate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CountThenEstimate_getBytesTest_4_Test {
  @Test
  public void getBytesTest() throws Exception {
    // Arrange
    CountThenEstimate countThenEstimate = new CountThenEstimate();

    // Act
    byte[] actual = countThenEstimate.getBytes();

    // Assert
    Assert.assertEquals(111, actual.length);
    Assert.assertEquals((byte) -84, actual[0]);
    Assert.assertEquals((byte) -19, actual[1]);
    Assert.assertEquals((byte) 0, actual[2]);
    Assert.assertEquals((byte) 5, actual[3]);
    Assert.assertEquals((byte) 119, actual[4]);
    Assert.assertEquals((byte) 5, actual[5]);
    Assert.assertEquals((byte) 119, actual[105]);
    Assert.assertEquals((byte) 4, actual[106]);
    Assert.assertEquals((byte) 0, actual[107]);
    Assert.assertEquals((byte) 0, actual[108]);
    Assert.assertEquals((byte) 0, actual[109]);
    Assert.assertEquals((byte) 0, actual[110]);
    byte[] bytes = countThenEstimate.getBytes();
    long cardinalityResult = countThenEstimate.cardinality();
    int sizeofResult = countThenEstimate.sizeof();
    Assert.assertEquals(111, bytes.length);
    Assert.assertEquals((byte) -84, bytes[0]);
    Assert.assertEquals((byte) -19, bytes[1]);
    Assert.assertEquals((byte) 0, bytes[2]);
    Assert.assertEquals((byte) 0, bytes[108]);
    Assert.assertEquals((byte) 0, bytes[109]);
    Assert.assertEquals((byte) 0, bytes[110]);
    Assert.assertNotNull(countThenEstimate.toString());
    Assert.assertEquals(-1, sizeofResult);
    Assert.assertEquals(0L, cardinalityResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
