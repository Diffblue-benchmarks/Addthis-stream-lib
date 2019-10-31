package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.ScoredItem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ScoredItem_compareToTest_3_Test {
  @Test
  public void compareToTest() throws Exception {
    // Arrange
    ScoredItem<Object> scoredItem = new ScoredItem<Object>("aaaaa", 1L);
    ScoredItem<Object> scoredItem1 = new ScoredItem<Object>("aaaaa", 1L);

    // Act
    int actual = scoredItem.compareTo(scoredItem1);

    // Assert
    Assert.assertEquals(0, actual);
    Object item = scoredItem1.getItem();
    String toStringResult = scoredItem1.toString();
    long error = scoredItem1.getError();
    boolean isNewItemResult = scoredItem1.isNewItem();
    Assert.assertTrue(item instanceof String);
    Assert.assertEquals(1L, scoredItem1.getCount());
    Assert.assertEquals("aaaaa", item);
    Assert.assertTrue(isNewItemResult);
    Assert.assertEquals(0L, error);
    Assert.assertNotNull(toStringResult);
    Object item1 = scoredItem.getItem();
    String toStringResult1 = scoredItem.toString();
    long error1 = scoredItem.getError();
    boolean isNewItemResult1 = scoredItem.isNewItem();
    Assert.assertTrue(item1 instanceof String);
    Assert.assertEquals(1L, scoredItem.getCount());
    Assert.assertEquals("aaaaa", item1);
    Assert.assertTrue(isNewItemResult1);
    Assert.assertEquals(0L, error1);
    Assert.assertNotNull(toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
