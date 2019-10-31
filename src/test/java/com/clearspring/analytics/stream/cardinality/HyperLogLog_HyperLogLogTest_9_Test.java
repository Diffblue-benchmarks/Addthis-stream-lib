package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HyperLogLog_HyperLogLogTest_9_Test {
  @Test
  public void HyperLogLogTest() throws Exception {
    // Arrange
    int log2m = 1;

    // Act
    HyperLogLog hyperLogLog = new HyperLogLog(log2m);

    // Assert
    int sizeofResult = hyperLogLog.sizeof();
    Assert.assertEquals(4, sizeofResult);
    Assert.assertNotNull(hyperLogLog.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
