package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Pair_createTest_3_Test {
  @Test
  public void createTest() throws Exception {
    // Arrange
    String x = "aaaaa";
    String y = "aaaaa";

    // Act
    Pair<Object, Object> actual = Pair.<Object, Object>create(x, y);

    // Assert
    Object object = actual.left;
    Object object1 = actual.right;
    Assert.assertTrue(object instanceof String);
    Assert.assertTrue(object1 instanceof String);
    Assert.assertEquals("aaaaa", object);
    Assert.assertEquals("aaaaa", object1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
