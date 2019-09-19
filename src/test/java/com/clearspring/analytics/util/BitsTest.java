package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Bits;
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
import java.lang.reflect.InvocationTargetException;

public class BitsTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final Bits actual = new Bits();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInput3Output02() throws IOException {

    // Arrange
    final byte[] mBytes = {(byte)0, (byte)0, (byte)1};

    // Act
    final int[] actual = Bits.getBits(mBytes);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInput5Output1() throws IOException {

    // Arrange
    final byte[] mBytes = {(byte)-122, (byte)-2, (byte)-2, (byte)-1, (byte)1};

    // Act
    final int[] actual = Bits.getBits(mBytes);

    // Assert result
    Assert.assertArrayEquals(new int[] {-2_030_108_929}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInput13Output3() throws IOException {

    // Arrange
    final byte[] mBytes = {(byte)0, (byte)0,    (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                           (byte)0, (byte)-127, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    final int[] actual = Bits.getBits(mBytes);

    // Assert result
    Assert.assertArrayEquals(new int[] {0, 0, -2_130_706_432}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInput3Output0() throws IOException {

    // Arrange
    final byte[] mBytes = {(byte)1, (byte)-125, (byte)0};

    // Act
    final int[] actual = Bits.getBits(mBytes);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Bits.getBits(dataIn, 4);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_614_807_041);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_614_807_045);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Bits.getBits(dataIn, 262_147);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -1_543_610_349);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 587_120_714);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Bits.getBits(dataIn, 262_144);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 5);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {
        (byte)0, (byte)0, (byte)0,  (byte)0, (byte)1, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)16, (byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dataIn, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Bits.getBits(dataIn, 22);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(dataIn);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_013_449_092);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2_080_550_660);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Bits.getBits(dataIn, 24);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 262_009);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 262_009);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Bits.getBits(dataIn, 262_144);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 3);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)126, (byte)86, (byte)117};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dataIn, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Bits.getBits(dataIn, 4);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(dataIn);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 4);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1);
    final byte[] myByteArray = {(byte)5, (byte)4, (byte)1, (byte)0, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dataIn, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Bits.getBits(dataIn, 4);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(dataIn);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullNegativeOutput0() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_614_807_041);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_614_807_045);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, -1);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutput15() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 18);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 14);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 4);

    // Assert side effects
    Assert.assertNotNull(dataIn);

    // Assert result
    Assert.assertArrayEquals(new int[] {0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutput13() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 16);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 12);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)3,  (byte)3, (byte)3,
                                (byte)3, (byte)3, (byte)3, (byte)3,  (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0,  (byte)2, (byte)1,
                                (byte)0, (byte)0, (byte)3, (byte)18, (byte)10};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 4);

    // Assert side effects
    Assert.assertNotNull(dataIn);

    // Assert result
    Assert.assertArrayEquals(new int[] {0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutput12() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 262_009);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 12);
    final byte[] myByteArray = {(byte)-91, (byte)65,  (byte)37,  (byte)55,  (byte)-120, (byte)40,
                                (byte)37,  (byte)42,  (byte)51,  (byte)34,  (byte)-95,  (byte)6,
                                (byte)-91, (byte)-65, (byte)-5,  (byte)-69, (byte)0,    (byte)0,
                                (byte)0,   (byte)0,   (byte)-92, (byte)-4,  (byte)-95};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 4);

    // Assert side effects
    Assert.assertNotNull(dataIn);

    // Assert result
    Assert.assertArrayEquals(new int[] {-1_514_144_837}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutput1() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_843);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 15);
    final byte[] myByteArray = {(byte)126, (byte)0,   (byte)11,  (byte)1,   (byte)-78,
                                (byte)56,  (byte)93,  (byte)76,  (byte)-38, (byte)-61,
                                (byte)110, (byte)-21, (byte)-93, (byte)60,  (byte)118,
                                (byte)126, (byte)0,   (byte)1,   (byte)-127};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 4);

    // Assert side effects
    Assert.assertNotNull(dataIn);

    // Assert result
    Assert.assertArrayEquals(new int[] {2_113_929_601}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutput0() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_013_449_092);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2_080_550_660);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 2);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullPositiveOutput14() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_614_807_041);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 13);
    final byte[] myByteArray = {(byte)-45, (byte)-63,  (byte)9,   (byte)-117, (byte)-117, (byte)3,
                                (byte)9,   (byte)1,    (byte)8,   (byte)13,   (byte)29,   (byte)15,
                                (byte)25,  (byte)-113, (byte)-85, (byte)-117, (byte)-41,  (byte)2,
                                (byte)0,   (byte)0,    (byte)0,   (byte)27,   (byte)95,   (byte)7,
                                (byte)10,  (byte)13,   (byte)5};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 7);

    // Assert side effects
    Assert.assertNotNull(dataIn);

    // Assert result
    Assert.assertArrayEquals(new int[] {-1_884_582_953}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullZeroOutput0() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_824);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_073_741_821);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 0);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullZeroOutput02() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 3);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 0);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullZeroOutput03() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 262_009);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 262_006);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 0);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNotNullZeroOutput04() throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream dataIn =
        (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -1_543_610_349);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 587_120_714);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dataIn, "in", byteArrayInputStream);

    // Act
    final int[] actual = Bits.getBits(dataIn, 0);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBitsInputNullZeroOutputNotNull() throws IOException {

    // Act
    final int[] actual = Bits.getBits(null, 0);

    // Assert result
    Assert.assertNotNull(actual);
  }
}
