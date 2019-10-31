package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.ScoredItem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ScoredItem_addAndGetCountTest_4_Test {
  @Test
  public void addAndGetCountTest() throws Exception {
    // Arrange
    ScoredItem<Object> scoredItem = new ScoredItem<Object>("aaaaa", 1L);
    long delta = 1L;

    // Act
    long actual = scoredItem.addAndGetCount(delta);

    // Assert
    Assert.assertEquals(2L, actual);
    Object item = scoredItem.getItem();
    String toStringResult = scoredItem.toString();
    long error = scoredItem.getError();
    boolean isNewItemResult = scoredItem.isNewItem();
    Assert.assertTrue(item instanceof String);
    Assert.assertEquals(2L, scoredItem.getCount());
    Assert.assertEquals("aaaaa", item);
    Assert.assertTrue(isNewItemResult);
    Assert.assertEquals(0L, error);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
