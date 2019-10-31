package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.ConcurrentStreamSummary;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConcurrentStreamSummary_toStringTest_3_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    ConcurrentStreamSummary<Object> concurrentStreamSummary = new ConcurrentStreamSummary<Object>(1);

    // Act
    String actual = concurrentStreamSummary.toString();

    // Assert
    Assert.assertEquals("]", actual);
    Assert.assertEquals("]", concurrentStreamSummary.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
