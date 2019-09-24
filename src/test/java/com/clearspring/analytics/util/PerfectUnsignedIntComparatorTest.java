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

  @Test
  public void compare1() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left = {(byte)0};
    final byte[] right = {(byte)0};

    // Act and Assert result
    Assert.assertEquals(0, unsignedIntComparator.compare(left, right));
  }

  @Test
  public void compare2() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left = {(byte)0x81, (byte)1};
    final byte[] right = {(byte)0x81, (byte)1};

    // Act and Assert result
    Assert.assertEquals(0, unsignedIntComparator.compare(left, right));
  }

  @Test
  public void compare3() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left = {(byte)0x81, (byte)1};
    final byte[] right = {(byte)0x81, (byte)2};

    // Act and Assert result
    Assert.assertTrue(unsignedIntComparator.compare(left, right) < 0);
  }

  @Test
  public void compare4() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left = {(byte)0x81, (byte)2};
    final byte[] right = {(byte)0x81, (byte)1};

    // Act and Assert result
    Assert.assertTrue(unsignedIntComparator.compare(left, right) > 0);
  }

  @Test
  public void compare5() {

    // Arrange
    final UnsignedIntComparator unsignedIntComparator = new UnsignedIntComparator();
    final byte[] left =
      {(byte)0x80, (byte)0x80, (byte)0x80, (byte)0x80, (byte)0};
    final byte[] right = {(byte)0};

    // Act
    thrown.expect(IllegalArgumentException.class);
    Varint.readUnsignedVarInt(bytes);
  }
}
