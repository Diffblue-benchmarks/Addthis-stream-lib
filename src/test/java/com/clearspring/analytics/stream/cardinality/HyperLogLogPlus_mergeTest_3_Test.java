package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.AdaptiveCounting;
import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus;
import com.clearspring.analytics.stream.cardinality.ICardinality;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class HyperLogLogPlus_mergeTest_3_Test {
//failed_run   @Test
//  public void mergeTest() throws Exception {
//    // Arrange
//    HyperLogLogPlus hyperLogLogPlus = Whitebox.newInstance(HyperLogLogPlus.class);
//    AdaptiveCounting adaptiveCounting = new AdaptiveCounting(1);
//    AdaptiveCounting adaptiveCounting1 = new AdaptiveCounting(1);
//    ICardinality[] iCardinalityArray = new ICardinality[]{adaptiveCounting, adaptiveCounting1, null};
//
//    // Act
//    ICardinality actual = hyperLogLogPlus.merge(iCardinalityArray);
//
//    // Assert
//    Assert.assertEquals(null, actual);
//    Assert.assertEquals(3, iCardinalityArray.length);
//    ICardinality iCardinality = iCardinalityArray[0];
//    ICardinality iCardinality1 = iCardinalityArray[1];
//    Assert.assertSame(adaptiveCounting, iCardinality);
//    Assert.assertTrue(iCardinality instanceof AdaptiveCounting);
//    Assert.assertEquals(null, iCardinalityArray[2]);
//    Assert.assertSame(adaptiveCounting, iCardinality);
//    Assert.assertSame(adaptiveCounting1, iCardinality1);
//    Assert.assertTrue(iCardinality1 instanceof AdaptiveCounting);
//    Assert.assertSame(adaptiveCounting1, iCardinality1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
