package com.clearspring.analytics.stream;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.clearspring.analytics.stream.SampleSet;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@RunWith(PowerMockRunner.class)
public class SampleSetTest {

  // Test written by Diffblue Cover.

  @Test
  public void peekInputPositiveOutput1002749be8ef9861b494() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final int k = 1;

    // Act
    final List actual = sampleSet.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(SampleSet.class)
  @Test
  public void constructorInputZeroOutputVoid000c093158d2dd97ed4()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(Object.class));

    // Arrange
    final int capacity = 0;
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class, Random.class)
        .withArguments(anyInt(), or(isA(Random.class), isNull(Random.class)))
        .thenReturn(sampleSet);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final SampleSet actual = new SampleSet(capacity);
  }

  // Test written by Diffblue Cover.

  @Test
  public void peekInputZeroOutput06() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final int k = 0;

    // Act
    final List actual = sampleSet.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void peekInputPositiveOutput2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final int k = 262_145;

    // Act
    final List actual = sampleSet.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void peekInputPositiveOutput12() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final int k = 8;

    // Act
    final List actual = sampleSet.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(SampleSet.class)
  @Test
  public void constructorOutputVoid00037d5572cad4e8e13()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(Object.class));

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act, creating object to test constructor
    final SampleSet actual = new SampleSet();
  }

  // Test written by Diffblue Cover.

  @Test
  public void peekInputPositiveOutput14() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final int k = 1;

    // Act
    final List actual = sampleSet.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0);
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void peekInputZeroOutput000016150590eec8eb9f() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final int k = 0;

    // Act
    final List actual = sampleSet.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void peekInputZeroOutput0001ab2489b83cbf4948() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final int k = 0;

    // Act
    final List actual = sampleSet.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void peekInputZeroOutput07() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final int k = 0;

    // Act
    final List actual = sampleSet.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputNegativeOutputIllegalArgumentException() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act
    thrown.expect(IllegalArgumentException.class);
    sampleSet.peek(-2_147_483_648);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero7() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "next", node4);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node7, "this$0", sampleSet3);
    Reflector.setField(node7, "count", 0L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node7, "prev", node9);
    Reflector.setField(node1, "prev", node7);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(1, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero6() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(1, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero5() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node4, "this$0", sampleSet3);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node, "prev", node4);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap2);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero4() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node4, "this$0", sampleSet3);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node, "prev", node4);
    Reflector.setField(sampleSet, "head", node);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(sampleSet4, "head", node8);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(sampleSet4, "tail", node9);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap2);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node7, "this$0", sampleSet4);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    final SampleSet sampleSet5 = new SampleSet();
    Reflector.setField(sampleSet5, "head", null);
    Reflector.setField(sampleSet5, "tail", null);
    Reflector.setField(sampleSet5, "size", 0);
    Reflector.setField(sampleSet5, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet5, "sampleMap", hashMap3);
    final Random random4 = new Random();
    Reflector.setField(sampleSet5, "random", random4);
    Reflector.setField(node10, "this$0", sampleSet5);
    Reflector.setField(node10, "count", 0L);
    final Object node11 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node11, "element", 0);
    Reflector.setField(node11, "this$0", null);
    Reflector.setField(node11, "count", 0L);
    Reflector.setField(node11, "next", null);
    Reflector.setField(node11, "prev", null);
    Reflector.setField(node10, "next", node11);
    final Object node12 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node12, "element", 0);
    Reflector.setField(node12, "this$0", null);
    Reflector.setField(node12, "count", 0L);
    Reflector.setField(node12, "next", null);
    Reflector.setField(node12, "prev", null);
    Reflector.setField(node10, "prev", node12);
    Reflector.setField(node7, "prev", node10);
    Reflector.setField(sampleSet, "tail", node7);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap4);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeOutputPositive() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap1);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap2);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(-1));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeOutputPositive4() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "tail", node1);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    hashMap1.put(-4, node3);
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(-2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeZeroOutputZero3() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node4, "this$0", sampleSet3);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node, "prev", node4);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap3);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(-1, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeZeroOutputZero4() {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(-1, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeZeroOutputZero5() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 = new SampleSet();
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(-1, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputZeroZeroOutputZero3() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node3, "next", node4);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputPositiveOutput1() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act
    final List actual = sampleSet.peek(1);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeOutputPositive2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap1);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "head", node);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    Reflector.setField(node10, "this$0", null);
    Reflector.setField(node10, "count", 0L);
    Reflector.setField(node10, "next", null);
    Reflector.setField(node10, "prev", null);
    Reflector.setField(sampleSet4, "head", node10);
    final Object node11 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node11, "element", 0);
    Reflector.setField(node11, "this$0", null);
    Reflector.setField(node11, "count", 0L);
    Reflector.setField(node11, "next", null);
    Reflector.setField(node11, "prev", null);
    Reflector.setField(sampleSet4, "tail", node11);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap2);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node9, "this$0", sampleSet4);
    Reflector.setField(node9, "count", 0L);
    final Object node12 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node12, "element", 0);
    final SampleSet sampleSet5 = new SampleSet();
    Reflector.setField(sampleSet5, "head", null);
    Reflector.setField(sampleSet5, "tail", null);
    Reflector.setField(sampleSet5, "size", 0);
    Reflector.setField(sampleSet5, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet5, "sampleMap", hashMap3);
    final Random random4 = new Random();
    Reflector.setField(sampleSet5, "random", random4);
    Reflector.setField(node12, "this$0", sampleSet5);
    Reflector.setField(node12, "count", 0L);
    final Object node13 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node13, "element", 0);
    Reflector.setField(node13, "this$0", null);
    Reflector.setField(node13, "count", 0L);
    Reflector.setField(node13, "next", null);
    Reflector.setField(node13, "prev", null);
    Reflector.setField(node12, "next", node13);
    final Object node14 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node14, "element", 0);
    Reflector.setField(node14, "this$0", null);
    Reflector.setField(node14, "count", 0L);
    Reflector.setField(node14, "next", null);
    Reflector.setField(node14, "prev", null);
    Reflector.setField(node12, "prev", node14);
    Reflector.setField(node9, "next", node12);
    final Object node15 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node15, "element", 0);
    final SampleSet sampleSet6 = new SampleSet();
    Reflector.setField(sampleSet6, "head", null);
    Reflector.setField(sampleSet6, "tail", null);
    Reflector.setField(sampleSet6, "size", 0);
    Reflector.setField(sampleSet6, "count", 0L);
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(sampleSet6, "sampleMap", hashMap4);
    final Random random5 = new Random();
    Reflector.setField(sampleSet6, "random", random5);
    Reflector.setField(node15, "this$0", sampleSet6);
    Reflector.setField(node15, "count", 0L);
    final Object node16 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node16, "element", 0);
    Reflector.setField(node16, "this$0", null);
    Reflector.setField(node16, "count", 0L);
    Reflector.setField(node16, "next", null);
    Reflector.setField(node16, "prev", null);
    Reflector.setField(node15, "next", node16);
    final Object node17 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node17, "element", 0);
    Reflector.setField(node17, "this$0", null);
    Reflector.setField(node17, "count", 0L);
    Reflector.setField(node17, "next", null);
    Reflector.setField(node17, "prev", null);
    Reflector.setField(node15, "prev", node17);
    Reflector.setField(node9, "prev", node15);
    Reflector.setField(sampleSet, "tail", node9);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap5 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap5);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(-1));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputZeroOutputPositive2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputZeroOutputPositive() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeOutputPositive3() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "tail", node1);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    hashMap1.put(-4, node2);
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(-2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputZeroZeroOutputZero4() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputZeroOutput02() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act
    final List actual = sampleSet.peek(0);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputZeroOutput03() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act
    final List actual = sampleSet.peek(0);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero12() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", null);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    hashMap.put(-1, node9);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero11() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(-1, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero9() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero8() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputPositive7() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", -2);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputPositive() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(null, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "head", node);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(sampleSet4, "head", node9);
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    Reflector.setField(node10, "this$0", null);
    Reflector.setField(node10, "count", 0L);
    Reflector.setField(node10, "next", null);
    Reflector.setField(node10, "prev", null);
    Reflector.setField(sampleSet4, "tail", node10);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap3);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node8, "this$0", sampleSet4);
    Reflector.setField(node8, "count", 0L);
    final Object node11 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node11, "element", 0);
    Reflector.setField(node11, "this$0", null);
    Reflector.setField(node11, "count", 0L);
    final Object node12 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node12, "element", 0);
    Reflector.setField(node12, "this$0", null);
    Reflector.setField(node12, "count", 0L);
    Reflector.setField(node12, "next", null);
    Reflector.setField(node12, "prev", null);
    Reflector.setField(node11, "next", node12);
    final Object node13 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node13, "element", 0);
    Reflector.setField(node13, "this$0", null);
    Reflector.setField(node13, "count", 0L);
    Reflector.setField(node13, "next", null);
    Reflector.setField(node13, "prev", null);
    Reflector.setField(node11, "prev", node13);
    Reflector.setField(node8, "next", node11);
    final Object node14 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node14, "element", 0);
    final SampleSet sampleSet5 = new SampleSet();
    Reflector.setField(sampleSet5, "head", null);
    Reflector.setField(sampleSet5, "tail", null);
    Reflector.setField(sampleSet5, "size", 0);
    Reflector.setField(sampleSet5, "count", 0L);
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(sampleSet5, "sampleMap", hashMap4);
    final Random random4 = new Random();
    Reflector.setField(sampleSet5, "random", random4);
    Reflector.setField(node14, "this$0", sampleSet5);
    Reflector.setField(node14, "count", 0L);
    final Object node15 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node15, "element", 0);
    Reflector.setField(node15, "this$0", null);
    Reflector.setField(node15, "count", 0L);
    Reflector.setField(node15, "next", null);
    Reflector.setField(node15, "prev", null);
    Reflector.setField(node14, "next", node15);
    final Object node16 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node16, "element", 0);
    Reflector.setField(node16, "this$0", null);
    Reflector.setField(node16, "count", 0L);
    Reflector.setField(node16, "next", null);
    Reflector.setField(node16, "prev", null);
    Reflector.setField(node14, "prev", node16);
    Reflector.setField(node8, "prev", node14);
    Reflector.setField(sampleSet, "tail", node8);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap5 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap5);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputPositive2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(null, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap3);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputPositive6() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -2);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputPositive3() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 127L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    hashMap.put(-2_147_483_648, node1);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputPositive4() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 127L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    hashMap.put(-2_147_483_648, node2);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputZeroOutput0000b60a563166ba479f() {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act
    final List actual = sampleSet.peek(0);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekOutputNull() {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.peek());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekOutputNull2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.peek());
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputZero() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputZero2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputZero3() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node, "prev", node2);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputPositive5() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 52_366L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    hashMap.put(null, node1);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(52_367L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeOutputZero() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(-1, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(-1));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeOutputPositive5() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "tail", node1);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node2, "next", node3);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    hashMap1.put(-2, node6);
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(-2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullOutputZero4() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputPositiveOutputPositive() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node2, "prev", node4);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    hashMap.put(315_504_930, node5);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(315_504_930));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputZeroOutputPositive3() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    hashMap.put(0, node2);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(1L, sampleSet.put(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeOutputZero2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    hashMap.put(-1, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(-1));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero10() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    hashMap.put(null, node4);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeZeroOutputZero2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    hashMap.put(-1, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(-1, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeZeroOutputZero() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(-1, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(-1, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputZeroZeroOutputZero2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(0, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero3() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputZero2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node, "prev", node2);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNegativeZeroOutputZero6() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    hashMap.put(-1, node6);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(-1, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputZeroZeroOutputZero() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "next", node4);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node7, "this$0", sampleSet3);
    Reflector.setField(node7, "count", 0L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node7, "prev", node9);
    Reflector.setField(node1, "prev", node7);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    Reflector.setField(node10, "this$0", null);
    Reflector.setField(node10, "count", 0L);
    Reflector.setField(node10, "next", null);
    Reflector.setField(node10, "prev", null);
    hashMap.put(0, node10);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.put(0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void putInputNullZeroOutputNegative() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(-9_223_372_036_854_775_808L, sampleSet.put(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull26() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -4_208_949_838_479_361L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", -7_135_830_950_439_682_058L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node4, "this$0", sampleSet1);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node3, "next", node4);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", 4_287_394_428_682_240L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull2() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 9_223_372_036_854_775_296L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputZero2() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 1L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 3075L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", -9_223_372_036_854_775_805L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "next", node3);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random2 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node5, "this$0", sampleSet3);
    Reflector.setField(node5, "count", 0L);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "next", node6);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node5, "prev", node7);
    Reflector.setField(node, "prev", node5);
    Reflector.setField(sampleSet, "head", node);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", null);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 8_589_935_653L);
    Reflector.setField(node8, "next", null);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", null);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node8, "prev", node9);
    Reflector.setField(sampleSet, "tail", node8);
    Reflector.setField(sampleSet, "size", 65_538);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap2);
    final Random random3 = PowerMockito.mock(Random.class);
    PowerMockito.when(random3.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random3);

    // Act and Assert result
    Assert.assertEquals(0, sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputZero() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 1L);
    Reflector.setField(node, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 8_589_935_653L);
    Reflector.setField(node6, "next", null);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", null);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "prev", node7);
    Reflector.setField(sampleSet, "tail", node6);
    Reflector.setField(sampleSet, "size", 65_538);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertEquals(0, sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull57() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull56() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 1L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 8_070_591_269_736_284_159L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", -58L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 2);
    Reflector.setField(sampleSet, "count", 2L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull55() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 1L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 8_070_591_269_736_284_159L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", -58L);
    Reflector.setField(node3, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "prev", node4);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 2);
    Reflector.setField(sampleSet, "count", 2L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull54() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 1L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 2L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull53() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 2L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull52() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 9_187_905_365_155_512_319L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_187_906_189_789_233_151L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull51() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -2L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 2L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull50() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -142_989_288_169_013_312L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", -142_989_288_169_013_255L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x0.0000000000009p-1022 /* 4.44659e-323 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull49() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -9_151_314_442_816_847_360L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -8_150_458_110_773_035_517L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 7_873_039_013_015_357L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", -142_989_288_169_013_312L);
    Reflector.setField(node3, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "prev", node4);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", -142_989_288_169_013_255L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x0.0000000000009p-1022 /* 4.44659e-323 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull48() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 612_308_580_260L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -612_308_547_493L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 14_600L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.000661ed3f43ap-999 /* 1.86671e-301 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull47() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -4_752_423_506_782_715_904L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.4b3e0190201dfp-1 /* 0.646957 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull46() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 2_837_401_940_162_625_535L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 4_109_253_184_998_866_944L);
    Reflector.setField(node4, "next", null);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "prev", node5);
    Reflector.setField(sampleSet, "tail", node4);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 4_109_253_184_998_866_944L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull45() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 10_658_548_305_315_916L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 11_014_173_391_809_269L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 1_271_790_687_780_728_545L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 641_679_028_205_387_745L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1p-486 /* 5.00521e-147 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull44() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 11_285_187_981_297_739L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 5_536_931_566_482_749_373L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 641_679_028_205_387_745L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 641_679_028_205_387_745L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull43() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 5_599_832_395_977_783_808L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 6_228_811_368_219_946_736L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 7_570_764_774_464_415_248L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", -7_442_691_132_442_142L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1p-514 /* 1.86459e-155 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull42() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 5_599_832_395_977_783_808L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 6_228_811_368_219_946_736L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 7_570_764_774_464_415_248L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", -7_442_691_132_442_142L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1p-514 /* 1.86459e-155 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull41() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 634_990_207_608_291_460L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -1_554_576_170_081_844_049L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "next", node1);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node, "prev", node4);
    Reflector.setField(sampleSet, "head", node);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 20_799_719_160_676_355L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(sampleSet, "tail", node5);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 20_799_719_160_676_355L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull40() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -16_417L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 4_611_686_018_427_387_905L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull39() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -16_415L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 16_424L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", -4_611_686_018_427_387_904L);
    Reflector.setField(node3, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "prev", node4);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1p-512 /* 7.45834e-155 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull38() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", -4_611_686_018_460_943_357L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.fffffffffc001p-2 /* 0.5 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull37() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", -4_611_686_018_460_943_357L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.fffffffffc001p-2 /* 0.5 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull36() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 1L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node2, "prev", node4);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 3L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull35() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 1L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 3L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull34() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 439_213_156_406_557L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 5_069_078_994_003_184_867L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 9_154_418_827_431_263_200L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 2_404_906_808_115_200L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x0.0000000000001p-1022 /* 4.94066e-324 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull33() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -449_754_272_160_314_400L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 5_519_272_479_319_905_824L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -8_061_012_960_523_306_016L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", -2_462_624_571_509_965_056L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0x0.0000000000001p-1022 /* 4.94066e-324 */);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull32() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -449_754_272_160_314_400L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 5_519_272_479_319_905_824L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -8_061_012_960_523_306_016L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 2_462_624_571_509_965_056L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0x0.0000000000001p-1022 /* 4.94066e-324 */);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull31() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -32L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", -351_586_311_762_673_632L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 9_133_595_681_895_236_096L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 314_706_616_148_557_826L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node5, "this$0", sampleSet2);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(sampleSet, "tail", node4);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 314_706_616_148_557_824L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0x1.a040000aba9e2p-152 /* 2.8481e-46 */);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull30() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 5_035_305_858_376_925_186L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 5_035_305_858_376_925_184L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0x1.8p-512 /* 1.11875e-154 */);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull29() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", -2L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.5);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull28() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull27() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputZero3() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", -2_639_797_163_158_734_337L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node, "prev", node2);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 3L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertEquals(0, sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull25() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -7_135_830_950_439_682_058L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node2, "prev", node4);
    Reflector.setField(node1, "next", node2);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "next", node6);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", null);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node5, "prev", node7);
    Reflector.setField(node1, "prev", node5);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", 4_287_394_428_682_240L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull24() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -5_285_425_335_343_499_265L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 5_279_972_203_588_733_604L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 5);
    Reflector.setField(sampleSet, "count", 128_352_595_101_089_802L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.7f7e7e50aa8fap-513 /* 5.58639e-155 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull23() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 140_737_488_355_328L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 6_921_891_889_780_097_024L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 2_305_983_746_699_952_127L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 1_152_921_503_533_105_152L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x0.0000000000001p-1022 /* 4.94066e-324 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull22() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -9_223_371_487_098_961_919L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -549_755_813_889L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 1_152_921_503_533_105_152L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull21() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -30_700_990_874_041_771L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 31_650_440_165_506_477L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -3_522_208_298_122_168_960L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 666_803_466_652_352_512L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", -486_118_037_229_928_416L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.02af431b1afe9p-4 /* 0.0631554 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull20() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -30_700_990_874_041_771L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 31_650_440_165_506_477L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -3_522_208_298_122_168_960L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node1, "prev", node3);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 666_803_466_652_352_512L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(sampleSet, "tail", node4);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", -486_118_037_229_928_416L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull19() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1_009_176_445_999_644_608L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 1_044_835_113_549_955_072L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -35_658_663_012_073_473L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 1_008_805_148_568_322_048L);
    Reflector.setField(node4, "next", null);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "prev", node6);
    Reflector.setField(node4, "prev", node5);
    Reflector.setField(sampleSet, "tail", node4);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull18() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1_008_805_148_568_322_048L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.08000000002p-514 /* 1.92285e-155 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull17() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -143_451_228_769_120_615L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 136_751_480_393_546_779L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node, "prev", node2);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 515_396_075_520L);
    Reflector.setField(node3, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "prev", node4);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", -269_307_198_522_261_512L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull16() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9768L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node, "prev", node2);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 1_065_151_889_408L);
    Reflector.setField(node3, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "prev", node4);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 6);
    Reflector.setField(sampleSet, "count", -3L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.9f962fdb93fe8p-2 /* 0.405846 */);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull15() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", -4_612_248_452_984_733_696L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", -6_917_529_027_643_179_009L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "next", node3);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 792_812_293_913_584_571L);
    Reflector.setField(node5, "next", null);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "prev", node6);
    Reflector.setField(sampleSet, "tail", node5);
    Reflector.setField(sampleSet, "size", 65_539);
    Reflector.setField(sampleSet, "count", -1L);
    final HashMap hashMap2 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap2);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull12() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 1L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 16_777_216L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random2 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node4, "this$0", sampleSet3);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node, "prev", node4);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 65_538);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap2);
    final Random random3 = PowerMockito.mock(Random.class);
    PowerMockito.when(random3.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random3);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull11() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", -340L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 300_067_153_813_432_356L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 300_067_153_813_432_418L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node, "next", node3);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet3, "random", random1);
    Reflector.setField(node5, "this$0", sampleSet3);
    Reflector.setField(node5, "count", 0L);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "next", node6);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node5, "prev", node7);
    Reflector.setField(node, "prev", node5);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull10() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", -96_172_192_613_631_172L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 300_067_153_813_432_356L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 300_067_153_813_432_418L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet3, "random", random1);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 2_979_649_801_946_112L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull9() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", -96_172_192_613_631_172L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 300_067_153_813_432_361L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", -2_030_749_967_338_129_061L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet3, "random", random1);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 2_979_649_801_946_112L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull8() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 1_818_956_833_656_909_580L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", -2_030_749_967_338_129_060L);
    Reflector.setField(node3, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "prev", node4);
    Reflector.setField(node, "next", node3);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node5, "this$0", sampleSet3);
    Reflector.setField(node5, "count", 0L);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "next", node6);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node5, "prev", node7);
    Reflector.setField(node, "prev", node5);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", -423_320_196_617_659_999L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random3 = PowerMockito.mock(Random.class);
    PowerMockito.when(random3.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random3);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull7() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 1_818_956_833_656_909_580L);
    Reflector.setField(node, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", -423_320_196_617_659_998L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull6() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "prev", node4);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "next", node6);
    Reflector.setField(node5, "prev", null);
    hashMap1.put(null, node5);
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull5() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet, "tail", node3);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    Reflector.setField(node4, "prev", null);
    hashMap1.put(null, node4);
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull4() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull3() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 9_223_372_036_854_775_296L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 9_223_371_487_098_961_919L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random1);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull00040b636c65aad3713()
      throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull14() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "prev", node4);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 792_812_293_913_584_575L);
    Reflector.setField(node5, "next", null);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "prev", node6);
    Reflector.setField(sampleSet, "tail", node5);
    Reflector.setField(sampleSet, "size", 65_539);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void removeRandomOutputNull13() throws Exception, InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 1L);
    Reflector.setField(node, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "prev", node4);
    Reflector.setField(node, "prev", node3);
    Reflector.setField(sampleSet, "head", node);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 8999L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(sampleSet, "tail", node5);
    Reflector.setField(sampleSet, "size", 65_539);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeRandom());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputZero2() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0, sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputNull0029d3860a39421ca38() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputNull0010bfe2e094a24af49() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputNull6() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputZero() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0, sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputNull0008203a1606b6c9d89() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputNull002b5c6f99c474de137() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap2);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputNull001869662fec184c364() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap3);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputNull000b1a251c9daffa13f() {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeMinOutputNull5() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet1, "head", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "tail", node2);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node3, "prev", node5);
    Reflector.setField(node, "next", node3);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node, "prev", node6);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.removeMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeOutputZero() {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0, sampleSet.size());
  }

  // Test written by Diffblue Cover.
  @Test
  public void countOutputZero() {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertEquals(0L, sampleSet.count());
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekMinOutputNull() throws InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);

    // Act and Assert result
    Assert.assertNull(sampleSet.peekMin());
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid21()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 4_016_067_293_916_064_327L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 4_016_067_293_916_064_327L);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node6, "this$0", sampleSet2);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "next", node6);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", null);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet3, "random", random);
    Reflector.setField(node7, "this$0", sampleSet3);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node5, "prev", node7);
    Reflector.setField(node4, "prev", node5);
    Reflector.setField(node, "prev", node4);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid19()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid18()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet2, "random", random);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node2, "prev", node4);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "prev", node1);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid17()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node4, "next", null);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    Reflector.setField(sampleSet3, "random", null);
    Reflector.setField(node6, "this$0", sampleSet3);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "next", node6);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet4 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet4, "head", null);
    Reflector.setField(sampleSet4, "tail", null);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    Reflector.setField(sampleSet4, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet4, "random", random);
    Reflector.setField(node7, "this$0", sampleSet4);
    Reflector.setField(node7, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node5, "prev", node7);
    Reflector.setField(node4, "prev", node5);
    Reflector.setField(node, "prev", node4);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid16()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node, "prev", node4);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid15()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet, "random", random);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet1, "random", random1);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 1L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random2 = new Random();
    Reflector.setField(sampleSet2, "random", random2);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "prev", node1);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid14()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet, "random", random);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet1, "random", random1);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", 1L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random2 = new Random();
    Reflector.setField(sampleSet2, "random", random2);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node3, "next", node4);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node, "prev", node2);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid13()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet, "random", random);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node, "prev", node2);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid12()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet, "random", random);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid11()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 16L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_791L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_223_372_036_854_775_791L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 32L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "prev", node1);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid10()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "prev", node1);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid9()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "next", node2);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet3, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet3);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node1, "prev", node4);
    Reflector.setField(node, "next", node1);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node5, "next", null);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node6, "next", null);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", null);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "prev", node7);
    Reflector.setField(node5, "prev", node6);
    Reflector.setField(node, "prev", node5);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid8()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node3, "this$0", sampleSet2);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "next", node2);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet3, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet3);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node1, "prev", node4);
    Reflector.setField(node, "next", node1);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node, "prev", node5);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid0004a0b2be03d3e66de()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid6()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(sampleSet2, "head", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(sampleSet2, "tail", node6);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node4, "next", null);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node7, "this$0", sampleSet3);
    Reflector.setField(node7, "count", 0L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    Reflector.setField(sampleSet4, "head", null);
    Reflector.setField(sampleSet4, "tail", null);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap3);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node8, "this$0", sampleSet4);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    final SampleSet sampleSet5 = new SampleSet();
    Reflector.setField(sampleSet5, "head", null);
    Reflector.setField(sampleSet5, "tail", null);
    Reflector.setField(sampleSet5, "size", 0);
    Reflector.setField(sampleSet5, "count", 0L);
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(sampleSet5, "sampleMap", hashMap4);
    final Random random4 = new Random();
    Reflector.setField(sampleSet5, "random", random4);
    Reflector.setField(node9, "this$0", sampleSet5);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node7, "prev", node9);
    Reflector.setField(node4, "prev", node7);
    Reflector.setField(node, "prev", node4);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid5()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "next", node4);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node7, "this$0", sampleSet3);
    Reflector.setField(node7, "count", 0L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node7, "prev", node9);
    Reflector.setField(node1, "prev", node7);
    Reflector.setField(sampleSet, "head", node1);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    final Object node11 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node11, "element", 0);
    Reflector.setField(node11, "this$0", null);
    Reflector.setField(node11, "count", 0L);
    Reflector.setField(node11, "next", null);
    Reflector.setField(node11, "prev", null);
    Reflector.setField(sampleSet4, "head", node11);
    final Object node12 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node12, "element", 0);
    Reflector.setField(node12, "this$0", null);
    Reflector.setField(node12, "count", 0L);
    Reflector.setField(node12, "next", null);
    Reflector.setField(node12, "prev", null);
    Reflector.setField(sampleSet4, "tail", node12);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap3);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node10, "this$0", sampleSet4);
    Reflector.setField(node10, "count", 0L);
    Reflector.setField(node10, "next", null);
    Reflector.setField(node10, "prev", null);
    Reflector.setField(node, "next", node10);
    final Object node13 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node13, "element", 0);
    final SampleSet sampleSet5 = new SampleSet();
    final Object node14 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node14, "element", 0);
    Reflector.setField(node14, "this$0", null);
    Reflector.setField(node14, "count", 0L);
    Reflector.setField(node14, "next", null);
    Reflector.setField(node14, "prev", null);
    Reflector.setField(sampleSet5, "head", node14);
    final Object node15 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node15, "element", 0);
    Reflector.setField(node15, "this$0", null);
    Reflector.setField(node15, "count", 0L);
    Reflector.setField(node15, "next", null);
    Reflector.setField(node15, "prev", null);
    Reflector.setField(sampleSet5, "tail", node15);
    Reflector.setField(sampleSet5, "size", 0);
    Reflector.setField(sampleSet5, "count", 0L);
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(sampleSet5, "sampleMap", hashMap4);
    final Random random4 = new Random();
    Reflector.setField(sampleSet5, "random", random4);
    Reflector.setField(node13, "this$0", sampleSet5);
    Reflector.setField(node13, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node13, "next", null);
    Reflector.setField(node13, "prev", null);
    Reflector.setField(node, "prev", node13);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid4()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "next", node4);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node7, "this$0", sampleSet3);
    Reflector.setField(node7, "count", 0L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node7, "prev", node9);
    Reflector.setField(node1, "prev", node7);
    Reflector.setField(sampleSet, "head", node1);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    final Object node11 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node11, "element", 0);
    Reflector.setField(node11, "this$0", null);
    Reflector.setField(node11, "count", 0L);
    Reflector.setField(node11, "next", null);
    Reflector.setField(node11, "prev", null);
    Reflector.setField(sampleSet4, "head", node11);
    final Object node12 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node12, "element", 0);
    Reflector.setField(node12, "this$0", null);
    Reflector.setField(node12, "count", 0L);
    Reflector.setField(node12, "next", null);
    Reflector.setField(node12, "prev", null);
    Reflector.setField(sampleSet4, "tail", node12);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap3);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node10, "this$0", sampleSet4);
    Reflector.setField(node10, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node10, "next", null);
    Reflector.setField(node10, "prev", null);
    Reflector.setField(node, "prev", node10);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid3()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", -9_223_372_036_854_775_808L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node5, "this$0", sampleSet3);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node1, "prev", node4);
    Reflector.setField(node, "prev", node1);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid2()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid00028390ed7755c2483()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid20()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 4_016_067_293_916_064_327L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 4_016_067_293_916_064_327L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet2, "random", random);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node2, "prev", node4);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "prev", node1);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void promoteInputNotNullOutputVoid22()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 4_016_067_293_916_064_327L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "next", node1);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node, "prev", node4);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "promote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid11()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -9_223_372_036_854_775_807L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 35_184_372_088_832L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 4L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 2L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node4, "this$0", sampleSet1);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node2, "prev", node4);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid22()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -9_223_372_036_854_775_808L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 1L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_223_372_036_854_775_808L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid21()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid20()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 1L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid19()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 1L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 1L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid18()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 1L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 1L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", null);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", null);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node5, "next", node6);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "prev", node5);
    Reflector.setField(node, "prev", node4);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid17()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(node, "prev", node1);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid16()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "prev", node4);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet, "random", random);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 4_611_686_019_501_129_728L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", null);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 6_917_529_027_641_081_856L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", null);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 4_647_714_816_520_093_696L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node, "next", node7);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", null);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    Reflector.setField(node10, "this$0", null);
    Reflector.setField(node10, "count", 0L);
    Reflector.setField(node10, "next", null);
    Reflector.setField(node10, "prev", null);
    Reflector.setField(sampleSet3, "tail", node10);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet3, "random", random1);
    Reflector.setField(node9, "this$0", sampleSet3);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node, "prev", node9);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid15()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "prev", node4);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet, "random", random);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 4_611_686_018_427_387_904L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", null);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 6_917_529_027_641_081_856L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", null);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", null);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 6_917_529_027_641_081_856L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node8, "next", node9);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node, "next", node7);
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", null);
    final SampleSet sampleSet3 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet3, "head", null);
    final Object node11 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node11, "element", 0);
    Reflector.setField(node11, "this$0", null);
    Reflector.setField(node11, "count", 0L);
    Reflector.setField(node11, "next", null);
    Reflector.setField(node11, "prev", null);
    Reflector.setField(sampleSet3, "tail", node11);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    Reflector.setField(sampleSet3, "sampleMap", null);
    final Random random1 = new Random();
    Reflector.setField(sampleSet3, "random", random1);
    Reflector.setField(node10, "this$0", sampleSet3);
    Reflector.setField(node10, "count", 0L);
    Reflector.setField(node10, "next", null);
    Reflector.setField(node10, "prev", null);
    Reflector.setField(node, "prev", node10);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid14()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "prev", node4);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet, "random", random);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", null);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 1L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", null);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", null);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 1L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node8, "next", node9);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node, "next", node7);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid13()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "prev", node4);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet, "random", random);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", null);
    Reflector.setField(node7, "this$0", null);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node, "next", node7);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid12()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet, "random", random);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid24()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -9_223_372_036_854_775_808L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 1L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node, "next", node2);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid10()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 35_184_372_088_832L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 4L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", -9_223_372_036_854_775_806L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node4, "this$0", sampleSet1);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node2, "prev", node4);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid9()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 35_184_372_088_832L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 2L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node4, "this$0", sampleSet1);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    Reflector.setField(node2, "prev", node4);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid8()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid000fb4c8c74d7dc8fa5()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid6()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "next", node4);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node7, "this$0", sampleSet3);
    Reflector.setField(node7, "count", 0L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node7, "prev", node9);
    Reflector.setField(node1, "prev", node7);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    final Object node11 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node11, "element", 0);
    Reflector.setField(node11, "this$0", null);
    Reflector.setField(node11, "count", 0L);
    Reflector.setField(node11, "next", null);
    Reflector.setField(node11, "prev", null);
    Reflector.setField(sampleSet4, "head", node11);
    final Object node12 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node12, "element", 0);
    Reflector.setField(node12, "this$0", null);
    Reflector.setField(node12, "count", 0L);
    Reflector.setField(node12, "next", null);
    Reflector.setField(node12, "prev", null);
    Reflector.setField(sampleSet4, "tail", node12);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap3);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node10, "this$0", sampleSet4);
    Reflector.setField(node10, "count", 1L);
    final Object node13 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node13, "element", 0);
    final SampleSet sampleSet5 = new SampleSet();
    Reflector.setField(sampleSet5, "head", null);
    Reflector.setField(sampleSet5, "tail", null);
    Reflector.setField(sampleSet5, "size", 0);
    Reflector.setField(sampleSet5, "count", 0L);
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(sampleSet5, "sampleMap", hashMap4);
    final Random random4 = new Random();
    Reflector.setField(sampleSet5, "random", random4);
    Reflector.setField(node13, "this$0", sampleSet5);
    Reflector.setField(node13, "count", 0L);
    final Object node14 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node14, "element", 0);
    final SampleSet sampleSet6 = new SampleSet();
    Reflector.setField(sampleSet6, "head", null);
    Reflector.setField(sampleSet6, "tail", null);
    Reflector.setField(sampleSet6, "size", 0);
    Reflector.setField(sampleSet6, "count", 0L);
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(sampleSet6, "sampleMap", hashMap5);
    final Random random5 = new Random();
    Reflector.setField(sampleSet6, "random", random5);
    Reflector.setField(node14, "this$0", sampleSet6);
    Reflector.setField(node14, "count", 0L);
    Reflector.setField(node14, "next", null);
    Reflector.setField(node14, "prev", null);
    Reflector.setField(node13, "next", node14);
    final Object node15 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node15, "element", 0);
    final SampleSet sampleSet7 = new SampleSet();
    Reflector.setField(sampleSet7, "head", null);
    Reflector.setField(sampleSet7, "tail", null);
    Reflector.setField(sampleSet7, "size", 0);
    Reflector.setField(sampleSet7, "count", 0L);
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(sampleSet7, "sampleMap", hashMap6);
    final Random random6 = new Random();
    Reflector.setField(sampleSet7, "random", random6);
    Reflector.setField(node15, "this$0", sampleSet7);
    Reflector.setField(node15, "count", 0L);
    Reflector.setField(node15, "next", null);
    Reflector.setField(node15, "prev", null);
    Reflector.setField(node13, "prev", node15);
    Reflector.setField(node10, "next", node13);
    final Object node16 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node16, "element", 0);
    final SampleSet sampleSet8 = new SampleSet();
    Reflector.setField(sampleSet8, "head", null);
    Reflector.setField(sampleSet8, "tail", null);
    Reflector.setField(sampleSet8, "size", 0);
    Reflector.setField(sampleSet8, "count", 0L);
    final HashMap hashMap7 = new HashMap();
    hashMap7.put(0, null);
    Reflector.setField(sampleSet8, "sampleMap", hashMap7);
    final Random random7 = new Random();
    Reflector.setField(sampleSet8, "random", random7);
    Reflector.setField(node16, "this$0", sampleSet8);
    Reflector.setField(node16, "count", 0L);
    final Object node17 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node17, "element", 0);
    final SampleSet sampleSet9 = new SampleSet();
    Reflector.setField(sampleSet9, "head", null);
    Reflector.setField(sampleSet9, "tail", null);
    Reflector.setField(sampleSet9, "size", 0);
    Reflector.setField(sampleSet9, "count", 0L);
    final HashMap hashMap8 = new HashMap();
    hashMap8.put(0, null);
    Reflector.setField(sampleSet9, "sampleMap", hashMap8);
    final Random random8 = new Random();
    Reflector.setField(sampleSet9, "random", random8);
    Reflector.setField(node17, "this$0", sampleSet9);
    Reflector.setField(node17, "count", 0L);
    Reflector.setField(node17, "next", null);
    Reflector.setField(node17, "prev", null);
    Reflector.setField(node16, "next", node17);
    final Object node18 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node18, "element", 0);
    final SampleSet sampleSet10 = new SampleSet();
    Reflector.setField(sampleSet10, "head", null);
    Reflector.setField(sampleSet10, "tail", null);
    Reflector.setField(sampleSet10, "size", 0);
    Reflector.setField(sampleSet10, "count", 0L);
    final HashMap hashMap9 = new HashMap();
    hashMap9.put(0, null);
    Reflector.setField(sampleSet10, "sampleMap", hashMap9);
    final Random random9 = new Random();
    Reflector.setField(sampleSet10, "random", random9);
    Reflector.setField(node18, "this$0", sampleSet10);
    Reflector.setField(node18, "count", 0L);
    Reflector.setField(node18, "next", null);
    Reflector.setField(node18, "prev", null);
    Reflector.setField(node16, "prev", node18);
    Reflector.setField(node10, "prev", node16);
    Reflector.setField(node, "next", node10);
    final Object node19 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node19, "element", 0);
    final SampleSet sampleSet11 = new SampleSet();
    final Object node20 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node20, "element", 0);
    Reflector.setField(node20, "this$0", null);
    Reflector.setField(node20, "count", 0L);
    Reflector.setField(node20, "next", null);
    Reflector.setField(node20, "prev", null);
    Reflector.setField(sampleSet11, "head", node20);
    final Object node21 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node21, "element", 0);
    Reflector.setField(node21, "this$0", null);
    Reflector.setField(node21, "count", 0L);
    Reflector.setField(node21, "next", null);
    Reflector.setField(node21, "prev", null);
    Reflector.setField(sampleSet11, "tail", node21);
    Reflector.setField(sampleSet11, "size", 0);
    Reflector.setField(sampleSet11, "count", 0L);
    final HashMap hashMap10 = new HashMap();
    hashMap10.put(0, null);
    Reflector.setField(sampleSet11, "sampleMap", hashMap10);
    final Random random10 = new Random();
    Reflector.setField(sampleSet11, "random", random10);
    Reflector.setField(node19, "this$0", sampleSet11);
    Reflector.setField(node19, "count", 0L);
    final Object node22 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node22, "element", 0);
    final SampleSet sampleSet12 = new SampleSet();
    Reflector.setField(sampleSet12, "head", null);
    Reflector.setField(sampleSet12, "tail", null);
    Reflector.setField(sampleSet12, "size", 0);
    Reflector.setField(sampleSet12, "count", 0L);
    final HashMap hashMap11 = new HashMap();
    hashMap11.put(0, null);
    Reflector.setField(sampleSet12, "sampleMap", hashMap11);
    final Random random11 = new Random();
    Reflector.setField(sampleSet12, "random", random11);
    Reflector.setField(node22, "this$0", sampleSet12);
    Reflector.setField(node22, "count", 0L);
    final Object node23 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node23, "element", 0);
    final SampleSet sampleSet13 = new SampleSet();
    Reflector.setField(sampleSet13, "head", null);
    Reflector.setField(sampleSet13, "tail", null);
    Reflector.setField(sampleSet13, "size", 0);
    Reflector.setField(sampleSet13, "count", 0L);
    final HashMap hashMap12 = new HashMap();
    hashMap12.put(0, null);
    Reflector.setField(sampleSet13, "sampleMap", hashMap12);
    final Random random12 = new Random();
    Reflector.setField(sampleSet13, "random", random12);
    Reflector.setField(node23, "this$0", sampleSet13);
    Reflector.setField(node23, "count", 0L);
    Reflector.setField(node23, "next", null);
    Reflector.setField(node23, "prev", null);
    Reflector.setField(node22, "next", node23);
    final Object node24 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node24, "element", 0);
    final SampleSet sampleSet14 = new SampleSet();
    Reflector.setField(sampleSet14, "head", null);
    Reflector.setField(sampleSet14, "tail", null);
    Reflector.setField(sampleSet14, "size", 0);
    Reflector.setField(sampleSet14, "count", 0L);
    final HashMap hashMap13 = new HashMap();
    hashMap13.put(0, null);
    Reflector.setField(sampleSet14, "sampleMap", hashMap13);
    final Random random13 = new Random();
    Reflector.setField(sampleSet14, "random", random13);
    Reflector.setField(node24, "this$0", sampleSet14);
    Reflector.setField(node24, "count", 0L);
    Reflector.setField(node24, "next", null);
    Reflector.setField(node24, "prev", null);
    Reflector.setField(node22, "prev", node24);
    Reflector.setField(node19, "next", node22);
    final Object node25 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node25, "element", 0);
    final SampleSet sampleSet15 = new SampleSet();
    Reflector.setField(sampleSet15, "head", null);
    Reflector.setField(sampleSet15, "tail", null);
    Reflector.setField(sampleSet15, "size", 0);
    Reflector.setField(sampleSet15, "count", 0L);
    final HashMap hashMap14 = new HashMap();
    hashMap14.put(0, null);
    Reflector.setField(sampleSet15, "sampleMap", hashMap14);
    final Random random14 = new Random();
    Reflector.setField(sampleSet15, "random", random14);
    Reflector.setField(node25, "this$0", sampleSet15);
    Reflector.setField(node25, "count", 0L);
    final Object node26 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node26, "element", 0);
    final SampleSet sampleSet16 = new SampleSet();
    Reflector.setField(sampleSet16, "head", null);
    Reflector.setField(sampleSet16, "tail", null);
    Reflector.setField(sampleSet16, "size", 0);
    Reflector.setField(sampleSet16, "count", 0L);
    final HashMap hashMap15 = new HashMap();
    hashMap15.put(0, null);
    Reflector.setField(sampleSet16, "sampleMap", hashMap15);
    final Random random15 = new Random();
    Reflector.setField(sampleSet16, "random", random15);
    Reflector.setField(node26, "this$0", sampleSet16);
    Reflector.setField(node26, "count", 0L);
    Reflector.setField(node26, "next", null);
    Reflector.setField(node26, "prev", null);
    Reflector.setField(node25, "next", node26);
    final Object node27 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node27, "element", 0);
    final SampleSet sampleSet17 = new SampleSet();
    Reflector.setField(sampleSet17, "head", null);
    Reflector.setField(sampleSet17, "tail", null);
    Reflector.setField(sampleSet17, "size", 0);
    Reflector.setField(sampleSet17, "count", 0L);
    final HashMap hashMap16 = new HashMap();
    hashMap16.put(0, null);
    Reflector.setField(sampleSet17, "sampleMap", hashMap16);
    final Random random16 = new Random();
    Reflector.setField(sampleSet17, "random", random16);
    Reflector.setField(node27, "this$0", sampleSet17);
    Reflector.setField(node27, "count", 0L);
    Reflector.setField(node27, "next", null);
    Reflector.setField(node27, "prev", null);
    Reflector.setField(node25, "prev", node27);
    Reflector.setField(node19, "prev", node25);
    Reflector.setField(node, "prev", node19);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid5()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "next", node4);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node7, "this$0", sampleSet3);
    Reflector.setField(node7, "count", 0L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node7, "prev", node9);
    Reflector.setField(node1, "prev", node7);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    final Object node11 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node11, "element", 0);
    Reflector.setField(node11, "this$0", null);
    Reflector.setField(node11, "count", 0L);
    Reflector.setField(node11, "next", null);
    Reflector.setField(node11, "prev", null);
    Reflector.setField(sampleSet4, "head", node11);
    final Object node12 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node12, "element", 0);
    Reflector.setField(node12, "this$0", null);
    Reflector.setField(node12, "count", 0L);
    Reflector.setField(node12, "next", null);
    Reflector.setField(node12, "prev", null);
    Reflector.setField(sampleSet4, "tail", node12);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap3);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node10, "this$0", sampleSet4);
    Reflector.setField(node10, "count", 1L);
    Reflector.setField(node10, "next", null);
    final Object node13 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node13, "element", 0);
    final SampleSet sampleSet5 = new SampleSet();
    Reflector.setField(sampleSet5, "head", null);
    Reflector.setField(sampleSet5, "tail", null);
    Reflector.setField(sampleSet5, "size", 0);
    Reflector.setField(sampleSet5, "count", 0L);
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(sampleSet5, "sampleMap", hashMap4);
    final Random random4 = new Random();
    Reflector.setField(sampleSet5, "random", random4);
    Reflector.setField(node13, "this$0", sampleSet5);
    Reflector.setField(node13, "count", 0L);
    final Object node14 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node14, "element", 0);
    final SampleSet sampleSet6 = new SampleSet();
    Reflector.setField(sampleSet6, "head", null);
    Reflector.setField(sampleSet6, "tail", null);
    Reflector.setField(sampleSet6, "size", 0);
    Reflector.setField(sampleSet6, "count", 0L);
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(sampleSet6, "sampleMap", hashMap5);
    final Random random5 = new Random();
    Reflector.setField(sampleSet6, "random", random5);
    Reflector.setField(node14, "this$0", sampleSet6);
    Reflector.setField(node14, "count", 0L);
    Reflector.setField(node14, "next", null);
    Reflector.setField(node14, "prev", null);
    Reflector.setField(node13, "next", node14);
    final Object node15 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node15, "element", 0);
    final SampleSet sampleSet7 = new SampleSet();
    Reflector.setField(sampleSet7, "head", null);
    Reflector.setField(sampleSet7, "tail", null);
    Reflector.setField(sampleSet7, "size", 0);
    Reflector.setField(sampleSet7, "count", 0L);
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(sampleSet7, "sampleMap", hashMap6);
    final Random random6 = new Random();
    Reflector.setField(sampleSet7, "random", random6);
    Reflector.setField(node15, "this$0", sampleSet7);
    Reflector.setField(node15, "count", 0L);
    Reflector.setField(node15, "next", null);
    Reflector.setField(node15, "prev", null);
    Reflector.setField(node13, "prev", node15);
    Reflector.setField(node10, "prev", node13);
    Reflector.setField(node, "next", node10);
    final Object node16 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node16, "element", 0);
    final SampleSet sampleSet8 = new SampleSet();
    final Object node17 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node17, "element", 0);
    Reflector.setField(node17, "this$0", null);
    Reflector.setField(node17, "count", 0L);
    Reflector.setField(node17, "next", null);
    Reflector.setField(node17, "prev", null);
    Reflector.setField(sampleSet8, "head", node17);
    final Object node18 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node18, "element", 0);
    Reflector.setField(node18, "this$0", null);
    Reflector.setField(node18, "count", 0L);
    Reflector.setField(node18, "next", null);
    Reflector.setField(node18, "prev", null);
    Reflector.setField(sampleSet8, "tail", node18);
    Reflector.setField(sampleSet8, "size", 0);
    Reflector.setField(sampleSet8, "count", 0L);
    final HashMap hashMap7 = new HashMap();
    hashMap7.put(0, null);
    Reflector.setField(sampleSet8, "sampleMap", hashMap7);
    final Random random7 = new Random();
    Reflector.setField(sampleSet8, "random", random7);
    Reflector.setField(node16, "this$0", sampleSet8);
    Reflector.setField(node16, "count", 0L);
    final Object node19 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node19, "element", 0);
    final SampleSet sampleSet9 = new SampleSet();
    Reflector.setField(sampleSet9, "head", null);
    Reflector.setField(sampleSet9, "tail", null);
    Reflector.setField(sampleSet9, "size", 0);
    Reflector.setField(sampleSet9, "count", 0L);
    final HashMap hashMap8 = new HashMap();
    hashMap8.put(0, null);
    Reflector.setField(sampleSet9, "sampleMap", hashMap8);
    final Random random8 = new Random();
    Reflector.setField(sampleSet9, "random", random8);
    Reflector.setField(node19, "this$0", sampleSet9);
    Reflector.setField(node19, "count", 0L);
    final Object node20 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node20, "element", 0);
    final SampleSet sampleSet10 = new SampleSet();
    Reflector.setField(sampleSet10, "head", null);
    Reflector.setField(sampleSet10, "tail", null);
    Reflector.setField(sampleSet10, "size", 0);
    Reflector.setField(sampleSet10, "count", 0L);
    final HashMap hashMap9 = new HashMap();
    hashMap9.put(0, null);
    Reflector.setField(sampleSet10, "sampleMap", hashMap9);
    final Random random9 = new Random();
    Reflector.setField(sampleSet10, "random", random9);
    Reflector.setField(node20, "this$0", sampleSet10);
    Reflector.setField(node20, "count", 0L);
    Reflector.setField(node20, "next", null);
    Reflector.setField(node20, "prev", null);
    Reflector.setField(node19, "next", node20);
    final Object node21 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node21, "element", 0);
    final SampleSet sampleSet11 = new SampleSet();
    Reflector.setField(sampleSet11, "head", null);
    Reflector.setField(sampleSet11, "tail", null);
    Reflector.setField(sampleSet11, "size", 0);
    Reflector.setField(sampleSet11, "count", 0L);
    final HashMap hashMap10 = new HashMap();
    hashMap10.put(0, null);
    Reflector.setField(sampleSet11, "sampleMap", hashMap10);
    final Random random10 = new Random();
    Reflector.setField(sampleSet11, "random", random10);
    Reflector.setField(node21, "this$0", sampleSet11);
    Reflector.setField(node21, "count", 0L);
    Reflector.setField(node21, "next", null);
    Reflector.setField(node21, "prev", null);
    Reflector.setField(node19, "prev", node21);
    Reflector.setField(node16, "next", node19);
    final Object node22 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node22, "element", 0);
    final SampleSet sampleSet12 = new SampleSet();
    Reflector.setField(sampleSet12, "head", null);
    Reflector.setField(sampleSet12, "tail", null);
    Reflector.setField(sampleSet12, "size", 0);
    Reflector.setField(sampleSet12, "count", 0L);
    final HashMap hashMap11 = new HashMap();
    hashMap11.put(0, null);
    Reflector.setField(sampleSet12, "sampleMap", hashMap11);
    final Random random11 = new Random();
    Reflector.setField(sampleSet12, "random", random11);
    Reflector.setField(node22, "this$0", sampleSet12);
    Reflector.setField(node22, "count", 0L);
    final Object node23 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node23, "element", 0);
    final SampleSet sampleSet13 = new SampleSet();
    Reflector.setField(sampleSet13, "head", null);
    Reflector.setField(sampleSet13, "tail", null);
    Reflector.setField(sampleSet13, "size", 0);
    Reflector.setField(sampleSet13, "count", 0L);
    final HashMap hashMap12 = new HashMap();
    hashMap12.put(0, null);
    Reflector.setField(sampleSet13, "sampleMap", hashMap12);
    final Random random12 = new Random();
    Reflector.setField(sampleSet13, "random", random12);
    Reflector.setField(node23, "this$0", sampleSet13);
    Reflector.setField(node23, "count", 0L);
    Reflector.setField(node23, "next", null);
    Reflector.setField(node23, "prev", null);
    Reflector.setField(node22, "next", node23);
    final Object node24 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node24, "element", 0);
    final SampleSet sampleSet14 = new SampleSet();
    Reflector.setField(sampleSet14, "head", null);
    Reflector.setField(sampleSet14, "tail", null);
    Reflector.setField(sampleSet14, "size", 0);
    Reflector.setField(sampleSet14, "count", 0L);
    final HashMap hashMap13 = new HashMap();
    hashMap13.put(0, null);
    Reflector.setField(sampleSet14, "sampleMap", hashMap13);
    final Random random13 = new Random();
    Reflector.setField(sampleSet14, "random", random13);
    Reflector.setField(node24, "this$0", sampleSet14);
    Reflector.setField(node24, "count", 0L);
    Reflector.setField(node24, "next", null);
    Reflector.setField(node24, "prev", null);
    Reflector.setField(node22, "prev", node24);
    Reflector.setField(node16, "prev", node22);
    Reflector.setField(node, "prev", node16);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid4()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    Reflector.setField(node5, "this$0", null);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    Reflector.setField(node6, "this$0", null);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "next", node4);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node7, "this$0", sampleSet3);
    Reflector.setField(node7, "count", 0L);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    Reflector.setField(node8, "this$0", null);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node7, "next", node8);
    final Object node9 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node9, "element", 0);
    Reflector.setField(node9, "this$0", null);
    Reflector.setField(node9, "count", 0L);
    Reflector.setField(node9, "next", null);
    Reflector.setField(node9, "prev", null);
    Reflector.setField(node7, "prev", node9);
    Reflector.setField(node1, "prev", node7);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node10 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node10, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    final Object node11 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node11, "element", 0);
    Reflector.setField(node11, "this$0", null);
    Reflector.setField(node11, "count", 0L);
    Reflector.setField(node11, "next", null);
    Reflector.setField(node11, "prev", null);
    Reflector.setField(sampleSet4, "head", node11);
    final Object node12 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node12, "element", 0);
    Reflector.setField(node12, "this$0", null);
    Reflector.setField(node12, "count", 0L);
    Reflector.setField(node12, "next", null);
    Reflector.setField(node12, "prev", null);
    Reflector.setField(sampleSet4, "tail", node12);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap3);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node10, "this$0", sampleSet4);
    Reflector.setField(node10, "count", 1L);
    Reflector.setField(node10, "next", null);
    final Object node13 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node13, "element", 0);
    final SampleSet sampleSet5 = new SampleSet();
    Reflector.setField(sampleSet5, "head", null);
    Reflector.setField(sampleSet5, "tail", null);
    Reflector.setField(sampleSet5, "size", 0);
    Reflector.setField(sampleSet5, "count", 0L);
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(sampleSet5, "sampleMap", hashMap4);
    final Random random4 = new Random();
    Reflector.setField(sampleSet5, "random", random4);
    Reflector.setField(node13, "this$0", sampleSet5);
    Reflector.setField(node13, "count", 0L);
    final Object node14 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node14, "element", 0);
    final SampleSet sampleSet6 = new SampleSet();
    Reflector.setField(sampleSet6, "head", null);
    Reflector.setField(sampleSet6, "tail", null);
    Reflector.setField(sampleSet6, "size", 0);
    Reflector.setField(sampleSet6, "count", 0L);
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(sampleSet6, "sampleMap", hashMap5);
    final Random random5 = new Random();
    Reflector.setField(sampleSet6, "random", random5);
    Reflector.setField(node14, "this$0", sampleSet6);
    Reflector.setField(node14, "count", 0L);
    Reflector.setField(node14, "next", null);
    Reflector.setField(node14, "prev", null);
    Reflector.setField(node13, "next", node14);
    final Object node15 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node15, "element", 0);
    final SampleSet sampleSet7 = new SampleSet();
    Reflector.setField(sampleSet7, "head", null);
    Reflector.setField(sampleSet7, "tail", null);
    Reflector.setField(sampleSet7, "size", 0);
    Reflector.setField(sampleSet7, "count", 0L);
    final HashMap hashMap6 = new HashMap();
    hashMap6.put(0, null);
    Reflector.setField(sampleSet7, "sampleMap", hashMap6);
    final Random random6 = new Random();
    Reflector.setField(sampleSet7, "random", random6);
    Reflector.setField(node15, "this$0", sampleSet7);
    Reflector.setField(node15, "count", 0L);
    Reflector.setField(node15, "next", null);
    Reflector.setField(node15, "prev", null);
    Reflector.setField(node13, "prev", node15);
    Reflector.setField(node10, "prev", node13);
    Reflector.setField(node, "next", node10);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid3()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 1L);
    Reflector.setField(node4, "next", null);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node5, "this$0", sampleSet3);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "prev", node5);
    Reflector.setField(node1, "next", node4);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    Reflector.setField(sampleSet4, "head", null);
    Reflector.setField(sampleSet4, "tail", null);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap3);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node6, "this$0", sampleSet4);
    Reflector.setField(node6, "count", 0L);
    final Object node7 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node7, "element", 0);
    final SampleSet sampleSet5 = new SampleSet();
    Reflector.setField(sampleSet5, "head", null);
    Reflector.setField(sampleSet5, "tail", null);
    Reflector.setField(sampleSet5, "size", 0);
    Reflector.setField(sampleSet5, "count", 0L);
    final HashMap hashMap4 = new HashMap();
    hashMap4.put(0, null);
    Reflector.setField(sampleSet5, "sampleMap", hashMap4);
    final Random random4 = new Random();
    Reflector.setField(sampleSet5, "random", random4);
    Reflector.setField(node7, "this$0", sampleSet5);
    Reflector.setField(node7, "count", 0L);
    Reflector.setField(node7, "next", null);
    Reflector.setField(node7, "prev", null);
    Reflector.setField(node6, "next", node7);
    final Object node8 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node8, "element", 0);
    final SampleSet sampleSet6 = new SampleSet();
    Reflector.setField(sampleSet6, "head", null);
    Reflector.setField(sampleSet6, "tail", null);
    Reflector.setField(sampleSet6, "size", 0);
    Reflector.setField(sampleSet6, "count", 0L);
    final HashMap hashMap5 = new HashMap();
    hashMap5.put(0, null);
    Reflector.setField(sampleSet6, "sampleMap", hashMap5);
    final Random random5 = new Random();
    Reflector.setField(sampleSet6, "random", random5);
    Reflector.setField(node8, "this$0", sampleSet6);
    Reflector.setField(node8, "count", 0L);
    Reflector.setField(node8, "next", null);
    Reflector.setField(node8, "prev", null);
    Reflector.setField(node6, "prev", node8);
    Reflector.setField(node1, "prev", node6);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid2()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet1 = new SampleSet();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet1, "head", node2);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(sampleSet1, "tail", node3);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random = new Random();
    Reflector.setField(sampleSet1, "random", random);
    Reflector.setField(node1, "this$0", sampleSet1);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", 0);
    final SampleSet sampleSet2 = new SampleSet();
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    final HashMap hashMap1 = new HashMap();
    hashMap1.put(0, null);
    Reflector.setField(sampleSet2, "sampleMap", hashMap1);
    final Random random1 = new Random();
    Reflector.setField(sampleSet2, "random", random1);
    Reflector.setField(node4, "this$0", sampleSet2);
    Reflector.setField(node4, "count", 0L);
    final Object node5 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node5, "element", 0);
    final SampleSet sampleSet3 = new SampleSet();
    Reflector.setField(sampleSet3, "head", null);
    Reflector.setField(sampleSet3, "tail", null);
    Reflector.setField(sampleSet3, "size", 0);
    Reflector.setField(sampleSet3, "count", 0L);
    final HashMap hashMap2 = new HashMap();
    hashMap2.put(0, null);
    Reflector.setField(sampleSet3, "sampleMap", hashMap2);
    final Random random2 = new Random();
    Reflector.setField(sampleSet3, "random", random2);
    Reflector.setField(node5, "this$0", sampleSet3);
    Reflector.setField(node5, "count", 0L);
    Reflector.setField(node5, "next", null);
    Reflector.setField(node5, "prev", null);
    Reflector.setField(node4, "next", node5);
    final Object node6 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node6, "element", 0);
    final SampleSet sampleSet4 = new SampleSet();
    Reflector.setField(sampleSet4, "head", null);
    Reflector.setField(sampleSet4, "tail", null);
    Reflector.setField(sampleSet4, "size", 0);
    Reflector.setField(sampleSet4, "count", 0L);
    final HashMap hashMap3 = new HashMap();
    hashMap3.put(0, null);
    Reflector.setField(sampleSet4, "sampleMap", hashMap3);
    final Random random3 = new Random();
    Reflector.setField(sampleSet4, "random", random3);
    Reflector.setField(node6, "this$0", sampleSet4);
    Reflector.setField(node6, "count", 0L);
    Reflector.setField(node6, "next", null);
    Reflector.setField(node6, "prev", null);
    Reflector.setField(node4, "prev", node6);
    Reflector.setField(node1, "prev", node4);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid0009e3e826d4cdf7fd6()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);
  }

  // Test written by Diffblue Cover.
  @Test
  public void demoteInputNotNullOutputVoid23()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -9_223_372_036_854_775_808L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 1L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -9_223_372_036_854_775_807L);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node3, "this$0", sampleSet1);
    Reflector.setField(node3, "count", -9_223_372_036_854_775_808L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "next", node3);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "next", node2);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    final Class<?> classUnderTest = Reflector.forName("com.clearspring.analytics.stream.SampleSet");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "demote", Reflector.forName("com.clearspring.analytics.stream.SampleSet$Node"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(sampleSet, node);

    // Assert side effects
    Assert.assertNotNull(node);
  }
}
