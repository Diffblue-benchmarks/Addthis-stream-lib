package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Varint;
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
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

@RunWith(PowerMockRunner.class)
public class VarintTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInput10OutputIllegalArgumentException() {

    // Arrange
    final byte[] bytes = {(byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-128,
                          (byte)-16,  (byte)0,    (byte)0,    (byte)0,    (byte)0};

    // Act
    thrown.expect(IllegalArgumentException.class);
    Varint.readSignedVarInt(bytes);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputIllegalArgumentException()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 12);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)-128, (byte)-1,   (byte)-1,   (byte)-128, (byte)-128,
                                (byte)-118, (byte)-128, (byte)-128, (byte)-2,   (byte)-126,
                                (byte)-125, (byte)-125, (byte)-118, (byte)-125, (byte)-125,
                                (byte)11,   (byte)9,    (byte)9,    (byte)9};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      Varint.readUnsignedVarLong(in);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputIllegalArgumentException001dca373b766c5ae33()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_828);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2);
    final byte[] myByteArray = {(byte)-128, (byte)-127, (byte)-128, (byte)-128, (byte)-128,
                                (byte)-128, (byte)-64,  (byte)-128, (byte)-122, (byte)-125,
                                (byte)-127, (byte)5,    (byte)7,    (byte)7,    (byte)-127};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      Varint.readUnsignedVarInt(in);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInput20OutputIllegalArgumentException() {

    // Arrange
    final byte[] bytes = {(byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-128,
                          (byte)-128, (byte)0,    (byte)0,    (byte)0,    (byte)0,
                          (byte)0,    (byte)0,    (byte)0,    (byte)0,    (byte)0,
                          (byte)0,    (byte)0,    (byte)0,    (byte)0,    (byte)0};

    // Act
    thrown.expect(IllegalArgumentException.class);
    Varint.readUnsignedVarInt(bytes);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputIllegalArgumentException()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_147_483_579);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2);
    final byte[] myByteArray = {(byte)-128, (byte)127,  (byte)-1,   (byte)-126, (byte)-127,
                                (byte)-120, (byte)-120, (byte)-126, (byte)-126, (byte)-96,
                                (byte)-128, (byte)-128, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-128, (byte)-127, (byte)-63,  (byte)-63,  (byte)-127,
                                (byte)-127, (byte)-64,  (byte)-127, (byte)-127};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      Varint.readSignedVarLong(in);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputIllegalArgumentException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_929);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 7);
    final byte[] myByteArray = {(byte)1,    (byte)-127, (byte)2,   (byte)0,    (byte)32,
                                (byte)2,    (byte)0,    (byte)-77, (byte)-128, (byte)-127,
                                (byte)-127, (byte)-128, (byte)-1,  (byte)3,    (byte)-128};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      Varint.readSignedVarInt(in);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputIllegalArgumentException()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 134_217_751);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 22);
    final byte[] myByteArray = {
        (byte)-128, (byte)9,  (byte)-128, (byte)3,   (byte)-128, (byte)0,  (byte)0,  (byte)-128,
        (byte)-127, (byte)9,  (byte)126,  (byte)-65, (byte)-2,   (byte)-9, (byte)-2, (byte)124,
        (byte)126,  (byte)-2, (byte)-1,   (byte)-1,  (byte)-2,   (byte)-2, (byte)-1, (byte)-3,
        (byte)-3,   (byte)-1, (byte)-127, (byte)-1,  (byte)-2};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(IllegalArgumentException.class);
      Varint.readSignedVarInt(in);
    } catch (IllegalArgumentException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 19);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 19);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readUnsignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 29);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 28);
    final byte[] myByteArray = {(byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-128};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readSignedVarInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -141_158_369);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", -140_638_113);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)-112};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)-128, (byte)127};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readSignedVarLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 18);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 19);
    final byte[] myByteArray = {
        (byte)-128, (byte)0, (byte)-128, (byte)1, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1,
        (byte)1,    (byte)1, (byte)1,    (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)-127, (byte)0, (byte)1,    (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -765_466_772);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 555_741_549);
    final byte[] myByteArray = {(byte)0,    (byte)-128, (byte)-128, (byte)-128, (byte)0,
                                (byte)-128, (byte)-128, (byte)-128, (byte)0,    (byte)1,
                                (byte)1,    (byte)1,    (byte)1,    (byte)1,    (byte)1,
                                (byte)1,    (byte)1,    (byte)1,    (byte)1,    (byte)1,
                                (byte)1,    (byte)1,    (byte)1,    (byte)1,    (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -1_451_243_148);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", -748_165_930);
    final byte[] myByteArray = {(byte)-128, (byte)127,  (byte)-1,   (byte)-126,
                                (byte)-127, (byte)-120, (byte)-120, (byte)-126,
                                (byte)-126, (byte)-96,  (byte)-128, (byte)-128};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_023_410_179);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2_097_152_003);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 29);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 28);
    final byte[] myByteArray = {(byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-128};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readSignedVarLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_929);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_073_741_929);
    final byte[] myByteArray = {};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)-127};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 19);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 18);
    final byte[] myByteArray = {(byte)114, (byte)63, (byte)27, (byte)19,   (byte)115,
                                (byte)19,  (byte)19, (byte)19, (byte)19,   (byte)19,
                                (byte)19,  (byte)19, (byte)19, (byte)19,   (byte)19,
                                (byte)19,  (byte)19, (byte)19, (byte)-128, (byte)18};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readSignedVarInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 29);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 28);
    final byte[] myByteArray = {(byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-128, (byte)-127};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readUnsignedVarLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -1_358_948_838);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 658_510_675);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)-128};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readUnsignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 20);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 19);
    final byte[] myByteArray = {(byte)127, (byte)126, (byte)-3, (byte)-1,  (byte)-66,
                                (byte)-1,  (byte)-2,  (byte)-1, (byte)-2,  (byte)-1,
                                (byte)-4,  (byte)-2,  (byte)-2, (byte)-66, (byte)-2,
                                (byte)-2,  (byte)-2,  (byte)-2, (byte)-2,  (byte)-1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readUnsignedVarInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 16);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 13);
    final byte[] myByteArray = {(byte)-125, (byte)-125, (byte)-125, (byte)-125, (byte)-127,
                                (byte)2,    (byte)-61,  (byte)-128, (byte)3,    (byte)-128,
                                (byte)-125, (byte)-128, (byte)-125, (byte)-126, (byte)-125,
                                (byte)-128, (byte)-125, (byte)-125, (byte)-125, (byte)-125,
                                (byte)-125, (byte)-125, (byte)-128, (byte)3,    (byte)-128,
                                (byte)-125, (byte)-125, (byte)-122, (byte)-125, (byte)-125};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readUnsignedVarInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputEOFException00289530a2766277f6b()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -973_074_498);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_174_409_022);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readUnsignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 3);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1);
    final byte[] myByteArray = {(byte)64, (byte)-63, (byte)-1, (byte)64, (byte)1,  (byte)69,
                                (byte)65, (byte)65,  (byte)65, (byte)76, (byte)88, (byte)94,
                                (byte)75, (byte)104, (byte)19, (byte)81, (byte)9,  (byte)93};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readUnsignedVarInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readUnsignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 29);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 28);
    final byte[] myByteArray = {(byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
                                (byte)-127, (byte)-127, (byte)-127, (byte)-128, (byte)-127};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readUnsignedVarInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", -44_466_238);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_934_196_674);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readSignedVarInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)-96};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readUnsignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 16);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 15);
    final byte[] myByteArray = {(byte)-128, (byte)1, (byte)-127, (byte)1,   (byte)1, (byte)1,
                                (byte)1,    (byte)1, (byte)1,    (byte)1,   (byte)1, (byte)1,
                                (byte)1,    (byte)1, (byte)1,    (byte)-128};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readUnsignedVarLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 752_952);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2_211_097);
    final byte[] myByteArray = {(byte)1,   (byte)127,  (byte)-128, (byte)-127, (byte)1,
                                (byte)127, (byte)118,  (byte)-33,  (byte)1,    (byte)127,
                                (byte)-70, (byte)-127, (byte)1,    (byte)127,  (byte)126,
                                (byte)-2,  (byte)1,    (byte)127,  (byte)126,  (byte)126,
                                (byte)126, (byte)126,  (byte)126,  (byte)-2,   (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readUnsignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_745_985);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1_073_745_991);
    final byte[] myByteArray = {
        (byte)-128, (byte)-128, (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127,
        (byte)-128, (byte)-127, (byte)-128, (byte)-127, (byte)0,    (byte)1,    (byte)0,
        (byte)0,    (byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-127, (byte)-127,
        (byte)-127, (byte)-127, (byte)-127, (byte)-127, (byte)-127};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readUnsignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 9);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)-128, (byte)-1,   (byte)-1,  (byte)-128, (byte)-29,
                                (byte)-118, (byte)-3,   (byte)-1,  (byte)-2,   (byte)-126,
                                (byte)-62,  (byte)-109, (byte)-56, (byte)-117, (byte)-125,
                                (byte)11,   (byte)73,   (byte)9,   (byte)9};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readUnsignedVarLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 4);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2);
    final byte[] myByteArray = {(byte)1, (byte)-127, (byte)-127, (byte)-125,
                                (byte)0, (byte)1,    (byte)4,    (byte)2};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);
    try {

      // Act
      thrown.expect(EOFException.class);
      Varint.readUnsignedVarLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act
    thrown.expect(EOFException.class);
    Varint.readUnsignedVarLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Varint.class, DataOutput.class})
  @Test
  public void writeSignedVarLongInputZeroNotNullOutputVoid00020f99f96982d53a5()
      throws IOException, Exception {

    // Arrange
    final DataOutput out = PowerMockito.mock(DataOutput.class);

    // Act
    Varint.writeSignedVarLong(0L, out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Varint.class, DataOutput.class})
  @Test
  public void writeSignedVarLongInputPositiveNotNullOutputVoid() throws IOException, Exception {

    // Arrange
    final DataOutput out = PowerMockito.mock(DataOutput.class);

    // Act
    Varint.writeSignedVarLong(4096L, out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputZero6()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 29);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 28);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readUnsignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputZero5()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 262_144);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1);
    final byte[] myByteArray = {(byte)0, (byte)-128, (byte)-128, (byte)0, (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readUnsignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputZero4()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 13);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)-128, (byte)0,   (byte)-127, (byte)-128, (byte)-128,
                                (byte)-127, (byte)-93, (byte)-1,   (byte)-2,   (byte)8,
                                (byte)9,    (byte)9,   (byte)0,    (byte)9,    (byte)9,
                                (byte)9,    (byte)9,   (byte)9,    (byte)9};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readUnsignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputZero3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_872);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 11);
    final byte[] myByteArray = {(byte)0,    (byte)0,    (byte)1,    (byte)1,    (byte)1, (byte)1,
                                (byte)1,    (byte)1,    (byte)1,    (byte)1,    (byte)1, (byte)-128,
                                (byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)0, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readUnsignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputNegative()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_929);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 7);
    final byte[] myByteArray = {(byte)1,    (byte)-127, (byte)0,   (byte)0, (byte)32,
                                (byte)0,    (byte)0,    (byte)-79, (byte)0, (byte)-127,
                                (byte)-125, (byte)0,    (byte)127, (byte)1, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(-25, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputPositive()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_878_799);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 18);
    final byte[] myByteArray = {(byte)126, (byte)127, (byte)127, (byte)127,  (byte)127,
                                (byte)127, (byte)127, (byte)127, (byte)127,  (byte)127,
                                (byte)127, (byte)127, (byte)127, (byte)127,  (byte)127,
                                (byte)127, (byte)127, (byte)127, (byte)-128, (byte)126};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(8064, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputPositive2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 18);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 15);
    final byte[] myByteArray = {
        (byte)-127, (byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-128,
        (byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-128,
        (byte)-128, (byte)-126, (byte)-128, (byte)0,    (byte)-127, (byte)-127, (byte)-128,
        (byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-128, (byte)-128};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(1, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputZero()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputZero2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_878_797);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 19);
    final byte[] myByteArray = {(byte)-1, (byte)-2, (byte)-2, (byte)-2, (byte)-2,
                                (byte)-2, (byte)-2, (byte)-2, (byte)-2, (byte)-2,
                                (byte)-2, (byte)-2, (byte)-2, (byte)-2, (byte)-2,
                                (byte)-2, (byte)-2, (byte)-2, (byte)-2, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputZero3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_826);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1);
    final byte[] myByteArray = {(byte)0, (byte)-128, (byte)-128, (byte)0, (byte)0, (byte)1,
                                (byte)1, (byte)1,    (byte)1,    (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1,    (byte)1,    (byte)1, (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputZero4()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 18);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 15);
    final byte[] myByteArray = {(byte)1, (byte)0, (byte)0,    (byte)0,    (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0,    (byte)0,    (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)-128, (byte)-128, (byte)1, (byte)1, (byte)0,
                                (byte)0, (byte)0, (byte)0,    (byte)0,    (byte)0, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputZero5()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_147_483_644);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 15);
    final byte[] myByteArray = {(byte)64, (byte)65, (byte)65, (byte)65, (byte)65,  (byte)65,
                                (byte)65, (byte)65, (byte)65, (byte)65, (byte)65,  (byte)65,
                                (byte)65, (byte)65, (byte)65, (byte)0,  (byte)-64, (byte)64,
                                (byte)65, (byte)65, (byte)65, (byte)65, (byte)65};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputNegative()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_147_483_578);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1);
    final byte[] myByteArray = {(byte)0, (byte)-1,   (byte)-128, (byte)-127, (byte)-128, (byte)8,
                                (byte)2, (byte)-128, (byte)-128, (byte)32,   (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(-1_073_750_080L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputPositive()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)16};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(8L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputPositive()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_147_483_647);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 14);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)1,    (byte)1,    (byte)1,    (byte)1,
                                (byte)1, (byte)1, (byte)1,    (byte)1,    (byte)1,    (byte)1,
                                (byte)1, (byte)1, (byte)-126, (byte)-127, (byte)-128, (byte)0,
                                (byte)1, (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(130, Varint.readUnsignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputPositive0004a52a0e4290f4c0e()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_828);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 3);
    final byte[] myByteArray = {(byte)0,    (byte)-128, (byte)-128, (byte)-124, (byte)-122,
                                (byte)-128, (byte)-126, (byte)0,    (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(4_195_076, Varint.readUnsignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputZero()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readUnsignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputZero2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_147_482_899);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 19);
    final byte[] myByteArray = {(byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readUnsignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputZero3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_827);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1);
    final byte[] myByteArray = {(byte)0, (byte)-128, (byte)-128, (byte)0, (byte)1, (byte)1,
                                (byte)1, (byte)1,    (byte)1,    (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1,    (byte)1,    (byte)1, (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readUnsignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInputNotNullOutputZero4()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 31);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 29);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readUnsignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputPositive2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 33);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)-128, (byte)127};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(8128L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputPositive3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_147_483_642);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1);
    final byte[] myByteArray = {(byte)0, (byte)16, (byte)-128};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(8L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputZero()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputZero2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_824);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)-128};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputZero3()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_826);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 2);
    final byte[] myByteArray = {(byte)-128, (byte)0, (byte)-128, (byte)-128, (byte)0,
                                (byte)0,    (byte)1, (byte)1,    (byte)1,    (byte)1,
                                (byte)1,    (byte)1, (byte)1,    (byte)1,    (byte)1,
                                (byte)1,    (byte)1, (byte)1,    (byte)1,    (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputZero6()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 2_147_483_645);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 14);
    final byte[] myByteArray = {(byte)-64, (byte)65,  (byte)65,   (byte)65, (byte)65, (byte)65,
                                (byte)65,  (byte)65,  (byte)65,   (byte)65, (byte)65, (byte)65,
                                (byte)65,  (byte)65,  (byte)-128, (byte)0,  (byte)64, (byte)64,
                                (byte)-63, (byte)-63, (byte)-63,  (byte)65};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputZero5()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1_073_741_839);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 13);
    final byte[] myByteArray = {(byte)0, (byte)1,    (byte)1,    (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1,    (byte)1,    (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)-128, (byte)-128, (byte)0, (byte)1, (byte)1,
                                (byte)1, (byte)1,    (byte)1,    (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputZero6()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 31);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 29);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInputNotNullOutputZero7()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 33_554_444);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 28);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputPositive()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 1);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    final byte[] myByteArray = {(byte)32};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(32L, Varint.readUnsignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputZero()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 131_073);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 15);
    final byte[] myByteArray = {(byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readUnsignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarLongInputNotNullOutputZero2()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 8_388_608);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1);
    final byte[] myByteArray = {(byte)0, (byte)-128, (byte)-128, (byte)0, (byte)0,
                                (byte)1, (byte)1,    (byte)1,    (byte)1, (byte)1,
                                (byte)1, (byte)1,    (byte)1,    (byte)1, (byte)1};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readUnsignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarLongInputNotNullOutputZero4()
      throws IOException, InvocationTargetException {

    // Arrange
    final DataInputStream in = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 512);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 1);
    final byte[] myByteArray = {(byte)0,    (byte)-128, (byte)-128, (byte)-128, (byte)0,
                                (byte)-128, (byte)-128, (byte)-128, (byte)0};
    Reflector.setField(byteArrayInputStream, "buf", myByteArray);
    Reflector.setField(in, "in", byteArrayInputStream);

    // Act and Assert result
    Assert.assertEquals(0L, Varint.readSignedVarLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Varint.class, DataOutput.class})
  @Test
  public void writeUnsignedVarLongInputZeroNotNullOutputVoid00091e0559d91339689()
      throws IOException, Exception {

    // Arrange
    final DataOutput out = PowerMockito.mock(DataOutput.class);

    // Act
    Varint.writeUnsignedVarLong(0L, out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Varint.class, DataOutput.class})
  @Test
  public void writeUnsignedVarLongInputPositiveNotNullOutputVoid() throws IOException, Exception {

    // Arrange
    final DataOutput out = PowerMockito.mock(DataOutput.class);

    // Act
    Varint.writeUnsignedVarLong(8192L, out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Varint.class, DataOutput.class})
  @Test
  public void writeSignedVarIntInputPositiveNotNullOutputVoid() throws IOException, Exception {

    // Arrange
    final DataOutput out = PowerMockito.mock(DataOutput.class);

    // Act
    Varint.writeSignedVarInt(4096, out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Varint.class, DataOutput.class})
  @Test
  public void writeSignedVarIntInputZeroNotNullOutputVoid000489c81cf2885d7af()
      throws IOException, Exception {

    // Arrange
    final DataOutput out = PowerMockito.mock(DataOutput.class);

    // Act
    Varint.writeSignedVarInt(0, out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Varint.class, DataOutput.class})
  @Test
  public void writeUnsignedVarIntInputPositiveNotNullOutputVoid() throws IOException, Exception {

    // Arrange
    final DataOutput out = PowerMockito.mock(DataOutput.class);

    // Act
    Varint.writeUnsignedVarInt(8192, out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Varint.class, DataOutput.class})
  @Test
  public void writeUnsignedVarIntInputZeroNotNullOutputVoid00058875b8118115651()
      throws IOException, Exception {

    // Arrange
    final DataOutput out = PowerMockito.mock(DataOutput.class);

    // Act
    Varint.writeUnsignedVarInt(0, out);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeSignedVarIntInputNegativeOutput1() {

    // Arrange
    final int value = -1;

    // Act
    final byte[] actual = Varint.writeSignedVarInt(value);

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)1}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeSignedVarIntInputPositiveOutput3() {

    // Arrange
    final int value = 8704;

    // Act
    final byte[] actual = Varint.writeSignedVarInt(value);

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)-128, (byte)-120, (byte)1}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void writeUnsignedVarIntInputPositiveOutput3() {

    // Arrange
    final int value = 16_384;

    // Act
    final byte[] actual = Varint.writeUnsignedVarInt(value);

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)-128, (byte)-128, (byte)1}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInput0OutputPositive() {

    // Arrange
    final byte[] bytes = {};

    // Act and Assert result
    Assert.assertEquals(2_147_483_584, Varint.readSignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInput1OutputZero() {

    // Arrange
    final byte[] bytes = {(byte)0};

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInput3OutputPositive() {

    // Arrange
    final byte[] bytes = {(byte)-128, (byte)-128, (byte)-128};

    // Act and Assert result
    Assert.assertEquals(2_013_265_920, Varint.readSignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInput4OutputZero() {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)-128, (byte)-128, (byte)0};

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInput4OutputZero2() {

    // Arrange
    final byte[] bytes = {(byte)-128, (byte)0, (byte)-128, (byte)0};

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInput0OutputPositive2() {

    // Arrange
    final byte[] bytes = {};

    // Act and Assert result
    Assert.assertEquals(2_147_483_584, Varint.readSignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInput4OutputZero3() {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)-128, (byte)-128, (byte)-128};

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readSignedVarIntInput4OutputZero4() {

    // Arrange
    final byte[] bytes = {(byte)-128, (byte)0, (byte)-128, (byte)-128};

    // Act and Assert result
    Assert.assertEquals(0, Varint.readSignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInput2OutputZero() {

    // Arrange
    final byte[] bytes = {(byte)-128, (byte)0};

    // Act and Assert result
    Assert.assertEquals(0, Varint.readUnsignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInput1OutputZero2() {

    // Arrange
    final byte[] bytes = {(byte)0};

    // Act and Assert result
    Assert.assertEquals(0, Varint.readUnsignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInput1OutputZero() {

    // Arrange
    final byte[] bytes = {(byte)0};

    // Act and Assert result
    Assert.assertEquals(0, Varint.readUnsignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInput1OutputNegative0012d4fb5dca8f5f482() {

    // Arrange
    final byte[] bytes = {(byte)-128};

    // Act and Assert result
    Assert.assertEquals(-16_384, Varint.readUnsignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInput0OutputNegative000b64a79fd682280f0() {

    // Arrange
    final byte[] bytes = {};

    // Act and Assert result
    Assert.assertEquals(-128, Varint.readUnsignedVarInt(bytes));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUnsignedVarIntInput0OutputNegative() {

    // Arrange
    final byte[] bytes = {};

    // Act and Assert result
    Assert.assertEquals(-128, Varint.readUnsignedVarInt(bytes));
  }
}
