package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.StreamSummary;
import java.io.ObjectInputStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamSummary_readExternalTest_2_Test {
  @Test
  public void readExternalTest() throws Exception {
    // Arrange
    StreamSummary<Object> streamSummary = new StreamSummary<Object>();
    ObjectInputStream objectInputStream = (ObjectInputStream) null;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    streamSummary.readExternal(objectInputStream);
    Assert.assertEquals(null, objectInputStream);
    int capacity = streamSummary.getCapacity();
    Assert.assertEquals(0, capacity);
    Assert.assertEquals("[]", streamSummary.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
