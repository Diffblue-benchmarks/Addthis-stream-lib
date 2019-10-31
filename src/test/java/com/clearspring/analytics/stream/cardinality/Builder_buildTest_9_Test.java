package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_buildTest_9_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    HyperLogLog.Builder builder = new HyperLogLog.Builder(1.0);

    // Act
    HyperLogLog actual = builder.build();

    // Assert
    int sizeofResult = actual.sizeof();
    Assert.assertEquals(4, sizeofResult);
    Assert.assertNotNull(actual.toString());
    int sizeofResult1 = builder.sizeof();
    Assert.assertEquals(0, sizeofResult1);
    Assert.assertNotNull(builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
