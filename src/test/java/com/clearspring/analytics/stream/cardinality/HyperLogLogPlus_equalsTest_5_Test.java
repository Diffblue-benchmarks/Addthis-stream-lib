package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class HyperLogLogPlus_equalsTest_5_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    HyperLogLogPlus hyperLogLogPlus = Whitebox.newInstance(HyperLogLogPlus.class);
    String obj = "aaaaa";

    // Act
    boolean actual = hyperLogLogPlus.equals(obj);

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
