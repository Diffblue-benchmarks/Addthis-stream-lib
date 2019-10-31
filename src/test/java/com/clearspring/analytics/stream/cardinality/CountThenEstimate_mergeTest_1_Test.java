package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.AdaptiveCounting;
import com.clearspring.analytics.stream.cardinality.CountThenEstimate;
import com.clearspring.analytics.stream.cardinality.ICardinality;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CountThenEstimate_mergeTest_1_Test {
  @Test
  public void mergeTest() throws Exception {
    // Arrange
    CountThenEstimate countThenEstimate = new CountThenEstimate();
    AdaptiveCounting adaptiveCounting = new AdaptiveCounting(1);
    AdaptiveCounting adaptiveCounting1 = new AdaptiveCounting(1);
    AdaptiveCounting adaptiveCounting2 = new AdaptiveCounting(1);
    ICardinality[] iCardinalityArray = new ICardinality[]{adaptiveCounting, adaptiveCounting1, adaptiveCounting2};

    // Act and Assert
    thrown.expect(ArrayStoreException.class);
    countThenEstimate.merge(iCardinalityArray);
    Assert.assertEquals(3, iCardinalityArray.length);
    ICardinality iCardinality = iCardinalityArray[0];
    ICardinality iCardinality1 = iCardinalityArray[1];
    ICardinality iCardinality2 = iCardinalityArray[2];
    Assert.assertSame(adaptiveCounting, iCardinality);
    Assert.assertTrue(iCardinality instanceof AdaptiveCounting);
    Assert.assertSame(adaptiveCounting2, iCardinality2);
    Assert.assertTrue(iCardinality2 instanceof AdaptiveCounting);
    Assert.assertSame(adaptiveCounting, iCardinality);
    Assert.assertSame(adaptiveCounting2, iCardinality2);
    Assert.assertSame(adaptiveCounting1, iCardinality1);
    Assert.assertTrue(iCardinality1 instanceof AdaptiveCounting);
    Assert.assertSame(adaptiveCounting1, iCardinality1);
    byte[] bytes = countThenEstimate.getBytes();
    long cardinalityResult = countThenEstimate.cardinality();
    int sizeofResult = countThenEstimate.sizeof();
    Assert.assertEquals(111, bytes.length);
    Assert.assertEquals((byte) -84, bytes[0]);
    Assert.assertEquals((byte) -19, bytes[1]);
    Assert.assertEquals((byte) 0, bytes[2]);
    Assert.assertEquals((byte) 0, bytes[108]);
    Assert.assertEquals((byte) 0, bytes[109]);
    Assert.assertEquals((byte) 0, bytes[110]);
    Assert.assertNotNull(countThenEstimate.toString());
    Assert.assertEquals(-1, sizeofResult);
    Assert.assertEquals(0L, cardinalityResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
