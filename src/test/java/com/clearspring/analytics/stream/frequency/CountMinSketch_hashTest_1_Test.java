package com.clearspring.analytics.stream.frequency;

import com.clearspring.analytics.stream.frequency.CountMinSketch;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CountMinSketch_hashTest_1_Test {
  @Test
  public void hashTest() throws Exception {
    // Arrange
    CountMinSketch countMinSketch = new CountMinSketch();
    long item = 1L;
    int i = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    countMinSketch.hash(item, i);
    double confidence = countMinSketch.getConfidence();
    String toStringResult = countMinSketch.toString();
    double relativeError = countMinSketch.getRelativeError();
    Assert.assertEquals(0.0, confidence);
    Assert.assertEquals(0L, countMinSketch.size());
    Assert.assertEquals(0.0, relativeError);
    Assert.assertEquals("CountMinSketch{eps=0.0, confidence=0.0, depth=0, width=0, size=0}", toStringResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
