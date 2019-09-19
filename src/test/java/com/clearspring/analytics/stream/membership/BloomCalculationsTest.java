package com.clearspring.analytics.stream.membership;

import static org.mockito.Matchers.anyDouble;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.clearspring.analytics.stream.membership.BloomCalculations.BloomSpecification;
import com.clearspring.analytics.stream.membership.BloomCalculations;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class BloomCalculationsTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final BloomCalculations actual = new BloomCalculations();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroZeroOutputNotNull() {

    // Act, creating object to test constructor
    final BloomCalculations.BloomSpecification actual =
        new BloomCalculations.BloomSpecification(0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.bucketsPerElement);
    Assert.assertEquals(0, actual.K);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BloomCalculations.class, Math.class})
  @Test
  public void getFalsePositiveProbabilityInputZeroZeroOutputZero() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Math.class);

    // Arrange
    final int bucketsPerElement = 0;
    final int hashCount = 0;
    PowerMockito.when(Math.pow(anyDouble(), anyDouble())).thenReturn(0.0);
    PowerMockito.when(Math.exp(anyDouble())).thenReturn(257.0);

    // Act
    final double actual =
        BloomCalculations.getFalsePositiveProbability(bucketsPerElement, hashCount);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }
}
