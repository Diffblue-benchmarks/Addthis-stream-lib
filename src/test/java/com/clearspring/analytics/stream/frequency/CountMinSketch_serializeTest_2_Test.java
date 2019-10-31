package com.clearspring.analytics.stream.frequency;

import com.clearspring.analytics.stream.frequency.CountMinSketch;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CountMinSketch_serializeTest_2_Test {
//failed_pass   @Test
//  public void serializeTest() throws Exception {
//    // Arrange
//    CountMinSketch countMinSketch = new CountMinSketch();
//
//    // Act
//    byte[] actual = CountMinSketch.serialize(countMinSketch);
//
//    // Assert
//    Assert.assertEquals(16, actual.length);
//    Assert.assertEquals((byte) 0, actual[0]);
//    Assert.assertEquals((byte) 0, actual[1]);
//    Assert.assertEquals((byte) 0, actual[2]);
//    Assert.assertEquals((byte) 0, actual[3]);
//    Assert.assertEquals((byte) 0, actual[4]);
//    Assert.assertEquals((byte) 0, actual[5]);
//    Assert.assertEquals((byte) 0, actual[10]);
//    Assert.assertEquals((byte) 0, actual[11]);
//    Assert.assertEquals((byte) 0, actual[12]);
//    Assert.assertEquals((byte) 0, actual[13]);
//    Assert.assertEquals((byte) 0, actual[14]);
//    Assert.assertEquals((byte) 0, actual[15]);
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
