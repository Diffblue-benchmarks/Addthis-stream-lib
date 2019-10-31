package com.clearspring.analytics.hash;

import com.clearspring.analytics.hash.Lookup3Hash;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Lookup3Hash_lookup3ycsTest_3_Test {
  @Test
  public void lookup3ycsTest() throws Exception {
    // Arrange
    String s = new String();
    int start = 1;
    int end = 1;
    int initval = 1;

    // Act
    int actual = Lookup3Hash.lookup3ycs(s, start, end, initval);

    // Assert
    Assert.assertEquals(-559038736, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
