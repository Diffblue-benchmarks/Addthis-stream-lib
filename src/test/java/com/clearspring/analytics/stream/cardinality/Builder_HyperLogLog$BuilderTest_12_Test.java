package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_HyperLogLog$BuilderTest_12_Test {
  @Test
  public void HyperLogLog$BuilderTest() throws Exception {
    // Arrange
    double rsd = 1.0;

    // Act
    HyperLogLog.Builder builder = new HyperLogLog.Builder(rsd);

    // Assert
    int sizeofResult = builder.sizeof();
    Assert.assertEquals(0, sizeofResult);
    Assert.assertNotNull(builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
