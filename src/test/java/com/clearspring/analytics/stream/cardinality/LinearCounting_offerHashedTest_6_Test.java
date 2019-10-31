package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LinearCounting;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class LinearCounting_offerHashedTest_6_Test {
  @Test
  public void offerHashedTest() throws Exception {
    // Arrange
    LinearCounting linearCounting = new LinearCounting(1);
    long hashedLong = 1L;

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    linearCounting.offerHashed(hashedLong);
    byte[] bytes = linearCounting.getBytes();
    int sizeofResult = linearCounting.sizeof();
    boolean isSaturatedResult = linearCounting.isSaturated();
    String toStringResult = linearCounting.toString();
    double utilization = linearCounting.getUtilization();
    Assert.assertEquals(1, bytes.length);
    Assert.assertArrayEquals(new byte[]{0}, bytes);
    Assert.assertEquals(8, linearCounting.getCount());
    Assert.assertEquals(0.0, utilization);
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(isSaturatedResult);
    Assert.assertEquals(1, sizeofResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
