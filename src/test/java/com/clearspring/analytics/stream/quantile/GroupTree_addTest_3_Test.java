package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GroupTree_addTest_3_Test {
//failed_compile   @Test
//  public void addTest() throws Exception {
//    // Arrange
//    GroupTree groupTree = new GroupTree();
//    TDigest.Group group = new TDigest.Group(1.0);
//
//    // Act
//    groupTree.add(group);
//
//    // Assert
//    String toStringResult = group.toString();
//    Iterable<Double> dataResult = group.data();
//    int idResult = group.id();
//    Assert.assertEquals("Group{centroid=1.0, count=1}", toStringResult);
//    Assert.assertEquals(1.0, group.mean());
//    Assert.assertEquals(10, idResult);
//    Assert.assertEquals(null, dataResult);
//    String toStringResult1 = groupTree.toString();
//    int sumResult = groupTree.sum();
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(1, groupTree.size());
//    Assert.assertEquals(1, sumResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
