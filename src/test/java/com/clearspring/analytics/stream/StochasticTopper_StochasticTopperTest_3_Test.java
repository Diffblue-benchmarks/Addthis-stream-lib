package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StochasticTopper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StochasticTopper_StochasticTopperTest_3_Test {
  @Test
  public void StochasticTopperTest() throws Exception {
    // Arrange
    int sampleSize = 1;

    // Act
    StochasticTopper<Object> stochasticTopper = new StochasticTopper<Object>(sampleSize);

    // Assert
    Assert.assertNotNull(stochasticTopper.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
