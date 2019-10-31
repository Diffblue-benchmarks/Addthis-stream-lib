package com.clearspring.analytics.stream.cardinality;

import com.clearspring.analytics.stream.cardinality.AdaptiveCounting;
import com.clearspring.analytics.stream.cardinality.LogLog;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AdaptiveCounting_mergeEstimatorsTest_1_Test {
  @Test
  public void mergeEstimatorsTest() throws Exception {
    // Arrange
    LogLog logLog = new LogLog(1);
    LogLog logLog1 = new LogLog(1);
    LogLog logLog2 = new LogLog(1);
    LogLog[] logLogArray = new LogLog[]{logLog, logLog1, logLog2};

    // Act and Assert
    thrown.expect(ClassCastException.class);
    AdaptiveCounting.mergeEstimators(logLogArray);
    Assert.assertEquals(3, logLogArray.length);
    LogLog logLog3 = logLogArray[0];
    LogLog logLog4 = logLogArray[1];
    LogLog logLog5 = logLogArray[2];
    Assert.assertSame(logLog, logLog3);
    int sizeofResult = logLog3.sizeof();
    long cardinalityResult = logLog3.cardinality();
    String toStringResult = logLog3.toString();
    Assert.assertSame(logLog2, logLog5);
    byte[] bytes = logLog5.getBytes();
    int sizeofResult1 = logLog5.sizeof();
    long cardinalityResult1 = logLog5.cardinality();
    String toStringResult1 = logLog5.toString();
    Assert.assertSame(logLog1, logLog4);
    byte[] bytes1 = logLog4.getBytes();
    int sizeofResult2 = logLog4.sizeof();
    long cardinalityResult2 = logLog4.cardinality();
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull(logLog4.toString());
    Assert.assertEquals(0L, cardinalityResult2);
    Assert.assertEquals(2, sizeofResult2);
    Assert.assertEquals(2, bytes1.length);
    Assert.assertArrayEquals(new byte[]{0, 0}, bytes1);
    Assert.assertEquals(0L, cardinalityResult1);
    Assert.assertEquals(2, sizeofResult1);
    Assert.assertEquals(2, bytes.length);
    Assert.assertArrayEquals(new byte[]{0, 0}, bytes);
    Assert.assertEquals(0L, cardinalityResult);
    Assert.assertEquals(2, sizeofResult);
    Assert.assertNotNull(toStringResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
