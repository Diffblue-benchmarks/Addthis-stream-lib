package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.QDigest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class QDigest_getQuantileTest_4_Test {
  @Test
  public void getQuantileTest() throws Exception {
    // Arrange
    QDigest qDigest = new QDigest(1.0);
    double q = 1.0;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    qDigest.getQuantile(q);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
