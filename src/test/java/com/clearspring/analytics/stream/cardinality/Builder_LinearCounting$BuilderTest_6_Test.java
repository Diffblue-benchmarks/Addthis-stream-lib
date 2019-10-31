package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.LinearCounting;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_LinearCounting$BuilderTest_6_Test {
  @Test
  public void LinearCounting$BuilderTest() throws Exception {
    // Arrange
    int size = 1;

    // Act
    LinearCounting.Builder builder = new LinearCounting.Builder(size);

    // Assert
    int sizeofResult = builder.sizeof();
    Assert.assertEquals(1, sizeofResult);
    Assert.assertNotNull(builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
