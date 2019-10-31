package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StreamSummary;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamSummary_writeExternalTest_8_Test {
//failed_compile   @Test
//  public void writeExternalTest() throws Exception {
//    // Arrange
//    StreamSummary<Object> streamSummary = new StreamSummary<Object>();
//    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new ByteArrayOutputStream());
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    streamSummary.writeExternal(objectOutputStream);
//    String toStringResult = objectOutputStream.toString();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(2, objectOutputStream.getProtocolVersion());
//    Assert.assertEquals(0, streamSummary.getCapacity());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
