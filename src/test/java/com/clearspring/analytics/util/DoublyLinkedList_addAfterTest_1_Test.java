package com.clearspring.analytics.util;

import com.clearspring.analytics.util.DoublyLinkedList;
import com.clearspring.analytics.util.ListNode2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoublyLinkedList_addAfterTest_1_Test {
  @Test
  public void addAfterTest() throws Exception {
    // Arrange
    DoublyLinkedList<Object> doublyLinkedList = new DoublyLinkedList<Object>();
    ListNode2<Object> listNode2 = new ListNode2<Object>("aaaaa");
    String value = "aaaaa";

    // Act
    ListNode2<Object> actual = doublyLinkedList.addAfter(listNode2, value);

    // Assert
    String toStringResult = actual.toString();
    ListNode2<Object> prev = actual.getPrev();
    Object value1 = actual.getValue();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, actual.getNext());
    Assert.assertTrue(value1 instanceof String);
    Assert.assertSame(listNode2, prev);
    String toStringResult1 = prev.toString();
    ListNode2<Object> prev1 = prev.getPrev();
    Object value2 = prev.getValue();
    Assert.assertEquals("aaaaa", value1);
    Assert.assertSame(actual, prev.getNext());
    Assert.assertTrue(value2 instanceof String);
    Assert.assertEquals(null, prev1);
    Assert.assertEquals("aaaaa", value2);
    Assert.assertNotNull(toStringResult1);
    Assert.assertSame(prev, listNode2);
    String toStringResult2 = doublyLinkedList.toString();
    Object[] toArrayResult = doublyLinkedList.toArray();
    Object firstResult = doublyLinkedList.first();
    boolean isEmptyResult = doublyLinkedList.isEmpty();
    int sizeResult = doublyLinkedList.size();
    Assert.assertNotNull(toStringResult2);
    Assert.assertEquals(null, doublyLinkedList.tail());
    Assert.assertEquals(1, sizeResult);
    Assert.assertFalse(isEmptyResult);
    Assert.assertEquals(null, firstResult);
    Assert.assertEquals(1, toArrayResult.length);
    Assert.assertEquals(null, toArrayResult[0]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
