package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LogLog_cardinalityTest_6_Test {
  @Test
  public void cardinalityTest() throws Exception {
    // Arrange
    LogLog logLog = new LogLog(1);

    // Act
    long actual = logLog.cardinality();

    // Assert
    Assert.assertEquals(0L, actual);
    byte[] bytes = logLog.getBytes();
    int sizeofResult = logLog.sizeof();
    long cardinalityResult = logLog.cardinality();
    Assert.assertEquals(2, bytes.length);
    Assert.assertArrayEquals(new byte[]{0, 0}, bytes);
    Assert.assertNotNull(logLog.toString());
    Assert.assertEquals(0L, cardinalityResult);
    Assert.assertEquals(2, sizeofResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
