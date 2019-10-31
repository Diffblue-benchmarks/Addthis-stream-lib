package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.QDigest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QDigest_serializeTest_1_Test {
  @Test
  public void serializeTest() throws Exception {
    // Arrange
    QDigest qDigest = new QDigest(1.0);

    // Act
    byte[] actual = QDigest.serialize(qDigest);

    // Assert
    Assert.assertEquals(28, actual.length);
    Assert.assertEquals((byte) 0, actual[0]);
    Assert.assertEquals((byte) 0, actual[1]);
    Assert.assertEquals((byte) 0, actual[2]);
    Assert.assertEquals((byte) 0, actual[3]);
    Assert.assertEquals((byte) 0, actual[4]);
    Assert.assertEquals((byte) 0, actual[5]);
    Assert.assertEquals((byte) 0, actual[22]);
    Assert.assertEquals((byte) 1, actual[23]);
    Assert.assertEquals((byte) 0, actual[24]);
    Assert.assertEquals((byte) 0, actual[25]);
    Assert.assertEquals((byte) 0, actual[26]);
    Assert.assertEquals((byte) 0, actual[27]);
    Assert.assertEquals("", qDigest.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
