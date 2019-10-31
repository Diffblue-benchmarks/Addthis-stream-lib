package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.AdaptiveCounting;
import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import com.clearspring.analytics.stream.cardinality.ICardinality;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class HyperLogLog_mergeTest_2_Test {
  @Test
  public void mergeTest() throws Exception {
    // Arrange
    HyperLogLog hyperLogLog = new HyperLogLog(1.0);
    AdaptiveCounting adaptiveCounting = new AdaptiveCounting(1);
    AdaptiveCounting adaptiveCounting1 = new AdaptiveCounting(1);
    ICardinality[] iCardinalityArray = new ICardinality[]{adaptiveCounting, adaptiveCounting1, null};

    // Act and Assert
    thrown.expect(HyperLogLog.HyperLogLogMergeException.class);
    hyperLogLog.merge(iCardinalityArray);
    Assert.assertEquals(3, iCardinalityArray.length);
    ICardinality iCardinality = iCardinalityArray[0];
    ICardinality iCardinality1 = iCardinalityArray[1];
    Assert.assertSame(adaptiveCounting, iCardinality);
    Assert.assertTrue(iCardinality instanceof AdaptiveCounting);
    Assert.assertEquals(null, iCardinalityArray[2]);
    Assert.assertSame(adaptiveCounting, iCardinality);
    Assert.assertSame(adaptiveCounting1, iCardinality1);
    Assert.assertTrue(iCardinality1 instanceof AdaptiveCounting);
    Assert.assertSame(adaptiveCounting1, iCardinality1);
    byte[] bytes = hyperLogLog.getBytes();
    int sizeofResult = hyperLogLog.sizeof();
    Assert.assertEquals(12, bytes.length);
    Assert.assertEquals((byte) 0, bytes[0]);
    Assert.assertEquals((byte) 0, bytes[1]);
    Assert.assertEquals((byte) 0, bytes[2]);
    Assert.assertEquals((byte) 0, bytes[9]);
    Assert.assertEquals((byte) 0, bytes[10]);
    Assert.assertEquals((byte) 0, bytes[11]);
    Assert.assertNotNull(hyperLogLog.toString());
    Assert.assertEquals(4, sizeofResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
