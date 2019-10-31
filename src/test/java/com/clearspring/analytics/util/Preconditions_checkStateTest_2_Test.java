package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Preconditions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Preconditions_checkStateTest_2_Test {
  @Test
  public void checkStateTest() throws Exception {
    // Arrange
    boolean condition = true;
    String format = "aaaaa";
    Object[] objectArray = new Object[]{"aaaaa", "aaaaa", "aaaka"};

    // Act
    Preconditions.checkState(condition, format, objectArray);

    // Assert
    Assert.assertEquals(3, objectArray.length);
    Object object = objectArray[0];
    Object object1 = objectArray[1];
    Object object2 = objectArray[2];
    Assert.assertTrue(object instanceof String);
    Assert.assertTrue(object2 instanceof String);
    Assert.assertEquals("aaaaa", object);
    Assert.assertEquals("aaaka", object2);
    Assert.assertTrue(object1 instanceof String);
    Assert.assertEquals("aaaaa", object1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
