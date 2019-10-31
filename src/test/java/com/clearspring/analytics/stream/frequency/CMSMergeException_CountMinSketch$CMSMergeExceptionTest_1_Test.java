package com.clearspring.analytics.stream.frequency;

import com.clearspring.analytics.stream.frequency.CountMinSketch;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CMSMergeException_CountMinSketch$CMSMergeExceptionTest_1_Test {
  @Test
  public void CountMinSketch$CMSMergeExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    CountMinSketch.CMSMergeException cMSMergeException = new CountMinSketch.CMSMergeException(message);

    // Assert
    String toStringResult = cMSMergeException.toString();
    Throwable[] suppressed = cMSMergeException.getSuppressed();
    String message1 = cMSMergeException.getMessage();
    Throwable cause = cMSMergeException.getCause();
    Assert.assertEquals("com.clearspring.analytics.stream.frequency.CountMinSketch$CMSMergeException: aaaaa",
        toStringResult);
    Assert.assertEquals("aaaaa", cMSMergeException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
