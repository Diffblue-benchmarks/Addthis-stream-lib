package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.QDigest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QDigest_offerTest_3_Test {
  @Test
  public void offerTest() throws Exception {
    // Arrange
    QDigest qDigest = new QDigest(1.0);
    long value = 1L;

    // Act
    qDigest.offer(value);

    // Assert
    Assert.assertEquals("0 .. 1: 1", qDigest.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
