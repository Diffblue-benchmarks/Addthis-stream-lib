package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Builder_withAccuracyTest_15_Test {
  @Test
  public void withAccuracyTest() throws Exception {
    // Arrange
    double accuracy = 1.0;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    HyperLogLog.Builder.withAccuracy(accuracy);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
