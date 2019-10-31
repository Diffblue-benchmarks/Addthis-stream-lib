package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Pair_equalsTest_1_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    Pair<Object, Object> pair = new Pair<Object, Object>("aaaaa", "aaaaa");
    String o = "aaaaa";

    // Act
    boolean actual = pair.equals(o);

    // Assert
    Assert.assertFalse(actual);
    Object object = pair.left;
    Object object1 = pair.right;
    Assert.assertEquals("(aaaaa,aaaaa)", pair.toString());
    Assert.assertTrue(object1 instanceof String);
    Assert.assertTrue(object instanceof String);
    Assert.assertEquals("aaaaa", object1);
    Assert.assertEquals("aaaaa", object);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
