package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StreamSummary;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamSummary_StreamSummaryTest_6_Test {
  @Test
  public void StreamSummaryTest() throws Exception {
    // Arrange and Act
    StreamSummary<Object> streamSummary = new StreamSummary<Object>();

    // Assert
    Assert.assertEquals(0, streamSummary.getCapacity());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
