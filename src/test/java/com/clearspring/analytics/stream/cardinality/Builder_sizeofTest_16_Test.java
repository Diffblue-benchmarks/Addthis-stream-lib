package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_sizeofTest_16_Test {
  @Test
  public void sizeofTest() throws Exception {
    // Arrange
    HyperLogLogPlus.Builder builder = new HyperLogLogPlus.Builder(1, 1);

    // Act
    int actual = builder.sizeof();

    // Assert
    Assert.assertEquals(0, actual);
    int sizeofResult = builder.sizeof();
    Assert.assertEquals(0, sizeofResult);
    Assert.assertNotNull(builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
