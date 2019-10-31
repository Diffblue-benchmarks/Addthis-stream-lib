package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.RegisterSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RegisterSet_getSizeForCountTest_3_Test {
  @Test
  public void getSizeForCountTest() throws Exception {
    // Arrange
    int count = 1;

    // Act
    int actual = RegisterSet.getSizeForCount(count);

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
