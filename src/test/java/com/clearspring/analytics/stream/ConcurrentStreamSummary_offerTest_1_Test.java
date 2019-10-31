package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.ConcurrentStreamSummary;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConcurrentStreamSummary_offerTest_1_Test {
  @Test
  public void offerTest() throws Exception {
    // Arrange
    ConcurrentStreamSummary<Object> concurrentStreamSummary = new ConcurrentStreamSummary<Object>(1);
    String element = "aaaaa";

    // Act
    boolean actual = concurrentStreamSummary.offer(element);

    // Assert
    Assert.assertFalse(actual);
    Assert.assertEquals("[(1: aaaaa, e: 0)]", concurrentStreamSummary.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
