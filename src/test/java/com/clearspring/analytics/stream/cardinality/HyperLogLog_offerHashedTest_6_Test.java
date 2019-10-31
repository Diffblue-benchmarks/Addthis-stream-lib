package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HyperLogLog_offerHashedTest_6_Test {
  @Test
  public void offerHashedTest() throws Exception {
    // Arrange
    HyperLogLog hyperLogLog = new HyperLogLog(1.0);
    long hashedValue = 1L;

    // Act
    boolean actual = hyperLogLog.offerHashed(hashedValue);

    // Assert
    Assert.assertTrue(actual);
    byte[] bytes = hyperLogLog.getBytes();
    int sizeofResult = hyperLogLog.sizeof();
    Assert.assertEquals(12, bytes.length);
    Assert.assertEquals((byte) 0, bytes[0]);
    Assert.assertEquals((byte) 0, bytes[1]);
    Assert.assertEquals((byte) 0, bytes[2]);
    Assert.assertEquals((byte) 0, bytes[9]);
    Assert.assertEquals((byte) 0, bytes[10]);
    Assert.assertEquals((byte) 32, bytes[11]);
    Assert.assertNotNull(hyperLogLog.toString());
    Assert.assertEquals(4, sizeofResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
