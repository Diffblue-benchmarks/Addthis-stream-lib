package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GroupTree_GroupTreeTest_1_Test {
  @Test
  public void GroupTreeTest() throws Exception {
    // Arrange and Act
    GroupTree groupTree = new GroupTree();

    // Assert
    String toStringResult = groupTree.toString();
    int sumResult = groupTree.sum();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, groupTree.size());
    Assert.assertEquals(0, sumResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
