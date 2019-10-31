package com.clearspring.experimental.stream.cardinality;

import com.clearspring.experimental.stream.cardinality.HyperBitBit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HyperBitBit_getBytesTest_1_Test {
  @Test
  public void getBytesTest() throws Exception {
    // Arrange
    HyperBitBit hyperBitBit = new HyperBitBit();

    // Act
    byte[] actual = hyperBitBit.getBytes();

    // Assert
    Assert.assertEquals(0, actual.length);
    Assert.assertArrayEquals(new byte[]{}, actual);
    byte[] bytes = hyperBitBit.getBytes();
    int sizeofResult = hyperBitBit.sizeof();
    Assert.assertEquals(0, bytes.length);
    Assert.assertArrayEquals(new byte[]{}, bytes);
    Assert.assertNotNull(hyperBitBit.toString());
    Assert.assertEquals(0, sizeofResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
