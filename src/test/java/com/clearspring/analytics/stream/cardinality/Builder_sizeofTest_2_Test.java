package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_sizeofTest_2_Test {
  @Test
  public void sizeofTest() throws Exception {
    // Arrange
    LogLog.Builder builder = new LogLog.Builder();

    // Act
    int actual = builder.sizeof();

    // Assert
    Assert.assertEquals(65536, actual);
    int sizeofResult = builder.sizeof();
    Assert.assertEquals(65536, sizeofResult);
    Assert.assertNotNull(builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
