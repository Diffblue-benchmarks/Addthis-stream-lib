package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TDigest_addTest_7_Test {
//failed_compile   @Test
//  public void addTest() throws Exception {
//    // Arrange
//    TDigest tDigest = new TDigest(1.0);
//    double x = 1.0;
//
//    // Act
//    tDigest.add(x);
//
//    // Assert
//    String toStringResult = tDigest.toString();
//    int sizeResult = tDigest.size();
//    Iterable<TDigest.Group> centroidsResult = tDigest.centroids();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(1.0, tDigest.compression());
//    Assert.assertTrue(centroidsResult instanceof GroupTree);
//    Assert.assertEquals(1, sizeResult);
//    String toStringResult1 = ((GroupTree) centroidsResult).toString();
//    int sumResult = ((GroupTree) centroidsResult).sum();
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(1, ((GroupTree) centroidsResult).size());
//    Assert.assertEquals(1, sumResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
