package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.BloomFilter;
import com.clearspring.analytics.stream.membership.BloomFilterSerializer;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.StreamCorruptedException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class BloomFilterSerializer_deserializeTest_1_Test {
  @Test
  public void deserializeTest() throws Exception {
    // Arrange
    BloomFilterSerializer bloomFilterSerializer = new BloomFilterSerializer();
    DataInputStream dataInputStream = new DataInputStream(
        new ByteArrayInputStream(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0}));

    // Act and Assert
    thrown.expect(StreamCorruptedException.class);
    bloomFilterSerializer.deserialize(dataInputStream);
    int availableResult = dataInputStream.available();
    String readUTFResult = dataInputStream.readUTF();
    String toStringResult = dataInputStream.toString();
    Assert.assertEquals(16, availableResult);
    Assert.assertEquals(0L, dataInputStream.readLong());
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("", readUTFResult);
    Assert.assertNotNull(bloomFilterSerializer.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
