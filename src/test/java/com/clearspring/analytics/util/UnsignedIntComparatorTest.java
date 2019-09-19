package com.clearspring.analytics.util;

import com.clearspring.analytics.util.UnsignedIntComparator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class UnsignedIntComparatorTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void compareInput02OutputZero() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left = {};
    final byte[] right = {(byte)-128, (byte)-1};

    // Act and Assert result
    Assert.assertEquals(0, unsignedIntComparator.compare(left, right));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInput11OutputZero() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left = {(byte)0};
    final byte[] right = {(byte)0};

    // Act and Assert result
    Assert.assertEquals(0, unsignedIntComparator.compare(left, right));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInput77OutputIllegalArgumentException() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left = {(byte)0, (byte)-128, (byte)0, (byte)0, (byte)-128, (byte)-128, (byte)0};
    final byte[] right = {(byte)-128, (byte)-128, (byte)-128, (byte)-128,
                          (byte)-128, (byte)-128, (byte)0};

    // Act
    thrown.expect(IllegalArgumentException.class);
    unsignedIntComparator.compare(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInput77OutputIllegalArgumentException2() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left = {(byte)-128, (byte)-128, (byte)-128, (byte)-128,
                         (byte)-128, (byte)-128, (byte)0};
    final byte[] right = {(byte)-128, (byte)-128, (byte)-128, (byte)-128,
                          (byte)-128, (byte)-128, (byte)0};

    // Act
    thrown.expect(IllegalArgumentException.class);
    unsignedIntComparator.compare(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInput77OutputZero() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left = {(byte)0, (byte)-128, (byte)0, (byte)0, (byte)-128, (byte)-128, (byte)0};
    final byte[] right = {(byte)0, (byte)-128, (byte)-128, (byte)0, (byte)-128, (byte)0, (byte)0};

    // Act and Assert result
    Assert.assertEquals(0, unsignedIntComparator.compare(left, right));
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final UnsignedIntComparator actual = new UnsignedIntComparator();

    // Assert result
    Assert.assertNotNull(actual);
  }
}
