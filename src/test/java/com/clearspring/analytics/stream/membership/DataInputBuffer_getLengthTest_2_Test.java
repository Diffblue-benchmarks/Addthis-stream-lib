package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.DataInputBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataInputBuffer_getLengthTest_2_Test {
  @Test
  public void getLengthTest() throws Exception {
    // Arrange
    DataInputBuffer dataInputBuffer = new DataInputBuffer();

    // Act
    int actual = dataInputBuffer.getLength();

    // Assert
    Assert.assertEquals(0, actual);
    int availableResult = dataInputBuffer.available();
    String toStringResult = dataInputBuffer.toString();
    int position = dataInputBuffer.getPosition();
    Assert.assertEquals(0, availableResult);
    Assert.assertEquals(0, dataInputBuffer.getLength());
    Assert.assertEquals(0, position);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
