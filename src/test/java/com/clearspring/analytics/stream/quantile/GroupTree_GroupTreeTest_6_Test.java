package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GroupTree_GroupTreeTest_6_Test {
//failed_compile   @Test
//  public void GroupTreeTest() throws Exception {
//    // Arrange
//    TDigest.Group group = new TDigest.Group(1.0);
//
//    // Act
//    GroupTree groupTree = new GroupTree(group);
//
//    // Assert
//    String toStringResult = groupTree.toString();
//    int sumResult = groupTree.sum();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(1, groupTree.size());
//    Assert.assertEquals(1, sumResult);
//    String toStringResult1 = group.toString();
//    Iterable<Double> dataResult = group.data();
//    int idResult = group.id();
//    Assert.assertEquals("Group{centroid=1.0, count=1}", toStringResult1);
//    Assert.assertEquals(1.0, group.mean());
//    Assert.assertEquals(35, idResult);
//    Assert.assertEquals(null, dataResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
