package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.QDigest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QDigest_computeActualSizeTest_5_Test {
  @Test
  public void computeActualSizeTest() throws Exception {
    // Arrange
    QDigest qDigest = new QDigest(1.0);

    // Act
    long actual = qDigest.computeActualSize();

    // Assert
    Assert.assertEquals(0L, actual);
    Assert.assertEquals("", qDigest.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
