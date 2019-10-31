package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HyperLogLog_cardinalityTest_1_Test {
  @Test
  public void cardinalityTest() throws Exception {
    // Arrange
    HyperLogLog hyperLogLog = new HyperLogLog(1.0);

    // Act
    long actual = hyperLogLog.cardinality();

    // Assert
    Assert.assertEquals(0L, actual);
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
