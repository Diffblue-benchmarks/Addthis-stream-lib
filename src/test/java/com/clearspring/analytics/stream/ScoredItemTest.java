package com.clearspring.analytics.stream;

import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyLong;

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
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

@RunWith(PowerMockRunner.class)
public class ScoredItemTest {

  // Test written by Diffblue Cover.
  @PrepareForTest(ScoredItem.class)
  @Test
  public void constructorInputZeroZeroZeroOutputVoid() throws Exception {

    // Arrange
    final Object item = 0;
    final long count = 0L;
    final long error = 0L;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong1);

    // Act, creating object to test constructor
    final ScoredItem actual = new ScoredItem(item, count, error);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicLong.class, ScoredItem.class})
  @Test
  public void addAndGetCountInputZeroOutputZero() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method addAndGetMethod =
        DTUMemberMatcher.method(AtomicLong.class, "addAndGet", long.class);
    PowerMockito.doReturn(0L).when(atomicLong, addAndGetMethod).withArguments(anyLong());
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    final long delta = 0L;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong);

    // Act
    final long actual = scoredItem.addAndGetCount(delta);

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicLong.class, ScoredItem.class})
  @Test
  public void compareToInputNotNullOutputNegative2() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong, getMethod).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    final ScoredItem o =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(o, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(o, "newItem", atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(-9_223_372_036_854_775_808L)
        .when(atomicLong2, getMethod1)
        .withNoArguments();
    Reflector.setField(o, "count", atomicLong2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(o, "error", atomicLong3);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong)
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong2);

    // Act
    final int actual = scoredItem.compareTo(o);

    // Assert result
    Assert.assertEquals(-1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicLong.class, ScoredItem.class})
  @Test
  public void compareToInputNotNullOutputPositive() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(-9_223_372_036_854_775_808L)
        .when(atomicLong, getMethod)
        .withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    final ScoredItem o =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(o, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(o, "newItem", atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong2, getMethod1).withNoArguments();
    Reflector.setField(o, "count", atomicLong2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(o, "error", atomicLong3);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong)
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong2);

    // Act
    final int actual = scoredItem.compareTo(o);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicLong.class, ScoredItem.class})
  @Test
  public void compareToInputNotNullOutputPositive2() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong, getMethod).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    final ScoredItem o =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(o, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(o, "newItem", atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(4_611_686_018_427_387_904L)
        .when(atomicLong2, getMethod1)
        .withNoArguments();
    Reflector.setField(o, "count", atomicLong2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(o, "error", atomicLong3);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong)
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong2);

    // Act
    final int actual = scoredItem.compareTo(o);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicLong.class, ScoredItem.class})
  @Test
  public void compareToInputNotNullOutputZero000370f21fc12df31dd()
      throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong, getMethod).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    final ScoredItem o =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(o, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(o, "newItem", atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong2, getMethod1).withNoArguments();
    Reflector.setField(o, "count", atomicLong2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(o, "error", atomicLong3);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong)
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong2);

    // Act
    final int actual = scoredItem.compareTo(o);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(ScoredItem.class)
  @Test
  public void constructorInputZeroZeroOutputVoid() throws Exception {

    // Arrange
    final Object item = 0;
    final long count = 0L;
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong)
        .thenReturn(atomicLong1);

    // Act, creating object to test constructor
    final ScoredItem actual = new ScoredItem(item, count);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicLong.class, ScoredItem.class})
  @Test
  public void compareToInputNotNullOutputNegative() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(-4_611_545_280_939_032_576L)
        .when(atomicLong, getMethod)
        .withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    final ScoredItem o =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(o, "item", 0);
    final AtomicBoolean atomicBoolean1 = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(o, "newItem", atomicBoolean1);
    final AtomicLong atomicLong2 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod1 = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(-9_223_231_299_366_420_480L)
        .when(atomicLong2, getMethod1)
        .withNoArguments();
    Reflector.setField(o, "count", atomicLong2);
    final AtomicLong atomicLong3 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(o, "error", atomicLong3);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean)
        .thenReturn(atomicBoolean1);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong)
        .thenReturn(atomicLong3)
        .thenReturn(atomicLong2);

    // Act
    final int actual = scoredItem.compareTo(o);

    // Assert result
    Assert.assertEquals(-1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicLong.class, ScoredItem.class})
  @Test
  public void getCountOutputZero() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong, getMethod).withNoArguments();
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong);

    // Act
    final long actual = scoredItem.getCount();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicLong.class, ScoredItem.class})
  @Test
  public void getErrorOutputZero() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicLong.class, "get");
    PowerMockito.doReturn(0L).when(atomicLong1, getMethod).withNoArguments();
    Reflector.setField(scoredItem, "error", atomicLong1);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong);

    // Act
    final long actual = scoredItem.getError();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(ScoredItem.class)
  @Test
  public void getItemOutputZero() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong);

    // Act
    final Object actual = scoredItem.getItem();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicBoolean.class, ScoredItem.class})
  @Test
  public void isNewItemOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicBoolean.class, "get");
    PowerMockito.doReturn(false).when(atomicBoolean, getMethod).withNoArguments();
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong);

    // Act
    final boolean actual = scoredItem.isNewItem();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicLong.class, ScoredItem.class})
  @Test
  public void setErrorInputZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    final long newError = 0L;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong);

    // Act
    scoredItem.setError(newError);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AtomicBoolean.class, ScoredItem.class})
  @Test
  public void setNewItemInputFalseOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 0);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    Reflector.setField(scoredItem, "error", atomicLong1);
    final boolean newItem = false;
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong);

    // Act
    scoredItem.setNewItem(newItem);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ScoredItem.class, Object.class})
  @Test
  public void toStringOutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final ScoredItem scoredItem =
        (ScoredItem)Reflector.getInstance("com.clearspring.analytics.stream.ScoredItem");
    Reflector.setField(scoredItem, "item", 1_215_752_192);
    final AtomicBoolean atomicBoolean = PowerMockito.mock(AtomicBoolean.class);
    Reflector.setField(scoredItem, "newItem", atomicBoolean);
    final AtomicLong atomicLong = PowerMockito.mock(AtomicLong.class);
    PowerMockito.when(atomicLong.toString()).thenReturn("java.util.concurrent.atomic.AtomicLong@0");
    Reflector.setField(scoredItem, "count", atomicLong);
    final AtomicLong atomicLong1 = PowerMockito.mock(AtomicLong.class);
    PowerMockito.when(atomicLong1.toString())
        .thenReturn("java.util.concurrent.atomic.AtomicLong@0");
    Reflector.setField(scoredItem, "error", atomicLong1);
    PowerMockito.whenNew(AtomicBoolean.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(atomicBoolean);
    PowerMockito.whenNew(AtomicLong.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(atomicLong1)
        .thenReturn(atomicLong);

    // Act
    final String actual = scoredItem.toString();

    // Assert result
    Assert.assertEquals(
        "Value: 1215752192, Count: java.util.concurrent.atomic.AtomicLong@0, Error: java.util.concurrent.atomic.AtomicLong@0, object: com.clearspring.analytics.stream.ScoredItem@0",
        actual);
  }
}
