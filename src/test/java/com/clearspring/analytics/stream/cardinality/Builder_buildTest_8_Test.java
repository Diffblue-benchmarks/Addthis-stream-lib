package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Builder_buildTest_8_Test {
  @Test
  public void buildTest() throws Exception {
    // Arrange
    HyperLogLogPlus.Builder builder = new HyperLogLogPlus.Builder(1, 1);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    builder.build();
    int sizeofResult = builder.sizeof();
    Assert.assertEquals(0, sizeofResult);
    Assert.assertNotNull(builder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
