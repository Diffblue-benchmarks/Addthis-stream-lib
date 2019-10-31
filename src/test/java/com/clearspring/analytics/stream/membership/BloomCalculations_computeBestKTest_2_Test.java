package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.BloomCalculations;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BloomCalculations_computeBestKTest_2_Test {
  @Test
  public void computeBestKTest() throws Exception {
    // Arrange
    int bucketsPerElement = 1;

    // Act
    int actual = BloomCalculations.computeBestK(bucketsPerElement);

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
