package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GroupTree_headCountTest_2_Test {
//failed_compile   @Test
//  public void headCountTest() throws Exception {
//    // Arrange
//    GroupTree groupTree = new GroupTree();
//    TDigest.Group group = new TDigest.Group(1.0);
//
//    // Act
//    int actual = groupTree.headCount(group);
//
//    // Assert
//    Assert.assertEquals(0, actual);
//    String toStringResult = group.toString();
//    Iterable<Double> dataResult = group.data();
//    int idResult = group.id();
//    Assert.assertEquals("Group{centroid=1.0, count=1}", toStringResult);
//    Assert.assertEquals(1.0, group.mean());
//    Assert.assertEquals(4, idResult);
//    Assert.assertEquals(null, dataResult);
//    String toStringResult1 = groupTree.toString();
//    int sumResult = groupTree.sum();
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(0, groupTree.size());
//    Assert.assertEquals(0, sumResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
