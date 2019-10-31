package com.clearspring.analytics.stream.frequency;

import com.clearspring.analytics.stream.frequency.CountMinSketch;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CountMinSketch_CountMinSketchTest_5_Test {
  @Test
  public void CountMinSketchTest() throws Exception {
    // Arrange
    double epsOfTotalCount = 1.0;
    double confidence = 1.0;
    int seed = 1;

    // Act and Assert
    thrown.expect(OutOfMemoryError.class);
    new CountMinSketch(epsOfTotalCount, confidence, seed);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
