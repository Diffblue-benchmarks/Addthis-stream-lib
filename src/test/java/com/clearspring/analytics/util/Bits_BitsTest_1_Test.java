package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Bits;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Bits_BitsTest_1_Test {
  @Test
  public void BitsTest() throws Exception {
    // Arrange and Act
    Bits bits = new Bits();

    // Assert
    Assert.assertNotNull(bits.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
