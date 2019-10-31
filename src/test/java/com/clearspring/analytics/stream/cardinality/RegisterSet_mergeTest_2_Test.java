package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.RegisterSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RegisterSet_mergeTest_2_Test {
  @Test
  public void mergeTest() throws Exception {
    // Arrange
    RegisterSet registerSet = new RegisterSet(1);
    RegisterSet registerSet1 = new RegisterSet(1);

    // Act
    registerSet.merge(registerSet1);

    // Assert
    int[] bitsResult = registerSet1.bits();
    Assert.assertEquals(1, bitsResult.length);
    Assert.assertArrayEquals(new int[]{0}, bitsResult);
    Assert.assertEquals(1, registerSet1.size);
    Assert.assertEquals(1, registerSet1.count);
    Assert.assertNotNull(registerSet1.toString());
    int[] readOnlyBitsResult = registerSet.readOnlyBits();
    int[] bitsResult1 = registerSet.bits();
    Assert.assertEquals(1, readOnlyBitsResult.length);
    Assert.assertArrayEquals(new int[]{0}, readOnlyBitsResult);
    Assert.assertEquals(1, registerSet.size);
    Assert.assertEquals(1, registerSet.count);
    Assert.assertNotNull(registerSet.toString());
    Assert.assertEquals(1, bitsResult1.length);
    Assert.assertArrayEquals(new int[]{0}, bitsResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
