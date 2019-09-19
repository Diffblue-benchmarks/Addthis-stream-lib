package com.clearspring.analytics.util;

import com.clearspring.analytics.util.ListNode2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ListNode2Test {

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroOutputNotNull() {

    // Act, creating object to test constructor
    final ListNode2 actual = new ListNode2(0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(0, actual.value);
    Assert.assertNull(actual.prev);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNextOutputNull() {

    // Arrange
    final ListNode2 listNode2 = new ListNode2(0);

    // Act and Assert result
    Assert.assertNull(listNode2.getNext());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPrevOutputNull() {

    // Arrange
    final ListNode2 listNode2 = new ListNode2(0);

    // Act and Assert result
    Assert.assertNull(listNode2.getPrev());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getValueOutputZero() {

    // Arrange
    final ListNode2 listNode2 = new ListNode2(0);

    // Act and Assert result
    Assert.assertEquals(0, listNode2.getValue());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setValueInputZeroOutputVoid() {

    // Arrange
    final ListNode2 listNode2 = new ListNode2(0);

    // Act
    listNode2.setValue(0);

    // The method returns void, testing that no exception is thrown
  }
}
