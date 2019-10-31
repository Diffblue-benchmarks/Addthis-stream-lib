package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Bits;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Bits_getBitsTest_2_Test {
  @Test
  public void getBitsTest() throws Exception {
    // Arrange
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int[] actual = Bits.getBits(byteArray);

    // Assert
    Assert.assertEquals(6, actual.length);
    Assert.assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, actual);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[3]);
    Assert.assertEquals((byte) 0, byteArray[4]);
    Assert.assertEquals((byte) 0, byteArray[5]);
    Assert.assertEquals((byte) 0, byteArray[18]);
    Assert.assertEquals((byte) 0, byteArray[19]);
    Assert.assertEquals((byte) 0, byteArray[20]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
