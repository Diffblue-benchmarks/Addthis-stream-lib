package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class GroupTree_GroupTreeTest_5_Test {
  @Test
  public void GroupTreeTest() throws Exception {
    // Arrange
    GroupTree groupTree = new GroupTree();
    GroupTree groupTree1 = new GroupTree();

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    new GroupTree(groupTree, groupTree1);
    String toStringResult = groupTree.toString();
    int sumResult = groupTree.sum();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, groupTree.size());
    Assert.assertEquals(0, sumResult);
    String toStringResult1 = groupTree1.toString();
    int sumResult1 = groupTree1.sum();
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(0, groupTree1.size());
    Assert.assertEquals(0, sumResult1);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
