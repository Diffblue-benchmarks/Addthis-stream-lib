package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.AdaptiveCounting;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Builder_AdaptiveCounting$BuilderTest_4_Test {
  @Test
  public void AdaptiveCounting$BuilderTest() throws Exception {
    // Arrange and Act
    AdaptiveCounting.Builder builder = new AdaptiveCounting.Builder();

    // Assert
    int sizeofResult = builder.sizeof();
    Assert.assertEquals(65536, sizeofResult);
    Assert.assertNotNull(builder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
