package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.CountThenEstimate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CountThenEstimateMergeException_CountThenEstimate$CountThenEstimateMergeExceptionTest_1_Test {
  @Test
  public void CountThenEstimate$CountThenEstimateMergeExceptionTest() throws Exception {
    // Arrange
    String message = "aaaaa";

    // Act
    CountThenEstimate.CountThenEstimateMergeException countThenEstimateMergeException = new CountThenEstimate.CountThenEstimateMergeException(
        message);

    // Assert
    String toStringResult = countThenEstimateMergeException.toString();
    Throwable[] suppressed = countThenEstimateMergeException.getSuppressed();
    String message1 = countThenEstimateMergeException.getMessage();
    Throwable cause = countThenEstimateMergeException.getCause();
    Assert.assertEquals(
        "com.clearspring.analytics.stream.cardinality.CountThenEstimate$CountThenEstimateMergeException: aaaaa",
        toStringResult);
    Assert.assertEquals("aaaaa", countThenEstimateMergeException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
