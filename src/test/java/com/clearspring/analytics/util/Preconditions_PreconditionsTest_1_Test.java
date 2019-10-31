package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Preconditions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Preconditions_PreconditionsTest_1_Test {
  @Test
  public void PreconditionsTest() throws Exception {
    // Arrange and Act
    Preconditions preconditions = new Preconditions();

    // Assert
    Assert.assertNotNull(preconditions.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
