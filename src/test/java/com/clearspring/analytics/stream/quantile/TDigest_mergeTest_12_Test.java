package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TDigest_mergeTest_12_Test {
//failed_compile   @Test
//  public void mergeTest() throws Exception {
//    // Arrange
//    double compression = 1.0;
//    ArrayList<TDigest> arrayList = new ArrayList<TDigest>();
//    TDigest tDigest = new TDigest(1.0);
//    arrayList.add(tDigest);
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    TDigest.merge(compression, arrayList);
//    Assert.assertEquals(1, arrayList.size());
//    TDigest getResult = arrayList.get(0);
//    Assert.assertSame(tDigest, getResult);
//    String toStringResult = getResult.toString();
//    int sizeResult = getResult.size();
//    Iterable<TDigest.Group> centroidsResult = getResult.centroids();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(1.0, getResult.compression());
//    Assert.assertTrue(centroidsResult instanceof GroupTree);
//    Assert.assertEquals(0, sizeResult);
//    String toStringResult1 = ((GroupTree) centroidsResult).toString();
//    int sumResult = ((GroupTree) centroidsResult).sum();
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(0, ((GroupTree) centroidsResult).size());
//    Assert.assertEquals(0, sumResult);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
