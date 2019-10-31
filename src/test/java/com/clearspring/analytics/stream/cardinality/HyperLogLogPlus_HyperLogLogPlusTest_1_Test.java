package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class HyperLogLogPlus_HyperLogLogPlusTest_1_Test {
  @Test
  public void HyperLogLogPlusTest() throws Exception {
    // Arrange
    int p = 1;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new HyperLogLogPlus(p);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
