package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_LogLog$BuilderTest_1_Test {
  @Test
  public void LogLog$BuilderTest() throws Exception {
    // Arrange
    int k = 1;

    // Act
    LogLog.Builder builder = new LogLog.Builder(k);

    // Assert
    int sizeofResult = builder.sizeof();
    Assert.assertEquals(2, sizeofResult);
    Assert.assertNotNull(builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
