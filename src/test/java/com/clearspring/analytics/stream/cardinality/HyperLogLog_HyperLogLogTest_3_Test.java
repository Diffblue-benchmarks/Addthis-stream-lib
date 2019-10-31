package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import com.clearspring.analytics.stream.cardinality.RegisterSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HyperLogLog_HyperLogLogTest_3_Test {
  @Test
  public void HyperLogLogTest() throws Exception {
    // Arrange
    int log2m = 1;
    RegisterSet registerSet = new RegisterSet(1);

    // Act
    HyperLogLog hyperLogLog = new HyperLogLog(log2m, registerSet);

    // Assert
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
    int[] readOnlyBitsResult = registerSet.readOnlyBits();
    int[] bitsResult = registerSet.bits();
    Assert.assertEquals(1, readOnlyBitsResult.length);
    Assert.assertArrayEquals(new int[]{0}, readOnlyBitsResult);
    Assert.assertEquals(1, registerSet.size);
    Assert.assertEquals(1, registerSet.count);
    Assert.assertNotNull(registerSet.toString());
    Assert.assertEquals(1, bitsResult.length);
    Assert.assertArrayEquals(new int[]{0}, bitsResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
