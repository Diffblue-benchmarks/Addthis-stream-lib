package com.clearspring.analytics.util;

import com.clearspring.analytics.stream.membership.DataOutputBuffer;
import com.clearspring.analytics.util.Varint;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Varint_writeSignedVarIntTest_1_Test {
  @Test
  public void writeSignedVarIntTest() throws Exception {
    // Arrange
    int value = 1;
    DataOutputBuffer dataOutputBuffer = new DataOutputBuffer();

    // Act
    Varint.writeSignedVarInt(value, dataOutputBuffer);

    // Assert
    String toStringResult = dataOutputBuffer.toString();
    byte[] data = dataOutputBuffer.getData();
    int length = dataOutputBuffer.getLength();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, dataOutputBuffer.size());
    Assert.assertEquals(1, length);
    Assert.assertEquals(1, data.length);
    Assert.assertArrayEquals(new byte[]{2}, data);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
