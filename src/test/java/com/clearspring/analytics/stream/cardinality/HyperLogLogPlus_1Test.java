package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus.Builder;
import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus.Format;
import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus.HyperLogLogPlusMergeException;
import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HyperLogLogPlus_1Test {

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final HyperLogLogPlusMergeException actual = new HyperLogLogPlusMergeException("foo");

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull3()
      throws NoSuchMethodException, IllegalAccessException, InstantiationException,
             InvocationTargetException {

    // Arrange
    final HyperLogLogPlus hyperLogLogHolder = new HyperLogLogPlus(16);
    final Class<?> classUnderTest = Reflector.forName(
        "com.clearspring.analytics.stream.cardinality.HyperLogLogPlus$SerializationHolder");
    final Constructor<?> ctor = classUnderTest.getDeclaredConstructor(
        Reflector.forName("com.clearspring.analytics.stream.cardinality.HyperLogLogPlus"));
    ctor.setAccessible(true);

    // Act
    final Object actual = (Object)ctor.newInstance(hyperLogLogHolder);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull000a925a2cd28f927fe()
      throws NoSuchMethodException, IllegalAccessException, InstantiationException,
             InvocationTargetException {

    // Arrange
    final HyperLogLogPlus hyperLogLogHolder = new HyperLogLogPlus(17);
    final Class<?> classUnderTest = Reflector.forName(
        "com.clearspring.analytics.stream.cardinality.HyperLogLogPlus$SerializationHolder");
    final Constructor<?> ctor = classUnderTest.getDeclaredConstructor(
        Reflector.forName("com.clearspring.analytics.stream.cardinality.HyperLogLogPlus"));
    ctor.setAccessible(true);

    // Act
    final Object actual = (Object)ctor.newInstance(hyperLogLogHolder);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    HyperLogLogPlus.Format.valueOf(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void buildInputNotNullOutputEOFException() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream oi = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(oi, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    HyperLogLogPlus.Builder.build(oi);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void buildInput6OutputEOFException() throws IOException {

    // Arrange
    final byte[] bytes = {(byte)-128, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    thrown.expect(EOFException.class);
    HyperLogLogPlus.Builder.build(bytes);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void buildInput5OutputEOFException() throws IOException {

    // Arrange
    final byte[] bytes = {(byte)-128, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    thrown.expect(EOFException.class);
    HyperLogLogPlus.Builder.build(bytes);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void buildInput4OutputEOFException() throws IOException {

    // Arrange
    final byte[] bytes = {(byte)-128, (byte)0, (byte)0, (byte)0};

    // Act
    thrown.expect(EOFException.class);
    HyperLogLogPlus.Builder.build(bytes);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroZeroOutputNotNull() {

    // Act, creating object to test constructor
    final HyperLogLogPlus.Builder actual = new HyperLogLogPlus.Builder(0, 0);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() throws NoSuchMethodException, IllegalAccessException,
                                                InstantiationException, InvocationTargetException {
    final Class<?> classUnderTest = Reflector.forName(
        "com.clearspring.analytics.stream.cardinality.HyperLogLogPlus$SerializationHolder");
    final Constructor<?> ctor = classUnderTest.getDeclaredConstructor();
    ctor.setAccessible(true);

    // Act
    final Object actual = (Object)ctor.newInstance();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeofOutputZero() {

    // Arrange
    final HyperLogLogPlus.Builder hyperLogLogPlusBuilder = new HyperLogLogPlus.Builder(63, 0);

    // Act and Assert result
    Assert.assertEquals(0, hyperLogLogPlusBuilder.sizeof());
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid2() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance(
        "com.clearspring.analytics.stream.cardinality.HyperLogLogPlus$Format");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void buildInput0OutputEOFException() throws IOException {

    // Arrange
    final byte[] bytes = {};

    // Act
    thrown.expect(EOFException.class);
    HyperLogLogPlus.Builder.build(bytes);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid0001c89b4ee3ffde730() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.clearspring.analytics.stream.cardinality.HyperLogLogPlus$1");

    // The method returns void, testing that no exception is thrown
  }
}
