package com.clearspring.analytics.util;

import com.clearspring.analytics.stream.membership.DataInputBuffer;
import com.clearspring.analytics.util.Varint;
import java.io.EOFException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Varint_readUnsignedVarLongTest_3_Test {
  @Test
  public void readUnsignedVarLongTest() throws Exception {
    // Arrange
    DataInputBuffer dataInputBuffer = new DataInputBuffer();

    // Act and Assert
    thrown.expect(EOFException.class);
    Varint.readUnsignedVarLong(dataInputBuffer);
    int availableResult = dataInputBuffer.available();
    String toStringResult = dataInputBuffer.toString();
    int position = dataInputBuffer.getPosition();
    Assert.assertEquals(0, availableResult);
    Assert.assertEquals(0, dataInputBuffer.getLength());
    Assert.assertEquals(0, position);
    Assert.assertNotNull(toStringResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
