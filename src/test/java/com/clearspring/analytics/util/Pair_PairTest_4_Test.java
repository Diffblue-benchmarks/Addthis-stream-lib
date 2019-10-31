package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Pair_PairTest_4_Test {
  @Test
  public void PairTest() throws Exception {
    // Arrange
    String left = "aaaaa";
    String right = "aaaaa";

    // Act
    Pair<Object, Object> pair = new Pair<Object, Object>(left, right);

    // Assert
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
