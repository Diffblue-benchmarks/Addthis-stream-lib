package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HyperLogLog_getBytesTest_5_Test {
  @Test
  public void getBytesTest() throws Exception {
    // Arrange
    HyperLogLog hyperLogLog = new HyperLogLog(1.0);

    // Act
    byte[] actual = hyperLogLog.getBytes();

    // Assert
    Assert.assertEquals(12, actual.length);
    Assert.assertEquals((byte) 0, actual[0]);
    Assert.assertEquals((byte) 0, actual[1]);
    Assert.assertEquals((byte) 0, actual[2]);
    Assert.assertEquals((byte) 0, actual[3]);
    Assert.assertEquals((byte) 0, actual[4]);
    Assert.assertEquals((byte) 0, actual[5]);
    Assert.assertEquals((byte) 0, actual[6]);
    Assert.assertEquals((byte) 4, actual[7]);
    Assert.assertEquals((byte) 0, actual[8]);
    Assert.assertEquals((byte) 0, actual[9]);
    Assert.assertEquals((byte) 0, actual[10]);
    Assert.assertEquals((byte) 0, actual[11]);
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
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
