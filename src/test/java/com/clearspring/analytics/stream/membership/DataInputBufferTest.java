package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.DataInputBuffer;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DataInputBufferTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final DataInputBuffer actual = new DataInputBuffer();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLengthOutputZero() {

    // Arrange
    final DataInputBuffer dataInputBuffer = new DataInputBuffer();

    // Act and Assert result
    Assert.assertEquals(0, dataInputBuffer.getLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPositionOutputZero() {

    // Arrange
    final DataInputBuffer dataInputBuffer = new DataInputBuffer();

    // Act and Assert result
    Assert.assertEquals(0, dataInputBuffer.getPosition());
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetInput0ZeroOutputVoid() {

    // Arrange
    final DataInputBuffer dataInputBuffer = new DataInputBuffer();
    final byte[] input = {};

    // Act
    dataInputBuffer.reset(input, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void resetInput0ZeroZeroOutputVoid() {

    // Arrange
    final DataInputBuffer dataInputBuffer = new DataInputBuffer();
    final byte[] input = {};

    // Act
    dataInputBuffer.reset(input, 0, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPositionInputZeroOutputVoid()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final ByteArrayInputStream dataInputBufferBuffer = (ByteArrayInputStream)Reflector.getInstance(
        "com.clearspring.analytics.stream.membership.DataInputBuffer$Buffer");
    Reflector.setField(dataInputBufferBuffer, "count", 0);
    Reflector.setField(dataInputBufferBuffer, "mark", 0);
    Reflector.setField(dataInputBufferBuffer, "pos", 0);
    Reflector.setField(dataInputBufferBuffer, "buf", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.membership.DataInputBuffer$Buffer");
    final Method methodUnderTest =
        classUnderTest.getDeclaredMethod("setPosition", Reflector.forName("int"));
    methodUnderTest.setAccessible(true);

    // Act
    methodUnderTest.invoke(dataInputBufferBuffer, 0);
  }
}
