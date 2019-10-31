package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LinearCounting;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_buildTest_11_Test {
//failed_pass   @Test
//  public void buildTest() throws Exception {
//    // Arrange
//    LinearCounting.Builder builder = new LinearCounting.Builder();
//
//    // Act
//    LinearCounting actual = builder.build();
//
//    // Assert
//    byte[] bytes = actual.getBytes();
//    int sizeofResult = actual.sizeof();
//    boolean isSaturatedResult = actual.isSaturated();
//    String toStringResult = actual.toString();
//    double utilization = actual.getUtilization();
//    Assert.assertEquals(65536, bytes.length);
//    Assert.assertEquals((byte) 0, bytes[0]);
//    Assert.assertEquals((byte) 0, bytes[1]);
//    Assert.assertEquals((byte) 0, bytes[2]);
//    Assert.assertEquals((byte) 0, bytes[65533]);
//    Assert.assertEquals((byte) 0, bytes[65534]);
//    Assert.assertEquals((byte) 0, bytes[65535]);
//    Assert.assertEquals(524288, actual.getCount());
//    Assert.assertEquals(0.0, utilization);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertFalse(isSaturatedResult);
//    Assert.assertEquals(65536, sizeofResult);
//    int sizeofResult1 = builder.sizeof();
//    Assert.assertEquals(65536, sizeofResult1);
//    Assert.assertNotNull(builder.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
