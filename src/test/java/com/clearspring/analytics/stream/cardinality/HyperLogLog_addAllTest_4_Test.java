package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HyperLogLog_addAllTest_4_Test {
  @Test
  public void addAllTest() throws Exception {
    // Arrange
    HyperLogLog hyperLogLog = new HyperLogLog(1.0);
    HyperLogLog hyperLogLog1 = new HyperLogLog(1.0);

    // Act
    hyperLogLog.addAll(hyperLogLog1);

    // Assert
    byte[] bytes = hyperLogLog1.getBytes();
    int sizeofResult = hyperLogLog1.sizeof();
    Assert.assertEquals(12, bytes.length);
    Assert.assertEquals((byte) 0, bytes[0]);
    Assert.assertEquals((byte) 0, bytes[1]);
    Assert.assertEquals((byte) 0, bytes[2]);
    Assert.assertEquals((byte) 0, bytes[9]);
    Assert.assertEquals((byte) 0, bytes[10]);
    Assert.assertEquals((byte) 0, bytes[11]);
    Assert.assertNotNull(hyperLogLog1.toString());
    Assert.assertEquals(4, sizeofResult);
    byte[] bytes1 = hyperLogLog.getBytes();
    int sizeofResult1 = hyperLogLog.sizeof();
    Assert.assertEquals(12, bytes1.length);
    Assert.assertEquals((byte) 0, bytes1[0]);
    Assert.assertEquals((byte) 0, bytes1[1]);
    Assert.assertEquals((byte) 0, bytes1[2]);
    Assert.assertEquals((byte) 0, bytes1[9]);
    Assert.assertEquals((byte) 0, bytes1[10]);
    Assert.assertEquals((byte) 0, bytes1[11]);
    Assert.assertNotNull(hyperLogLog.toString());
    Assert.assertEquals(4, sizeofResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
