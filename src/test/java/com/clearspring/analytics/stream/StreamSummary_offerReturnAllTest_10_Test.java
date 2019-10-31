package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StreamSummary;
import com.clearspring.analytics.util.Pair;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamSummary_offerReturnAllTest_10_Test {
  @Test
  public void offerReturnAllTest() throws Exception {
    // Arrange
    StreamSummary<Object> streamSummary = new StreamSummary<Object>();
    String item = "aaaaa";
    int incrementCount = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    streamSummary.offerReturnAll(item, incrementCount);
    Assert.assertEquals(0, streamSummary.getCapacity());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
