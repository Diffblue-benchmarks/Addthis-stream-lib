package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LinearCounting;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_onePercentErrorTest_14_Test {
  @Test
  public void onePercentErrorTest() throws Exception {
    // Arrange
    int maxCardinality = 1;

    // Act
    LinearCounting.Builder actual = LinearCounting.Builder.onePercentError(maxCardinality);

    // Assert
    int sizeofResult = actual.sizeof();
    Assert.assertEquals(630, sizeofResult);
    Assert.assertNotNull(actual.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
