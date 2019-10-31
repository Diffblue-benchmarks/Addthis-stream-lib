package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_withRsdTest_10_Test {
  @Test
  public void withRsdTest() throws Exception {
    // Arrange
    double rsd = 1.0;

    // Act
    HyperLogLog.Builder actual = HyperLogLog.Builder.withRsd(rsd);

    // Assert
    int sizeofResult = actual.sizeof();
    Assert.assertEquals(0, sizeofResult);
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
