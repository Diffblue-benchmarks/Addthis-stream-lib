package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.TDigest;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class TDigest_decodeTest_10_Test {
//failed_run   @Test
//  public void decodeTest() throws Exception {
//    // Arrange
//    ByteBuffer buf = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    int actual = TDigest.decode(buf);
//
//    // Assert
//    Assert.assertEquals(0, actual);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
