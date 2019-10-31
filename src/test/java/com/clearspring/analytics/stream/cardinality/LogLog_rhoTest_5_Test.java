package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LogLog_rhoTest_5_Test {
  @Test
  public void rhoTest() throws Exception {
    // Arrange
    int x = 1;
    int k = 1;

    // Act
    int actual = LogLog.rho(x, k);

    // Assert
    Assert.assertEquals(31, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
