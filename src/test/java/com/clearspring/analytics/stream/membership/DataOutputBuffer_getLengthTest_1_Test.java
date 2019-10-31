package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.DataOutputBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataOutputBuffer_getLengthTest_1_Test {
  @Test
  public void getLengthTest() throws Exception {
    // Arrange
    DataOutputBuffer dataOutputBuffer = new DataOutputBuffer();

    // Act
    int actual = dataOutputBuffer.getLength();

    // Assert
    Assert.assertEquals(0, actual);
    String toStringResult = dataOutputBuffer.toString();
    byte[] data = dataOutputBuffer.getData();
    int length = dataOutputBuffer.getLength();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, dataOutputBuffer.size());
    Assert.assertEquals(0, length);
    Assert.assertEquals(0, data.length);
    Assert.assertArrayEquals(new byte[]{}, data);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
