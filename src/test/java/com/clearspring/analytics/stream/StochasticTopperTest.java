package com.clearspring.analytics.stream;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.clearspring.analytics.stream.SampleSet;
import com.clearspring.analytics.stream.StochasticTopper;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@RunWith(PowerMockRunner.class)
public class StochasticTopperTest {

  // Test written by Diffblue Cover.

  @Test
  public void peekInputZeroOutput04() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    Reflector.setField(stochasticTopper, "random", null);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);
    final int k = 0;

    // Act
    final List actual = stochasticTopper.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StochasticTopper.class)
  @Test
  public void constructorInputZeroOutputVoid0006b4b01a726e7ab60() throws Exception {

    // Arrange
    final int sampleSize = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act, creating object to test constructor
    final StochasticTopper actual = new StochasticTopper(sampleSize);
  }

  // Test written by Diffblue Cover.

  @Test
  public void peekInputZeroOutput0000ee77a77bb3b9d46d() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    Reflector.setField(stochasticTopper, "random", null);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);
    final int k = 0;

    // Act
    final List actual = stochasticTopper.peek(k);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void offerInputZeroZeroOutputTrue001892f047cfe5759d8()
      throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.put(or(isA(Object.class), isNull(Object.class)), anyInt()))
        .thenReturn(0L);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1);
    final Object item = 0;
    final int incrementCount = 0;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, Random.class, StochasticTopper.class})
  @Test
  public void offerInputZeroZeroOutputFalse00006ea1def1a7f52b5()
      throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);
    final Object item = 0;
    final int incrementCount = 0;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void offerInputZeroOutputTrue2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.put(or(isA(Object.class), isNull(Object.class)), anyInt()))
        .thenReturn(1L);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1);
    final Object item = 0;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void offerInputZeroOutputTrue001b3bb9d628931b5c8()
      throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.put(or(isA(Object.class), isNull(Object.class)), anyInt()))
        .thenReturn(1L);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 2);
    final Object item = 0;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, Random.class, StochasticTopper.class})
  @Test
  public void offerInputZeroOutputFalse000cf8ce92e68c833bc()
      throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);
    final Object item = 0;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputNegativeOutputIllegalArgumentException00143be4f4c8c69aad8()
      throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    Reflector.setField(stochasticTopper, "random", null);
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    stochasticTopper.peek(-2_147_483_648);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void peekInputNegativeOutputIllegalArgumentException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    final IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    final IllegalArgumentException illegalArgumentException1 = new IllegalArgumentException();
    Reflector.setField(illegalArgumentException1, "cause", illegalArgumentException1);
    Reflector.setField(illegalArgumentException1, "detailMessage", null);
    Reflector.setField(illegalArgumentException, "cause", illegalArgumentException1);
    Reflector.setField(illegalArgumentException, "detailMessage", null);
    PowerMockito.when(sampleSet.peek(anyInt())).thenThrow(illegalArgumentException);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);
    final int k = -2_147_483_648;
    PowerMockito.whenNew(Random.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    thrown.expect(IllegalArgumentException.class);
    stochasticTopper.peek(k);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void peekInputNegativeOutputIllegalArgumentException0010d6a4cc95cd6d8a9()
      throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    final IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    final IllegalArgumentException illegalArgumentException1 = new IllegalArgumentException();
    Reflector.setField(illegalArgumentException1, "cause", illegalArgumentException1);
    Reflector.setField(illegalArgumentException1, "detailMessage", null);
    Reflector.setField(illegalArgumentException, "cause", illegalArgumentException1);
    Reflector.setField(illegalArgumentException, "detailMessage", null);
    PowerMockito.when(sampleSet.peek(anyInt())).thenThrow(illegalArgumentException);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);
    final int k = -2_147_483_648;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    thrown.expect(IllegalArgumentException.class);
    stochasticTopper.peek(k);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StochasticTopper.class)
  @Test
  public void constructorInputNegativeOutputIllegalArgumentException() throws Exception {

    // Arrange
    final int sampleSize = -2_147_481_600;
    final IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    final IllegalArgumentException illegalArgumentException1 = new IllegalArgumentException();
    Reflector.setField(illegalArgumentException1, "cause", illegalArgumentException1);
    Reflector.setField(illegalArgumentException1, "detailMessage", null);
    Reflector.setField(illegalArgumentException, "cause", illegalArgumentException1);
    Reflector.setField(illegalArgumentException, "detailMessage", null);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenThrow(illegalArgumentException);

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    final StochasticTopper actual = new StochasticTopper(sampleSize);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputNegativeOutputIllegalArgumentException7() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    Reflector.setField(stochasticTopper, "random", null);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    stochasticTopper.peek(-2_147_483_648);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputNegativeOutputIllegalArgumentException6() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    Reflector.setField(stochasticTopper, "random", null);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    stochasticTopper.peek(-1_879_048_192);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputNegativeOutputIllegalArgumentException5() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    Reflector.setField(stochasticTopper, "random", null);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    stochasticTopper.peek(-2_147_483_644);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputNegativeOutputIllegalArgumentException001b0d0d39e7d3e5c2d()
      throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    Reflector.setField(stochasticTopper, "random", null);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    stochasticTopper.peek(-2_147_483_648);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, Random.class, StochasticTopper.class})
  @Test
  public void offerInputZeroOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);
    final Object item = 0;
    PowerMockito.whenNew(Random.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullZeroOutputTrue3() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", -799_890_532_710_656L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -5);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeZeroOutputTrue() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -562_949_953_421_308L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -1L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 512);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(-1_859_691_829, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeZeroOutputTrue2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -70_458_599_230_630_737L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1p-959 /* 2.05227e-289 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -527_765_581_332_476L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -1L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0x1p-256 /* 8.63617e-78 */);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -660_128_591);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(-1_859_691_829, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeZeroOutputTrue3() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 1_184_629_476);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -590_303_969_750_378_099L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 547_211_296_116_535_615L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", -1_740_719_780);
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
    Reflector.setField(node2, "count", -2_178_677_005_615_105L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", 3);
    Reflector.setField(sampleSet, "count", -17_942_930_253_676_545L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(-536_872_705, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeZeroOutputTrue4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -2_305_843_009_213_693_825L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -1_740_719_780);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random1);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 1_422_702_648_099_812_863L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 3);
    Reflector.setField(sampleSet, "count", 1_406_938_394_851_751_361L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0x1.04200be614703p-1022 /* 2.26093e-308 */);
    Reflector.setField(sampleSet, "random", random2);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -1);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(-536_872_705, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeZeroOutputTrue5() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -2_305_843_009_213_693_825L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -1_740_719_780);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random1);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 18_014_123_631_574_975L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 3);
    Reflector.setField(sampleSet, "count", -8200L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0x0.04200be614703p-1022 /* 3.58548e-310 */);
    Reflector.setField(sampleSet, "random", random2);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -8200);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(-536_872_705, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StochasticTopper.class)
  @Test
  public void constructorInputZeroZeroOutputVoid0000362495d29ebfe78() throws Exception {

    // Arrange
    final int sampleSize = 0;
    final Long seed = 0L;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.whenNew(Random.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act, creating object to test constructor
    final StochasticTopper actual = new StochasticTopper(sampleSize, seed);
  }

  // Test written by Diffblue Cover.
  @Test
  public void peekInputZeroOutput00002eec83a99242df37() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    Reflector.setField(stochasticTopper, "random", null);
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act
    final List actual = stochasticTopper.peek(0);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void peekInputZeroOutput00003a0b3c6def5b4b6c()
      throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    final ArrayList arrayList = new ArrayList();
    PowerMockito.when(sampleSet.peek(anyInt())).thenReturn(arrayList);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);
    final int k = 0;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final List actual = stochasticTopper.peek(k);

    // Assert result
    final ArrayList arrayList1 = new ArrayList();
    Assert.assertEquals(arrayList1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StochasticTopper.class)
  @Test
  public void constructorInputZeroZeroOutputVoid2() throws Exception {

    // Arrange
    final int sampleSize = 0;
    final Long seed = 0L;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.whenNew(Random.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act, creating object to test constructor
    final StochasticTopper actual = new StochasticTopper(sampleSize, seed);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -7_392_171_657L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -1_563_907_136);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 6_800_407_862_770_964_480L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", -1_563_907_136);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 5_106_202_329_482_758L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 5_078_255_514_163_265L);
    final HashMap hashMap = new HashMap();
    hashMap.put(-1_563_907_136, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -1_210_699_910);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(-1_563_907_136));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void offerInputZeroZeroOutputTrue4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.put(or(isA(Object.class), isNull(Object.class)), anyInt()))
        .thenReturn(0L);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1);
    final Object item = 0;
    final int incrementCount = 0;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void offerInputZeroZeroOutputTrue3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.put(or(isA(Object.class), isNull(Object.class)), anyInt()))
        .thenReturn(0L);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1);
    final Object item = 0;
    final int incrementCount = 0;
    PowerMockito.whenNew(Random.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeOutputTrue2() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1_241_869_698_962_976_768L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -1_078_190_448_045_981_793L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", -1_078_190_448_045_981_792L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -2_143_289_329);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(-2_147_483_648));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void offerInputZeroZeroOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.put(or(isA(Object.class), isNull(Object.class)), anyInt()))
        .thenReturn(0L);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 2);
    final Object item = 0;
    final int incrementCount = 0;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item, incrementCount);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, Random.class, StochasticTopper.class})
  @Test
  public void offerInputZeroZeroOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);
    final Object item = 0;
    final int incrementCount = 0;
    PowerMockito.whenNew(Random.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item, incrementCount);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullOutputTrue3() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -151_064_596);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1_735_874_714_174_597_379L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", -3);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_807L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -45);
    Reflector.setField(sampleSet, "count", -9_223_372_036_854_775_807L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputTrue4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 1_373_668_856_387_600_384L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -151_064_596);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -152_018_120_537_089_512L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", -3);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 72_057_594_037_927_944L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
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
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -45);
    Reflector.setField(sampleSet, "count", 41_382_058_827_874_304L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0x1p-511 /* 1.49167e-154 */);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 2_099_435_265);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeOutputTrue3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 251_990_679_058_710_545L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_680L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 2L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0x1.105135ea51201p-991 /* 5.08288e-299 */);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(-2_147_483_648));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroOutputTrue7() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -501_957_339_750_859_810L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.eef1b99442221p-239 /* 2.1885e-72 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 38_917_830_392_938_494L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", -85_983_240L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0x1.4p-512 /* 9.32293e-155 */);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -1_792_583_565);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroOutputTrue6() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 71_271_768_299_405_313L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 10_168_126_562_670_977L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -8_403_804_272_348_402_053L);
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
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", -184_647_584_722_190_320L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -811_136_409);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroOutputTrue5() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -5_243_068_097L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 2_143_289_344L);
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
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1_931_481_582);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void offerInputZeroOutputTrue4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.put(or(isA(Object.class), isNull(Object.class)), anyInt()))
        .thenReturn(1L);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 256);
    final Object item = 0;
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SampleSet.class, StochasticTopper.class})
  @Test
  public void offerInputZeroOutputTrue3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    PowerMockito.when(sampleSet.put(or(isA(Object.class), isNull(Object.class)), anyInt()))
        .thenReturn(1L);
    PowerMockito.when(sampleSet.count()).thenReturn(0L);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 256);
    final Object item = 0;
    PowerMockito.whenNew(Random.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(random);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act
    final boolean actual = stochasticTopper.offer(item);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputPositiveOutputTrue3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.8p-256 /* 1.29543e-77 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 12_543_228_649_668_674L);
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
    Reflector.setField(sampleSet, "count", 67L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 67);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(4_194_303));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputTrue2() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -8_989_607_060_574_368L);
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
    Reflector.setField(sampleSet, "count", -12_512_304_885_137_408L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = new Random();
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(4_194_303));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputPositiveOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 485_964_090_569_654_239L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.04b66dc68f46fp-32 /* 2.37117e-10 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 2_149_483_659_852_251_136L);
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
    Reflector.setField(sampleSet, "count", 2_149_483_659_852_251_136L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(-0.0);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1_843_683_533);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(4_194_303));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullZeroOutputTrue() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -4L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -134_217_706);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -1L);
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
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    hashMap.put(-67_108_833, node3);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 2);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputTrue2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1p-905 /* 3.69704e-273 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 2_305_843_009_213_702_144L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(-67_108_833, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0x1.fffffffffffep-1021 /* 8.9003e-308 */);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StochasticTopper.class)
  @Test
  public void constructorInputZeroNullOutputVoid() throws Exception {

    // Arrange
    final int sampleSize = 0;
    final Long seed = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);
    final SampleSet sampleSet = PowerMockito.mock(SampleSet.class);
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    Reflector.setField(sampleSet, "random", random1);
    PowerMockito.whenNew(SampleSet.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(sampleSet);

    // Act, creating object to test constructor
    final StochasticTopper actual = new StochasticTopper(sampleSize, seed);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputTrue4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -32_769L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 5_637_643_049_095_256_328L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0x1.631f8b999a5a9p-514 /* 2.58655e-155 */);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -16_777_216);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroZeroOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
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
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    hashMap.put(0, node1);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(0, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputPositiveOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 485_964_090_569_654_239L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.04b66dc68f46fp-28 /* 3.79387e-09 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 2_149_483_659_852_251_136L);
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
    Reflector.setField(sampleSet, "count", 2_149_483_659_852_251_136L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1_843_683_533);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(4_194_303));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputFalse9() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 1L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputFalse8() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputFalse7() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeZeroOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.8p-32 /* 3.49246e-10 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -527_765_581_332_476L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -1L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-1_859_691_829, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeZeroOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -1_740_719_780);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random1);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", 1_422_702_648_099_812_863L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 3);
    Reflector.setField(sampleSet, "count", 1_406_938_394_851_751_361L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -1);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-536_872_705, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 5_243_068_095L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 2_143_289_344L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -965_740_791);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 501_957_339_750_859_809L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.eef1b99442221p-239 /* 2.1885e-72 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 38_917_830_392_938_494L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -7_693_964_340_239_872_002L);
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
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", -85_983_240L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -1_792_583_565);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -5L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -6_104_150_141_535_648_508L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 6_075_840_095_441_779_453L);
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
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroOutputFalse6() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -6_104_150_141_535_648_508L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 6_075_840_095_441_779_453L);
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
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeZeroOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.5);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -527_765_581_332_476L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -1L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-1_859_691_829, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeZeroOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.0000000000001p-511 /* 1.49167e-154 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -67_108_833);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 54_043_195_528_445_951L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -54_043_195_528_445_952L);
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
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 1L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-134_217_698, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputFalse6() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -639_511_147_086_612_936L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 1L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 9_223_372_036_854_775_807L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x0.0000000000001p-1022 /* 4.94066e-324 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 33_554_553L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -7);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 65_535L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -134_217_706);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -1L);
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
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    hashMap.put(-67_108_833, node3);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.8p-513 /* 5.59376e-155 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -134_217_706);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -1L);
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
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    hashMap.put(-67_108_833, node3);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullZeroOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 1_073_609_269L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -259);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputTrue2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", -917_506L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node1, "this$0", sampleSet2);
    Reflector.setField(node1, "count", -7_773_215_755_818_450_386L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 536_907_905);
    Reflector.setField(sampleSet, "count", 4_611_686_018_427_387_904L);
    final HashMap hashMap = new HashMap();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -2L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    hashMap.put(null, node2);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 9);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroZeroOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -2L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1_190_576_444_307_144_576L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 83_348_995_338_883_296L);
    final HashMap hashMap = new HashMap();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    hashMap.put(0, node1);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(0, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroZeroOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 136_478_770_011_194_872L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", -1L);
    final HashMap hashMap = new HashMap();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    hashMap.put(0, node1);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -1);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(0, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputPositiveOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.8p-128 /* 4.4081e-39 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 12_512_304_885_137_408L);
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
    Reflector.setField(sampleSet, "count", 12_512_304_885_137_408L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(4_194_303));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroZeroOutputFalse6() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 3_679_356_972_378_070_656L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 1);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 3_269_619_953_498_062_848L);
    Reflector.setField(node2, "next", null);
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", 0);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", 0L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    Reflector.setField(node2, "prev", node3);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", 1_082_228_736);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node4 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node4, "element", null);
    Reflector.setField(node4, "this$0", null);
    Reflector.setField(node4, "count", 0L);
    Reflector.setField(node4, "next", null);
    Reflector.setField(node4, "prev", null);
    hashMap.put(0, node4);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullOutputTrue() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -2L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = new Random();
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 524_289);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputFalse8() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 1L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputFalse7() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputFalse6() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 0L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroZeroOutputTrue5() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -9L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = new SampleSet();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 0);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 1_190_576_444_307_144_576L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", -83_348_995_338_883_304L);
    final HashMap hashMap = new HashMap();
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    hashMap.put(0, node1);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -16);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(0, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroZeroOutputTrue6() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    Reflector.setField(sampleSet, "tail", null);
    Reflector.setField(sampleSet, "size", 0);
    Reflector.setField(sampleSet, "count", 8L);
    final HashMap hashMap = new HashMap();
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 0L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(0, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = PowerMockito.mock(Random.class);
    PowerMockito.when(random1.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 8);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(0, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroZeroOutputTrue7() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1_152_921_504_606_847_089L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 1);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random1);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", -1_073_609_276L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1_082_195_968);
    Reflector.setField(sampleSet, "count", -4L);
    final HashMap hashMap1 = new HashMap();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    hashMap1.put(0, node2);
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -1_048_580);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(0, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputZeroZeroOutputTrue8() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1_152_921_504_606_847_089L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 1);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random1);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", -1_073_609_276L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1_082_195_968);
    Reflector.setField(sampleSet, "count", -4L);
    final HashMap hashMap1 = new HashMap();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    hashMap1.put(0, node2);
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    final Random random2 = PowerMockito.mock(Random.class);
    PowerMockito.when(random2.nextDouble()).thenReturn(0.0);
    Reflector.setField(sampleSet, "random", random2);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -4);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroZeroOutputTrue9() throws InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -535_819_551L);
    final Random random = new Random();
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet = new SampleSet();
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 1);
    final SampleSet sampleSet1 = new SampleSet();
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(0, null);
    Reflector.setField(sampleSet1, "sampleMap", hashMap);
    final Random random1 = new Random();
    Reflector.setField(sampleSet1, "random", random1);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", -560_698_253_456_046_648L);
    Reflector.setField(node, "next", null);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "prev", node1);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", 1_082_195_968);
    Reflector.setField(sampleSet, "count", -560_256_214_390_276_128L);
    final HashMap hashMap1 = new HashMap();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    hashMap1.put(0, node2);
    Reflector.setField(sampleSet, "sampleMap", hashMap1);
    final Random random2 = new Random();
    Reflector.setField(sampleSet, "random", random2);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -1_026_390_222);

    // Act and Assert result
    Assert.assertTrue(stochasticTopper.offer(0, 0));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -151_064_596);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -1_808_002_676_956_700_931L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", -3);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 8L);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", 0);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
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
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -45);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeOutputFalse5() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 251_990_679_058_710_545L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_680L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -16_386);
    Reflector.setField(sampleSet, "count", 2L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-2_147_483_648));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.0000000000001p-895 /* 3.78577e-270 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 256_212_314_271_748_241L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", -9_223_372_036_854_775_680L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 0L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-2_147_483_648));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 0L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.ffffb004p-994 /* 1.19457e-299 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 256_212_314_271_486_097L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 1_171_359_216_435_331_071L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 1_171_359_216_435_331_072L);
    final HashMap hashMap = new HashMap();
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -2_147_478_529);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-2_147_483_648));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet, "head", null);
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -1_563_907_136);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 4_538_854_732_203_525L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "tail", node);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 69_167_880_710_669_196L);
    final HashMap hashMap = new HashMap();
    hashMap.put(-1_563_907_136, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-1_563_907_136));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 663_594_744_286_347_903L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -1_563_907_136);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 6_853_165_246_892_513_280L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 0L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", -1_563_907_136);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 5_106_202_329_482_758L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", -1_793_051_663L);
    final HashMap hashMap = new HashMap();
    hashMap.put(-1_563_907_136, null);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", -1_793_051_663);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-1_563_907_136));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(-0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -151_064_596);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -5_519_687_588_640_987L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", -3);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 17_662_555_591_802_884L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 17_662_555_591_802_884L);
    final HashMap hashMap = new HashMap();
    final Object node3 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node3, "element", null);
    Reflector.setField(node3, "this$0", null);
    Reflector.setField(node3, "count", -1L);
    Reflector.setField(node3, "next", null);
    Reflector.setField(node3, "prev", null);
    hashMap.put(null, node3);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputFalse3() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -211_106_232_532_993L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x0.000000000004p-1022 /* 3.16202e-322 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", -151_064_596);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", -16_249_398_840_273_486L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", -3);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 519_979_875_538_273_376L);
    Reflector.setField(node1, "next", null);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", 0L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(node1, "prev", node2);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", -1);
    Reflector.setField(sampleSet, "count", 519_979_875_538_273_376L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 1);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputFalse2() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", null);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    Reflector.setField(sampleSet1, "random", null);
    Reflector.setField(node, "this$0", sampleSet1);
    Reflector.setField(node, "count", -917_506L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", 0);
    final SampleSet sampleSet2 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet2, "head", null);
    Reflector.setField(sampleSet2, "tail", null);
    Reflector.setField(sampleSet2, "size", 0);
    Reflector.setField(sampleSet2, "count", 0L);
    Reflector.setField(sampleSet2, "sampleMap", null);
    Reflector.setField(sampleSet2, "random", null);
    Reflector.setField(node1, "this$0", sampleSet2);
    Reflector.setField(node1, "count", -7_773_215_755_818_450_386L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(sampleSet, "tail", node1);
    Reflector.setField(sampleSet, "size", 536_907_905);
    Reflector.setField(sampleSet, "count", 4_611_686_018_427_387_904L);
    final HashMap hashMap = new HashMap();
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", null);
    Reflector.setField(node2, "this$0", null);
    Reflector.setField(node2, "count", -2L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    hashMap.put(null, node2);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet, "random", random1);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNullOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", 31L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0.0);
    Reflector.setField(stochasticTopper, "random", random);
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
    Reflector.setField(node, "count", -1L);
    Reflector.setField(node, "next", null);
    Reflector.setField(node, "prev", null);
    hashMap.put(null, node);
    Reflector.setField(sampleSet, "sampleMap", hashMap);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Random.class)
  @Test
  public void offerInputNegativeZeroOutputFalse4() throws Exception, InvocationTargetException {

    // Arrange
    final StochasticTopper stochasticTopper = (StochasticTopper)Reflector.getInstance(
        "com.clearspring.analytics.stream.StochasticTopper");
    Reflector.setField(stochasticTopper, "count", -1L);
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextDouble()).thenReturn(0x1.0000000571809p-334 /* 2.85747e-101 */);
    Reflector.setField(stochasticTopper, "random", random);
    final SampleSet sampleSet =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    final Object node = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node, "element", 1_184_629_476);
    Reflector.setField(node, "this$0", null);
    Reflector.setField(node, "count", 651_115_462_561_632_320L);
    final Object node1 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node1, "element", null);
    Reflector.setField(node1, "this$0", null);
    Reflector.setField(node1, "count", 271_654_502_521_648_720L);
    Reflector.setField(node1, "next", null);
    Reflector.setField(node1, "prev", null);
    Reflector.setField(node, "next", node1);
    Reflector.setField(node, "prev", null);
    Reflector.setField(sampleSet, "head", node);
    final Object node2 = Reflector.getInstance("com.clearspring.analytics.stream.SampleSet$Node");
    Reflector.setField(node2, "element", -1_740_719_780);
    final SampleSet sampleSet1 =
        (SampleSet)Reflector.getInstance("com.clearspring.analytics.stream.SampleSet");
    Reflector.setField(sampleSet1, "head", null);
    Reflector.setField(sampleSet1, "tail", null);
    Reflector.setField(sampleSet1, "size", 0);
    Reflector.setField(sampleSet1, "count", 0L);
    Reflector.setField(sampleSet1, "sampleMap", null);
    final Random random1 = (Random)Reflector.getInstance("java.util.Random");
    Reflector.setField(sampleSet1, "random", random1);
    Reflector.setField(node2, "this$0", sampleSet1);
    Reflector.setField(node2, "count", 32_056_305_447_403_519L);
    Reflector.setField(node2, "next", null);
    Reflector.setField(node2, "prev", null);
    Reflector.setField(sampleSet, "tail", node2);
    Reflector.setField(sampleSet, "size", 3);
    Reflector.setField(sampleSet, "count", 16_292_052_199_342_079L);
    Reflector.setField(sampleSet, "sampleMap", null);
    Reflector.setField(sampleSet, "random", null);
    Reflector.setField(stochasticTopper, "sample", sampleSet);
    Reflector.setField(stochasticTopper, "sampleSize", 0);

    // Act and Assert result
    Assert.assertFalse(stochasticTopper.offer(-536_872_705, 0));
  }
}
