package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TDigest_TDigestTest_4_Test {
//failed_compile   @Test
//  public void TDigestTest() throws Exception {
//    // Arrange
//    double compression = 1.0;
//    Random random = new Random();
//
//    // Act
//    TDigest tDigest = new TDigest(compression, random);
//
//    // Assert
//    int sizeResult = tDigest.size();
//    Iterable<TDigest.Group> centroidsResult = tDigest.centroids();
//    Assert.assertEquals(0, sizeResult);
//    Assert.assertEquals(1.0, tDigest.compression());
//    Assert.assertTrue(centroidsResult instanceof GroupTree);
//    String toStringResult = ((GroupTree) centroidsResult).toString();
//    int sumResult = ((GroupTree) centroidsResult).sum();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(0, ((GroupTree) centroidsResult).size());
//    Assert.assertEquals(0, sumResult);
//    Assert.assertNotNull(random.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
