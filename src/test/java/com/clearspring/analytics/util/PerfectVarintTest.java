package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Varint;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

public class PerfectVarintTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void readUnsignedVarInt1() {

    // Arrange
    final byte[] bytes = {(byte)0};

    // Act and Assert result
    Assert.assertEquals(0, Varint.readUnsignedVarInt(bytes));
  }

  @Test
  public void readUnsignedVarInt2() {

    // Arrange
    // msb is 1 to indicate that there is a next byte
    final byte b1 = 0x80 | 0x03;
    // msb is 0 to indicate that this is the last byte
    final byte b2 = 0x73

    final byte[] bytes = {b1, b2};

    // Act and Assert result
    Assert.assertEquals((0x03 << 7) | 0x73, Varint.readUnsignedVarInt(bytes));
  }

  @Test
  public void readUnsignedVarInt3() {

    // Arrange
    // maximum convertible value
    final byte[] bytes = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0x7f};

    // Act and Assert result
    Assert.assertEquals(0xfffffff, Varint.readUnsignedVarInt(bytes));
  }


  @Test
  public void readUnsignedVarInt4() {

    // Arrange
    final byte[] bytes = {
      (byte)0x80, (byte)0x80, (byte)0x80, (byte)0x80, (byte)0 };

    // Act
    thrown.expect(IllegalArgumentException.class);
    Varint.readUnsignedVarInt(bytes);
  }
}
