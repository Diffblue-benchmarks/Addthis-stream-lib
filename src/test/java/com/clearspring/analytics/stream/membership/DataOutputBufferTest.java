package com.clearspring.analytics.stream.membership;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.clearspring.analytics.stream.membership.DataOutputBuffer;
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@RunWith(PowerMockRunner.class)
public class DataOutputBufferTest {

  // Test written by Diffblue Cover.

  @Test
  public void writeInputNotNullPositiveOutputIndexOutOfBoundsException()
      throws InvocationTargetException, IOException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 13);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_822);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 2_147_483_645;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    dataOutputBuffer.write(in, length);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullPositiveOutputIndexOutOfBoundsException4() throws Throwable {

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 9);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -398_458_879);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_879_048_192);
    final byte[] myByteArray1 = {};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray1);
    Reflector.setField(in, "in", byteArrayInputStream);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);
    try {
      thrown.expect(IndexOutOfBoundsException.class);

      // Act
      methodUnderTest.invoke(dataOutputBufferBuffer, in, 2_147_483_639);
    } catch (InvocationTargetException ex) {

      // The method is not expected to return due to exception thrown
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeInputNotNullPositiveOutputIndexOutOfBoundsException3()
      throws InvocationTargetException, IOException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 7);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -1_990_937_778);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_922_197_922);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 2_147_483_646;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    dataOutputBuffer.write(in, length);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeInputNotNullNegativeOutputIndexOutOfBoundsException()
      throws InvocationTargetException, IOException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 11);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_879_048_169);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", -1_342_177_274);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = -6269;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    dataOutputBuffer.write(in, length);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullNegativeOutputIndexOutOfBoundsException2() throws Throwable {

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 284_152_981);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 215_590_912);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);
    try {
      thrown.expect(IndexOutOfBoundsException.class);

      // Act
      methodUnderTest.invoke(dataOutputBufferBuffer, in, -1_610_612_736);
    } catch (InvocationTargetException ex) {

      // The method is not expected to return due to exception thrown
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeInputNotNullNegativeOutputIndexOutOfBoundsException3()
      throws InvocationTargetException, IOException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = -2_147_483_648;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    dataOutputBuffer.write(in, length);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullNegativeOutputIndexOutOfBoundsException4() throws Throwable {

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);
    try {
      thrown.expect(IndexOutOfBoundsException.class);

      // Act
      methodUnderTest.invoke(dataOutputBufferBuffer, in, -2_147_483_648);
    } catch (InvocationTargetException ex) {

      // The method is not expected to return due to exception thrown
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullPositiveOutputIndexOutOfBoundsException2() throws Throwable {

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 19);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_147_483_631);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);
    try {
      thrown.expect(IndexOutOfBoundsException.class);

      // Act
      methodUnderTest.invoke(dataOutputBufferBuffer, in, 2_147_483_637);
    } catch (InvocationTargetException ex) {

      // The method is not expected to return due to exception thrown
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DataOutputBuffer.class)
  @Test
  public void constructorOutputVoid00061aecee9d3b444f5()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(DataOutputStream.class));

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    PowerMockito.whenNew(DataOutputBuffer.class)
        .withParameterTypes(Reflector.forName(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer"))
        .withArguments(
            or(isA(Reflector.forName(
                   "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer")),
               isNull(Reflector.forName(
                   "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer"))))
        .thenReturn(dataOutputBuffer);

    // Act, creating object to test constructor
    final DataOutputBuffer actual = new DataOutputBuffer();
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataOutputBuffer.class, System.class})
  @Test
  public void writeInputNotNullPositiveOutputVoid()
      throws Exception, InvocationTargetException, IOException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 1);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_215_299_584);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 74_448_887);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 9;

    // Act
    dataOutputBuffer.write(in, length);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeInputNotNullPositiveOutputEOFException2()
      throws EOFException, InvocationTargetException, IOException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 5);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -2_147_483_632);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 4;

    // Act
    thrown.expect(EOFException.class);
    dataOutputBuffer.write(in, length);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullPositiveOutputEOFException4() throws Throwable {

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 7);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);
    try {
      thrown.expect(EOFException.class);

      // Act
      methodUnderTest.invoke(dataOutputBufferBuffer, in, 1);
    } catch (InvocationTargetException ex) {

      // The method is not expected to return due to exception thrown
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(
      fullyQualifiedNames = {"com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer"},
      value = System.class)
  @Test
  public void
  writeInputNotNullPositiveOutputEOFException5() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 5);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -541_067_137);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", -4_205_440);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int len = 1024;

    // Act
    thrown.expect(EOFException.class);
    try {
      final Class<?> classUnderTest =
          Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
      final Method methodUnderTest = classUnderTest.getDeclaredMethod(
          "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
      methodUnderTest.setAccessible(true);
      methodUnderTest.invoke(dataOutputBufferBuffer, in, len);
    } catch (InvocationTargetException ex) {
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(
      fullyQualifiedNames = {"com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer"},
      value = System.class)
  @Test
  public void
  writeInputNotNullPositiveOutputEOFException6() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 13);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 3);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray1);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int len = 20;

    // Act
    thrown.expect(EOFException.class);
    try {
      final Class<?> classUnderTest =
          Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
      final Method methodUnderTest = classUnderTest.getDeclaredMethod(
          "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
      methodUnderTest.setAccessible(true);
      methodUnderTest.invoke(dataOutputBufferBuffer, in, len);
    } catch (InvocationTargetException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataOutputBuffer.class, System.class})
  @Test
  public void writeInputNotNullPositiveOutputEOFException7() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 13);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -1_879_072_817);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_073_725_375);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 32;

    // Act
    thrown.expect(EOFException.class);
    try {
      dataOutputBuffer.write(in, length);
    } catch (EOFException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataOutputBuffer.class, Arrays.class})
  @Test
  public void getDataOutput0() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final byte[] myByteArray1 = {};
    PowerMockito.when(Arrays.copyOf(or(isA(byte[].class), isNull(byte[].class)), anyInt()))
        .thenReturn(myByteArray1);

    // Act
    final byte[] actual = dataOutputBuffer.getData();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataOutputBuffer.class, System.class})
  @Test
  public void writeInputNotNullPositiveOutputEOFException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 5);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 20;

    // Act
    thrown.expect(EOFException.class);
    try {
      dataOutputBuffer.write(in, length);
    } catch (EOFException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(
      fullyQualifiedNames = {"com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer"},
      value = System.class)
  @Test
  public void
  writeInputNotNullPositiveOutputVoid4() throws Exception, IOException, NoSuchMethodException,
                                                IllegalAccessException, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 16);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 68_562_071);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray1 = {(byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray1);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int len = 1;

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);
    methodUnderTest.invoke(dataOutputBufferBuffer, in, len);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(
      fullyQualifiedNames = {"com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer"},
      value = System.class)
  @Test
  public void
  writeInputNotNullPositiveOutputVoid3() throws Exception, IOException, NoSuchMethodException,
                                                IllegalAccessException, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 28);
    final byte[] myByteArray = {
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_825);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)16};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray1);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int len = 2;

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);
    methodUnderTest.invoke(dataOutputBufferBuffer, in, len);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(
      fullyQualifiedNames = {"com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer"},
      value = System.class)
  @Test
  public void
  writeInputNotNullPositiveOutputEOFException3() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int len = 7;

    // Act
    thrown.expect(EOFException.class);
    try {
      final Class<?> classUnderTest =
          Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
      final Method methodUnderTest = classUnderTest.getDeclaredMethod(
          "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
      methodUnderTest.setAccessible(true);
      methodUnderTest.invoke(dataOutputBufferBuffer, in, len);
    } catch (InvocationTargetException ex) {
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DataOutputBuffer.class, System.class})
  @Test
  public void writeInputNotNullPositiveOutputVoid2()
      throws Exception, InvocationTargetException, IOException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 17);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 11);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray1);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 3;

    // Act
    dataOutputBuffer.write(in, length);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getLengthOutputZero() throws InvocationTargetException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);

    // Act
    final int actual = dataOutputBuffer.getLength();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void resetOutputNotNull() throws InvocationTargetException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);

    // Act
    final DataOutputBuffer actual = dataOutputBuffer.reset();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeInputNotNullZeroOutputVoid() throws InvocationTargetException, IOException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 8);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -2_147_483_632);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 0;

    // Act
    dataOutputBuffer.write(in, length);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullZeroOutputVoid2()
      throws IOException, InvocationTargetException, InvocationTargetException,
             IllegalAccessException, NoSuchMethodException {

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 8);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -2_147_483_647);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(dataOutputBufferBuffer, in, 0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullZeroOutputVoid3()
      throws IOException, InvocationTargetException, InvocationTargetException,
             IllegalAccessException, NoSuchMethodException {

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 5);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -541_067_137);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", -4_205_440);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(dataOutputBufferBuffer, in, 0);
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeInputNotNullZeroOutputVoid4() throws InvocationTargetException, IOException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 13);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -1_879_072_817);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_073_725_375);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 0;

    // Act
    dataOutputBuffer.write(in, length);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullZeroOutputVoid5()
      throws IOException, InvocationTargetException, InvocationTargetException,
             IllegalAccessException, NoSuchMethodException {

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 16);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 284_152_981);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 215_590_912);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(dataOutputBufferBuffer, in, 0);
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeInputNotNullZeroOutputVoid6() throws InvocationTargetException, IOException {

    // Arrange
    final DataOutputBuffer dataOutputBuffer = (DataOutputBuffer)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer");
    final ByteArrayOutputStream buffer = (ByteArrayOutputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(buffer, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(buffer, "buf", myByteArray);
    Reflector.setField(dataOutputBuffer, "buffer", buffer);
    Reflector.setField(dataOutputBuffer, "written", 0);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final int length = 0;

    // Act
    dataOutputBuffer.write(in, length);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullZeroOutputVoid7()
      throws IOException, InvocationTargetException, InvocationTargetException,
             IllegalAccessException, NoSuchMethodException {

    // Arrange
    final ByteArrayOutputStream dataOutputBufferBuffer =
        (ByteArrayOutputStream)Reflector.getInstance(
            "com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    Reflector.setField(dataOutputBufferBuffer, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(dataOutputBufferBuffer, "buf", myByteArray);
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataOutputBuffer$Buffer");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "write", Reflector.forName("java.io.DataInput"), Reflector.forName("int"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(dataOutputBufferBuffer, in, 0);
  }
}
