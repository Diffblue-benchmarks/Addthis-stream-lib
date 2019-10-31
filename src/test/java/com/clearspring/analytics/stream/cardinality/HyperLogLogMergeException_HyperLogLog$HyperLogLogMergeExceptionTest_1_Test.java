package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HyperLogLogMergeException_HyperLogLog$HyperLogLogMergeExceptionTest_1_Test {
  @Test
  public void HyperLogLog$HyperLogLogMergeExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    HyperLogLog.HyperLogLogMergeException hyperLogLogMergeException = new HyperLogLog.HyperLogLogMergeException(
        message);

    // Assert
    String toStringResult = hyperLogLogMergeException.toString();
    Throwable[] suppressed = hyperLogLogMergeException.getSuppressed();
    String message1 = hyperLogLogMergeException.getMessage();
    Throwable cause = hyperLogLogMergeException.getCause();
    Assert.assertEquals("com.clearspring.analytics.stream.cardinality.HyperLogLog$HyperLogLogMergeException: aaaaa",
        toStringResult);
    Assert.assertEquals("aaaaa", hyperLogLogMergeException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
