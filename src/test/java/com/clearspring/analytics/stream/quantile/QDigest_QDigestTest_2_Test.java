package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.QDigest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QDigest_QDigestTest_2_Test {
  @Test
  public void QDigestTest() throws Exception {
    // Arrange
    double compressionFactor = 1.0;

    // Act
    QDigest qDigest = new QDigest(compressionFactor);

    // Assert
    Assert.assertEquals("", qDigest.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
