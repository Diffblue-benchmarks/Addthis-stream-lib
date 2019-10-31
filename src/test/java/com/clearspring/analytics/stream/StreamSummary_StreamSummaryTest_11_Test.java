package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StreamSummary;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamSummary_StreamSummaryTest_11_Test {
  @Test
  public void StreamSummaryTest() throws Exception {
    // Arrange
    int capacity = 1;

    // Act
    StreamSummary<Object> streamSummary = new StreamSummary<Object>(capacity);

    // Assert
    String toStringResult = streamSummary.toString();
    byte[] toBytesResult = streamSummary.toBytes();
    Assert.assertEquals("[]", toStringResult);
    Assert.assertEquals(0, streamSummary.size());
    Assert.assertEquals(14, toBytesResult.length);
    Assert.assertEquals((byte) -84, toBytesResult[0]);
    Assert.assertEquals((byte) -19, toBytesResult[1]);
    Assert.assertEquals((byte) 0, toBytesResult[2]);
    Assert.assertEquals((byte) 0, toBytesResult[11]);
    Assert.assertEquals((byte) 0, toBytesResult[12]);
    Assert.assertEquals((byte) 0, toBytesResult[13]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
