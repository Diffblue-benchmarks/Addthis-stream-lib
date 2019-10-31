package com.clearspring.analytics.stream.frequency;

import com.clearspring.analytics.stream.frequency.CountMinSketch;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CountMinSketch_CountMinSketchTest_4_Test {
//failed_pass   @Test
//  public void CountMinSketchTest() throws Exception {
//    // Arrange
//    int depth = 1;
//    int width = 1;
//    long size = 1L;
//    long[] longArray = new long[]{1L, 1L, 1L, 1L, 655361L, 1L, 1L, 1L};
//    long[][] longArray1 = new long[][]{new long[]{1L, 1L, 1L, 2561L, 1L, 1L, 1L, 1L}, longArray,
//        new long[]{1L, 1L, 655361L, 1L, 1L, 1L, 1L, 1L}};
//
//    // Act
//    CountMinSketch countMinSketch = new CountMinSketch(depth, width, size, longArray, longArray1);
//
//    // Assert
//    double confidence = countMinSketch.getConfidence();
//    String toStringResult = countMinSketch.toString();
//    double relativeError = countMinSketch.getRelativeError();
//    Assert.assertEquals(0.5, confidence);
//    Assert.assertEquals(1L, countMinSketch.size());
//    Assert.assertEquals(2.0, relativeError);
//    Assert.assertEquals("CountMinSketch{eps=2.0, confidence=0.5, depth=1, width=1, size=1}", toStringResult);
//    Assert.assertEquals(8, longArray.length);
//    Assert.assertArrayEquals(new long[]{1L, 1L, 1L, 1L, 655361L, 1L, 1L, 1L}, longArray);
//    Assert.assertEquals(3, longArray1.length);
//    long[] longArray2 = longArray1[0];
//    long[] longArray3 = longArray1[2];
//    Assert.assertEquals(8, longArray2.length);
//    Assert.assertEquals(1L, longArray2[0]);
//    Assert.assertEquals(1L, longArray2[1]);
//    Assert.assertEquals(1L, longArray2[2]);
//    Assert.assertEquals(1L, longArray2[5]);
//    Assert.assertEquals(1L, longArray2[6]);
//    Assert.assertEquals(1L, longArray2[7]);
//    Assert.assertEquals(8, longArray3.length);
//    Assert.assertEquals(1L, longArray3[0]);
//    Assert.assertEquals(1L, longArray3[1]);
//    Assert.assertEquals(655361L, longArray3[2]);
//    Assert.assertEquals(1L, longArray3[5]);
//    Assert.assertEquals(1L, longArray3[6]);
//    Assert.assertEquals(1L, longArray3[7]);
//    Assert.assertSame(longArray, longArray1[1]);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
