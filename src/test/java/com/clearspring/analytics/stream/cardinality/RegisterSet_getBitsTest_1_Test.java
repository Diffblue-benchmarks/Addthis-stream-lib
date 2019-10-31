package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.RegisterSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RegisterSet_getBitsTest_1_Test {
  @Test
  public void getBitsTest() throws Exception {
    // Arrange
    int count = 1;

    // Act
    int actual = RegisterSet.getBits(count);

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
