package com.clearspring.analytics.stream;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.clearspring.analytics.stream.ConcurrentStreamSummary;
import com.clearspring.analytics.stream.ScoredItem;
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

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

@RunWith(PowerMockRunner.class)
public class ConcurrentStreamSummaryTest {

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentStreamSummary.class, AbstractCollection.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  peekInputZeroOutputConcurrentModificationException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);

    // Act
    thrown.expect(ConcurrentModificationException.class);
    concurrentStreamSummary.peek(0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentStreamSummary.class, AbstractCollection.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  peekWithScoresInputZeroOutputConcurrentModificationException000ca70be5802b27e03()
      throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);

    // Act
    thrown.expect(ConcurrentModificationException.class);
    concurrentStreamSummary.peekWithScores(0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputZeroOutputConcurrentModificationException0001d0084456440bfdc()
      throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    thrown.expect(ConcurrentModificationException.class);
    concurrentStreamSummary.peekWithScores(k);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekInputPositiveOutput02() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 20;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    Reflector.setField(itr, "expectedModCount", 0);
    Reflector.setField(itr, "lastRet", -1);
    Reflector.setField(itr, "cursor", 0);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);

    // Act
    final List actual = concurrentStreamSummary.peek(k);

    // Assert result
    final ArrayList arrayList1 = new ArrayList();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekInputPositiveOutput03() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 8192;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    Reflector.setField(itr, "expectedModCount", 0);
    Reflector.setField(itr, "lastRet", -1);
    Reflector.setField(itr, "cursor", 0);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List actual = concurrentStreamSummary.peek(k);

    // Assert result
    final ArrayList arrayList1 = new ArrayList();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekInputPositiveOutput04() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 524_292;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    Reflector.setField(itr, "expectedModCount", 0);
    Reflector.setField(itr, "lastRet", -1);
    Reflector.setField(itr, "cursor", 0);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List actual = concurrentStreamSummary.peek(k);

    // Assert result
    final ArrayList arrayList1 = new ArrayList();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekInputPositiveOutput05() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 524_288;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    Reflector.setField(itr, "expectedModCount", 0);
    Reflector.setField(itr, "lastRet", -1);
    Reflector.setField(itr, "cursor", 0);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List actual = concurrentStreamSummary.peek(k);

    // Assert result
    final ArrayList arrayList1 = new ArrayList();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekInputPositiveOutputNoSuchElementException() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 4;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    thrown.expect(java.util.NoSuchElementException.class);
    concurrentStreamSummary.peek(k);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentStreamSummary.class, AbstractCollection.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  peekInputPositiveOutputNoSuchElementException2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);

    // Act
    thrown.expect(NoSuchElementException.class);
    concurrentStreamSummary.peek(1);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentStreamSummary.class, AbstractCollection.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  peekInputPositiveOutputNoSuchElementException3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference =
        (AtomicReference<ScoredItem>)Reflector.getInstance(
            "java.util.concurrent.atomic.AtomicReference");
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);

    // Act
    thrown.expect(NoSuchElementException.class);
    concurrentStreamSummary.peek(524_292);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekInputZeroOutput0() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    Reflector.setField(itr, "expectedModCount", 0);
    Reflector.setField(itr, "lastRet", -1);
    Reflector.setField(itr, "cursor", 0);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    final List actual = concurrentStreamSummary.peek(k);

    // Assert result
    final ArrayList arrayList1 = new ArrayList();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputZeroOutput06() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    final ArrayList<ScoredItem> arrayList1 = new ArrayList<ScoredItem>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekInputZeroOutput03() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    Reflector.setField(itr, "expectedModCount", 0);
    Reflector.setField(itr, "lastRet", -1);
    Reflector.setField(itr, "cursor", 0);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List actual = concurrentStreamSummary.peek(k);

    // Assert result
    final ArrayList arrayList1 = new ArrayList();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ConcurrentStreamSummary.class})
  @Test
  public void peekInputZeroOutputConcurrentModificationException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    thrown.expect(ConcurrentModificationException.class);
    concurrentStreamSummary.peek(k);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputPositiveOutput0002952a24c3af0a8519()
      throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 1;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    final ArrayList<ScoredItem> arrayList1 = new ArrayList<ScoredItem>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentStreamSummary.class, AbstractCollection.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  peekInputZeroOutputNoSuchElementException() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);

    // Act
    thrown.expect(NoSuchElementException.class);
    concurrentStreamSummary.peek(0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputZeroOutput05() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    final ArrayList<ScoredItem> arrayList1 = new ArrayList<ScoredItem>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_647;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_632;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentStreamSummary.class, AbstractCollection.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  peekWithScoresInputPositiveOutputConcurrentModificationException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);

    // Act
    thrown.expect(ConcurrentModificationException.class);
    concurrentStreamSummary.peekWithScores(3);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentStreamSummary.class, AbstractCollection.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  peekWithScoresInputPositiveOutputConcurrentModificationException()
      throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);

    // Act
    thrown.expect(ConcurrentModificationException.class);
    concurrentStreamSummary.peekWithScores(4);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputPositiveOutput03() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 2;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    final ArrayList<ScoredItem> arrayList1 = new ArrayList<ScoredItem>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull7() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_648;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull8() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_647;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull9() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_520;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull10() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_646;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputPositiveOutput02() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 128;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    final ArrayList<ScoredItem> arrayList1 = new ArrayList<ScoredItem>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(ConcurrentStreamSummary.class)
  @Test
  public void peekInputNegativeOutputIllegalArgumentException()
      throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_647;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    thrown.expect(IllegalArgumentException.class);
    concurrentStreamSummary.peek(k);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse18() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(2_075_916_565L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 2_075_916_565);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse19() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(9_223_372_036_783_208_725L)
        .when(atomicLong, incrementAndGetMethod)
        .withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(0)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -71_567_083);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-9_223_372_036_854_775_807L)
        .when(atomicLong4, addAndGetMethod)
        .withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse20() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean1, getMethod1).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -939_524_097);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse21() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -939_524_097);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse22() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-805_306_369L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -939_524_097);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse23() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-805_306_369L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1_207_959_551);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse24() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-805_306_369L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1_207_959_551);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse25() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-805_306_369L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -805_306_369);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(70_368_744_177_665L)
        .when(atomicLong1, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -1_006_632_961);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputTrue2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -1_056_964_609);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputTrue3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 176_866_616);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputTrue4() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-9_223_372_036_854_775_807L)
        .when(atomicLong, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong1);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputTrue5() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -805_306_369);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullPositiveOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -268_435_457);
    final Object element = null;
    final int incrementCount = 2_147_483_647;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullPositiveOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-1L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -268_435_457);
    final Object element = null;
    final int incrementCount = 2_147_483_647;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullPositiveOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(2_147_483_647L)
        .when(atomicLong1, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -268_435_457);
    final Object element = null;
    final int incrementCount = 2_147_483_647;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullPositiveOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(65_011_711L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 67_108_863);
    final Object element = null;
    final int incrementCount = 2_122_317_759;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullPositiveOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean1, getMethod1).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 67_108_863);
    final Object element = null;
    final int incrementCount = 2_122_317_759;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong4, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullPositiveOutputFalse6() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 67_108_863);
    final Object element = null;
    final int incrementCount = 2_122_317_759;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong4, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullPositiveOutputFalse7() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-67_108_864L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -67_108_864);
    final Object element = null;
    final int incrementCount = 2_122_317_759;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullPositiveOutputFalse8() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(9_223_372_036_787_666_944L)
        .when(atomicLong, incrementAndGetMethod)
        .withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true)
         .doReturn(true)
         .doReturn(true)
         .doReturn(true)
         .doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -67_108_864);
    final Object element = null;
    final int incrementCount = 2_122_317_759;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong4, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullPositiveOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(72_057_596_185_411_583L)
        .when(atomicLong1, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -268_435_457);
    final Object element = null;
    final int incrementCount = 2_147_483_647;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-939_524_097L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -939_524_097);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -503_316_481);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong1);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 67_108_863);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(0L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse6() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-4_194_303L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean1, getMethod1).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(0)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -4_194_304);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-9_223_372_036_854_775_808L)
        .when(atomicLong4, addAndGetMethod)
        .withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse7() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-4_194_304L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -4_194_304);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse8() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-4_194_302L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(865_817_030_752_976_963L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(0)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -4_194_304);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-9_223_372_036_854_775_808L)
        .when(atomicLong4, addAndGetMethod)
        .withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse9() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(865_817_030_752_976_963L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(0)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -4_194_304);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-9_223_372_036_854_775_808L)
        .when(atomicLong4, addAndGetMethod)
        .withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse10() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(715_653_120L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean1, getMethod1).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 715_128_833);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean1, getMethod1).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -268_435_457);
    final Object element = null;
    final int incrementCount = -1;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong4, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-9_223_372_036_854_775_808L)
        .when(atomicLong, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -503_316_481);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputTrue2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong1);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 67_108_863);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputTrue3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-9_223_372_036_854_775_808L)
        .when(atomicLong, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroOutputFalse00007014efed72e47d8() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroOutputFalse000c4104ea6bb8d7354() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroOutputTrue0015536d82aa0381dac() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-9_223_372_036_854_775_807L)
        .when(atomicLong1, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroOutputTrue2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroOutputTrue3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroOutputTrue4() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroOutputTrue5() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(4_611_686_018_427_387_905L)
        .when(atomicLong, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroZeroOutputFalse00046b5008d999c5394() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroZeroOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroZeroOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroZeroOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroZeroOutputTrue001c42894c3a784caf1() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroZeroOutputTrue2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(144_115_188_075_855_872L)
        .when(atomicLong1, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroZeroOutputTrue3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ConcurrentStreamSummary.class, ScoredItem.class,
                   AtomicLong.class, ConcurrentHashMap.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroZeroOutputTrue4() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-9_223_372_036_854_775_808L)
        .when(atomicLong1, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputZeroZeroOutputTrue5() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = 0;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullZeroOutputFalse11() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(715_653_120L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 715_128_833);
    final Object element = null;
    final int incrementCount = 0;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-294_440_140_801L)
        .when(atomicLong, incrementAndGetMethod)
        .withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1_644_167_167);
    final Object element = null;
    final int incrementCount = -15;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean1, getMethod1).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1_644_167_167);
    final Object element = null;
    final int incrementCount = -15;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong4, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1_644_167_167);
    final Object element = null;
    final int incrementCount = -15;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong4, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-234_881_025L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -503_316_481);
    final Object element = null;
    final int incrementCount = -15;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong4, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputFalse6() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(0L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final Object element = null;
    final int incrementCount = -15;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputFalse7() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 715_128_833);
    final Object element = null;
    final int incrementCount = -1;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputFalse8() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(715_653_119L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 715_653_119);
    final Object element = null;
    final int incrementCount = -1;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputFalse9() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-1L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 715_653_119);
    final Object element = null;
    final int incrementCount = -1;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullNegativeOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(-144_115_188_075_855_873L)
        .when(atomicLong1, addAndGetMethod)
        .withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 715_653_119);
    final Object element = null;
    final int incrementCount = -1;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-1_006_632_961L)
        .when(atomicLong, incrementAndGetMethod)
        .withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -1_006_632_961);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -201_326_593);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-738_197_505L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -1_006_632_961);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean1 =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong1, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -1_006_632_961);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean =
        (AtomicBoolean)Reflector.getInstance("java.util.concurrent.atomic.AtomicBoolean");
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -1_056_964_609);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNoSuchElementException()
      throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_648;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act
    thrown.expect(NoSuchElementException.class);
    concurrentStreamSummary.peekWithScores(k);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse6() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-872_415_233L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -872_415_233);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse7() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean1, getMethod1).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -872_415_233);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse8() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(276_152_975_359L)
        .when(atomicLong, incrementAndGetMethod)
        .withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean1, getMethod1).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1_275_068_415);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse9() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(276_152_975_359L)
        .when(atomicLong, incrementAndGetMethod)
        .withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1_275_068_415);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse10() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(276_152_975_359L)
        .when(atomicLong, incrementAndGetMethod)
        .withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1_275_068_415);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong3, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse11() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -939_524_097);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong2, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse12() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(-134_217_729L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong1);
    final AtomicLong atomicLong2 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong2);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", -402_653_185);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong4 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong4, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong4);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse13() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(176_866_616L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 176_866_616);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse14() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean1, getMethod1).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong2, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse15() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(true).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(atomicBoolean1, getMethod1)
        .withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean1);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method getMethod2 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong, getMethod2).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong);
    Reflector.setField(scoredItem, "error", null);
    final Method getAndSetMethod =
        DTUMemberMatcher.method(AtomicReference.class, "getAndSet", Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(atomicReference, getAndSetMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method removeMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "remove", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, removeMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1);
    final Object element = null;
    final AtomicBoolean atomicBoolean2 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean2);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong2, addAndGetMethod).withArguments(anyLong());
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse16() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", null);
    Reflector.setField(scoredItem, "newItem", null);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(1L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 =
        (AtomicLong)Reflector.getInstance("java.util.concurrent.atomic.AtomicLong");
    Reflector.setField(scoredItem, "error", atomicLong1);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(scoredItem)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong2)
        .thenReturn(atomicLong3);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicReference.class, ScoredItem.class, AtomicLong.class,
                   ConcurrentHashMap.class, ConcurrentStreamSummary.class, AtomicBoolean.class})
  @Test
  public void
  offerInputNullOutputFalse17() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method incrementAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "incrementAndGet");
    PowerMockito.doReturn(0L).when(atomicLong, incrementAndGetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    final Method valuesMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "values");
    PowerMockito.doReturn(arrayList).when(concurrentHashMap, valuesMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 1);
    final Object element = null;
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong2);

    // Act
    final boolean actual = concurrentStreamSummary.offer(element);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputZeroOutput03() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    final ArrayList<ScoredItem> arrayList1 = new ArrayList<ScoredItem>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull6() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_647;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull4() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_648;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputZeroOutput0() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    final ArrayList<ScoredItem> arrayList1 = new ArrayList<ScoredItem>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AbstractCollection.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputZeroOutput02() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    final ArrayList<ScoredItem> arrayList1 = new ArrayList<ScoredItem>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_648;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputZeroOutput04() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    final ArrayList<ScoredItem> arrayList1 = new ArrayList<ScoredItem>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekWithScoresInputNegativeOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = -2_147_483_648;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final List list = (List)Reflector.getInstance("java.util.List");
    PowerMockito.when(arrayList.subList(anyInt(), anyInt())).thenReturn(list);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    final List<ScoredItem> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekInputZeroOutput02() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    Reflector.setField(concurrentStreamSummary, "size", null);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", null);
    Reflector.setField(concurrentStreamSummary, "minVal", null);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 0;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    final List actual = concurrentStreamSummary.peek(k);

    // Assert result
    final ArrayList arrayList1 = new ArrayList();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Collections.class, ConcurrentHashMap.class, ArrayList.class,
                   ConcurrentStreamSummary.class})
  @Test
  public void
  peekInputPositiveOutput0() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Collections.class);

    // Arrange
    final ConcurrentStreamSummary concurrentStreamSummary =
        (ConcurrentStreamSummary)Reflector.getInstance(
            "com.clearspring.analytics.stream.ConcurrentStreamSummary");
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(concurrentStreamSummary, "size", atomicLong);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(concurrentStreamSummary, "reachCapacity", atomicBoolean);
    final AtomicReference<ScoredItem> atomicReference = PowerMockito.mock(AtomicReference.class);
    Reflector.setField(concurrentStreamSummary, "minVal", atomicReference);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    final Method entrySetMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "entrySet");
    PowerMockito.doReturn(hashSet).when(concurrentHashMap, entrySetMethod).withNoArguments();
    Reflector.setField(concurrentStreamSummary, "itemMap", concurrentHashMap);
    Reflector.setField(concurrentStreamSummary, "capacity", 0);
    final int k = 1;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final Iterator iterator = (Iterator)Reflector.getInstance("java.util.Iterator");
    PowerMockito.when(Collections.emptyIterator()).thenReturn(iterator);

    // Act
    final List actual = concurrentStreamSummary.peek(k);

    // Assert result
    final ArrayList arrayList1 = new ArrayList();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(ConcurrentStreamSummary.class)
  @Test
  public void constructorInputZeroOutputVoid() throws Exception {

    // Arrange
    final int capacity = 0;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(concurrentHashMap);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong);
    final AtomicReference atomicReference = PowerMockito.mock(AtomicReference.class);
    PowerMockito.whenNew(AtomicReference.class).withNoArguments().thenReturn(atomicReference);

    // Act, creating object to test constructor
    final ConcurrentStreamSummary actual = new ConcurrentStreamSummary(capacity);
  }
}
