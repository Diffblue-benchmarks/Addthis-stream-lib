package com.clearspring.analytics.util;

import com.clearspring.analytics.util.DoublyLinkedList;
import com.clearspring.analytics.util.ListNode2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoublyLinkedList_addTest_2_Test {
  @Test
  public void addTest() throws Exception {
    // Arrange
    DoublyLinkedList<Object> doublyLinkedList = new DoublyLinkedList<Object>();
    String value = "aaaaa";

    // Act
    ListNode2<Object> actual = doublyLinkedList.add(value);

    // Assert
    String toStringResult = actual.toString();
    ListNode2<Object> prev = actual.getPrev();
    Object value1 = actual.getValue();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, actual.getNext());
    Assert.assertTrue(value1 instanceof String);
    Assert.assertEquals(null, prev);
    Assert.assertEquals("aaaaa", value1);
    String toStringResult1 = doublyLinkedList.toString();
    Object[] toArrayResult = doublyLinkedList.toArray();
    Object firstResult = doublyLinkedList.first();
    boolean isEmptyResult = doublyLinkedList.isEmpty();
    int sizeResult = doublyLinkedList.size();
    Assert.assertNotNull(toStringResult1);
    Assert.assertSame(actual, doublyLinkedList.tail());
    Assert.assertEquals(1, sizeResult);
    Assert.assertFalse(isEmptyResult);
    Assert.assertTrue(firstResult instanceof String);
    Assert.assertEquals(1, toArrayResult.length);
    Object object = toArrayResult[0];
    Assert.assertEquals("aaaaa", firstResult);
    Assert.assertTrue(object instanceof String);
    Assert.assertEquals("aaaaa", object);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
