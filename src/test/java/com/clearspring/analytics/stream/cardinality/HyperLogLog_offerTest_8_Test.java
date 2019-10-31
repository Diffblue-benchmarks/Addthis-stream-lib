package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.HyperLogLog;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class HyperLogLog_offerTest_8_Test {
  @Test
  public void offerTest() throws Exception {
    // Arrange
    HyperLogLog hyperLogLog = new HyperLogLog(1.0);
    String o = "aaaaa";

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    hyperLogLog.offer(o);
    byte[] bytes = hyperLogLog.getBytes();
    int sizeofResult = hyperLogLog.sizeof();
    Assert.assertEquals(12, bytes.length);
    Assert.assertEquals((byte) 0, bytes[0]);
    Assert.assertEquals((byte) 0, bytes[1]);
    Assert.assertEquals((byte) 0, bytes[2]);
    Assert.assertEquals((byte) 0, bytes[9]);
    Assert.assertEquals((byte) 0, bytes[10]);
    Assert.assertEquals((byte) 0, bytes[11]);
    Assert.assertNotNull(hyperLogLog.toString());
    Assert.assertEquals(4, sizeofResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
