package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StreamSummary;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamSummary_peekTest_4_Test {
  @Test
  public void peekTest() throws Exception {
    // Arrange
    StreamSummary<Object> streamSummary = new StreamSummary<Object>();
    int k = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    streamSummary.peek(k);
    Assert.assertEquals(0, streamSummary.getCapacity());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
