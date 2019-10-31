package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StochasticTopper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StochasticTopper_offerTest_2_Test {
  @Test
  public void offerTest() throws Exception {
    // Arrange
    StochasticTopper<Object> stochasticTopper = new StochasticTopper<Object>(1);
    String item = "aaaaa";

    // Act
    boolean actual = stochasticTopper.offer(item);

    // Assert
    Assert.assertTrue(actual);
    Assert.assertNotNull(stochasticTopper.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
