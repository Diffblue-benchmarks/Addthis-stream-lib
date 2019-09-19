package com.clearspring.analytics.stream.quantile;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyFloat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.clearspring.analytics.stream.quantile.QDigest;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongSet;
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

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@RunWith(PowerMockRunner.class)
public class QDigestTest {

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toAscRangesOutput02() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<long[]> actual = qDigest.toAscRanges();

    // Assert result
    final ArrayList<long[]> arrayList1 = new ArrayList<long[]>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toStringOutputNotNull5() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
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
    final String actual = qDigest.toString();

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class})
  @Test
  public void toStringOutputNoSuchElementException() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(java.util.NoSuchElementException.class);
    qDigest.toString();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongSet.class, Long2LongOpenHashMap.class})
  @Test
  public void toStringOutputConcurrentModificationException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    qDigest.toString();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongSet.class, Long2LongOpenHashMap.class})
  @Test
  public void toAscRangesOutputNoSuchElementException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 4_442_809_828_514_988_545L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(java.util.NoSuchElementException.class);
    qDigest.toAscRanges();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongSet.class, Long2LongOpenHashMap.class})
  @Test
  public void getQuantileInputNegativeOutputNoSuchElementException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 72_057_594_037_944_323L);
    Reflector.setField(qDigest, "size", -52_863L);
    final double q = -0x1.0000102143455p-524 /* -1.82089e-158 */;

    // Act
    thrown.expect(java.util.NoSuchElementException.class);
    qDigest.getQuantile(q);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class})
  @Test
  public void toAscRangesOutputNoSuchElementException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(java.util.NoSuchElementException.class);
    qDigest.toAscRanges();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongSet.class, Long2LongOpenHashMap.class})
  @Test
  public void toAscRangesOutputConcurrentModificationException3()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    qDigest.toAscRanges();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongSet.class, Long2LongOpenHashMap.class})
  @Test
  public void toAscRangesOutputConcurrentModificationException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", -86_578_775_223_814_992L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    qDigest.toAscRanges();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class})
  @Test
  public void getQuantileInputZeroOutputConcurrentModificationException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final double q = 0.0;
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    qDigest.getQuantile(q);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongSet.class, Long2LongOpenHashMap.class})
  @Test
  public void getQuantileInputZeroOutputConcurrentModificationException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);
    final double q = 0.0;

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    qDigest.getQuantile(q);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongSet.class, Long2LongOpenHashMap.class})
  @Test
  public void toAscRangesOutputConcurrentModificationException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 252_202_129_157_027_183L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    qDigest.toAscRanges();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toAscRangesOutput08() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<long[]> actual = qDigest.toAscRanges();

    // Assert result
    final ArrayList<long[]> arrayList1 = new ArrayList<long[]>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toAscRangesOutput07() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 4_442_809_828_514_988_545L);
    Reflector.setField(qDigest, "size", 0L);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<long[]> actual = qDigest.toAscRanges();

    // Assert result
    final ArrayList<long[]> arrayList1 = new ArrayList<long[]>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toAscRangesOutput05() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 252_202_129_157_027_183L);
    Reflector.setField(qDigest, "size", 0L);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<long[]> actual = qDigest.toAscRanges();

    // Assert result
    final ArrayList<long[]> arrayList1 = new ArrayList<long[]>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toAscRangesOutput06() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", -86_578_775_223_814_992L);
    Reflector.setField(qDigest, "size", 0L);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    final Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
    Reflector.setField(arrayList, "elementData", objectArray);
    Reflector.setField(arrayList, "size", 0);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<long[]> actual = qDigest.toAscRanges();

    // Assert result
    final ArrayList<long[]> arrayList1 = new ArrayList<long[]>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongCollection.class, QDigest.class})
  @Test
  public void computeActualSizeOutputConcurrentModificationException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    qDigest.computeActualSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, DataOutputStream.class, LongSet.class,
                   QDigest.class})
  @Test
  public void
  serializeInputNotNullOutputConcurrentModificationException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest d =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(d, "node2count", long2LongOpenHashMap);
    Reflector.setField(d, "compressionFactor", 0.0);
    Reflector.setField(d, "capacity", 1L);
    Reflector.setField(d, "size", 0L);
    final DataOutputStream dataOutputStream = PowerMockito.mock(DataOutputStream.class);
    PowerMockito.whenNew(DataOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(dataOutputStream);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    QDigest.serialize(d);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongCollection.class, QDigest.class})
  @Test
  public void computeActualSizeOutputConcurrentModificationException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 1.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    qDigest.computeActualSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void getQuantileInputZeroOutputArrayIndexOutOfBoundsException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);
    final double q = 0.0;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException =
        new ArrayIndexOutOfBoundsException();
    final ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException1 =
        new ArrayIndexOutOfBoundsException();
    Reflector.setField(arrayIndexOutOfBoundsException1, "cause", arrayIndexOutOfBoundsException1);
    Reflector.setField(arrayIndexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(arrayIndexOutOfBoundsException, "cause", arrayIndexOutOfBoundsException1);
    Reflector.setField(arrayIndexOutOfBoundsException, "detailMessage", null);
    PowerMockito.when(arrayList.get(anyInt())).thenThrow(arrayIndexOutOfBoundsException);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    qDigest.getQuantile(q);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void getQuantileInputZeroOutputArrayIndexOutOfBoundsException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final double q = 0.0;
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException =
        new ArrayIndexOutOfBoundsException();
    final ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException1 =
        new ArrayIndexOutOfBoundsException();
    Reflector.setField(arrayIndexOutOfBoundsException1, "cause", arrayIndexOutOfBoundsException1);
    Reflector.setField(arrayIndexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(arrayIndexOutOfBoundsException, "cause", arrayIndexOutOfBoundsException1);
    Reflector.setField(arrayIndexOutOfBoundsException, "detailMessage", null);
    PowerMockito.when(arrayList.get(anyInt())).thenThrow(arrayIndexOutOfBoundsException);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    qDigest.getQuantile(q);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void getQuantileInputPositiveOutputArrayIndexOutOfBoundsException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", -1L);
    final double q = 6.0;
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    PowerMockito.when(arrayList.size()).thenReturn(0);
    final ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException =
        new ArrayIndexOutOfBoundsException();
    final ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException1 =
        new ArrayIndexOutOfBoundsException();
    Reflector.setField(arrayIndexOutOfBoundsException1, "cause", arrayIndexOutOfBoundsException1);
    Reflector.setField(arrayIndexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(arrayIndexOutOfBoundsException, "cause", arrayIndexOutOfBoundsException1);
    Reflector.setField(arrayIndexOutOfBoundsException, "detailMessage", null);
    PowerMockito.when(arrayList.get(anyInt())).thenThrow(arrayIndexOutOfBoundsException);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    qDigest.getQuantile(q);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongCollection.class, Long2LongOpenHashMap.class})
  @Test
  public void computeActualSizeOutputNoSuchElementException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(java.util.NoSuchElementException.class);
    qDigest.computeActualSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongCollection.class, Long2LongOpenHashMap.class})
  @Test
  public void computeActualSizeOutputNoSuchElementException000d9666a17d57d48a7()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(java.util.NoSuchElementException.class);
    qDigest.computeActualSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongCollection.class, Long2LongOpenHashMap.class})
  @Test
  public void computeActualSizeOutputConcurrentModificationException3()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    qDigest.computeActualSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class})
  @Test
  public void unionOfInputNotNullNotNullOutputConcurrentModificationException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest a =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(a, "node2count", long2LongOpenHashMap);
    Reflector.setField(a, "compressionFactor", 0.0);
    Reflector.setField(a, "capacity", 1L);
    Reflector.setField(a, "size", 0L);
    final QDigest b =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(b, "node2count", long2LongOpenHashMap1);
    Reflector.setField(b, "compressionFactor", 0.0);
    Reflector.setField(b, "capacity", 1L);
    Reflector.setField(b, "size", 0L);
    final Long2LongOpenHashMap long2LongOpenHashMap2 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1)
        .thenReturn(long2LongOpenHashMap2);

    // Act
    thrown.expect(java.util.ConcurrentModificationException.class);
    QDigest.unionOf(a, b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void unionOfInputNotNullNotNullOutputIllegalArgumentException4()
      throws InvocationTargetException {

    // Arrange
    final QDigest a =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(a, "node2count", long2LongOpenHashMap);
    Reflector.setField(a, "compressionFactor", -0x1.fe1802b8p+30 /* -2.13949e+09 */);
    Reflector.setField(a, "capacity", 9_003_821_555_020_398_592L);
    Reflector.setField(a, "size", -646_032_534_760_634_814L);
    final QDigest b =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(b, "node2count", long2LongOpenHashMap1);
    Reflector.setField(b, "compressionFactor", 1.0);
    Reflector.setField(b, "capacity", 8_202_180_821_348_515_841L);
    Reflector.setField(b, "size", 576_460_752_588_636_166L);

    // Act
    thrown.expect(IllegalArgumentException.class);
    QDigest.unionOf(a, b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(QDigest.class)
  @Test
  public void offerInputNegativeOutputIllegalArgumentException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 16.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = -3L;
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(IllegalArgumentException.class);
    qDigest.offer(value);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeOutputIllegalArgumentException2() throws InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = (Long2LongOpenHashMap)Reflector.getInstance(
        "it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap");
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 9_223_372_036_854_775_704L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(IllegalArgumentException.class);
    qDigest.offer(-112L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeOutputIllegalArgumentException3() throws InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = (Long2LongOpenHashMap)Reflector.getInstance(
        "it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap");
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0x1.f400008p+25 /* 6.5536e+07 */);
    Reflector.setField(qDigest, "capacity", -5_872_693_914_091_126_784L);
    Reflector.setField(qDigest, "size", 4_496_830_827_523_810L);

    // Act
    thrown.expect(IllegalArgumentException.class);
    qDigest.offer(-6L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeOutputIllegalArgumentException4() throws InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    Reflector.setField(qDigest, "node2count", null);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(IllegalArgumentException.class);
    qDigest.offer(-12L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void unionOfInputNotNullNotNullOutputIllegalArgumentException3()
      throws InvocationTargetException {

    // Arrange
    final QDigest a =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(a, "node2count", long2LongOpenHashMap);
    Reflector.setField(a, "compressionFactor", 2.0);
    Reflector.setField(a, "capacity", 9_187_236_449_768_964_094L);
    Reflector.setField(a, "size", 4_891_403_910_141_409_280L);
    final QDigest b =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(b, "node2count", long2LongOpenHashMap1);
    Reflector.setField(b, "compressionFactor", 0.0);
    Reflector.setField(b, "capacity", 9_187_271_634_141_052_926L);
    Reflector.setField(b, "size", 4_331_968_126_243_538_944L);

    // Act
    thrown.expect(IllegalArgumentException.class);
    QDigest.unionOf(a, b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputIllegalArgumentException2() throws InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = (Long2LongOpenHashMap)Reflector.getInstance(
        "it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap");
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -0x1.78c478bp+30 /* -1.58028e+09 */);
    Reflector.setField(qDigest, "capacity", 8_935_141_660_703_064_064L);
    Reflector.setField(qDigest, "size", 638_549_560_208_398_147L);

    // Act
    thrown.expect(IllegalArgumentException.class);
    qDigest.offer(8_796_093_022_208_739_195L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputIllegalArgumentException3() throws InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = (Long2LongOpenHashMap)Reflector.getInstance(
        "it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap");
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -393216.0);
    Reflector.setField(qDigest, "capacity", 8_899_112_863_684_100_096L);
    Reflector.setField(qDigest, "size", -2L);

    // Act
    thrown.expect(IllegalArgumentException.class);
    qDigest.offer(8_869_021_028_359_748_378L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputIllegalArgumentException4() throws InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    Reflector.setField(qDigest, "node2count", null);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    thrown.expect(IllegalArgumentException.class);
    qDigest.offer(7_402_485_206_534_789_066L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(QDigest.class)
  @Test
  public void unionOfInputNotNullNotNullOutputIllegalArgumentException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest a =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(a, "node2count", long2LongOpenHashMap);
    Reflector.setField(a, "compressionFactor", 0x1.80000004p+30 /* 1.61061e+09 */);
    Reflector.setField(a, "capacity", 1L);
    Reflector.setField(a, "size", 0L);
    final QDigest b =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(b, "node2count", long2LongOpenHashMap1);
    Reflector.setField(b, "compressionFactor", 0x1.000004p+30 /* 1.07374e+09 */);
    Reflector.setField(b, "capacity", 1L);
    Reflector.setField(b, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    thrown.expect(IllegalArgumentException.class);
    QDigest.unionOf(a, b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(QDigest.class)
  @Test
  public void unionOfInputNotNullNotNullOutputIllegalArgumentException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest a =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(a, "node2count", long2LongOpenHashMap);
    Reflector.setField(a, "compressionFactor", 0x1.40a688p+24 /* 2.10142e+07 */);
    Reflector.setField(a, "capacity", 1L);
    Reflector.setField(a, "size", 0L);
    final QDigest b =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(b, "node2count", long2LongOpenHashMap1);
    Reflector.setField(b, "compressionFactor", 0x1.00a788p+24 /* 1.68201e+07 */);
    Reflector.setField(b, "capacity", 1L);
    Reflector.setField(b, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    thrown.expect(IllegalArgumentException.class);
    QDigest.unionOf(a, b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(QDigest.class)
  @Test
  public void offerInputPositiveOutputIllegalArgumentException()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 16.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 7_355_131_494_694_789_123L;
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(IllegalArgumentException.class);
    qDigest.offer(value);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid21() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -0x1.d84128acp+30 /* -1.98078e+09 */);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 487_591_808_042_377_591L);
    final long value = 2L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_733_606_913_361_998_710L)
         .doReturn(2_733_786_268_845_431_421L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, QDigest.class})
  @Test
  public void deserializeInput9OutputRuntimeException()
      throws Exception, InvocationTargetException {

    // Arrange
    final byte[] b = {(byte)1, (byte)0,  (byte)0, (byte)0, (byte)2,
                      (byte)0, (byte)64, (byte)0, (byte)0};
    final DataInputStream dataInputStream = PowerMockito.mock(DataInputStream.class);
    final EOFException eOFException = new EOFException();
    final EOFException eOFException1 = new EOFException();
    Reflector.setField(eOFException1, "cause", eOFException1);
    Reflector.setField(eOFException1, "detailMessage", null);
    Reflector.setField(eOFException, "cause", eOFException1);
    Reflector.setField(eOFException, "detailMessage", null);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doThrow(eOFException)).when(dataInputStream);
    dataInputStream.readLong();
    PowerMockito.doReturn(0.0).when(dataInputStream);
    dataInputStream.readDouble();
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 9);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", b);
    Reflector.setField(dataInputStream, "in", byteArrayInputStream);
    PowerMockito.whenNew(DataInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(dataInputStream);

    // Act
    thrown.expect(RuntimeException.class);
    QDigest.deserialize(b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, QDigest.class})
  @Test
  public void deserializeInput16OutputRuntimeException()
      throws Exception, InvocationTargetException {

    // Arrange
    final byte[] b = {(byte)1, (byte)0, (byte)0, (byte)0, (byte)2, (byte)0, (byte)64, (byte)0,
                      (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1};
    final DataInputStream dataInputStream = PowerMockito.mock(DataInputStream.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L)).when(dataInputStream);
    dataInputStream.readLong();
    PowerMockito.doReturn(0.0).when(dataInputStream);
    dataInputStream.readDouble();
    final EOFException eOFException = new EOFException();
    final EOFException eOFException1 = new EOFException();
    Reflector.setField(eOFException1, "cause", eOFException1);
    Reflector.setField(eOFException1, "detailMessage", null);
    Reflector.setField(eOFException, "cause", eOFException1);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.doThrow(eOFException).when(dataInputStream);
    dataInputStream.readInt();
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 16);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", b);
    Reflector.setField(dataInputStream, "in", byteArrayInputStream);
    PowerMockito.whenNew(DataInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(dataInputStream);

    // Act
    thrown.expect(RuntimeException.class);
    QDigest.deserialize(b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, QDigest.class})
  @Test
  public void deserializeInput16OutputRuntimeException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final DataInputStream dataInputStream = PowerMockito.mock(DataInputStream.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L)).when(dataInputStream);
    dataInputStream.readLong();
    PowerMockito.doReturn(0.0).when(dataInputStream);
    dataInputStream.readDouble();
    final EOFException eOFException = new EOFException();
    final EOFException eOFException1 = new EOFException();
    Reflector.setField(eOFException1, "cause", eOFException1);
    Reflector.setField(eOFException1, "detailMessage", null);
    Reflector.setField(eOFException, "cause", eOFException1);
    Reflector.setField(eOFException, "detailMessage", null);
    PowerMockito.doThrow(eOFException).when(dataInputStream);
    dataInputStream.readInt();
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 16);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", b);
    Reflector.setField(dataInputStream, "in", byteArrayInputStream);
    PowerMockito.whenNew(DataInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(dataInputStream);

    // Act
    thrown.expect(RuntimeException.class);
    QDigest.deserialize(b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -98304.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 48L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(37L).when(long2LongOpenHashMap1, getMethod).withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -24.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 48L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-1L).doReturn(72L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -24.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 48L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-72))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-1L).doReturn(72L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -24.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 48L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-72))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-1L).doReturn(0L).doReturn(4L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 16.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 7L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-67_108_864))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-6_918_091_977_594_503_168L)
         .doReturn(6_773_976_789_518_647_264L)
         .doReturn(144_115_188_075_855_905L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid6() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 16.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 1L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(67_108_864).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-6_918_091_977_594_503_168L)
         .doReturn(6_773_976_789_518_647_264L)
         .doReturn(144_115_188_075_855_905L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -32.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 9L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-1_125_899_990_729_693L)
         .doReturn(1_125_906_080_269_294L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-65_536))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {1L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid8() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -32.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 9L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(1L).doReturn(1L))
        .when(longArrayFIFOQueue, dequeueLongMethod)
        .withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {0L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L)
         .doReturn(1L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(1L)
         .doReturn(7_416_611_106_567_811_720L)
         .doReturn(-1_125_899_990_729_693L)
         .doReturn(1_125_906_080_269_294L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-65_536))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -32.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 9L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(1L).doReturn(1L))
        .when(longArrayFIFOQueue, dequeueLongMethod)
        .withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {0L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L)
         .doReturn(1L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(1L)
         .doReturn(7_416_611_106_567_811_720L)
         .doReturn(-1_125_899_990_729_693L)
         .doReturn(1_125_906_080_269_294L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-65_536))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid10() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -32.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 9L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(1L).doReturn(1L))
        .when(longArrayFIFOQueue, dequeueLongMethod)
        .withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {0L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L)
         .doReturn(1L)
         .doReturn(0L)
         .doReturn(16_384L)
         .doReturn(1L)
         .doReturn(7_416_611_106_567_811_720L)
         .doReturn(-1_125_899_990_729_693L)
         .doReturn(1_125_906_080_269_294L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-65_536))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid11() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {2L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(5_072_179_087_439_593_480L)
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -0x1.f8293f8cp+30 /* -2.11461e+09 */);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 3L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {1L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method putMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "put", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, putMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(140_737_488_355_328L)
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(96_799).doReturn(65_536))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid12() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {2L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(5_072_179_087_439_593_480L)
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -0x1.f8293f8cp+30 /* -2.11461e+09 */);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 3L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {1L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method putMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "put", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, putMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-140_737_488_355_328L)
         .doReturn(140_737_488_355_326L)
         .doReturn(2L))
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(96_799).doReturn(65_536))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Long2LongOpenHashMap.class)
  @Test
  public void offerInputPositiveOutputVoid13() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(-1_610_612_736).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(-8_589_932_540L)
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 4_611_686_018_427_387_904L);
    Reflector.setField(qDigest, "size", -2L);

    // Act
    qDigest.offer(7L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid14() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(9736).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 7L);
    Reflector.setField(qDigest, "size", -2L);
    final long value = 7L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(67_234).doReturn(-1_610_612_736))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(-8_589_932_540L)
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid15() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(9736).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 7L);
    Reflector.setField(qDigest, "size", -2L);
    final long value = 7L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(67_234).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(-8_589_932_540L)
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid16() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(9736).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 1.0);
    Reflector.setField(qDigest, "capacity", -4_611_686_018_427_387_904L);
    Reflector.setField(qDigest, "size", -2_251_799_848_667_391L);
    final long value = 3L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(67_234).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-72_057_594_037_927_936L)
         .doReturn(4_683_743_612_465_315_839L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid17() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(9736).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -1.0);
    Reflector.setField(qDigest, "capacity", -4_611_686_018_427_387_904L);
    Reflector.setField(qDigest, "size", 2_251_799_848_667_389L);
    final long value = 3L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(67_234).doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-72_057_594_037_927_936L)
         .doReturn(4_683_743_612_465_315_839L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid18() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(9736).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -1.0);
    Reflector.setField(qDigest, "capacity", -4_611_686_018_427_387_904L);
    Reflector.setField(qDigest, "size", 2_251_799_848_667_389L);
    final long value = 3L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(67_234).doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-72_057_594_037_927_936L)
         .doReturn(-4_539_628_424_389_459_872L)
         .doReturn(4_613_937_818_276_055_198L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid19() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(9736).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -1.0);
    Reflector.setField(qDigest, "capacity", -4_611_686_018_427_387_904L);
    Reflector.setField(qDigest, "size", 2_251_799_848_667_389L);
    final long value = 2L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(67_234).doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-72_057_594_037_927_936L)
         .doReturn(-4_539_628_424_389_459_872L)
         .doReturn(4_613_937_818_276_055_198L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid20() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0x1.d84128acp+30 /* 1.98078e+09 */);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", -487_591_808_042_377_609L);
    final long value = 2L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_733_606_913_361_998_710L)
         .doReturn(2_733_786_268_845_431_421L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, QDigest.class})
  @Test
  public void deserializeInput20OutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final byte[] b = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                      (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                      (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0};
    final DataInputStream dataInputStream = PowerMockito.mock(DataInputStream.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L)).when(dataInputStream);
    dataInputStream.readLong();
    PowerMockito.doReturn(0.0).when(dataInputStream);
    dataInputStream.readDouble();
    PowerMockito.doReturn(0).when(dataInputStream);
    dataInputStream.readInt();
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 20);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", b);
    Reflector.setField(dataInputStream, "in", byteArrayInputStream);
    PowerMockito.whenNew(DataInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(dataInputStream);
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    final QDigest actual = QDigest.deserialize(b);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid22() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {1L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -0x1.d84128acp+30 /* -1.98078e+09 */);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 487_591_808_042_377_591L);
    final long value = 2L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_733_606_913_361_998_710L)
         .doReturn(2_733_786_268_845_431_421L))
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method putMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "put", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, putMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(1).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid23() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {1L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 12.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", -23_689_430_031L);
    final long value = 2L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(148_696_848_155_118_730L)
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method putMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "put", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, putMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2_147_483_648))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid24() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {1L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -12.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 23_689_430_061L);
    final long value = 2L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    PowerMockito.doReturn(true).when(longArrayFIFOQueue, isEmptyMethod).withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(148_696_848_155_118_730L)
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method putMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "put", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, putMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2_147_483_648))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {0L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid25() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {1L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -12.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 23_689_430_061L);
    final long value = 2L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    PowerMockito.doReturn(true).when(longArrayFIFOQueue, isEmptyMethod).withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(148_696_848_155_118_730L)
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method putMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "put", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, putMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-36))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {0L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid26() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -1.0);
    Reflector.setField(qDigest, "capacity", -2_305_843_009_213_693_951L);
    Reflector.setField(qDigest, "size", -281_474_976_710_657L);
    final long value = 3L;
    final LongArrayFIFOQueue longArrayFIFOQueue1 = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod1 = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue1, isEmptyMethod1)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    PowerMockito.doReturn(0L).when(longArrayFIFOQueue1, dequeueLongMethod).withNoArguments();
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    PowerMockito.doReturn(true).when(longArrayFIFOQueue, isEmptyMethod).withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class)
        .withNoArguments()
        .thenReturn(longArrayFIFOQueue)
        .thenReturn(longArrayFIFOQueue1);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {-9_223_372_036_854_775_807L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {0L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(8_937_252_722_950_406_784L)
         .doReturn(1L)
         .doReturn(0L)
         .doReturn(4_613_797_080_674_730_112L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid27() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -1.0);
    Reflector.setField(qDigest, "capacity", -2_305_843_009_213_693_951L);
    Reflector.setField(qDigest, "size", -281_474_976_710_657L);
    final long value = 2L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {1L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(8_649_022_346_798_695_040L)
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class})
  @Test
  public void offerInputPositiveOutputVoid28() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-1L).doReturn(1L).doReturn(
         2_305_843_005_327_819_573L))
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -4.0);
    Reflector.setField(qDigest, "capacity", 549_755_813_886L);
    Reflector.setField(qDigest, "size", -281_474_978_807_812L);

    // Act
    qDigest.offer(2L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid29() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {-9_223_372_036_854_775_807L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-1L)
         .doReturn(1L)
         .doReturn(2_305_843_005_327_819_573L)
         .doReturn(288_230_376_151_711_744L)
         .doReturn(0L)
         .doReturn(4_613_797_080_674_730_112L)
         .doReturn(0L)
         .doReturn(0L))
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -4.0);
    Reflector.setField(qDigest, "capacity", 549_755_813_886L);
    Reflector.setField(qDigest, "size", -281_474_978_807_812L);
    final long value = 2L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(longArrayFIFOQueue, dequeueLongMethod)
        .withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid30() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {-9_223_372_036_854_775_807L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(1L)
         .doReturn(2047L)
         .doReturn(2_305_843_005_327_817_525L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(-9_223_372_036_854_775_808L)
         .doReturn(-4_609_574_956_180_045_696L)
         .doReturn(0L)
         .doReturn(0L))
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -4.0);
    Reflector.setField(qDigest, "capacity", 9_007_199_254_740_995L);
    Reflector.setField(qDigest, "size", -281_474_978_807_812L);
    final long value = 1L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(false).doReturn(
         true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(0L))
        .when(longArrayFIFOQueue, dequeueLongMethod)
        .withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid31() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {-9_223_372_036_854_775_807L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(1L)
         .doReturn(2047L)
         .doReturn(2_305_843_005_327_817_525L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(-9_223_372_036_854_775_808L)
         .doReturn(-4_609_574_956_180_045_696L)
         .doReturn(0L)
         .doReturn(0L))
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -4.0);
    Reflector.setField(qDigest, "capacity", 9_007_199_254_740_995L);
    Reflector.setField(qDigest, "size", -281_474_978_807_812L);
    final long value = 1L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(false).doReturn(
         true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(162_279_120_194_012_689L).doReturn(0L))
        .when(longArrayFIFOQueue, dequeueLongMethod)
        .withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid32() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(1L)
         .doReturn(2047L)
         .doReturn(-6_917_529_031_526_958_283L)
         .doReturn(6_917_529_026_069_688_663L)
         .doReturn(6_917_529_033_098_349_185L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(-9_223_372_036_854_775_808L)
         .doReturn(-4_609_574_956_180_045_696L)
         .doReturn(0L)
         .doReturn(0L))
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap, removeMethod)
        .withArguments(anyLong());
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {-9_223_372_036_854_775_807L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -4.0);
    Reflector.setField(qDigest, "capacity", 9_007_199_254_740_995L);
    Reflector.setField(qDigest, "size", -281_474_978_807_812L);
    final long value = 1L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(false).doReturn(
         true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(162_279_120_194_012_689L).doReturn(0L))
        .when(longArrayFIFOQueue, dequeueLongMethod)
        .withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid33() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -4.0);
    Reflector.setField(qDigest, "capacity", 3L);
    Reflector.setField(qDigest, "size", -281_474_978_807_812L);
    final long value = 3L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(false).doReturn(
         true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(162_279_120_194_012_689L).doReturn(0L))
        .when(longArrayFIFOQueue, dequeueLongMethod)
        .withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(1L)
         .doReturn(2047L)
         .doReturn(-6_917_529_031_526_958_283L)
         .doReturn(6_917_529_026_069_688_663L)
         .doReturn(6_917_529_033_098_349_185L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(-9_223_372_036_854_775_808L)
         .doReturn(-4_609_574_956_180_045_696L)
         .doReturn(0L)
         .doReturn(0L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {-9_223_372_036_854_775_807L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {1L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid34() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -65536.0);
    Reflector.setField(qDigest, "capacity", 3L);
    Reflector.setField(qDigest, "size", -72_057_594_037_928_961L);
    final long value = 3L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(2048L)
         .doReturn(0L)
         .doReturn(1_099_511_625_728L)
         .doReturn(-2_306_125_585_273_425_641L)
         .doReturn(-9_223_090_560_306_672_128L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap1, removeMethod).withArguments(anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {1L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {1L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputPositiveOutputVoid35() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {3L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -65536.0);
    Reflector.setField(qDigest, "capacity", 3L);
    Reflector.setField(qDigest, "size", -72_057_594_037_928_961L);
    final long value = 3L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(2048L)
         .doReturn(0L)
         .doReturn(1_099_511_625_728L)
         .doReturn(-2_306_125_585_273_425_641L)
         .doReturn(-9_223_090_560_306_672_128L))
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method putMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "put", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, putMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-196_609))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap1, removeMethod).withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid36() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -1.0);
    Reflector.setField(qDigest, "capacity", -8_937_390_522_222_247_938L);
    Reflector.setField(qDigest, "size", -2L);
    final long value = 9L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    PowerMockito.doReturn(0L).when(longArrayFIFOQueue, dequeueLongMethod).withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L)
         .doReturn(1L)
         .doReturn(2_162_009_296_114_548_734L)
         .doReturn(-4_294_967_296L)
         .doReturn(4_294_967_295L)
         .doReturn(-4_294_709_255L)
         .doReturn(6_481_514_502L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {1L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {0L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid37() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -1.0);
    Reflector.setField(qDigest, "capacity", -8_937_390_522_222_247_938L);
    Reflector.setField(qDigest, "size", -2L);
    final long value = 9L;
    final LongArrayFIFOQueue longArrayFIFOQueue1 = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod1 = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue1, isEmptyMethod1)
        .withNoArguments();
    final Method dequeueLongMethod1 =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(288_230_405_954_676_993L).doReturn(0L))
        .when(longArrayFIFOQueue1, dequeueLongMethod1)
        .withNoArguments();
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    PowerMockito.doReturn(0L).when(longArrayFIFOQueue, dequeueLongMethod).withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class)
        .withNoArguments()
        .thenReturn(longArrayFIFOQueue)
        .thenReturn(longArrayFIFOQueue1);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L)
         .doReturn(1L)
         .doReturn(2_162_009_296_114_548_734L)
         .doReturn(-4_294_967_296L)
         .doReturn(4_294_967_295L)
         .doReturn(-4_294_709_255L)
         .doReturn(6_481_514_502L)
         .doReturn(1L)
         .doReturn(0L)
         .doReturn(69_598_977L)
         .doReturn(0L)
         .doReturn(0L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(0L)
         .doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {549_755_813_889L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {0L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputPositiveOutputVoid38() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -1.0);
    Reflector.setField(qDigest, "capacity", -2L);
    Reflector.setField(qDigest, "size", -2L);
    final long value = 1L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    ((PowerMockitoStubber)PowerMockito.doReturn(288_230_405_954_676_993L).doReturn(0L))
        .when(longArrayFIFOQueue, dequeueLongMethod)
        .withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-4_294_967_296L)
         .doReturn(4_294_967_295L)
         .doReturn(-4_294_709_255L)
         .doReturn(1L)
         .doReturn(0L)
         .doReturn(69_598_977L)
         .doReturn(0L)
         .doReturn(0L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(-2).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {549_755_813_889L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, QDigest.class})
  @Test
  public void offerInputZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(-6).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(-3_221_225_472L)
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -1.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 0L;
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void offerInputZeroOutputVoid2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet).doReturn(longSet1))
        .when(long2LongOpenHashMap, keySetMethod)
        .withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 0L;
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet2).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final Method addToMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod1)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_305_843_004_918_726_555L)
         .doReturn(2_305_843_009_230_471_395L)
         .doReturn(-4_311_476_421L))
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputZeroOutputVoid3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet).doReturn(longSet1))
        .when(long2LongOpenHashMap, keySetMethod)
        .withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 0L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    PowerMockito.doReturn(true).when(longArrayFIFOQueue, isEmptyMethod).withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {-9_223_372_036_854_775_808L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet2).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final Method addToMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod1)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_305_843_004_918_726_555L)
         .doReturn(2_305_843_009_230_471_395L)
         .doReturn(-4_311_476_421L))
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputZeroOutputVoid4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(1L).doReturn(
         7_416_681_475_311_973_022L))
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap, removeMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(1_610_612_736).doReturn(1).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {-9_223_372_036_854_775_808L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet).doReturn(longSet1))
        .when(long2LongOpenHashMap, keySetMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 1.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 0L;
    final LongArrayFIFOQueue longArrayFIFOQueue1 = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod1 = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue1, isEmptyMethod1)
        .withNoArguments();
    final Method dequeueLongMethod1 =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    PowerMockito.doReturn(1L).when(longArrayFIFOQueue1, dequeueLongMethod1).withNoArguments();
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    PowerMockito.doReturn(1L).when(longArrayFIFOQueue, dequeueLongMethod).withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class)
        .withNoArguments()
        .thenReturn(longArrayFIFOQueue)
        .thenReturn(longArrayFIFOQueue1);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet3 = PowerMockito.mock(LongSet.class);
    final Long[] longArray3 = {-1L};
    final Method toArrayMethod3 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray3)
        .when(longSet3, toArrayMethod3)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet2).doReturn(longSet3))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method removeMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod1)
        .withArguments(anyLong());
    final Method addToMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod1)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(131_072L).doReturn(0L).doReturn(2L).doReturn(
         325_948_031_620_939_790L))
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(98_304).doReturn(65_536))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputZeroOutputVoid5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L)
         .doReturn(0L)
         .doReturn(1L)
         .doReturn(7_416_681_475_311_973_022L)
         .doReturn(5_072_179_087_439_593_480L))
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap, removeMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(1_610_612_736).doReturn(1).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {-1L};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {-9_223_372_036_854_775_808L};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet).doReturn(longSet1))
        .when(long2LongOpenHashMap, keySetMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 1.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 0L;
    final LongArrayFIFOQueue longArrayFIFOQueue1 = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod1 = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue1, isEmptyMethod1)
        .withNoArguments();
    final Method dequeueLongMethod1 =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    PowerMockito.doReturn(1L).when(longArrayFIFOQueue1, dequeueLongMethod1).withNoArguments();
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    PowerMockito.doReturn(1L).when(longArrayFIFOQueue, dequeueLongMethod).withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class)
        .withNoArguments()
        .thenReturn(longArrayFIFOQueue)
        .thenReturn(longArrayFIFOQueue1);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet3 = PowerMockito.mock(LongSet.class);
    final Long[] longArray3 = {-1L};
    final Method toArrayMethod3 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray3)
        .when(longSet3, toArrayMethod3)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet2).doReturn(longSet3))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(98_304).doReturn(65_536))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method removeMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod1)
        .withArguments(anyLong());
    final Method addToMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod1)
        .withArguments(anyLong(), anyLong());
    final Method putMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "put", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap1, putMethod)
        .withArguments(anyLong(), anyLong());
    final Method getMethod1 =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(131_072L).doReturn(0L).doReturn(2L).doReturn(
         325_948_031_620_939_790L))
        .when(long2LongOpenHashMap1, getMethod1)
        .withArguments(anyLong());
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class})
  @Test
  public void offerInputZeroOutputVoid6() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(1_552_141_825).doReturn(0))
        .when(long2LongOpenHashMap, sizeMethod)
        .withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(-542_900_065L)
        .when(long2LongOpenHashMap, getMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -0x1.1944ec04p+30 /* -1.17973e+09 */);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", -9_156_416_629_662_390_272L);

    // Act
    qDigest.offer(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongArrayFIFOQueue.class, Arrays.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  offerInputZeroOutputVoid7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 1.0);
    Reflector.setField(qDigest, "capacity", -9_081_505_706_540_007_425L);
    Reflector.setField(qDigest, "size", 0L);
    final long value = 0L;
    final LongArrayFIFOQueue longArrayFIFOQueue = PowerMockito.mock(LongArrayFIFOQueue.class);
    final Method isEmptyMethod = DTUMemberMatcher.method(LongArrayFIFOQueue.class, "isEmpty");
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(longArrayFIFOQueue, isEmptyMethod)
        .withNoArguments();
    final Method dequeueLongMethod =
        DTUMemberMatcher.method(LongArrayFIFOQueue.class, "dequeueLong");
    PowerMockito.doReturn(0L).when(longArrayFIFOQueue, dequeueLongMethod).withNoArguments();
    PowerMockito.whenNew(LongArrayFIFOQueue.class).withNoArguments().thenReturn(longArrayFIFOQueue);
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(-4_294_967_296L)
         .doReturn(4_294_967_295L)
         .doReturn(2L)
         .doReturn(2_186_703_126L)
         .doReturn(1L)
         .doReturn(0L)
         .doReturn(100_663_297L))
        .when(long2LongOpenHashMap1, getMethod)
        .withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, addToMethod)
        .withArguments(anyLong(), anyLong());
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(512).doReturn(0))
        .when(long2LongOpenHashMap1, sizeMethod1)
        .withNoArguments();
    final Method removeMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "remove", long.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(0L).doReturn(0L))
        .when(long2LongOpenHashMap1, removeMethod)
        .withArguments(anyLong());
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {576_460_752_303_423_489L};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet2, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet1, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet1).doReturn(longSet2))
        .when(long2LongOpenHashMap1, keySetMethod1)
        .withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap1);

    // Act
    qDigest.offer(value);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Long2LongOpenHashMap.class)
  @Test
  public void offerInputZeroOutputVoid8() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", Double.NaN);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", -3L);

    // Act
    qDigest.offer(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Long2LongOpenHashMap.class)
  @Test
  public void offerInputZeroOutputVoid9() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", -1L);

    // Act
    qDigest.offer(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Long2LongOpenHashMap.class)
  @Test
  public void offerInputZeroOutputVoid10() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(-163_840).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", -1L);

    // Act
    qDigest.offer(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Long2LongOpenHashMap.class)
  @Test
  public void offerInputZeroOutputVoid11() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final Method getMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "get", long.class);
    PowerMockito.doReturn(0L).when(long2LongOpenHashMap, getMethod).withArguments(anyLong());
    final Method addToMethod =
        DTUMemberMatcher.method(Long2LongOpenHashMap.class, "addTo", long.class, long.class);
    PowerMockito.doReturn(0L)
        .when(long2LongOpenHashMap, addToMethod)
        .withArguments(anyLong(), anyLong());
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -0.0);
    Reflector.setField(qDigest, "capacity", 4_611_686_018_427_387_906L);
    Reflector.setField(qDigest, "size", 1_152_921_504_606_846_911L);

    // Act
    qDigest.offer(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, DataOutputStream.class, LongSet.class,
                   QDigest.class})
  @Test
  public void
  serializeInputNotNullOutput00005392fe6e65be95ed() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest d =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(d, "node2count", long2LongOpenHashMap);
    Reflector.setField(d, "compressionFactor", 0.0);
    Reflector.setField(d, "capacity", 1L);
    Reflector.setField(d, "size", 0L);
    final DataOutputStream dataOutputStream = PowerMockito.mock(DataOutputStream.class);
    PowerMockito.whenNew(DataOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(dataOutputStream);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    final byte[] actual = QDigest.serialize(d);

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataOutputStream.class, QDigest.class, LongSet.class,
                   Long2LongOpenHashMap.class})
  @Test
  public void
  serializeInputNotNullOutput000089342f967d607986() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest d =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap, sizeMethod).withNoArguments();
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(d, "node2count", long2LongOpenHashMap);
    Reflector.setField(d, "compressionFactor", 0.0);
    Reflector.setField(d, "capacity", 0L);
    Reflector.setField(d, "size", 0L);
    final DataOutputStream dataOutputStream = PowerMockito.mock(DataOutputStream.class);
    PowerMockito.whenNew(DataOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(dataOutputStream);

    // Act
    final byte[] actual = QDigest.serialize(d);

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, QDigest.class})
  @Test
  public void deserializeInput20OutputRuntimeException()
      throws Exception, InvocationTargetException {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)2, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1};
    final DataInputStream dataInputStream = PowerMockito.mock(DataInputStream.class);
    final EOFException eOFException = new EOFException();
    final EOFException eOFException1 = new EOFException();
    Reflector.setField(eOFException1, "cause", eOFException1);
    Reflector.setField(eOFException1, "detailMessage", null);
    Reflector.setField(eOFException, "cause", eOFException1);
    Reflector.setField(eOFException, "detailMessage", null);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doThrow(eOFException))
        .when(dataInputStream);
    dataInputStream.readLong();
    PowerMockito.doReturn(0.0).when(dataInputStream);
    dataInputStream.readDouble();
    PowerMockito.doReturn(1).when(dataInputStream);
    dataInputStream.readInt();
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 20);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", b);
    Reflector.setField(dataInputStream, "in", byteArrayInputStream);
    PowerMockito.whenNew(DataInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(dataInputStream);
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(RuntimeException.class);
    QDigest.deserialize(b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toAscRangesOutput000012062f0ddb3155f6() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<long[]> actual = qDigest.toAscRanges();

    // Assert result
    final ArrayList<long[]> arrayList1 = new ArrayList<long[]>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, QDigest.class})
  @Test
  public void deserializeInput20OutputRuntimeException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1};
    final DataInputStream dataInputStream = PowerMockito.mock(DataInputStream.class);
    final EOFException eOFException = new EOFException();
    final EOFException eOFException1 = new EOFException();
    Reflector.setField(eOFException1, "cause", eOFException1);
    Reflector.setField(eOFException1, "detailMessage", null);
    Reflector.setField(eOFException, "cause", eOFException1);
    Reflector.setField(eOFException, "detailMessage", null);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doThrow(eOFException))
        .when(dataInputStream);
    dataInputStream.readLong();
    PowerMockito.doReturn(0.0).when(dataInputStream);
    dataInputStream.readDouble();
    PowerMockito.doReturn(1).when(dataInputStream);
    dataInputStream.readInt();
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 20);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", b);
    Reflector.setField(dataInputStream, "in", byteArrayInputStream);
    PowerMockito.whenNew(DataInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(dataInputStream);
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(RuntimeException.class);
    QDigest.deserialize(b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toAscRangesOutput03() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<long[]> actual = qDigest.toAscRanges();

    // Assert result
    final ArrayList<long[]> arrayList1 = new ArrayList<long[]>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toAscRangesOutput04() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", -288_230_376_151_711_744L);
    Reflector.setField(qDigest, "size", 0L);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final List<long[]> actual = qDigest.toAscRanges();

    // Assert result
    final ArrayList<long[]> arrayList1 = new ArrayList<long[]>();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, QDigest.class})
  @Test
  public void deserializeInput25OutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0};
    final DataInputStream dataInputStream = PowerMockito.mock(DataInputStream.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L)).when(dataInputStream);
    dataInputStream.readLong();
    PowerMockito.doReturn(0.0).when(dataInputStream);
    dataInputStream.readDouble();
    PowerMockito.doReturn(0).when(dataInputStream);
    dataInputStream.readInt();
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 25);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", b);
    Reflector.setField(dataInputStream, "in", byteArrayInputStream);
    PowerMockito.whenNew(DataInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(dataInputStream);
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    final QDigest actual = QDigest.deserialize(b);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataInputStream.class, QDigest.class})
  @Test
  public void deserializeInput28OutputRuntimeException()
      throws Exception, InvocationTargetException {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final DataInputStream dataInputStream = PowerMockito.mock(DataInputStream.class);
    final EOFException eOFException = new EOFException();
    final EOFException eOFException1 = new EOFException();
    Reflector.setField(eOFException1, "cause", eOFException1);
    Reflector.setField(eOFException1, "detailMessage", null);
    Reflector.setField(eOFException, "cause", eOFException1);
    Reflector.setField(eOFException, "detailMessage", null);
    ((PowerMockitoStubber)PowerMockito.doReturn(0L).doReturn(0L).doReturn(0L).doThrow(eOFException))
        .when(dataInputStream);
    dataInputStream.readLong();
    PowerMockito.doReturn(0.0).when(dataInputStream);
    dataInputStream.readDouble();
    PowerMockito.doReturn(1).when(dataInputStream);
    dataInputStream.readInt();
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 28);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", b);
    Reflector.setField(dataInputStream, "in", byteArrayInputStream);
    PowerMockito.whenNew(DataInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(dataInputStream);
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    thrown.expect(RuntimeException.class);
    QDigest.deserialize(b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class})
  @Test
  public void unionOfInputNotNullNotNullOutputNotNull4()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest a =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(a, "node2count", long2LongOpenHashMap);
    Reflector.setField(a, "compressionFactor", 0.0);
    Reflector.setField(a, "capacity", -1_347_552_381_585_892_136L);
    Reflector.setField(a, "size", 4_891_403_911_087_501_344L);
    final QDigest b =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator1 =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod1 = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator1).when(longSet1, iteratorMethod1).withNoArguments();
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    Reflector.setField(b, "node2count", long2LongOpenHashMap1);
    Reflector.setField(b, "compressionFactor", 0.0);
    Reflector.setField(b, "capacity", -1_347_552_381_585_892_136L);
    Reflector.setField(b, "size", -4_891_403_911_087_501_345L);
    final Long2LongOpenHashMap long2LongOpenHashMap2 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap2, sizeMethod).withNoArguments();
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet2, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod2 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet2).when(long2LongOpenHashMap2, keySetMethod2).withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap2);

    // Act
    final QDigest actual = QDigest.unionOf(a, b);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongCollection.class, QDigest.class})
  @Test
  public void computeActualSizeOutputZero() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    final long actual = qDigest.computeActualSize();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongCollection.class, QDigest.class})
  @Test
  public void computeActualSizeOutputZero2() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 1.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act
    final long actual = qDigest.computeActualSize();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void unionOfInputNotNullNotNullOutputNotNull3()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest a =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(a, "node2count", long2LongOpenHashMap);
    Reflector.setField(a, "compressionFactor", 0.0);
    Reflector.setField(a, "capacity", -72_083_946_220_814_334L);
    Reflector.setField(a, "size", 4_891_403_910_141_409_280L);
    final QDigest b =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator1 =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod1 = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator1).when(longSet1, iteratorMethod1).withNoArguments();
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    Reflector.setField(b, "node2count", long2LongOpenHashMap1);
    Reflector.setField(b, "compressionFactor", 0.0);
    Reflector.setField(b, "capacity", -72_770_024_305_065_982L);
    Reflector.setField(b, "size", 4_331_968_126_243_538_944L);
    final Long2LongOpenHashMap long2LongOpenHashMap3 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap3, sizeMethod1)
        .withNoArguments();
    final LongSet longSet4 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet4, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet3 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet3, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod3 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet3).doReturn(longSet4))
        .when(long2LongOpenHashMap3, keySetMethod3)
        .withNoArguments();
    final Long2LongOpenHashMap long2LongOpenHashMap2 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(100_000).when(long2LongOpenHashMap2, sizeMethod).withNoArguments();
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet2, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod2 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet2).when(long2LongOpenHashMap2, keySetMethod2).withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap2)
        .thenReturn(long2LongOpenHashMap3);

    // Act
    final QDigest actual = QDigest.unionOf(a, b);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class, Arrays.class})
  @Test
  public void unionOfInputNotNullNotNullOutputNotNull2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final QDigest a =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(a, "node2count", long2LongOpenHashMap);
    Reflector.setField(a, "compressionFactor", 0.0);
    Reflector.setField(a, "capacity", 50_577_534_877_697L);
    Reflector.setField(a, "size", 4_891_403_910_141_409_280L);
    final QDigest b =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator1 =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod1 = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator1).when(longSet1, iteratorMethod1).withNoArguments();
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    Reflector.setField(b, "node2count", long2LongOpenHashMap1);
    Reflector.setField(b, "compressionFactor", 0.0);
    Reflector.setField(b, "capacity", 6_638_356_428_278_988_800L);
    Reflector.setField(b, "size", 4_331_968_126_243_538_944L);
    final Long2LongOpenHashMap long2LongOpenHashMap3 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(long2LongOpenHashMap3, sizeMethod1)
        .withNoArguments();
    final LongSet longSet4 = PowerMockito.mock(LongSet.class);
    final Long[] longArray2 = {};
    final Method toArrayMethod2 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray2)
        .when(longSet4, toArrayMethod2)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final LongSet longSet3 = PowerMockito.mock(LongSet.class);
    final Long[] longArray1 = {};
    final Method toArrayMethod1 =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray1)
        .when(longSet3, toArrayMethod1)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod3 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    ((PowerMockitoStubber)PowerMockito.doReturn(longSet3).doReturn(longSet4))
        .when(long2LongOpenHashMap3, keySetMethod3)
        .withNoArguments();
    final Long2LongOpenHashMap long2LongOpenHashMap2 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(0).when(long2LongOpenHashMap2, sizeMethod).withNoArguments();
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet2, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod2 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet2).when(long2LongOpenHashMap2, keySetMethod2).withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap2)
        .thenReturn(long2LongOpenHashMap3);

    // Act
    final QDigest actual = QDigest.unionOf(a, b);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongSet.class, QDigest.class})
  @Test
  public void unionOfInputNotNullNotNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest a =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(a, "node2count", long2LongOpenHashMap);
    Reflector.setField(a, "compressionFactor", 1.0);
    Reflector.setField(a, "capacity", 1L);
    Reflector.setField(a, "size", 0L);
    final QDigest b =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap1 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet1 = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator1 =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod1 = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator1).when(longSet1, iteratorMethod1).withNoArguments();
    final Method keySetMethod1 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet1).when(long2LongOpenHashMap1, keySetMethod1).withNoArguments();
    Reflector.setField(b, "node2count", long2LongOpenHashMap1);
    Reflector.setField(b, "compressionFactor", 1.0);
    Reflector.setField(b, "capacity", 1L);
    Reflector.setField(b, "size", 0L);
    final Long2LongOpenHashMap long2LongOpenHashMap2 =
        PowerMockito.mock(Long2LongOpenHashMap.class);
    final Method sizeMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "size");
    PowerMockito.doReturn(99_970).when(long2LongOpenHashMap2, sizeMethod).withNoArguments();
    final LongSet longSet2 = PowerMockito.mock(LongSet.class);
    final Long[] longArray = {};
    final Method toArrayMethod =
        DTUMemberMatcher.method(LongSet.class, "toArray", java.lang.Object[].class);
    PowerMockito.doReturn(longArray)
        .when(longSet2, toArrayMethod)
        .withArguments(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)));
    final Method keySetMethod2 = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet2).when(long2LongOpenHashMap2, keySetMethod2).withNoArguments();
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap)
        .thenReturn(long2LongOpenHashMap1)
        .thenReturn(long2LongOpenHashMap2);

    // Act
    final QDigest actual = QDigest.unionOf(a, b);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(QDigest.class)
  @Test
  public void constructorInputZeroOutputVoid() throws Exception {

    // Arrange
    final double compressionFactor = 0.0;
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);

    // Act, creating object to test constructor
    final QDigest actual = new QDigest(compressionFactor);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() throws NoSuchMethodException, IllegalAccessException,
                                                InstantiationException, InvocationTargetException {
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.QDigest$1");
    final Constructor<?> ctor = classUnderTest.getDeclaredConstructor();
    ctor.setAccessible(true);

    // Act
    final Comparator actual = (Comparator)ctor.newInstance();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void deserializeInput0OutputRuntimeException000522a9a535d617ab0() {

    // Arrange
    final byte[] b = {};

    // Act
    thrown.expect(RuntimeException.class);
    QDigest.deserialize(b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toStringOutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final String actual = qDigest.toString();

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toStringOutputNotNull2() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0x1.02200088p+29 /* 5.41327e+08 */);
    Reflector.setField(qDigest, "capacity", 1L);
    Reflector.setField(qDigest, "size", 0L);
    PowerMockito.whenNew(Long2LongOpenHashMap.class)
        .withParameterTypes(int.class, float.class)
        .withArguments(anyInt(), anyFloat())
        .thenReturn(long2LongOpenHashMap);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final String actual = qDigest.toString();

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toStringOutputNotNull3() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 9_223_372_036_854_775_800L);
    Reflector.setField(qDigest, "size", 0L);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final String actual = qDigest.toString();

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, ArrayList.class, LongSet.class, QDigest.class})
  @Test
  public void toStringOutputNotNull4() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongSet longSet = PowerMockito.mock(LongSet.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongSet.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longSet, iteratorMethod).withNoArguments();
    final Method keySetMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "keySet");
    PowerMockito.doReturn(longSet).when(long2LongOpenHashMap, keySetMethod).withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", -0x1.0002p+20 /* -1.04861e+06 */);
    Reflector.setField(qDigest, "capacity", -36_093_408_210_681_858L);
    Reflector.setField(qDigest, "size", 0L);
    final ArrayList arrayList = PowerMockito.mock(ArrayList.class);
    final Iterator itr = (Iterator)Reflector.getInstance("java.util.ArrayList$Itr");
    Reflector.setField(itr, "this$0", arrayList);
    PowerMockito.when(arrayList.iterator()).thenReturn(itr);
    Reflector.setField(arrayList, "modCount", 0);
    PowerMockito.whenNew(ArrayList.class).withNoArguments().thenReturn(arrayList);

    // Act
    final String actual = qDigest.toString();

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void deserializeInput1OutputRuntimeException() {

    // Arrange
    final byte[] b = {(byte)0};

    // Act
    thrown.expect(RuntimeException.class);
    QDigest.deserialize(b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deserializeInput2OutputRuntimeException() {

    // Arrange
    final byte[] b = {(byte)1, (byte)0};

    // Act
    thrown.expect(RuntimeException.class);
    QDigest.deserialize(b);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInput22OutputNegative2()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final Comparator qDigest1 =
        (Comparator)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest$1");
    final long[] ra = {576_460_752_303_423_486L, -576_460_752_303_423_491L};
    final long[] rb = {8_646_911_284_551_352_320L, -576_460_752_303_423_491L};
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.QDigest$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("long[]"), Reflector.forName("long[]"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(qDigest1, ra, rb);

    // Assert result
    Assert.assertEquals(-1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInput22OutputZero()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final Comparator qDigest1 =
        (Comparator)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest$1");
    final long[] ra = {0L, 0L};
    final long[] rb = {0L, 0L};
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.QDigest$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("long[]"), Reflector.forName("long[]"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(qDigest1, ra, rb);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInput22OutputPositive2()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final Comparator qDigest1 =
        (Comparator)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest$1");
    final long[] ra = {-8_646_911_284_551_352_322L, -576_460_752_303_423_491L};
    final long[] rb = {-576_460_752_303_423_488L, -576_460_752_303_423_491L};
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.QDigest$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("long[]"), Reflector.forName("long[]"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(qDigest1, ra, rb);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInput22OutputPositive()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final Comparator qDigest1 =
        (Comparator)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest$1");
    final long[] ra = {0L, 2L};
    final long[] rb = {0L, 0L};
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.QDigest$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("long[]"), Reflector.forName("long[]"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(qDigest1, ra, rb);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInput22OutputNegative()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final Comparator qDigest1 =
        (Comparator)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest$1");
    final long[] ra = {576_460_752_303_423_488L, -576_460_752_303_423_490L};
    final long[] rb = {0L, -4L};
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.QDigest$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("long[]"), Reflector.forName("long[]"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(qDigest1, ra, rb);

    // Assert result
    Assert.assertEquals(-1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongCollection.class, Long2LongOpenHashMap.class})
  @Test
  public void computeActualSizeOutputZero000449c8c62c6aef3a7()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    final long actual = qDigest.computeActualSize();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LongCollection.class, Long2LongOpenHashMap.class})
  @Test
  public void computeActualSizeOutputZero4() throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act
    final long actual = qDigest.computeActualSize();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Long2LongOpenHashMap.class, LongCollection.class})
  @Test
  public void computeActualSizeOutputZero0005a5daa42d3fcff67()
      throws Exception, InvocationTargetException {

    // Arrange
    final QDigest qDigest =
        (QDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.QDigest");
    final Long2LongOpenHashMap long2LongOpenHashMap = PowerMockito.mock(Long2LongOpenHashMap.class);
    final LongCollection longCollection = PowerMockito.mock(LongCollection.class);
    final LongIterator longIterator =
        (LongIterator)Reflector.getInstance("it.unimi.dsi.fastutil.longs.LongIterator");
    final Method iteratorMethod = DTUMemberMatcher.method(LongCollection.class, "iterator");
    PowerMockito.doReturn(longIterator).when(longCollection, iteratorMethod).withNoArguments();
    final Method valuesMethod = DTUMemberMatcher.method(Long2LongOpenHashMap.class, "values");
    PowerMockito.doReturn(longCollection)
        .when(long2LongOpenHashMap, valuesMethod)
        .withNoArguments();
    Reflector.setField(qDigest, "node2count", long2LongOpenHashMap);
    Reflector.setField(qDigest, "compressionFactor", 0.0);
    Reflector.setField(qDigest, "capacity", 0L);
    Reflector.setField(qDigest, "size", 0L);

    // Act and Assert result
    Assert.assertEquals(0L, qDigest.computeActualSize());
  }
}
