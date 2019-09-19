package com.clearspring.experimental.stream.cardinality;

import static org.mockito.Matchers.anyDouble;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.clearspring.analytics.stream.cardinality.CardinalityMergeException;
import com.clearspring.analytics.stream.cardinality.ICardinality;
import com.clearspring.experimental.stream.cardinality.HyperBitBit.HyperBitBitMergeException;
import com.clearspring.experimental.stream.cardinality.HyperBitBit;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.lang.reflect.Array;

@RunWith(PowerMockRunner.class)
public class HyperBitBitTest {

  // Test written by Diffblue Cover.
  @Test
  public void mergeInput0OutputHyperBitBitMergeException() throws CardinalityMergeException {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();
    final ICardinality[] estimators = {};

    // Act
    thrown.expect(HyperBitBit.HyperBitBitMergeException.class);
    hyperBitBit.merge(estimators);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final HyperBitBit.HyperBitBitMergeException actual =
        new HyperBitBit.HyperBitBitMergeException("foo");

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputZeroOutputUnsupportedOperationException() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act
    thrown.expect(UnsupportedOperationException.class);
    hyperBitBit.offerHashed(0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputZeroOutputFalse() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();
    hyperBitBit.sketch2 = 0L;
    hyperBitBit.lgN = 59;
    hyperBitBit.sketch = 0L;

    // Act and Assert result
    Assert.assertFalse(hyperBitBit.offerHashed(0L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputNegativeOutputFalse000f8877c05930f5d1a() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertFalse(hyperBitBit.offerHashed(-9_205_357_638_345_293_727L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputNegativeOutputFalse000b43fa152a46ba287() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertFalse(hyperBitBit.offerHashed(-4_593_671_619_917_905_823L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputPositiveOutputTrue001b8160c8f5d977e87() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offerHashed(285_982_974_384_537_697L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputPositiveOutputTrue2() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offerHashed(824_633_720_929L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputPositiveOutputTrue002e61d54d3eb4f2150() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offerHashed(8_521_215_115_361L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputPositiveOutputTrue4() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();
    hyperBitBit.sketch2 = 0L;
    hyperBitBit.lgN = 63;
    hyperBitBit.sketch = -12_003_024_285_691L;

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offerHashed(16_384L));

    // Assert side effects
    Assert.assertEquals(64, hyperBitBit.lgN);
    Assert.assertEquals(0L, hyperBitBit.sketch);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerHashedInputPositiveOutputTrue5() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();
    hyperBitBit.sketch2 = 0L;
    hyperBitBit.lgN = -2_147_483_553;
    hyperBitBit.sketch = -12_003_024_285_691L;

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offerHashed(70_368_744_194_048L));

    // Assert side effects
    Assert.assertEquals(-2_147_483_552, hyperBitBit.lgN);
    Assert.assertEquals(1L, hyperBitBit.sketch);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBytesOutput0() throws IOException {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act
    final byte[] actual = hyperBitBit.getBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HyperBitBit.class, Math.class})
  @Test
  public void cardinalityOutputPositive() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();
    hyperBitBit.sketch2 = 0L;
    hyperBitBit.lgN = 5;
    hyperBitBit.sketch = 0L;
    PowerMockito.when(Math.pow(anyDouble(), anyDouble())).thenReturn(32768.0);

    // Act
    final long actual = hyperBitBit.cardinality();

    // Assert result
    Assert.assertEquals(32_768L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeOutputTrue() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offer(-2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNegativeOutputTrue2() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offer(-2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullOutputFalse() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();
    hyperBitBit.sketch2 = 1L;
    hyperBitBit.lgN = 58;
    hyperBitBit.sketch = -4_611_686_018_360_279_041L;

    // Act and Assert result
    Assert.assertFalse(hyperBitBit.offer(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullOutputTrue() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();
    hyperBitBit.sketch2 = 0L;
    hyperBitBit.lgN = 57;
    hyperBitBit.sketch = 0L;

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offer(null));

    // Assert side effects
    Assert.assertEquals(1L, hyperBitBit.sketch);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullOutputTrue2() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();
    hyperBitBit.sketch2 = 0L;
    hyperBitBit.lgN = 25;
    hyperBitBit.sketch = 0L;

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offer(null));

    // Assert side effects
    Assert.assertEquals(1L, hyperBitBit.sketch2);
    Assert.assertEquals(1L, hyperBitBit.sketch);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputNullOutputTrue3() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();
    hyperBitBit.sketch2 = 23_060_287L;
    hyperBitBit.lgN = 58;
    hyperBitBit.sketch = -3_530_822_107_791_360_001L;

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offer(null));

    // Assert side effects
    Assert.assertEquals(0L, hyperBitBit.sketch2);
    Assert.assertEquals(59, hyperBitBit.lgN);
    Assert.assertEquals(23_060_287L, hyperBitBit.sketch);
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputFalse() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertFalse(hyperBitBit.offer(9));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputPositiveOutputTrue() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertTrue(hyperBitBit.offer(28));
  }

  // Test written by Diffblue Cover.
  @Test
  public void offerInputZeroOutputFalse000e0bf8561b812e883() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertFalse(hyperBitBit.offer(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeofOutputZero() {

    // Arrange
    final HyperBitBit hyperBitBit = new HyperBitBit();

    // Act and Assert result
    Assert.assertEquals(0, hyperBitBit.sizeof());
  }
}
