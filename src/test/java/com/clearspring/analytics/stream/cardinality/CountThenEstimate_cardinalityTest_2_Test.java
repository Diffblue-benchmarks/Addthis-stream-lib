package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.CountThenEstimate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CountThenEstimate_cardinalityTest_2_Test {
  @Test
  public void cardinalityTest() throws Exception {
    // Arrange
    CountThenEstimate countThenEstimate = new CountThenEstimate();

    // Act
    long actual = countThenEstimate.cardinality();

    // Assert
    Assert.assertEquals(0L, actual);
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
