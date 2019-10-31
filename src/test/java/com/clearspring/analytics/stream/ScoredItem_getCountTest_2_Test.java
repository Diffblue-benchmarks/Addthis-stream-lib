package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.ScoredItem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ScoredItem_getCountTest_2_Test {
  @Test
  public void getCountTest() throws Exception {
    // Arrange
    ScoredItem<Object> scoredItem = new ScoredItem<Object>("aaaaa", 1L);

    // Act
    long actual = scoredItem.getCount();

    // Assert
    Assert.assertEquals(1L, actual);
    Object item = scoredItem.getItem();
    String toStringResult = scoredItem.toString();
    long error = scoredItem.getError();
    boolean isNewItemResult = scoredItem.isNewItem();
    Assert.assertTrue(item instanceof String);
    Assert.assertEquals(1L, scoredItem.getCount());
    Assert.assertEquals("aaaaa", item);
    Assert.assertTrue(isNewItemResult);
    Assert.assertEquals(0L, error);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
