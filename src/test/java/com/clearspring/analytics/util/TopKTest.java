package com.clearspring.analytics.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyChar;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.clearspring.analytics.stream.Counter;
import com.clearspring.analytics.stream.StreamSummary;
import com.clearspring.analytics.util.DoublyLinkedList;
import com.clearspring.analytics.util.ListNode2;
import com.clearspring.analytics.util.TopK;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

@RunWith(PowerMockRunner.class)
public class TopKTest {

  // Test written by Diffblue Cover.
  @PrepareForTest({TopK.class, StringBuilder.class})
  @Test
  public void formatSummaryInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final StreamSummary<String> topk = new StreamSummary<String>();
    final DoublyLinkedList<Object> doublyLinkedList = new DoublyLinkedList<Object>();
    doublyLinkedList.head = null;
    doublyLinkedList.size = 0;
    doublyLinkedList.tail = null;
    Reflector.setField(topk, "bucketList", doublyLinkedList);
    Reflector.setField(topk, "capacity", 0);
    Reflector.setField(topk, "counterMap", null);
    final StringBuilder stringBuilder2 = PowerMockito.mock(StringBuilder.class);
    PowerMockito.when(stringBuilder2.toString()).thenReturn("\u0000");
    PowerMockito.when(stringBuilder2.append(anyChar()))
        .thenReturn(stringBuilder2)
        .thenReturn(stringBuilder2)
        .thenReturn(stringBuilder2)
        .thenReturn(stringBuilder2)
        .thenReturn(stringBuilder2);
    final char[] myCharArray2 = {'\u0000'};
    Reflector.setField(stringBuilder2, "data", myCharArray2);
    Reflector.setField(stringBuilder2, "length", 1_431_655_762);
    final StringBuilder stringBuilder1 = PowerMockito.mock(StringBuilder.class);
    PowerMockito.when(stringBuilder1.toString()).thenReturn("\u0000");
    PowerMockito.when(stringBuilder1.append(anyChar()))
        .thenReturn(stringBuilder1)
        .thenReturn(stringBuilder1)
        .thenReturn(stringBuilder1)
        .thenReturn(stringBuilder1)
        .thenReturn(stringBuilder1);
    final char[] myCharArray1 = {'\u0000'};
    Reflector.setField(stringBuilder1, "data", myCharArray1);
    Reflector.setField(stringBuilder1, "length", 1_431_655_762);
    final StringBuilder stringBuilder = PowerMockito.mock(StringBuilder.class);
    PowerMockito.when(stringBuilder.toString()).thenReturn("\u0000");
    PowerMockito.when(stringBuilder.append(anyChar()))
        .thenReturn(stringBuilder)
        .thenReturn(stringBuilder)
        .thenReturn(stringBuilder)
        .thenReturn(stringBuilder);
    final char[] myCharArray = {'\u0000'};
    Reflector.setField(stringBuilder, "data", myCharArray);
    Reflector.setField(stringBuilder, "length", 1_431_655_762);
    PowerMockito.whenNew(StringBuilder.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(stringBuilder)
        .thenReturn(stringBuilder1)
        .thenReturn(stringBuilder2);

    // Act
    final String actual = TopK.formatSummary(topk);

    // Assert result
    Assert.assertEquals("item count error\n???\n", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StreamSummary.class, TopK.class, ObjectInput.class})
  @Test
  public void formatSummaryInputNotNullOutputIllegalArgumentException()
      throws Exception, InvocationTargetException {

    // Arrange
    final StreamSummary<String> topk = new StreamSummary<String>();
    final DoublyLinkedList<Object> doublyLinkedList = new DoublyLinkedList<Object>();
    final ListNode2 listNode2 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    listNode2.next = null;
    final Object bucket =
        Reflector.getInstance("com.clearspring.analytics.stream.StreamSummary$Bucket");
    Reflector.setField(bucket, "this$0", topk);
    final DoublyLinkedList<Counter> doublyLinkedList1 = new DoublyLinkedList<Counter>();
    final ListNode2 listNode21 =
        (ListNode2)Reflector.getInstance("com.clearspring.analytics.util.ListNode2");
    listNode21.next = null;
    final Counter counter = new Counter();
    Reflector.setField(counter, "error", 622_601L);
    Reflector.setField(counter, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(counter, "item", -65_537);
    Reflector.setField(counter, "bucketNode", listNode2);
    listNode21.value = counter;
    listNode21.prev = null;
    doublyLinkedList1.head = listNode21;
    doublyLinkedList1.size = 1;
    doublyLinkedList1.tail = listNode21;
    Reflector.setField(bucket, "counterList", doublyLinkedList1);
    Reflector.setField(bucket, "count", -9_223_372_036_854_775_807L);
    listNode2.value = bucket;
    listNode2.prev = null;
    doublyLinkedList.head = listNode2;
    doublyLinkedList.size = 1;
    doublyLinkedList.tail = listNode2;
    Reflector.setField(topk, "bucketList", doublyLinkedList);
    Reflector.setField(topk, "capacity", -2_147_483_648);
    final HashMap hashMap = new HashMap();
    hashMap.put(-65537, listNode21);
    Reflector.setField(topk, "counterMap", hashMap);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInput.class, "readObject");
    PowerMockito.doReturn(counter).when(objectInputStream, readObjectMethod).withNoArguments();
    final Method readIntMethod = DTUMemberMatcher.method(ObjectInput.class, "readInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_147_483_648).doReturn(1))
        .when(objectInputStream, readIntMethod)
        .withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    thrown.expect(IllegalArgumentException.class);
    TopK.formatSummary(topk);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final TopK actual = new TopK();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TopK.class, StringBuilder.class})
  @Test
  public void stringInputNotNullPositiveOutputNotNull() throws Exception {

    // Arrange
    final char c = '!';
    final int len = 1;
    final StringBuilder stringBuilder = PowerMockito.mock(StringBuilder.class);
    PowerMockito.when(stringBuilder.toString()).thenReturn("??!");
    PowerMockito.when(stringBuilder.append(anyChar())).thenReturn(stringBuilder);
    final char[] myCharArray = {'?', '?', '!'};
    Reflector.setField(stringBuilder, "data", myCharArray);
    Reflector.setField(stringBuilder, "length", 3);
    PowerMockito.whenNew(StringBuilder.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(stringBuilder);

    // Act
    final String actual = TopK.string(c, len);

    // Assert result
    Assert.assertEquals("??!", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TopK.class, StringBuilder.class})
  @Test
  public void stringInputNotNullZeroOutputNotNull0008f253238208f5b7b() throws Exception {

    // Arrange
    final char c = '!';
    final int len = 0;
    final StringBuilder stringBuilder = PowerMockito.mock(StringBuilder.class);
    PowerMockito.when(stringBuilder.toString()).thenReturn("");
    Reflector.setField(stringBuilder, "data", null);
    Reflector.setField(stringBuilder, "length", 0);
    PowerMockito.whenNew(StringBuilder.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(stringBuilder);

    // Act
    final String actual = TopK.string(c, len);

    // Assert result
    Assert.assertEquals("", actual);
  }
}
