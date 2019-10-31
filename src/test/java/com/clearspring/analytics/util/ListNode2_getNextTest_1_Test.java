package com.clearspring.analytics.util;

import com.clearspring.analytics.util.ListNode2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ListNode2_getNextTest_1_Test {
  @Test
  public void getNextTest() throws Exception {
    // Arrange
    ListNode2<Object> listNode2 = new ListNode2<Object>("aaaaa");

    // Act
    ListNode2<Object> actual = listNode2.getNext();

    // Assert
    Assert.assertEquals(null, actual);
    String toStringResult = listNode2.toString();
    ListNode2<Object> prev = listNode2.getPrev();
    Object value = listNode2.getValue();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, listNode2.getNext());
    Assert.assertTrue(value instanceof String);
    Assert.assertEquals(null, prev);
    Assert.assertEquals("aaaaa", value);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
