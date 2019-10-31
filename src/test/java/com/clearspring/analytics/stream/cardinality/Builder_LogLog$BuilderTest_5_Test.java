package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_LogLog$BuilderTest_5_Test {
  @Test
  public void LogLog$BuilderTest() throws Exception {
    // Arrange and Act
    LogLog.Builder builder = new LogLog.Builder();

    // Assert
    Assert.assertNotNull(builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
