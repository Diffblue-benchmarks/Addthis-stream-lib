package com.clearspring.analytics.util;

import com.clearspring.analytics.util.DoublyLinkedList;
import com.clearspring.analytics.util.ListNode2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoublyLinkedList_addAfterTest_4_Test {
  @Test
  public void addAfterTest() throws Exception {
    // Arrange
    DoublyLinkedList<Object> doublyLinkedList = new DoublyLinkedList<Object>();
    ListNode2<Object> listNode2 = new ListNode2<Object>("aaaaa");
    ListNode2<Object> listNode21 = new ListNode2<Object>("aaaaa");

    // Act
    doublyLinkedList.addAfter(listNode2, listNode21);

    // Assert
    String toStringResult = listNode2.toString();
    ListNode2<Object> prev = listNode2.getPrev();
    Object value = listNode2.getValue();
    ListNode2<Object> next = listNode2.getNext();
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(listNode21, next);
    String toStringResult1 = next.toString();
    ListNode2<Object> prev1 = next.getPrev();
    Object value1 = next.getValue();
    Assert.assertTrue(value instanceof String);
    Assert.assertEquals(null, prev);
    Assert.assertEquals("aaaaa", value);
    Assert.assertTrue(value1 instanceof String);
    Assert.assertSame(listNode2, prev1);
    Assert.assertEquals("aaaaa", value1);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, next.getNext());
    Assert.assertSame(next, listNode21);
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
