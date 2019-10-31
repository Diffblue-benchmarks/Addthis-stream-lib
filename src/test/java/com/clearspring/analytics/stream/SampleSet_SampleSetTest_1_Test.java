package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.SampleSet;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SampleSet_SampleSetTest_1_Test {
  @Test
  public void SampleSetTest() throws Exception {
    // Arrange
    int capacity = 1;
    Random random = new Random();

    // Act
    SampleSet<Object> sampleSet = new SampleSet<Object>(capacity, random);

    // Assert
    String toStringResult = sampleSet.toString();
    Object peekResult = sampleSet.peek();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, sampleSet.size());
    Assert.assertEquals(null, peekResult);
    Assert.assertNotNull(random.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
