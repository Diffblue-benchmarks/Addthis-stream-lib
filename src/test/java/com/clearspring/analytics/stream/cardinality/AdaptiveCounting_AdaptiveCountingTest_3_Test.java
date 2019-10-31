package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.AdaptiveCounting;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AdaptiveCounting_AdaptiveCountingTest_3_Test {
  @Test
  public void AdaptiveCountingTest() throws Exception {
    // Arrange
    int k = 1;

    // Act
    AdaptiveCounting adaptiveCounting = new AdaptiveCounting(k);

    // Assert
    byte[] bytes = adaptiveCounting.getBytes();
    int sizeofResult = adaptiveCounting.sizeof();
    long cardinalityResult = adaptiveCounting.cardinality();
    Assert.assertEquals(2, bytes.length);
    Assert.assertArrayEquals(new byte[]{0, 0}, bytes);
    Assert.assertNotNull(adaptiveCounting.toString());
    Assert.assertEquals(0L, cardinalityResult);
    Assert.assertEquals(2, sizeofResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
