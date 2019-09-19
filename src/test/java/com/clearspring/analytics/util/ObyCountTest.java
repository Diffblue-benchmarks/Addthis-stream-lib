package com.clearspring.analytics.util;

import com.clearspring.analytics.util.ObyCount;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ObyCountTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ObyCount actual = new ObyCount();

    // Assert result
    Assert.assertNotNull(actual);
  }
}
