package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.AdaptiveCounting;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AdaptiveCounting_rhoTest_2_Test {
  @Test
  public void rhoTest() throws Exception {
    // Arrange
    long x = 1L;
    int k = 1;

    // Act
    byte actual = AdaptiveCounting.rho(x, k);

    // Assert
    Assert.assertEquals((byte) 63, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
