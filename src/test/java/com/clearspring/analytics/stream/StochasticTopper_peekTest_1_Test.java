package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StochasticTopper;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StochasticTopper_peekTest_1_Test {
  @Test
  public void peekTest() throws Exception {
    // Arrange
    StochasticTopper<Object> stochasticTopper = new StochasticTopper<Object>(1);
    int k = 1;

    // Act
    List<Object> actual = stochasticTopper.peek(k);

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(0, actual.size());
    Assert.assertNotNull(stochasticTopper.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
