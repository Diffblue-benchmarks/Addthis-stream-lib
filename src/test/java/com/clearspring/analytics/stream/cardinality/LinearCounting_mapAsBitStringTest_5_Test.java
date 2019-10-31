package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LinearCounting;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LinearCounting_mapAsBitStringTest_5_Test {
//failed_pass   @Test
//  public void mapAsBitStringTest() throws Exception {
//    // Arrange
//    LinearCounting linearCounting = new LinearCounting(1);
//
//    // Act
//    String actual = linearCounting.mapAsBitString();
//
//    // Assert
//    Assert.assertEquals("00000000", actual);
//    byte[] bytes = linearCounting.getBytes();
//    int sizeofResult = linearCounting.sizeof();
//    boolean isSaturatedResult = linearCounting.isSaturated();
//    String toStringResult = linearCounting.toString();
//    double utilization = linearCounting.getUtilization();
//    Assert.assertEquals(1, bytes.length);
//    Assert.assertArrayEquals(new byte[]{0}, bytes);
//    Assert.assertEquals(8, linearCounting.getCount());
//    Assert.assertEquals(0.0, utilization);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertFalse(isSaturatedResult);
//    Assert.assertEquals(1, sizeofResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
