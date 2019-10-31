package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.BitSetSerializer;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.StreamCorruptedException;
import java.util.BitSet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class BitSetSerializer_deserializeTest_1_Test {
  @Test
  public void deserializeTest() throws Exception {
    // Arrange
    DataInputStream dataInputStream = new DataInputStream(
        new ByteArrayInputStream(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10}));

    // Act and Assert
    thrown.expect(StreamCorruptedException.class);
    BitSetSerializer.deserialize(dataInputStream);
    int availableResult = dataInputStream.available();
    String readUTFResult = dataInputStream.readUTF();
    String toStringResult = dataInputStream.toString();
    Assert.assertEquals(20, availableResult);
    Assert.assertEquals(0L, dataInputStream.readLong());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("", readUTFResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
