package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.DataInputBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataInputBuffer_resetTest_1_Test {
  @Test
  public void resetTest() throws Exception {
    // Arrange
    DataInputBuffer dataInputBuffer = new DataInputBuffer();
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int length = 655361;

    // Act
    dataInputBuffer.reset(byteArray, length);

    // Assert
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
    int availableResult = dataInputBuffer.available();
    String readUTFResult = dataInputBuffer.readUTF();
    String toStringResult = dataInputBuffer.toString();
    int position = dataInputBuffer.getPosition();
    int length1 = dataInputBuffer.getLength();
    Assert.assertEquals(655361, availableResult);
    Assert.assertEquals(0L, dataInputBuffer.readLong());
    Assert.assertEquals(655361, length1);
    Assert.assertEquals(2, position);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("", readUTFResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
