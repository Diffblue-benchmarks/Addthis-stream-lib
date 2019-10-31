package com.clearspring.analytics.stream.frequency;

import com.clearspring.analytics.stream.frequency.ConservativeAddSketch;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConservativeAddSketch_ConservativeAddSketchTest_2_Test {
//failed_pass   @Test
//  public void ConservativeAddSketchTest() throws Exception {
//    // Arrange
//    int depth = 1;
//    int width = 1;
//    int seed = 1;
//
//    // Act
//    ConservativeAddSketch conservativeAddSketch = new ConservativeAddSketch(depth, width, seed);
//
//    // Assert
//    double confidence = conservativeAddSketch.getConfidence();
//    String toStringResult = conservativeAddSketch.toString();
//    Assert.assertEquals(0.5, confidence);
//    Assert.assertEquals(0L, conservativeAddSketch.size());
//    Assert.assertEquals("CountMinSketch{eps=2.0, confidence=0.5, depth=1, width=1, size=0}", toStringResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
