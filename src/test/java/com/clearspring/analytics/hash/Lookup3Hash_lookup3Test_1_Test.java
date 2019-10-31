package com.clearspring.analytics.hash;

import com.clearspring.analytics.hash.Lookup3Hash;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Lookup3Hash_lookup3Test_1_Test {
  @Test
  public void lookup3Test() throws Exception {
    // Arrange
    int[] intArray = new int[]{1, 1, 1, 1, 1, 1, 1, 655361};
    int offset = 1;
    int length = 1;
    int initval = 1;

    // Act
    int actual = Lookup3Hash.lookup3(intArray, offset, length, initval);

    // Assert
    Assert.assertEquals(1995431821, actual);
    Assert.assertEquals(8, intArray.length);
    Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 655361}, intArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
