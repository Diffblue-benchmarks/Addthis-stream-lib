package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Preconditions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PreconditionsTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final Preconditions actual = new Preconditions();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkStateInputFalseNotNullOutputIllegalStateException() {

    // Act
    thrown.expect(IllegalStateException.class);
    Preconditions.checkState(false, "foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkStateInputTrueNotNullOutputVoid() {

    // Act
    Preconditions.checkState(true, "foo");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkArgumentInputFalseOutputIllegalArgumentException() {

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkArgument(false);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkStateInputFalseOutputIllegalStateException() {

    // Act
    thrown.expect(IllegalStateException.class);
    Preconditions.checkState(false);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkArgumentInputTrueOutputVoid() {

    // Act
    Preconditions.checkArgument(true);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void checkStateInputFalseNotNull0OutputIllegalStateException001b80d3c01d738d73d() {

    // Arrange
    final boolean condition = false;
    final String format = "foo";
    final Object[] args = {};

    // Act
    thrown.expect(IllegalStateException.class);
    Preconditions.checkState(condition, format, args);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void checkArgumentInputFalseNotNull0OutputIllegalArgumentException001c9674399390be0e8() {

    // Arrange
    final boolean condition = false;
    final String format = "foo";
    final Object[] args = {};

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkArgument(condition, format, args);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkStateInputTrueOutputVoid() {

    // Act
    Preconditions.checkState(true);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void checkArgumentInputTrueNotNull0OutputVoid0008bb3df7b2c413c4d() {

    // Arrange
    final boolean condition = true;
    final String format = "foo";
    final Object[] args = {};

    // Act
    Preconditions.checkArgument(condition, format, args);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void checkStateInputTrueNotNull0OutputVoid00024d8fe962af6622d() {

    // Arrange
    final boolean condition = true;
    final String format = "foo";
    final Object[] args = {};

    // Act
    Preconditions.checkState(condition, format, args);

    // The method returns void, testing that no exception is thrown
  }
}
