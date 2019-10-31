package com.clearspring.analytics.stream.frequency;

import com.clearspring.analytics.stream.frequency.CountMinSketch;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CountMinSketch_estimateCountTest_3_Test {
//failed_pass   @Test
//  public void estimateCountTest() throws Exception {
//    // Arrange
//    CountMinSketch countMinSketch = new CountMinSketch();
//    String item = "aaaaa";
//
//    // Act
//    long actual = countMinSketch.estimateCount(item);
//
//    // Assert
//    Assert.assertEquals(9223372036854775807L, actual);
//    double confidence = countMinSketch.getConfidence();
//    String toStringResult = countMinSketch.toString();
//    double relativeError = countMinSketch.getRelativeError();
//    Assert.assertEquals(0.0, confidence);
//    Assert.assertEquals(0L, countMinSketch.size());
//    Assert.assertEquals(0.0, relativeError);
//    Assert.assertEquals("CountMinSketch{eps=0.0, confidence=0.0, depth=0, width=0, size=0}", toStringResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
