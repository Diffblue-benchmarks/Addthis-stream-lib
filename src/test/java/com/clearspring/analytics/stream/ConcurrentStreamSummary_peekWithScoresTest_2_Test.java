package com.clearspring.analytics.stream;

import com.clearspring.analytics.stream.ConcurrentStreamSummary;
import com.clearspring.analytics.stream.ScoredItem;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ConcurrentStreamSummary_peekWithScoresTest_2_Test {
  @Test
  public void peekWithScoresTest() throws Exception {
    // Arrange
    ConcurrentStreamSummary<Object> concurrentStreamSummary = new ConcurrentStreamSummary<Object>(1);
    int k = 1;

    // Act
    List<ScoredItem<Object>> actual = concurrentStreamSummary.peekWithScores(k);

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    Assert.assertEquals(0, actual.size());
    Assert.assertEquals("]", concurrentStreamSummary.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
