package com.clearspring.analytics.stream.membership;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.clearspring.analytics.stream.membership.BitSetSerializer;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
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
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.BitSet;

@RunWith(PowerMockRunner.class)
public class BitSetSerializerTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final BitSetSerializer actual = new BitSetSerializer();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, BitSetSerializer.class})
  @Test
  public void serializeInput1NotNullOutputVoid() throws Exception, IOException {

    // Arrange
    final BitSet bs = new BitSet();
    bs.set(0);
    final DataOutputStream dos = PowerMockito.mock(DataOutputStream.class);
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    BitSetSerializer.serialize(bs, dos);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNotNullOutput1()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final DataInputStream dis = (DataInputStream)Reflector.getInstance("java.io.DataInputStream");
    final ByteArrayInputStream byteArrayInputStream =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(byteArrayInputStream, "count", 0);
    Reflector.setField(byteArrayInputStream, "mark", 0);
    Reflector.setField(byteArrayInputStream, "pos", 0);
    Reflector.setField(byteArrayInputStream, "buf", null);
    Reflector.setField(dis, "in", byteArrayInputStream);
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(bitSet).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BitSet actual = BitSetSerializer.deserialize(dis);

    // Assert result
    final BitSet bitSet1 = new BitSet();
    bitSet1.set(0);
    Assert.assertEquals(bitSet1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNullOutput00011b456836261ed086() throws Exception, IOException {

    // Arrange
    final DataInputStream dis = null;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final BitSet bitSet = new BitSet();
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(bitSet).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BitSet actual = BitSetSerializer.deserialize(dis);

    // Assert result
    final BitSet bitSet1 = new BitSet();
    Assert.assertEquals(bitSet1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNullOutput1() throws Exception, IOException {

    // Arrange
    final DataInputStream dis = null;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(bitSet).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BitSet actual = BitSetSerializer.deserialize(dis);

    // Assert result
    final BitSet bitSet1 = new BitSet();
    bitSet1.set(0);
    Assert.assertEquals(bitSet1, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectInputStream.class, BitSetSerializer.class})
  @Test
  public void deserializeInputNullOutputNull000e35404ed603993a1() throws Exception, IOException {

    // Arrange
    final DataInputStream dis = null;
    final ObjectInputStream objectInputStream = PowerMockito.mock(ObjectInputStream.class);
    final Method readObjectMethod = DTUMemberMatcher.method(ObjectInputStream.class, "readObject");
    PowerMockito.doReturn(null).when(objectInputStream, readObjectMethod).withNoArguments();
    PowerMockito.whenNew(ObjectInputStream.class)
        .withParameterTypes(InputStream.class)
        .withArguments(or(isA(InputStream.class), isNull(InputStream.class)))
        .thenReturn(objectInputStream);

    // Act
    final BitSet actual = BitSetSerializer.deserialize(dis);

    // Assert result
    Assert.assertNull(actual);
  }
}
