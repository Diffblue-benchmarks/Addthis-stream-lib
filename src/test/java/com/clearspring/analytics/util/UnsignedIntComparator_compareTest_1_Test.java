package com.clearspring.analytics.util;

import com.clearspring.analytics.util.UnsignedIntComparator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UnsignedIntComparator_compareTest_1_Test {
  @Test
  public void compareTest() throws Exception {
    // Arrange
    UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    byte[] byteArray1 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = unsignedIntComparator.compare(byteArray, byteArray1);

    // Assert
    Assert.assertEquals(0, actual);
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
    Assert.assertEquals(21, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 0, byteArray1[3]);
    Assert.assertEquals((byte) 0, byteArray1[4]);
    Assert.assertEquals((byte) 0, byteArray1[5]);
    Assert.assertEquals((byte) 0, byteArray1[15]);
    Assert.assertEquals((byte) 0, byteArray1[16]);
    Assert.assertEquals((byte) 0, byteArray1[17]);
    Assert.assertEquals((byte) 0, byteArray1[18]);
    Assert.assertEquals((byte) 0, byteArray1[19]);
    Assert.assertEquals((byte) 0, byteArray1[20]);
    Assert.assertNotNull(unsignedIntComparator.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
