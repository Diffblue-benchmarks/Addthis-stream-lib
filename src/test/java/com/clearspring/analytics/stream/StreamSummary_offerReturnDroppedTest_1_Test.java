package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StreamSummary;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamSummary_offerReturnDroppedTest_1_Test {
  @Test
  public void offerReturnDroppedTest() throws Exception {
    // Arrange
    StreamSummary<Object> streamSummary = new StreamSummary<Object>();
    String item = "aaaaa";
    int incrementCount = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    streamSummary.offerReturnDropped(item, incrementCount);
    Assert.assertEquals(0, streamSummary.getCapacity());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
