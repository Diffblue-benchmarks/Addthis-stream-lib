package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LogLog_getBytesTest_4_Test {
  @Test
  public void getBytesTest() throws Exception {
    // Arrange
    LogLog logLog = new LogLog(1);

    // Act
    byte[] actual = logLog.getBytes();

    // Assert
    Assert.assertEquals(2, actual.length);
    Assert.assertArrayEquals(new byte[]{0, 0}, actual);
    byte[] bytes = logLog.getBytes();
    int sizeofResult = logLog.sizeof();
    long cardinalityResult = logLog.cardinality();
    Assert.assertSame(actual, bytes);
    Assert.assertNotNull(logLog.toString());
    Assert.assertEquals(0L, cardinalityResult);
    Assert.assertEquals(2, sizeofResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
