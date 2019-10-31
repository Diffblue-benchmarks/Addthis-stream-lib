package com.clearspring.analytics.stream.frequency;

import com.clearspring.analytics.stream.frequency.ConservativeAddSketch;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ConservativeAddSketch_addTest_1_Test {
  @Test
  public void addTest() throws Exception {
    // Arrange
    ConservativeAddSketch conservativeAddSketch = new ConservativeAddSketch();
    String item = "aaaaa";
    long count = 1L;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    conservativeAddSketch.add(item, count);
    double confidence = conservativeAddSketch.getConfidence();
    String toStringResult = conservativeAddSketch.toString();
    double relativeError = conservativeAddSketch.getRelativeError();
    Assert.assertEquals(0.0, confidence);
    Assert.assertEquals(0L, conservativeAddSketch.size());
    Assert.assertEquals(0.0, relativeError);
    Assert.assertEquals("CountMinSketch{eps=0.0, confidence=0.0, depth=0, width=0, size=0}", toStringResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
