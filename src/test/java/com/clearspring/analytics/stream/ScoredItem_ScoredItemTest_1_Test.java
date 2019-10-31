package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.ScoredItem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ScoredItem_ScoredItemTest_1_Test {
  @Test
  public void ScoredItemTest() throws Exception {
    // Arrange
    String item = "aaaaa";
    long count = 1L;
    long error = 1L;

    // Act
    ScoredItem<Object> scoredItem = new ScoredItem<Object>(item, count, error);

    // Assert
    Object item1 = scoredItem.getItem();
    String toStringResult = scoredItem.toString();
    long error1 = scoredItem.getError();
    boolean isNewItemResult = scoredItem.isNewItem();
    Assert.assertTrue(item1 instanceof String);
    Assert.assertEquals(1L, scoredItem.getCount());
    Assert.assertEquals("aaaaa", item1);
    Assert.assertTrue(isNewItemResult);
    Assert.assertEquals(1L, error1);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
