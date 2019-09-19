package com.clearspring.analytics.util;

import com.clearspring.analytics.util.AbstractIterator;
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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

@RunWith(PowerMockRunner.class)
public class AbstractIteratorTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final AbstractIterator actual = new AbstractIterator();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNullOutputNullPointerException() throws Throwable {
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method methodUnderTest =
        classUnderTest.getDeclaredMethod("valueOf", Reflector.forName("java.lang.String"));
    methodUnderTest.setAccessible(true);
    try {
      thrown.expect(NullPointerException.class);

      // Act
      methodUnderTest.invoke(null, null);
    } catch (InvocationTargetException ex) {

      // The method is not expected to return due to exception thrown
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid2() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator$State");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid000c0b51947638bc5d9() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator$1");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextOutputNoSuchElementException003c19f82edddb68cac()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act
    thrown.expect(NoSuchElementException.class);
    abstractIterator.next();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextOutputNoSuchElementException000c19f82edddb68cac()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act
    thrown.expect(NoSuchElementException.class);
    abstractIterator.next();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeOutputUnsupportedOperationException() throws InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    Reflector.setField(abstractIterator, "currentState", null);
    Reflector.setField(abstractIterator, "next", null);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    abstractIterator.remove();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void hasNextOutputTrue001d1d0546ea83ab91d()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.hasNext()).thenReturn(true);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "EMPTY");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertTrue(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextOutputTrue00208fe615881571120()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "HAS_DATA");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertTrue(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void hasNextOutputTrue003fa697515504f81e4()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.hasNext()).thenReturn(true);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "NOT_STARTED");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertTrue(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextOutputTrue7()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "HAS_DATA");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertTrue(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void hasNextOutputTrue8()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.hasNext()).thenReturn(true);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "NOT_STARTED");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertTrue(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void hasNextOutputTrue9()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.hasNext()).thenReturn(true);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "EMPTY");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertTrue(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void hasNextOutputTrue()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.hasNext()).thenReturn(true);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "NOT_STARTED");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertTrue(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextOutputFalse()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertFalse(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextOutputNull()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "HAS_DATA");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertNull(abstractIterator.next());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextOutputTrue2()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "HAS_DATA");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", 0);

    // Act and Assert result
    Assert.assertTrue(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextOutputNull001fd8405ef5ae530ea()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "HAS_DATA");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertNull(abstractIterator.next());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void nextOutputNull002dd36bc5b019e5464()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.next()).thenReturn(null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "EMPTY");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertNull(abstractIterator.next());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void nextOutputNull0006d90023d1104da03()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.next()).thenReturn(null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "NOT_STARTED");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", 0);

    // Act and Assert result
    Assert.assertNull(abstractIterator.next());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void nextOutputNull6()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.next()).thenReturn(null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "NOT_STARTED");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertNull(abstractIterator.next());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void nextOutputNull7()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.next()).thenReturn(null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "EMPTY");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertNull(abstractIterator.next());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void nextOutputZero()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.next()).thenReturn(0);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "EMPTY");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertEquals(0, abstractIterator.next());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void nextOutputZero2()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.next()).thenReturn(0);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "NOT_STARTED");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertEquals(0, abstractIterator.next());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void hasNextOutputTrue3()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.hasNext()).thenReturn(true);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "EMPTY");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", 0);

    // Act and Assert result
    Assert.assertTrue(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasNextOutputFalse00003200c09dc8a35db()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertFalse(abstractIterator.hasNext());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(AbstractIterator.class)
  @Test
  public void nextOutputNull2()
      throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator = PowerMockito.mock(AbstractIterator.class);
    PowerMockito.when(abstractIterator.next()).thenReturn(null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "NOT_STARTED");
    Reflector.setField(abstractIterator, "currentState", stateInstance);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertNull(abstractIterator.next());
  }

  // Test written by Diffblue Cover.
  @Test
  public void endOfDataOutputNull() throws InvocationTargetException {

    // Arrange
    final AbstractIterator abstractIterator =
        (AbstractIterator)Reflector.getInstance("com.clearspring.analytics.util.AbstractIterator");
    Reflector.setField(abstractIterator, "currentState", null);
    Reflector.setField(abstractIterator, "next", null);

    // Act and Assert result
    Assert.assertNull(abstractIterator.endOfData());
  }
}
