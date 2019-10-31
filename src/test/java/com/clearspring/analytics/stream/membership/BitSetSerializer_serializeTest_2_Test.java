package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.BitSetSerializer;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.BitSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BitSetSerializer_serializeTest_2_Test {
  @Test
  public void serializeTest() throws Exception {
    // Arrange
    BitSet bitSet = new BitSet();
    DataOutputStream dataOutputStream = new DataOutputStream(new ByteArrayOutputStream());

    // Act
    BitSetSerializer.serialize(bitSet, dataOutputStream);

    // Assert
    String toStringResult = bitSet.toString();
    boolean isEmptyResult = bitSet.isEmpty();
    Assert.assertEquals("{}", toStringResult);
    Assert.assertEquals(0, bitSet.size());
    Assert.assertTrue(isEmptyResult);
    String toStringResult1 = dataOutputStream.toString();
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(73, dataOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
