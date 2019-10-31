package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.BloomCalculations;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BloomCalculations_computeBucketsAndKTest_3_Test {
  @Test
  public void computeBucketsAndKTest() throws Exception {
    // Arrange
    double maxFalsePosProb = 1.0;

    // Act
    BloomCalculations.BloomSpecification actual = BloomCalculations.computeBucketsAndK(maxFalsePosProb);

    // Assert
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
