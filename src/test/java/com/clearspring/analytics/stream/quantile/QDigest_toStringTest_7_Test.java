package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.QDigest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QDigest_toStringTest_7_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    QDigest qDigest = new QDigest(1.0);

    // Act
    String actual = qDigest.toString();

    // Assert
    Assert.assertEquals("", actual);
    Assert.assertEquals("", qDigest.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
