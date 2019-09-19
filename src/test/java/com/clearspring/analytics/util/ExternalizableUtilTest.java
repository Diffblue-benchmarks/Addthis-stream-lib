package com.clearspring.analytics.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.clearspring.analytics.util.ExternalizableUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;

@RunWith(PowerMockRunner.class)
public class ExternalizableUtilTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ExternalizableUtil actual = new ExternalizableUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ObjectOutputStream.class, Externalizable.class, ExternalizableUtil.class})
  @Test
  public void toBytesInputNotNullOutput00006c1d924483e89e08() throws Exception, IOException {

    // Arrange
    final Externalizable o = PowerMockito.mock(Externalizable.class);
    final ObjectOutputStream objectOutputStream = PowerMockito.mock(ObjectOutputStream.class);
    PowerMockito.whenNew(ObjectOutputStream.class)
        .withParameterTypes(OutputStream.class)
        .withArguments(or(isA(OutputStream.class), isNull(OutputStream.class)))
        .thenReturn(objectOutputStream);

    // Act
    final byte[] actual = ExternalizableUtil.toBytes(o);

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }
}
