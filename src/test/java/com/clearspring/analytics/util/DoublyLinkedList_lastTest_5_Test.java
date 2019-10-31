package com.clearspring.analytics.util;

import com.clearspring.analytics.util.DoublyLinkedList;
import com.clearspring.analytics.util.ListNode2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DoublyLinkedList_lastTest_5_Test {
  @Test
  public void lastTest() throws Exception {
    // Arrange
    DoublyLinkedList<Object> doublyLinkedList = new DoublyLinkedList<Object>();

    // Act
    Object actual = doublyLinkedList.last();

    // Assert
    Assert.assertEquals(null, actual);
    String toStringResult = doublyLinkedList.toString();
    Object[] toArrayResult = doublyLinkedList.toArray();
    Object firstResult = doublyLinkedList.first();
    boolean isEmptyResult = doublyLinkedList.isEmpty();
    int sizeResult = doublyLinkedList.size();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, doublyLinkedList.tail());
    Assert.assertEquals(0, sizeResult);
    Assert.assertTrue(isEmptyResult);
    Assert.assertEquals(null, firstResult);
    Assert.assertEquals(0, toArrayResult.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
