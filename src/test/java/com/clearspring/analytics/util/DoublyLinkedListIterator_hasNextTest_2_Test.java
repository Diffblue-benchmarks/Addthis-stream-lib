package com.clearspring.analytics.util;

import com.clearspring.analytics.util.DoublyLinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class DoublyLinkedListIterator_hasNextTest_2_Test {
  @Test
  public void hasNextTest() throws Exception {
    // Arrange
    DoublyLinkedList.DoublyLinkedListIterator doublyLinkedListIterator = Whitebox
        .newInstance(DoublyLinkedList.DoublyLinkedListIterator.class);

    // Act
    boolean actual = doublyLinkedListIterator.hasNext();

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
