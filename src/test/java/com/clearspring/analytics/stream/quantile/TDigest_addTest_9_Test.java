package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TDigest_addTest_9_Test {
//failed_compile   @Test
//  public void addTest() throws Exception {
//    // Arrange
//    TDigest tDigest = new TDigest(1.0);
//    TDigest tDigest1 = new TDigest(1.0);
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    tDigest.add(tDigest1);
//    String toStringResult = tDigest1.toString();
//    int sizeResult = tDigest1.size();
//    Iterable<TDigest.Group> centroidsResult = tDigest1.centroids();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(1.0, tDigest1.compression());
//    Assert.assertTrue(centroidsResult instanceof GroupTree);
//    Assert.assertEquals(0, sizeResult);
//    String toStringResult1 = ((GroupTree) centroidsResult).toString();
//    int sumResult = ((GroupTree) centroidsResult).sum();
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(0, ((GroupTree) centroidsResult).size());
//    Assert.assertEquals(0, sumResult);
//    String toStringResult2 = tDigest.toString();
//    int sizeResult1 = tDigest.size();
//    Iterable<TDigest.Group> centroidsResult1 = tDigest.centroids();
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertEquals(1.0, tDigest.compression());
//    Assert.assertTrue(centroidsResult1 instanceof GroupTree);
//    Assert.assertEquals(0, sizeResult1);
//    String toStringResult3 = ((GroupTree) centroidsResult1).toString();
//    int sumResult1 = ((GroupTree) centroidsResult1).sum();
//    Assert.assertNotNull(toStringResult3);
//    Assert.assertEquals(0, ((GroupTree) centroidsResult1).size());
//    Assert.assertEquals(0, sumResult1);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
