package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.TDigest;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Group_TDigest$GroupTest_1_Test {
//failed_compile   @Test
//  public void TDigest$GroupTest() throws Exception {
//    // Arrange
//    double x = 1.0;
//    int id = 1;
//    boolean record = true;
//
//    // Act
//    TDigest.Group group = new TDigest.Group(x, id, record);
//
//    // Assert
//    String toStringResult = group.toString();
//    Iterable<Double> dataResult = group.data();
//    int idResult = group.id();
//    Assert.assertEquals("Group{centroid=1.0, count=1}", toStringResult);
//    Assert.assertEquals(1.0, group.mean());
//    Assert.assertEquals(1, idResult);
//    Assert.assertTrue(dataResult instanceof ArrayList);
//    Assert.assertEquals(1, ((ArrayList<Double>) dataResult).size());
//    Assert.assertEquals(Double.valueOf(1.0), ((ArrayList<Double>) dataResult).get(0));
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
