package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.DataOutputBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataOutputBuffer_resetTest_2_Test {
  @Test
  public void resetTest() throws Exception {
    // Arrange
    DataOutputBuffer dataOutputBuffer = new DataOutputBuffer();

    // Act
    DataOutputBuffer actual = dataOutputBuffer.reset();

    // Assert
    Assert.assertSame(dataOutputBuffer, actual);
    String toStringResult = actual.toString();
    byte[] data = actual.getData();
    int length = actual.getLength();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, actual.size());
    Assert.assertEquals(0, length);
    Assert.assertEquals(0, data.length);
    Assert.assertArrayEquals(new byte[]{}, data);
    Assert.assertSame(actual, dataOutputBuffer);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
