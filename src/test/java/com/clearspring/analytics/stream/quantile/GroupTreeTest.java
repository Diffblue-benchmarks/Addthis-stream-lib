package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest.Group;
import com.clearspring.analytics.util.AbstractIterator;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(PowerMockRunner.class)
public class GroupTreeTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputIllegalStateException() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_073_741_820);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_644);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", -2_147_483_644);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group8);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    Reflector.setField(groupTree8, "right", null);
    final GroupTree groupTree9 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group9, "actualData", arrayList8);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group9);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(null);
    Reflector.setField(group10, "actualData", arrayList9);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group10);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList10 = new ArrayList<Double>();
    arrayList10.add(0.0);
    Reflector.setField(group11, "actualData", arrayList10);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group11);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "left", groupTree9);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.floor(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -1.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 2);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 2_013_265_919);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 5);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -2_147_483_648);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_073_741_824);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_073_741_821);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -2_136_406_585);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_073_741_828);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -2_030_298_576);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -1_073_741_822);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -1_627_389_970);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -671_088_641);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", -2_113_929_218);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 2_013_265_920);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1_073_741_824);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -721_420_289);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 184_293_744);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", -1_073_741_823);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "left", groupTree11);
    Reflector.setField(groupTree7, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -1.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 4097);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 2_013_265_919);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -2_147_483_646);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_073_741_824);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_073_741_821);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -2_136_406_585);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_073_741_828);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -2_147_483_646);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -1_073_741_824);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -2_147_483_647);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 2_147_483_647);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 2);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 2_147_483_647);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 1_409_286_145);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -2_147_483_648);
    Reflector.setField(groupTree10, "right", null);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 184_549_379);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1_073_741_826);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "left", groupTree11);
    Reflector.setField(groupTree7, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1p+29 /* -5.36871e+08 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -0x1p+29 /* -5.36871e+08 */);
    Reflector.setField(groupTree1, "leaf", group2);
    Reflector.setField(groupTree1, "depth", 2_013_265_919);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -65_537);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -2_103_433_300);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -2_147_483_646);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -1_051_716_705);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -2);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", -65_537);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -50_331_707);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -50_331_699);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", -1_073_741_824);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -1);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 1);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 2);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 2_147_483_647);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 262_145);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", -2_147_483_648);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 939_524_096);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    Reflector.setField(groupTree13, "leaf", null);
    Reflector.setField(groupTree13, "depth", 939_524_095);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(groupTree8, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1p+29 /* -5.36871e+08 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -1.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", -61_442);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_645);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -65_537);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -2_103_433_300);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -2_147_483_646);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -1_051_716_705);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -2);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", -65_537);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -50_331_707);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -50_331_699);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", -1_006_632_960);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -1);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", -61_441);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 2);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 2_080_374_784);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -32_767);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", -2_080_374_784);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 939_524_096);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 1);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    Reflector.setField(groupTree13, "leaf", null);
    Reflector.setField(groupTree13, "depth", 939_524_095);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(groupTree8, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -1.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -1.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 2_147_422_205);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_645);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -65_537);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -2_103_433_300);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -2_147_483_646);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -1_051_716_705);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -2);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", -65_537);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -1_073_741_883);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -1_073_741_875);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", -1_006_632_960);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 2_147_483_639);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 2_147_422_207);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 2_147_422_205);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 2_080_374_784);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -53_251);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", -53_250);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", -1);
    final GroupTree groupTree13 = new GroupTree();
    Reflector.setField(groupTree13, "leaf", null);
    Reflector.setField(groupTree13, "depth", -427_824_176);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 1);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    Reflector.setField(groupTree14, "leaf", null);
    Reflector.setField(groupTree14, "depth", 1_388_291_552);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -1.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.ffffffep+27 /* -2.68435e+08 */);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", -1);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", -1_611_453_954);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -35_092_773);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2_130_706_432);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -387_377_993);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 2_147_483_646);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", -1_612_076_801);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 2);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 536_869_375);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2_147_483_648);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 1);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 2_147_418_111);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 2_147_483_647);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -2_144_344_497);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 805_306_368);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -2_144_344_497);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1_879_048_193);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", -1_824_892_166);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 2_147_483_647);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    Reflector.setField(groupTree13, "leaf", null);
    Reflector.setField(groupTree13, "depth", -412_829_705);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 134_217_728);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1.ffffffep+27 /* -2.68435e+08 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 65536.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 3);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", -2_147_483_643);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -545_797_612);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 134_219_593);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -4352.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", -2_128_016_548);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -167);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 469_762_049);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 532_671_498);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1_073_741_823);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -486);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2_147_483_647);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree3, "right", groupTree4);
    final GroupTree groupTree7 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group3);
    Reflector.setField(groupTree7, "depth", -485);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 2_147_483_647);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 270_035_454);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 603_979_775);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", -103_351_809);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 541_065_216);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree7, "left", groupTree9);
    Reflector.setField(groupTree3, "left", groupTree7);
    Reflector.setField(groupTree, "left", groupTree3);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -4352.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException10() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -65536.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 3);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -4352.0);
    Reflector.setField(groupTree1, "leaf", group2);
    Reflector.setField(groupTree1, "depth", -1_212_186_113);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -1_213_218_306);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_073_741_825);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_048_576);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -1_547_847_748);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", -1_547_847_749);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 3);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -2_147_483_113);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2_126_512_125);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", -4352.0);
    Reflector.setField(groupTree7, "leaf", group3);
    Reflector.setField(groupTree7, "depth", -1_547_847_749);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -202_406_209);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", -1);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 589_399_039);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1_073_741_823);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -1_007_713_281);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 536_870_913);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -4352.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputVoid5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 1_073_741_824);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.00000008p+29 /* -5.36871e+08 */);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", -939_211_287);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1_073_741_825);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -1_996_626_453);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 3);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_878_982_651);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -2_147_483_648);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -939_203_095);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 1_510_625_275);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", -65_537);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -939_211_288);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 536_870_913);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 1_377_371_900);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 805_306_368);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 1_377_371_899);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1_879_048_192);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", -619_266_822);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 65_537);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree4, "left", groupTree8);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 1_073_741_824);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1.00000008p+29 /* -5.36871e+08 */);

    // Act
    groupTree.add(group);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputVoid6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 15);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", -33);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1_589_641_217);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 603_979_767);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_610_612_738);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 2_147_483_622);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", -34);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 20_971_521);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 20_971_527);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 1);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -865_337_345);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 2_147_483_647);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 270_172_158);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 553_648_127);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "left", groupTree8);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -65536.0);

    // Act
    groupTree.add(group);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputVoid7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -65536.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 3);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -4352.0);
    Reflector.setField(groupTree1, "leaf", group2);
    Reflector.setField(groupTree1, "depth", -211_943_425);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group3);
    Reflector.setField(groupTree2, "depth", -212_992_002);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -235_536_384);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_048_576);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -235_536_384);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 134_217_728);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", -235_536_385);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 3);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -2_147_483_113);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2_126_512_127);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", -131_072);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", -4352.0);
    Reflector.setField(groupTree7, "leaf", group5);
    Reflector.setField(groupTree7, "depth", -235_536_384);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -203_592_194);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 536_870_913);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1_073_741_823);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 1);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -1_610_612_735);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -4352.0);

    // Act
    groupTree.add(group);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputVoid8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -1.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 3);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 490_733_567);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 1_572_863_998);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 4088);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -235_536_384);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_048_576);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -235_536_384);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 2);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 1_572_863_997);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -2_147_483_625);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -4093);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 2_109_734_911);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 490_733_566);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 65_535);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 1_879_048_193);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1_073_741_823);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 490_733_567);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 1_073_741_833);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 671_088_640);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 2);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "right", groupTree11);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 671_088_639);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 135_200_768);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree10, "left", groupTree12);
    Reflector.setField(groupTree7, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -1.0);

    // Act
    groupTree.add(group);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputIllegalStateException() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_644);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_644);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group7, "actualData", arrayList5);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group8, "actualData", arrayList6);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group8);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group9, "actualData", arrayList7);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.ceiling(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputIllegalStateException2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_644);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_644);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", -2_147_483_647);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group7, "actualData", arrayList5);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group8, "actualData", arrayList6);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group8);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group9, "actualData", arrayList7);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.ceiling(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputIllegalStateException3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -24.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_648);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 3);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -2_147_483_648);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -1.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.ceiling(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputIllegalStateException4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_644);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_648);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 3);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -2_147_483_648);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -1.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 1.0);
    Reflector.setField(groupTree7, "leaf", group4);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 3);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group5);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.ceiling(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputIllegalStateException5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 1.0625);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", -2_147_483_648);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 2.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 2_147_467_264);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", Double.NaN);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree4, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", Double.NaN);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.ceiling(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputIllegalStateException6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1.90136fccffebcp-244 /* -5.5282e-74 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 3);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.90136fccffebdp+783 /* -7.9504e+235 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 3);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 2_147_221_504);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", -2_147_483_646);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", -1_835_008);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0x1.c00daff7bff47p+536 /* 3.93702e+161 */);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", -2_147_483_647);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2_147_483_647);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", -2_147_483_648);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", Double.NaN);
    Reflector.setField(groupTree7, "leaf", group5);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree8 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", Double.NaN);
    Reflector.setField(groupTree8, "leaf", group6);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 2);
    Reflector.setField(groupTree8, "right", null);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "left", groupTree9);
    Reflector.setField(groupTree4, "left", groupTree8);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.90136fccffebdp+780 /* -9.938e+234 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.ceiling(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_644);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_644);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group6, "actualData", arrayList4);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group7, "actualData", arrayList5);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree8 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group8, "actualData", arrayList6);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group8);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree6, "left", groupTree8);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 1.0625);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 2.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 2_147_467_264);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "left", groupTree4);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree2);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", Double.NaN);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNull4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_644);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_644);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group7, "actualData", arrayList5);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group8, "actualData", arrayList6);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group8);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group9, "actualData", arrayList7);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNull7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -24.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_648);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 3);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -2_147_483_648);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -1.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNull9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 1.0625);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", -2_147_483_648);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 2.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 2_147_467_264);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", Double.NaN);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree4, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", Double.NaN);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNullOutputIllegalStateException() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkBalanceOutputIllegalStateException() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", -1_073_741_824);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -2_147_483_648);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.checkBalance();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputVoid9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1_073_741_824);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.6p+29 /* 7.38198e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", -540_016_639);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 257);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1_073_741_825);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 2_144_899_487);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -369_098_754);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_575_223_297);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 33_292_288);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -1_575_223_297);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_074_003_968);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", -539_459_586);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group2, "actualData", arrayList);
    Reflector.setField(group2, "id", 1_073_741_824);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -97504.0);
    Reflector.setField(groupTree6, "leaf", group2);
    Reflector.setField(groupTree6, "depth", -1_375_731_713);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1_610_612_736);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -1_002_039_359);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", -2_147_483_645);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -369_098_753);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1_090_519_039);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", -539_983_873);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree7, "left", groupTree9);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -539_459_585);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -16_542_482);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 2_147_483_633);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "right", groupTree11);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 2_147_483_633);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 2_130_941_166);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree10, "left", groupTree12);
    Reflector.setField(groupTree6, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 1_073_741_824);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -97504.0);

    // Act
    groupTree.remove(base);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputIllegalStateException8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 869_738_113);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 2_097_153);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1p+28 /* -2.68435e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 2_143_239_583);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 3);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 234_881_023);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 704_643_073);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 704_643_074);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -2_147_483_648);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", -998_432_876);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 3);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -1_938_923_628);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 536_870_912);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 150_872_063);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 2_147_483_645);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 658_456_468);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1_455_587_333);
    Reflector.setField(groupTree8, "right", null);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 658_456_469);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", -2_130_889_965);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "left", groupTree9);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 658_456_468);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -66_874_130);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -914_337_675);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1_073_741_828);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "right", groupTree11);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", -1_535_094_667);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 2_130_941_166);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree10, "left", groupTree12);
    Reflector.setField(groupTree7, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputVoid8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 2_097_153);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1p+28 /* -2.68435e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 2_123_370_911);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 3);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -1_887_436_801);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 704_643_074);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -2_147_483_648);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -369_098_754);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 3);
    Reflector.setField(groupTree4, "right", null);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", -830_660_716);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 67_108_868);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "left", groupTree5);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 1_845_493_759);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 1_145_968_583);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1_073_741_828);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -369_098_753);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1_090_519_038);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 1_145_968_583);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree7, "left", groupTree9);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 1_145_968_583);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -16_542_482);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -1_711_277_260);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "right", groupTree11);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", -1_711_277_260);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 2_130_941_164);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree10, "left", groupTree12);
    Reflector.setField(groupTree6, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    groupTree.remove(base);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputIllegalStateException7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 524_288);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.a7ff5ep+29 /* 8.89187e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 1_591_783_763);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_777_217);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.a7ff4ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 2_144_810_143);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 5);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -855_638_017);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 704_643_073);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2_147_483_647);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 704_643_074);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 869_738_110);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 2);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -855_638_018);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 869_738_111);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 67_108_868);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 524_288);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree8, "leaf", group2);
    Reflector.setField(groupTree8, "depth", 517_865_472);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 2_080_374_785);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", -203_970_953);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", -691_896_318);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 869_738_111);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -117_205_778);
    Reflector.setField(groupTree10, "right", null);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -402_239_402);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 2_130_941_166);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "left", groupTree11);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 524_288);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputIllegalStateException6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 524_288);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.a7ff5ep+29 /* 8.89187e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 1_591_783_763);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_777_217);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.a7ff4ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 2_131_802_434);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 5);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 905_969_665);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 2);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 905_969_665);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -1_073_741_822);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 923_842_880);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 905_969_665);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -1_324_304_064);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 2);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 524_288);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree7, "leaf", group2);
    Reflector.setField(groupTree7, "depth", 503_447_552);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1_073_741_825);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -250_562_239);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", -691_896_317);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", -1_324_304_063);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", -66_874_130);
    Reflector.setField(groupTree9, "right", null);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -402_239_402);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 2_130_941_166);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "left", groupTree10);
    Reflector.setField(groupTree7, "left", groupTree9);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 524_288);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputIllegalStateException5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 524_288);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 786_493_697);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_777_217);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.a7ff4ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 1_591_783_890);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 536_870_913);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 1_591_783_762);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 381_813_509);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1_591_783_762);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -2_147_483_642);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 524_288);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 2_128_666_981);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 5);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 786_477_311);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", -1_073_709_823);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 1_591_783_761);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -66_874_130);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 524_288);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputIllegalStateException4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 786_493_697);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_777_217);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 786_493_696);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 536_870_913);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -17_575_937);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -1_497_234_683);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 786_493_696);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 1_782_815_069);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -2_147_483_646);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "left", groupTree4);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 786_493_695);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputIllegalStateException3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.bfffa38p+26 /* 1.1744e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 3);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 114631.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 1_849_821_442);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -1_943_356_319);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -422_444_283);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_389_709_208);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -1_107_525_632);
    Reflector.setField(groupTree3, "right", null);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 1_782_815_017);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -3);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "left", groupTree4);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -2_147_483_647);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0x1.bfffa38p+25 /* 5.87201e+07 */);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 1_073_741_823);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 33_783_811);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 1_782_815_018);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2_147_483_645);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -2_147_483_647);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 2_147_254_272);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree6, "left", groupTree8);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree9 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group3);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", -33_062_909);
    Reflector.setField(groupTree9, "right", null);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -2_147_483_648);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -32_772);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "left", groupTree10);
    Reflector.setField(groupTree5, "left", groupTree9);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 2);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.bfffa38p+25 /* 5.87201e+07 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputVoid7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 524_288);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.a7ff5ep+29 /* 8.89187e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 1_591_783_763);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_777_217);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.a7ff4ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 2_144_810_143);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 5);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -855_638_017);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 704_643_073);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2_147_483_647);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 704_643_074);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 869_738_110);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 2);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -855_638_018);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 536_870_912);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 869_738_111);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 67_108_868);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 524_288);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree8, "leaf", group2);
    Reflector.setField(groupTree8, "depth", 517_865_472);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 2_080_374_785);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", -203_970_953);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", -691_896_318);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 869_738_111);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -66_874_130);
    Reflector.setField(groupTree10, "right", null);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -402_239_402);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 2_130_941_166);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "left", groupTree11);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 524_288);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);

    // Act
    groupTree.remove(base);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputIllegalStateException2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputVoid6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 524_288);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 786_493_697);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_777_217);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.a7ff4ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 1_591_783_762);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 536_870_913);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 1_591_783_762);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 381_813_509);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1_591_783_762);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -2_147_483_642);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 524_288);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 2_128_666_981);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 5);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 786_477_311);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", -1_073_709_823);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 1_591_783_761);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -66_874_130);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 524_288);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.a7ff5ep+29 /* -8.89187e+08 */);

    // Act
    groupTree.remove(base);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  removeInputNotNullOutputIllegalStateException0005bb85751575295f8() throws Exception {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group base = new Group(0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException000cc7088b9f055210c() {

    // Arrange
    final GroupTree left = new GroupTree();
    final GroupTree right = new GroupTree();

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException2()
      throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", 3);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 2_147_350_527);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -2_147_483_648);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 2_147_350_528);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -939_657_217);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -410_990_593);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -2_021_603_329);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 134_217_728);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 864_438_271);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 990_547_968);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(left, "left", groupTree4);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 3);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", -2_147_350_527);
    Reflector.setField(right, "right", null);
    Reflector.setField(right, "left", null);

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException3()
      throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", 3);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_073_741_824);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -2_147_483_648);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 8191);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -410_990_593);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -2_021_603_329);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 268_435_456);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 864_438_271);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 990_547_968);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(left, "left", groupTree4);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 3);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", 1);
    Reflector.setField(right, "right", null);
    final GroupTree groupTree7 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group1);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group2);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 524_288);
    final GroupTree groupTree9 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group3);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group4);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(right, "left", groupTree7);

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException4()
      throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", 2_147_471_359);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_073_741_824);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -2_147_483_648);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 8191);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -410_990_593);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -2_021_603_329);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 268_435_456);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 864_438_271);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 990_547_968);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(left, "left", groupTree4);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 2_147_479_551);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", 1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -2_147_352_574);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", -524_288);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(right, "right", groupTree7);
    final GroupTree groupTree8 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group1);
    Reflector.setField(groupTree8, "depth", 131_072);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group2);
    Reflector.setField(groupTree9, "depth", 127);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 524_288);
    final GroupTree groupTree10 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group3);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group4);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group5);
    Reflector.setField(groupTree12, "depth", 2_147_471_359);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", -1_073_741_822);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(right, "left", groupTree8);

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException5()
      throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", -807_943_937);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_073_741_824);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -2_147_483_648);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 8191);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -410_990_593);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -2_021_603_329);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 268_435_456);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 864_438_271);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 990_547_968);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(left, "left", groupTree4);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 1_339_547_903);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", 1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -2_130_706_433);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 2_147_483_647);
    Reflector.setField(groupTree7, "right", null);
    final GroupTree groupTree8 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group1);
    Reflector.setField(groupTree8, "depth", -1_881_812_992);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group2);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "left", groupTree8);
    Reflector.setField(right, "right", groupTree7);
    final GroupTree groupTree10 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group3);
    Reflector.setField(groupTree10, "depth", -1_881_683_969);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    final GroupTree groupTree11 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group4);
    Reflector.setField(groupTree11, "depth", -2_130_706_433);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1);
    final GroupTree groupTree12 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group5);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group6);
    Reflector.setField(groupTree13, "depth", 1);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(groupTree10, "right", groupTree11);
    final GroupTree groupTree14 = new GroupTree();
    Reflector.setField(groupTree14, "leaf", null);
    Reflector.setField(groupTree14, "depth", -807_943_937);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 1);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree10, "left", groupTree14);
    Reflector.setField(right, "left", groupTree10);

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException6()
      throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", 579_272_703);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_073_741_824);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -2_147_483_648);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 8191);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 1);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -410_990_593);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -2_021_603_329);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 268_435_456);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 864_438_271);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 990_547_968);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(left, "left", groupTree4);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 1_653_071_871);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", 1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 822_083_583);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 2_147_483_647);
    Reflector.setField(groupTree7, "right", null);
    final GroupTree groupTree8 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group1);
    Reflector.setField(groupTree8, "depth", 42_270_720);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group2);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "left", groupTree8);
    Reflector.setField(right, "right", groupTree7);
    final GroupTree groupTree10 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group3);
    Reflector.setField(groupTree10, "depth", 579_272_702);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    final GroupTree groupTree11 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group4);
    Reflector.setField(groupTree11, "depth", -2_130_706_433);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1);
    final GroupTree groupTree12 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group5);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group6);
    Reflector.setField(groupTree13, "depth", 1);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(groupTree10, "right", groupTree11);
    final GroupTree groupTree14 = new GroupTree();
    Reflector.setField(groupTree14, "leaf", null);
    Reflector.setField(groupTree14, "depth", 1_630_339_071);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 1);
    Reflector.setField(groupTree14, "right", null);
    final GroupTree groupTree15 = new GroupTree();
    Reflector.setField(groupTree15, "leaf", null);
    Reflector.setField(groupTree15, "depth", 16_384);
    Reflector.setField(groupTree15, "count", 0);
    Reflector.setField(groupTree15, "size", 1_073_741_824);
    Reflector.setField(groupTree15, "right", null);
    Reflector.setField(groupTree15, "left", null);
    Reflector.setField(groupTree14, "left", groupTree15);
    Reflector.setField(groupTree10, "left", groupTree14);
    Reflector.setField(right, "left", groupTree10);

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException7()
      throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", 587_202_559);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_342_169_088);
    Reflector.setField(left, "right", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -2_021_603_329);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1_073_741_824);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 864_438_271);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 990_547_968);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 536_838_145);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "left", groupTree);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 1_677_647_871);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", -2_147_483_647);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_549_795_328);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2_147_483_647);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 851_967_998);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    final GroupTree groupTree5 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group1);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "right", groupTree4);
    final GroupTree groupTree6 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group2);
    Reflector.setField(groupTree6, "depth", 583_532_542);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    final GroupTree groupTree7 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group3);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree3, "left", groupTree6);
    Reflector.setField(right, "right", groupTree3);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 587_202_558);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 8192);
    final GroupTree groupTree9 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group4);
    Reflector.setField(groupTree9, "depth", -1_549_795_329);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    final GroupTree groupTree10 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group5);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group6);
    Reflector.setField(groupTree11, "depth", 1);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 587_202_559);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 1);
    Reflector.setField(groupTree12, "right", null);
    final GroupTree groupTree13 = new GroupTree();
    Reflector.setField(groupTree13, "leaf", null);
    Reflector.setField(groupTree13, "depth", 16_384);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 1_073_741_824);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "left", groupTree13);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(right, "left", groupTree8);

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException8()
      throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", -1_560_281_089);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_342_169_088);
    Reflector.setField(left, "right", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -2_021_603_329);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1_073_741_824);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 864_438_271);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 990_547_968);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 536_838_145);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "left", groupTree);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 1_677_647_871);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", -2_147_483_647);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_549_795_328);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2_147_483_647);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -805_306_368);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_073_742_848);
    final GroupTree groupTree5 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group1);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "right", groupTree4);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -805_306_369);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -1_073_741_823);
    final GroupTree groupTree7 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group2);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree3, "left", groupTree6);
    Reflector.setField(right, "right", groupTree3);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -1_560_281_089);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 8192);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(right, "left", groupTree8);

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException9()
      throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", -1_560_281_089);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", -805_314_560);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -1_732_245_249);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 536_903_679);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 1);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2_147_483_647);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -1_988_096_490);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 8192);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -1_719_661_505);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_342_160_896);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", -1_203_504_641);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 1);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -1_203_504_641);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", -1_610_620_928);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree4, "left", groupTree7);
    Reflector.setField(left, "left", groupTree4);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 2_147_483_647);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -1_610_612_742);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 132_120_577);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 268_435_456);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1_073_742_848);
    final GroupTree groupTree10 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group1);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(right, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -1_560_281_089);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 8192);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", -1_610_612_737);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 2_097_152);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    Reflector.setField(groupTree13, "leaf", null);
    Reflector.setField(groupTree13, "depth", -1_560_281_088);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 134_217_728);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(right, "left", groupTree11);

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputIllegalStateException10()
      throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", 2_147_483_647);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_342_169_088);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -1);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 536_903_679);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", -2_147_483_647);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2_147_483_647);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -1);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_342_169_088);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", -1_203_504_641);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", -2_147_483_647);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 1);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -1_203_504_641);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 536_862_720);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree4, "left", groupTree7);
    Reflector.setField(left, "left", groupTree4);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", -1);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -2_116_026_369);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 132_120_577);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 268_435_456);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1_073_742_848);
    final GroupTree groupTree10 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group1);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(right, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -1_585_446_913);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", -2_147_475_456);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 50_331_647);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 2_097_152);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    Reflector.setField(groupTree13, "leaf", null);
    Reflector.setField(groupTree13, "depth", -2_147_483_648);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 1_207_959_552);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(right, "left", groupTree11);

    // Act, creating object to test constructor
    thrown.expect(IllegalStateException.class);
    new GroupTree(left, right);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", -1_560_281_089);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_342_169_088);
    Reflector.setField(left, "right", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -2_021_603_329);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1_073_741_824);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 864_438_271);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 990_547_968);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 536_838_145);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "left", groupTree);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 1_677_647_871);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", -2_147_483_647);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_549_795_328);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2_147_483_647);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -805_306_368);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1024);
    final GroupTree groupTree5 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group1);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "right", groupTree4);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -805_306_369);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group2);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree3, "left", groupTree6);
    Reflector.setField(right, "right", groupTree3);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -1_560_281_089);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 8192);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(right, "left", groupTree8);

    // Act, creating object to test constructor
    final GroupTree actual = new GroupTree(left, right);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", -1_560_281_089);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", -805_314_560);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", -658_503_425);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 536_903_679);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 1);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2_147_483_647);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -1_988_096_490);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 8192);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -1_719_661_505);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_342_160_896);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 864_438_271);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 453_677_056);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -1_610_620_927);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(left, "left", groupTree4);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", -1);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", 1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -1_610_612_738);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 132_120_577);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 268_435_456);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1_073_742_848);
    final GroupTree groupTree9 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group1);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(right, "right", groupTree7);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -1_560_281_089);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 8192);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -1_610_612_737);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 2_097_152);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "right", groupTree11);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", -1_560_281_088);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 134_217_728);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree10, "left", groupTree12);
    Reflector.setField(right, "left", groupTree10);

    // Act, creating object to test constructor
    final GroupTree actual = new GroupTree(left, right);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", 2_147_483_647);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_342_169_088);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 1_244_659_711);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 536_903_679);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", -261_095_447);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2_013_262_847);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 2_147_483_644);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 2_013_265_920);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 2_120_473_087);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "left", groupTree4);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 2_120_473_087);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 536_862_720);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree2, "left", groupTree5);
    Reflector.setField(left, "left", groupTree2);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 1_244_659_712);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -2_116_026_369);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 132_120_577);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 268_435_456);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1_073_742_848);
    final GroupTree groupTree8 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group1);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(right, "right", groupTree6);
    Reflector.setField(right, "left", null);

    // Act, creating object to test constructor
    final GroupTree actual = new GroupTree(left, right);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final GroupTree left = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(left, "leaf", group);
    Reflector.setField(left, "depth", 2_147_483_647);
    Reflector.setField(left, "count", 0);
    Reflector.setField(left, "size", 1_342_169_088);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 1_916_796_927);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 536_903_679);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 188_743_679);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2_147_480_575);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -1_073_741_826);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1_610_612_736);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    Reflector.setField(left, "right", groupTree);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_073_741_825);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2_013_298_688);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 2_120_473_087);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "left", groupTree5);
    Reflector.setField(groupTree3, "right", groupTree4);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 2_120_473_087);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 536_862_720);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree3, "left", groupTree6);
    Reflector.setField(left, "left", groupTree3);
    final GroupTree right = new GroupTree();
    Reflector.setField(right, "leaf", null);
    Reflector.setField(right, "depth", 188_743_680);
    Reflector.setField(right, "count", 0);
    Reflector.setField(right, "size", 1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -2_116_026_369);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 132_120_577);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 268_435_456);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1_073_742_848);
    final GroupTree groupTree9 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group1);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(right, "right", groupTree7);
    Reflector.setField(right, "left", null);

    // Act, creating object to test constructor
    final GroupTree actual = new GroupTree(left, right);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputVoid5() throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0x1.8p+25 /* 5.03316e+07 */);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 1);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 3);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 5);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 3);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList3 = new ArrayList();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 3);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "right", groupTree4);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    final int depth = 0;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException00028a85bfc2a165b65() {

    // Arrange
    final GroupTree groupTree = new GroupTree();

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group3);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group4);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 4);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group3, "actualData", arrayList);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException8() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException003b1f545e06f1e17c6() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputIllegalStateException10() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.first();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputNotNull() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act
    final Group actual = groupTree.first();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputNull00096aaabb402c01e45() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.first());
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputNull2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act and Assert result
    Assert.assertNull(groupTree.first());
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputNull3() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 4);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.first());
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputNull4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 4);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act and Assert result
    Assert.assertNull(groupTree.first());
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputNull5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act and Assert result
    Assert.assertNull(groupTree.first());
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputNull6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 256);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act and Assert result
    Assert.assertNull(groupTree.first());
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputNull7() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act and Assert result
    Assert.assertNull(groupTree.first());
  }

  // Test written by Diffblue Cover.
  @Test
  public void firstOutputNull8() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);

    // Act and Assert result
    Assert.assertNull(groupTree.first());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -1.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 4097);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 2_013_265_919);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -2_147_483_646);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_073_741_824);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_073_741_821);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -2_136_406_585);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_073_741_828);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 2);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -1_073_741_824);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 1);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 2_147_483_647);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 2_013_265_920);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 2_147_483_646);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 1_409_286_145);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -2_147_483_648);
    Reflector.setField(groupTree10, "right", null);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 184_549_379);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1_073_741_826);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "left", groupTree11);
    Reflector.setField(groupTree7, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -1.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputIllegalStateException2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_073_741_820);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_644);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", -2_147_483_644);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group8);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 5);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group9, "actualData", arrayList8);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(0.0);
    Reflector.setField(group10, "actualData", arrayList9);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group10);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList10 = new ArrayList<Double>();
    arrayList10.add(0.0);
    Reflector.setField(group11, "actualData", arrayList10);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group11);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group12 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList11 = new ArrayList<Double>();
    arrayList11.add(null);
    Reflector.setField(group12, "actualData", arrayList11);
    Reflector.setField(group12, "id", 0);
    Reflector.setField(group12, "count", 0);
    Reflector.setField(group12, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group12);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group13 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList12 = new ArrayList<Double>();
    arrayList12.add(0.0);
    Reflector.setField(group13, "actualData", arrayList12);
    Reflector.setField(group13, "id", 0);
    Reflector.setField(group13, "count", 0);
    Reflector.setField(group13, "centroid", 0.0);
    Reflector.setField(groupTree14, "leaf", group13);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.floor(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputIllegalStateException3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_645);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 655362.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 33_554_433);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(null);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 3);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", -2_147_483_648);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", -524801.0);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    final GroupTree groupTree7 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group5);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group6);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree9 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group7);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree7, "left", groupTree9);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 2);
    Reflector.setField(groupTree10, "right", null);
    final GroupTree groupTree11 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group8);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "left", groupTree11);
    Reflector.setField(groupTree6, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 2);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 655362.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.floor(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputIllegalStateException4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_645);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 655362.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 33_554_433);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(null);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 3);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1_073_741_825);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", -2_147_483_648);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", -524801.0);
    Reflector.setField(groupTree7, "leaf", group4);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 4);
    final GroupTree groupTree8 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group5);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", -2_147_467_263);
    final GroupTree groupTree9 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group6);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group7);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 2);
    Reflector.setField(groupTree11, "right", null);
    final GroupTree groupTree12 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group8);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "left", groupTree12);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 2);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 655362.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.floor(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputIllegalStateException5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_645);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 655362.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 33_554_433);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(null);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 3);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1_073_741_825);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2_147_483_647);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", -2_147_483_648);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", -524801.0);
    Reflector.setField(groupTree7, "leaf", group4);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 4);
    final GroupTree groupTree8 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group5);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", -2_147_467_263);
    final GroupTree groupTree9 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group6);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group7);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 2);
    Reflector.setField(groupTree11, "right", null);
    final GroupTree groupTree12 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group8);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "left", groupTree12);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 2);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 655362.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.floor(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputIllegalStateException6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 3);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 114687.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 33_554_433);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(null);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 3);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1_073_741_825);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2_147_483_647);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", -2_147_483_648);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", -128.0);
    Reflector.setField(groupTree7, "leaf", group4);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 4);
    final GroupTree groupTree8 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 2_147_483_647);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 114687.0);
    Reflector.setField(groupTree8, "leaf", group5);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group6);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group7);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 2);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", -2_147_483_647);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group8);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 114687.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.floor(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputIllegalStateException7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 2_130_706_432);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", Double.NaN);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", Double.NaN);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 5);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", Double.NaN);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", Double.NaN);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(group7, "actualData", arrayList);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", Double.NaN);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group8, "actualData", null);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", Double.NaN);
    Reflector.setField(groupTree9, "leaf", group8);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group9, "actualData", null);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", -0x1.9000000000199p+1010 /* -1.71441e+304 */);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree4, "left", groupTree8);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", -2_147_483_648);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.9000000000399p+1010 /* -1.71441e+304 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.floor(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputIllegalStateException8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 2_130_706_432);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", Double.NaN);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_647);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 2_130_706_432);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", Double.NaN);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", Double.NaN);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 5);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", Double.NaN);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 5);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", Double.NaN);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree6, "left", groupTree8);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree9 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(group8, "actualData", arrayList);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", Double.NaN);
    Reflector.setField(groupTree9, "leaf", group8);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group9, "actualData", null);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", Double.NaN);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group10, "actualData", null);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", -0x1.9000000000199p+882 /* -5.03821e+265 */);
    Reflector.setField(groupTree11, "leaf", group10);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree5, "left", groupTree9);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", -2_147_483_648);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.9000000000399p+882 /* -5.03821e+265 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.floor(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputIllegalStateException9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 2_130_706_432);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", Double.NaN);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_647);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -1_073_741_824);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", -2_147_483_648);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1_073_741_825);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", Double.NaN);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", -2_147_483_648);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 1.5);
    Reflector.setField(groupTree7, "leaf", group5);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 17);
    final GroupTree groupTree8 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", Double.NaN);
    Reflector.setField(groupTree8, "leaf", group6);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 5);
    final GroupTree groupTree9 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", -2_147_483_648);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", Double.NaN);
    Reflector.setField(groupTree9, "leaf", group7);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group8, "actualData", null);
    Reflector.setField(group8, "id", -2_147_483_648);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", Double.NaN);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(group9, "actualData", arrayList);
    Reflector.setField(group9, "id", -1_073_741_824);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", Double.NaN);
    Reflector.setField(groupTree11, "leaf", group9);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1);
    Reflector.setField(groupTree11, "right", null);
    final GroupTree groupTree12 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group10, "actualData", null);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0x1.fddbfd63f5eb9p+979 /* 1.0176e+295 */);
    Reflector.setField(groupTree12, "leaf", group10);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 3);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "left", groupTree12);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.ffdbfd63f5e3bp+851 /* 3.00218e+256 */);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.floor(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 2_130_706_432);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", Double.NaN);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_647);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 2_130_706_432);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", Double.NaN);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", Double.NaN);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", Double.NaN);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 5);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", Double.NaN);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree6, "left", groupTree8);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree9 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(group8, "actualData", arrayList);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", Double.NaN);
    Reflector.setField(groupTree9, "leaf", group8);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group9, "actualData", null);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", Double.NaN);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group10, "actualData", null);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", -0x1.9000000000199p+882 /* -5.03821e+265 */);
    Reflector.setField(groupTree11, "leaf", group10);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree5, "left", groupTree9);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", -2_147_483_648);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.9000000000399p+882 /* -5.03821e+265 */);

    // Act
    final Group actual = groupTree.floor(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -16_777_216);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", Double.NaN);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_647);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -16_777_216);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -2_147_483_648);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", -1_073_741_824);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", -2_147_483_648);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", Double.NaN);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1_073_741_825);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", -2_147_483_648);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", Double.NaN);
    Reflector.setField(groupTree7, "leaf", group5);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", -2_147_483_648);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", Double.NaN);
    Reflector.setField(groupTree8, "leaf", group6);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 5);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", -2_147_483_648);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", Double.NaN);
    Reflector.setField(groupTree10, "leaf", group7);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(group8, "actualData", arrayList);
    Reflector.setField(group8, "id", -2_147_483_648);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", Double.NaN);
    Reflector.setField(groupTree11, "leaf", group8);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 1);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group9, "actualData", null);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", -0x1.9000000000199p+882 /* -5.03821e+265 */);
    Reflector.setField(groupTree13, "leaf", group9);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 1);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.9000000000399p+882 /* -5.03821e+265 */);

    // Act
    final Group actual = groupTree.floor(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNotNull7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -16_777_216);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", Double.NaN);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_647);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -16_777_216);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -2_147_483_648);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", -1_073_741_824);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", -2_147_483_648);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", Double.NaN);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1_073_741_825);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", Double.NaN);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", -2_147_483_648);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", Double.NaN);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", -2_147_483_648);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", Double.NaN);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 5);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group8, "actualData", null);
    Reflector.setField(group8, "id", -2_147_483_648);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", Double.NaN);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(group9, "actualData", arrayList);
    Reflector.setField(group9, "id", -2_147_483_648);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", Double.NaN);
    Reflector.setField(groupTree11, "leaf", group9);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 1);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group10, "actualData", null);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", -0x1.9000000000199p+882 /* -5.03821e+265 */);
    Reflector.setField(groupTree13, "leaf", group10);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 1);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.9000000000399p+882 /* -5.03821e+265 */);

    // Act
    final Group actual = groupTree.floor(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputVoid5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_777_217);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 114631.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 786_493_696);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 262_144);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -17_575_937);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -423_492_859);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 786_493_696);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 1_782_815_069);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_627_389_953);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "left", groupTree4);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 786_493_695);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);

    // Act
    groupTree.remove(base);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNull4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_073_741_820);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_644);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group9, "actualData", arrayList8);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group9);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(0.0);
    Reflector.setField(group10, "actualData", arrayList9);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group10);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList10 = new ArrayList<Double>();
    arrayList10.add(null);
    Reflector.setField(group11, "actualData", arrayList10);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group11);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group12 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList11 = new ArrayList<Double>();
    arrayList11.add(0.0);
    Reflector.setField(group12, "actualData", arrayList11);
    Reflector.setField(group12, "id", 0);
    Reflector.setField(group12, "count", 0);
    Reflector.setField(group12, "centroid", 0.0);
    Reflector.setField(groupTree14, "leaf", group12);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNull5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_073_741_820);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_644);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 5);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group9, "actualData", arrayList8);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group9);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(0.0);
    Reflector.setField(group10, "actualData", arrayList9);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group10);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList10 = new ArrayList<Double>();
    arrayList10.add(null);
    Reflector.setField(group11, "actualData", arrayList10);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group11);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group12 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList11 = new ArrayList<Double>();
    arrayList11.add(0.0);
    Reflector.setField(group12, "actualData", arrayList11);
    Reflector.setField(group12, "id", 0);
    Reflector.setField(group12, "count", 0);
    Reflector.setField(group12, "centroid", 0.0);
    Reflector.setField(groupTree14, "leaf", group12);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNull7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 3);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 655362.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 33_554_433);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -524801.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_647);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 2);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 655362.0);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputIllegalStateException2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -1.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 2);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 2_013_265_919);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 5);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -2_147_483_648);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_073_741_824);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_073_741_821);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -2_136_406_585);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_073_741_828);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -2_030_298_576);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -1_073_741_822);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -1_627_389_970);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -671_088_641);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", -2_113_929_218);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 2_013_265_920);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 2_147_483_646);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -721_420_289);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 184_293_744);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", -1_073_741_823);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "left", groupTree11);
    Reflector.setField(groupTree7, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -1.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.add(group);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_777_217);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 114631.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 786_493_696);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 262_144);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -17_575_937);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -423_492_859);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 786_493_696);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 786_493_695);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.c3ffa28p+25 /* 5.92444e+07 */);

    // Act
    groupTree.remove(base);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.bfe7fb8p+26 /* 1.17416e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 3);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 114631.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -422_444_283);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -1_107_525_632);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -2_113_699_837);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.bfe7fb8p+25 /* 5.8708e+07 */);

    // Act
    groupTree.remove(base);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1.bfe7fb8p+26 /* -1.17416e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -422_444_283);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -33_783_808);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 33_783_811);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree, "left", groupTree4);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.bfe7fb8p+26 /* -1.17416e+08 */);

    // Act
    groupTree.remove(base);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 3);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -2_147_483_645);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    groupTree.remove(base);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputVoid4() throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = 0;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputVoid3() throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = 0;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException000b5c967d2df65fd99() {

    // Arrange
    final GroupTree groupTree = new GroupTree();

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 17);
    final GroupTree groupTree1 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group5, "actualData", arrayList5);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group6, "actualData", arrayList6);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 17);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException5() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1_073_741_825);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1_073_741_825);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -2_147_483_647);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    final GroupTree groupTree5 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group1);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group2);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 8193);
    final GroupTree groupTree1 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -1_610_612_735);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", -2_147_483_647);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group2, "actualData", arrayList);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException8() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 33_554_433);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1_073_741_824);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 268_435_457);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException9() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputIllegalStateException10() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 2);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.last();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputNotNull() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 17);
    final GroupTree groupTree1 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group5, "actualData", arrayList5);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group6, "actualData", arrayList6);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act
    final Group actual = groupTree.last();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputNull000ca922b36b7fa265e() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.last());
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputNull2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1_073_741_825);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.last());
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputNull3() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1_073_741_825);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.last());
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputNull4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1_073_741_825);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.last());
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputNull5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 8193);
    final GroupTree groupTree1 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 33);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 3);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group2, "actualData", arrayList);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.last());
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputNull6() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 33_554_433);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1_073_741_824);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 268_435_457);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.last());
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputNull7() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.last());
  }

  // Test written by Diffblue Cover.
  @Test
  public void lastOutputNull8() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 2);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.last());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputNegativeOutputIllegalStateException()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree4, "right", groupTree5);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree, "left", groupTree4);
    final int depth = -2_147_221_505;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputNegativeOutputIllegalStateException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList3 = new ArrayList();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", -2_147_483_648);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree, "left", groupTree4);
    final int depth = -2_147_221_505;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputNegativeOutputIllegalStateException3()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = -8_387_842;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputNegativeOutputIllegalStateException4()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group2, "actualData", arrayList);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group3, "actualData", arrayList1);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = -8_387_842;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputNegativeOutputIllegalStateException5()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 2);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0x1.8p+25 /* 5.03316e+07 */);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 1);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group3);
    Reflector.setField(groupTree6, "depth", 1);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList3 = new ArrayList();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 3);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group4);
    Reflector.setField(groupTree7, "depth", 5);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList4 = new ArrayList();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 3);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group5);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList5 = new ArrayList();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 3);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group6);
    Reflector.setField(groupTree9, "depth", 1);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree10 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group7);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree7, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree7);
    final int depth = -2_147_483_639;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputNegativeOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 4);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList3 = new ArrayList();
    arrayList3.add(0x1.f01801p+24 /* 3.2512e+07 */);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", -2_147_483_644);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree3, "right", groupTree4);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree, "left", groupTree3);
    final int depth = -2_147_221_505;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputNegativeOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 4);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree, "left", groupTree3);
    final int depth = -2_147_221_505;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputNegativeOutputVoid3() throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = -8_387_842;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputNegativeOutputVoid4() throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = -8_387_842;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputPositiveOutputIllegalStateException()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group2, "actualData", arrayList);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group3, "actualData", arrayList1);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group4, "actualData", arrayList2);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 1);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = 1;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputPositiveOutputIllegalStateException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group2, "actualData", arrayList);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group3, "actualData", arrayList1);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group4, "actualData", arrayList2);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 1);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList3 = new ArrayList();
    arrayList3.add(0.0);
    Reflector.setField(group5, "actualData", arrayList3);
    Reflector.setField(group5, "id", 8);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group5);
    Reflector.setField(groupTree7, "depth", 1);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList4 = new ArrayList();
    arrayList4.add(0.0);
    Reflector.setField(group6, "actualData", arrayList4);
    Reflector.setField(group6, "id", 7);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group6);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList5 = new ArrayList();
    arrayList5.add(0.0);
    Reflector.setField(group7, "actualData", arrayList5);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group7);
    Reflector.setField(groupTree9, "depth", 1);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList6 = new ArrayList();
    arrayList6.add(null);
    Reflector.setField(group8, "actualData", arrayList6);
    Reflector.setField(group8, "id", 7);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 1);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 1);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList7 = new ArrayList();
    arrayList7.add(0.0);
    Reflector.setField(group9, "actualData", arrayList7);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group9);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    final GroupTree groupTree12 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList8 = new ArrayList();
    arrayList8.add(0.0);
    Reflector.setField(group10, "actualData", arrayList8);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group10);
    Reflector.setField(groupTree12, "depth", 1);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 1);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "right", groupTree12);
    final GroupTree groupTree13 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList9 = new ArrayList();
    arrayList9.add(0.0);
    Reflector.setField(group11, "actualData", arrayList9);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group11);
    Reflector.setField(groupTree13, "depth", 1);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree11, "left", groupTree13);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final int depth = 1;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputPositiveOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group2, "actualData", arrayList);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group2);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group3, "actualData", arrayList1);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group4, "actualData", arrayList2);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 1);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = 1;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputIllegalStateException()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = 0;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputIllegalStateException2()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    final GroupTree groupTree4 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(6145.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group1);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "right", groupTree4);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree3, "left", groupTree5);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = 0;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputIllegalStateException3()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "left", groupTree3);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(6145.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group3);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 1);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 1);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree, "left", groupTree7);
    final int depth = 0;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputIllegalStateException4()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 3);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group2, "actualData", arrayList);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 1);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group3, "actualData", arrayList1);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group4, "actualData", arrayList2);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList3 = new ArrayList();
    arrayList3.add(0.0);
    Reflector.setField(group5, "actualData", arrayList3);
    Reflector.setField(group5, "id", 7);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList4 = new ArrayList();
    arrayList4.add(0.0);
    Reflector.setField(group6, "actualData", arrayList4);
    Reflector.setField(group6, "id", 7);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList5 = new ArrayList();
    arrayList5.add(0.0);
    Reflector.setField(group7, "actualData", arrayList5);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 1);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree8 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList6 = new ArrayList();
    arrayList6.add(0.0);
    Reflector.setField(group8, "actualData", arrayList6);
    Reflector.setField(group8, "id", 7);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group8);
    Reflector.setField(groupTree8, "depth", 1);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree6, "left", groupTree8);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree9 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList7 = new ArrayList();
    arrayList7.add(0.0);
    Reflector.setField(group9, "actualData", arrayList7);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group9);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList8 = new ArrayList();
    arrayList8.add(0.0);
    Reflector.setField(group10, "actualData", arrayList8);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group10);
    Reflector.setField(groupTree10, "depth", 1);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 1);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList9 = new ArrayList();
    arrayList9.add(0.0);
    Reflector.setField(group11, "actualData", arrayList9);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group11);
    Reflector.setField(groupTree11, "depth", 1);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree5, "left", groupTree9);
    Reflector.setField(groupTree, "left", groupTree5);
    final int depth = 0;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputIllegalStateException5()
      throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0.0);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 7);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 5);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 7);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList2 = new ArrayList();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 1);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList3 = new ArrayList();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 7);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 1);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList4 = new ArrayList();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList5 = new ArrayList();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 1);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList arrayList6 = new ArrayList();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 1);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);
    final int depth = 0;

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.print(depth);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group1);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final int depth = 0;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeInputNotNullOutputIllegalStateException9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 1_073_741_824);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", -540_016_639);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 257);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1_073_741_825);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 2_144_899_487);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 2);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", -369_098_754);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_656_455_276);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_107_034_112);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", -1_636_606_060);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1_074_003_968);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", -539_459_586);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 1_845_493_759);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 536_870_912);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", -1_002_039_359);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 3);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -369_098_753);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1_090_519_039);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", -539_983_873);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree7, "left", groupTree9);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -539_459_585);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", -16_542_482);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 2_147_483_633);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree10, "right", groupTree11);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 2_147_483_633);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 2_130_941_166);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree10, "left", groupTree12);
    Reflector.setField(groupTree6, "left", groupTree10);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 1_073_741_824);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    groupTree.remove(base);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.GroupTree$1"})
  @Test
  public void iteratorOutputNotNull2()
      throws Exception, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

    // Arrange
    final Iterable groupTree2 =
        (Iterable)Reflector.getInstance("com.clearspring.analytics.stream.quantile.GroupTree$2");
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -2_147_483_648);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree, "left", groupTree5);
    Reflector.setField(groupTree2, "this$0", groupTree);
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree2, "val$start", group3);
    final ArrayDeque arrayDeque = PowerMockito.mock(ArrayDeque.class);
    PowerMockito.whenNew(ArrayDeque.class).withNoArguments().thenReturn(arrayDeque);

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$2");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("iterator");
    methodUnderTest.setAccessible(true);
    final Iterator<Group> actual = (Iterator<Group>)methodUnderTest.invoke(groupTree2);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.GroupTree$1"})
  @Test
  public void constructorInputNotNullNotNullOutputVoid()
      throws Exception, NoSuchMethodException, IllegalAccessException, InstantiationException,
             InvocationTargetException {

    // Arrange
    final GroupTree this$0 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(this$0, "leaf", group);
    Reflector.setField(this$0, "depth", 0);
    Reflector.setField(this$0, "count", 0);
    Reflector.setField(this$0, "size", 0);
    Reflector.setField(this$0, "right", null);
    Reflector.setField(this$0, "left", null);
    final Group arg2a =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(arg2a, "actualData", null);
    Reflector.setField(arg2a, "id", -2_147_483_648);
    Reflector.setField(arg2a, "count", 0);
    Reflector.setField(arg2a, "centroid", 0.0);
    final ArrayDeque arrayDeque = PowerMockito.mock(ArrayDeque.class);
    PowerMockito.whenNew(ArrayDeque.class).withNoArguments().thenReturn(arrayDeque);

    // Act, creating object to test constructor
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Constructor<?> ctor = classUnderTest.getDeclaredConstructor(
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree"),
        Reflector.forName("com.clearspring.analytics.stream.quantile.TDigest$Group"));
    ctor.setAccessible(true);
    final AbstractIterator actual = (AbstractIterator)ctor.newInstance(this$0, arg2a);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.GroupTree$1"})
  @Test
  public void iteratorOutputNotNull()
      throws Exception, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

    // Arrange
    final Iterable groupTree2 =
        (Iterable)Reflector.getInstance("com.clearspring.analytics.stream.quantile.GroupTree$2");
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 2);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree, "left", groupTree3);
    Reflector.setField(groupTree2, "this$0", groupTree);
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree2, "val$start", group3);
    final ArrayDeque arrayDeque = PowerMockito.mock(ArrayDeque.class);
    PowerMockito.whenNew(ArrayDeque.class).withNoArguments().thenReturn(arrayDeque);

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$2");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("iterator");
    methodUnderTest.setAccessible(true);
    final Iterator<Group> actual = (Iterator<Group>)methodUnderTest.invoke(groupTree2);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull8() throws InvocationTargetException, InvocationTargetException,
                                              IllegalAccessException, NoSuchMethodException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    Reflector.setField(groupTree1, "val$start", null);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    linkedList.add(groupTree);
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(groupTree1, "currentState", stateInstance);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree1, "next", group);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull6() throws InvocationTargetException, InvocationTargetException,
                                              IllegalAccessException, NoSuchMethodException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_610_612_736);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -38688.0);
    Reflector.setField(groupTree1, "val$start", group);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 1_610_612_736);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.024008p+21 /* -2.11558e+06 */);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 1_610_612_736);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -38688.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 1_610_612_736);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", -0x1.14p+22 /* -4.52198e+06 */);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree, "left", groupTree3);
    linkedList.add(groupTree);
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(groupTree1, "currentState", stateInstance);
    Reflector.setField(groupTree1, "next", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull10() throws InvocationTargetException, InvocationTargetException,
                                               IllegalAccessException, NoSuchMethodException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    Reflector.setField(groupTree1, "val$start", null);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    linkedList.add(groupTree);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    linkedList.add(groupTree2);
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(groupTree1, "currentState", stateInstance);
    Reflector.setField(groupTree1, "next", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull4() throws InvocationTargetException, InvocationTargetException,
                                              IllegalAccessException, NoSuchMethodException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_610_612_736);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -404609.0);
    Reflector.setField(groupTree1, "val$start", group);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 536_870_912);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -404481.0);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 536_870_912);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -404609.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree, "left", groupTree3);
    linkedList.add(groupTree);
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(groupTree1, "currentState", stateInstance);
    Reflector.setField(groupTree1, "next", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull3() throws InvocationTargetException, InvocationTargetException,
                                              IllegalAccessException, NoSuchMethodException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_610_612_736);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree1, "val$start", group);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    linkedList.add(groupTree);
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(groupTree1, "currentState", stateInstance);
    Reflector.setField(groupTree1, "next", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull001c0da4e6828b1b5d4()
      throws InvocationTargetException, InvocationTargetException, IllegalAccessException,
             NoSuchMethodException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    Reflector.setField(groupTree1, "val$start", null);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    linkedList.add(groupTree);
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(groupTree1, "currentState", stateInstance);
    Reflector.setField(groupTree1, "next", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNotNull()
      throws InvocationTargetException, InvocationTargetException, IllegalAccessException,
             NoSuchMethodException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_610_612_736);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -38688.0);
    Reflector.setField(groupTree1, "val$start", group);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 1_610_612_736);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.024008p+21 /* -2.11558e+06 */);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 1_610_612_736);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -38688.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 1_610_612_736);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", -0x1.14p+22 /* -4.52198e+06 */);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree, "left", groupTree3);
    linkedList.add(groupTree);
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(groupTree1, "currentState", stateInstance);
    Reflector.setField(groupTree1, "next", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull5() throws InvocationTargetException, InvocationTargetException,
                                              IllegalAccessException, NoSuchMethodException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_610_612_736);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1.14p+22 /* -4.52198e+06 */);
    Reflector.setField(groupTree1, "val$start", group);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 536_870_912);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0x1.000008p+21 /* 2.09715e+06 */);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 1_610_612_736);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -0x1.14p+22 /* -4.52198e+06 */);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    linkedList.add(groupTree);
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(groupTree1, "currentState", stateInstance);
    Reflector.setField(groupTree1, "next", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero10() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x0.0000000000001p-1022 /* 4.94066e-324 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero11() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x0.0000000000001p-1022 /* -4.94066e-324 */);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  tailSetInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group start = new Group(0.0);

    // Act
    final Iterable<Group> actual = groupTree.tailSet(start);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  headSumInputNotNullOutputZero0003a6a675d680878a1() throws Exception {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group base = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_644);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_644);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", -2_147_483_647);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 2_147_483_634);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group7, "actualData", arrayList5);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group8, "actualData", arrayList6);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group8);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group9, "actualData", arrayList7);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero001f8f8062218f641ef() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(-0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(group5, "actualData", arrayList5);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group6, "actualData", arrayList6);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_145_386_495);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group5, "actualData", arrayList5);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group6, "actualData", arrayList6);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group7, "actualData", arrayList7);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group7);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group8, "actualData", arrayList8);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(0.0);
    Reflector.setField(group9, "actualData", arrayList9);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group9);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList10 = new ArrayList<Double>();
    arrayList10.add(0.0);
    Reflector.setField(group10, "actualData", arrayList10);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group10);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList11 = new ArrayList<Double>();
    arrayList11.add(-0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(group11, "actualData", arrayList11);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group11);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group12 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList12 = new ArrayList<Double>();
    arrayList12.add(0.0);
    Reflector.setField(group12, "actualData", arrayList12);
    Reflector.setField(group12, "id", 0);
    Reflector.setField(group12, "count", 0);
    Reflector.setField(group12, "centroid", 0.0);
    Reflector.setField(groupTree14, "leaf", group12);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 2_097_153);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -3.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_648);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 268_435_456);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree6, "left", groupTree8);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -3.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group5, "actualData", arrayList5);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group6, "actualData", arrayList6);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group7, "actualData", arrayList7);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "right", groupTree4);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree3, "left", groupTree5);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group5, "actualData", arrayList5);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group6, "actualData", arrayList6);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group7, "actualData", arrayList7);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree6, "left", groupTree8);
    Reflector.setField(groupTree2, "left", groupTree6);
    Reflector.setField(groupTree, "left", groupTree2);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero001f53d150da20aa997() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero11() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_384);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero12() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_384);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero13() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 16_384);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -2_147_483_648);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree1, "left", groupTree3);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero14() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -1);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero15() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero16() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero17() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero18() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero19() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -2_147_483_648);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero20() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero21() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -1);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero22() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero23() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero24() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x0.0000000000001p-1022 /* -4.94066e-324 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero25() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x0.0000000000001p-1022 /* 4.94066e-324 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero26() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x0.0000000000001p-1022 /* -4.94066e-324 */);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -24.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_648);
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -2_147_483_648);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 4);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 1.0625);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", Double.NaN);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  constructorInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final Group leaf = new Group(0.0);

    // Act, creating object to test constructor
    final GroupTree actual = new GroupTree(leaf);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  addInputNotNullOutputVoid000ed4ca96262d16afa() throws Exception {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group = new Group(0.0);

    // Act
    groupTree.add(group);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull10() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x0.0000000000001p-1022 /* -4.94066e-324 */);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  ceilingInputNotNullOutputNull0000cbbb5828de4c84e() throws Exception {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group base = new Group(0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeOutputZero() {

    // Arrange
    final GroupTree groupTree = new GroupTree();

    // Act and Assert result
    Assert.assertEquals(0, groupTree.size());
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNull3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void sumOutputZero() {

    // Arrange
    final GroupTree groupTree = new GroupTree();

    // Act and Assert result
    Assert.assertEquals(0, groupTree.sum());
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_073_741_824);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.e77c97f8p+29 /* 1.02233e+09 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0x1.e77c97f8p+29 /* 1.02233e+09 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 5);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group9, "actualData", arrayList8);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group9);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(0.0);
    Reflector.setField(group10, "actualData", arrayList9);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group10);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList10 = new ArrayList<Double>();
    arrayList10.add(null);
    Reflector.setField(group11, "actualData", arrayList10);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group11);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group12 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList11 = new ArrayList<Double>();
    arrayList11.add(0.0);
    Reflector.setField(group12, "actualData", arrayList11);
    Reflector.setField(group12, "id", 0);
    Reflector.setField(group12, "count", 0);
    Reflector.setField(group12, "centroid", 0.0);
    Reflector.setField(groupTree14, "leaf", group12);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 2);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.e77c97f8p+29 /* 1.02233e+09 */);

    // Act
    final Group actual = groupTree.floor(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_073_741_824);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.e77c97f8p+29 /* 1.02233e+09 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0x1.e77c97f8p+29 /* 1.02233e+09 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", -2_147_483_646);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0x1.e77c97f8p+29 /* 1.02233e+09 */);
    Reflector.setField(groupTree8, "leaf", group8);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group9, "actualData", arrayList8);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(0.0);
    Reflector.setField(group10, "actualData", arrayList9);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group10);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList10 = new ArrayList<Double>();
    arrayList10.add(0.0);
    Reflector.setField(group11, "actualData", arrayList10);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group11);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group12 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList11 = new ArrayList<Double>();
    arrayList11.add(null);
    Reflector.setField(group12, "actualData", arrayList11);
    Reflector.setField(group12, "id", 0);
    Reflector.setField(group12, "count", 0);
    Reflector.setField(group12, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group12);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group13 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList12 = new ArrayList<Double>();
    arrayList12.add(0.0);
    Reflector.setField(group13, "actualData", arrayList12);
    Reflector.setField(group13, "id", 0);
    Reflector.setField(group13, "count", 0);
    Reflector.setField(group13, "centroid", 0.0);
    Reflector.setField(groupTree14, "leaf", group13);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", -2_147_483_646);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.e77c97f8p+29 /* 1.02233e+09 */);

    // Act
    final Group actual = groupTree.floor(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 1.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.01bcp+28 /* 2.70254e+08 */);

    // Act
    final Group actual = groupTree.floor(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 3);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 655362.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 33_554_433);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -524801.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_647);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 2);
    Reflector.setField(groupTree5, "right", null);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 2);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 655362.0);

    // Act
    final Group actual = groupTree.floor(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNull5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNull6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -24.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -2_147_483_648);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.00000008p+29 /* -5.36871e+08 */);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 1_896_130_523);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 1_879_117_829);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", -2_147_483_647);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_108_834_597);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1_342_177_280);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 1_760_105_655);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 2_147_483_647);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 1);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 536_870_912);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", -805_236_731);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", -2_147_483_648);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    Reflector.setField(groupTree7, "leaf", null);
    Reflector.setField(groupTree7, "depth", 17_055_743);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", -285_212_673);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 2_147_483_647);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", -285_212_673);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    Reflector.setField(groupTree10, "leaf", null);
    Reflector.setField(groupTree10, "depth", -615_205_126);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 1);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", -327_915_721);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree7, "left", groupTree9);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1.00000008p+29 /* -5.36871e+08 */);

    // Act
    groupTree.add(group);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNotNull8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 2_130_706_432);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", Double.NaN);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_647);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -1_073_741_824);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", -2_147_483_648);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree5, "leaf", group3);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1_073_741_825);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", Double.NaN);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree7 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", -2_147_483_648);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", Double.NaN);
    Reflector.setField(groupTree7, "leaf", group5);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 17);
    final GroupTree groupTree8 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", -2_147_483_648);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", Double.NaN);
    Reflector.setField(groupTree8, "leaf", group6);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 5);
    final GroupTree groupTree9 = new GroupTree();
    Reflector.setField(groupTree9, "leaf", null);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    Reflector.setField(groupTree9, "right", null);
    Reflector.setField(groupTree9, "left", null);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree10 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", -2_147_483_648);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", Double.NaN);
    Reflector.setField(groupTree10, "leaf", group7);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree8, "left", groupTree10);
    Reflector.setField(groupTree7, "right", groupTree8);
    final GroupTree groupTree11 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(group8, "actualData", arrayList);
    Reflector.setField(group8, "id", -1_073_741_824);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", Double.NaN);
    Reflector.setField(groupTree11, "leaf", group8);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 1);
    Reflector.setField(groupTree11, "right", null);
    final GroupTree groupTree12 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group9, "actualData", null);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", -0x1.ffdbfd63f5c3bp+851 /* -3.00218e+256 */);
    Reflector.setField(groupTree12, "leaf", group9);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 3);
    Reflector.setField(groupTree12, "right", null);
    Reflector.setField(groupTree12, "left", null);
    Reflector.setField(groupTree11, "left", groupTree12);
    Reflector.setField(groupTree7, "left", groupTree11);
    Reflector.setField(groupTree, "left", groupTree7);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1.ffdbfd63f5e3bp+851 /* -3.00218e+256 */);

    // Act
    final Group actual = groupTree.floor(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNotNull9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x0.0000000000001p-1022 /* 4.94066e-324 */);

    // Act
    final Group actual = groupTree.floor(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  floorInputNotNullOutputNull0002bcdf60ab7beb687() throws Exception {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group base = new Group(0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNull8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x0.a9fdaf8cddeb8p-1022 /* 1.47751e-308 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.a9fdaf8cddeb8p+1 /* 3.32805 */);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNull00104d7b46d8844dc74() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputVoid4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1_073_741_824);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.00000008p+29 /* -5.36871e+08 */);
    Reflector.setField(groupTree, "leaf", group1);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 1);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 1);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", -1_595_912_197);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 2_147_483_647);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree, "left", groupTree2);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1.00000008p+29 /* -5.36871e+08 */);

    // Act
    groupTree.add(group);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNull10() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x0.0000000000001p-1022 /* 4.94066e-324 */);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNull6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -1.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 33_554_433);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -655362.0);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -2_147_483_648);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNull8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", -2_147_483_648);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNull9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x0.0000000000001p-1022 /* -4.94066e-324 */);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNotNull2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_647);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group3, "actualData", arrayList2);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group4, "actualData", arrayList3);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group5, "actualData", arrayList4);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act
    final Group actual = groupTree.ceiling(base);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputNegative() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_463_790_080);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0x1.7ffa00dp+29 /* 8.05257e+08 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1_466_935_808);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_648);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    Reflector.setField(groupTree3, "leaf", null);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -2_146_435_065);
    final GroupTree groupTree5 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group2, "actualData", arrayList1);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group2);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree4, "right", groupTree5);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree4, "left", groupTree6);
    Reflector.setField(groupTree1, "left", groupTree4);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", -1_466_935_808);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.7ff800dp+29 /* 8.05241e+08 */);

    // Act and Assert result
    Assert.assertEquals(-2_146_435_065, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 262_144);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 262_144);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group7);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group9, "actualData", arrayList8);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group9);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(0.0);
    Reflector.setField(group10, "actualData", arrayList9);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group10);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList10 = new ArrayList<Double>();
    arrayList10.add(-0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(group11, "actualData", arrayList10);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group11);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group12 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList11 = new ArrayList<Double>();
    arrayList11.add(0.0);
    Reflector.setField(group12, "actualData", arrayList11);
    Reflector.setField(group12, "id", 0);
    Reflector.setField(group12, "count", 0);
    Reflector.setField(group12, "centroid", 0.0);
    Reflector.setField(groupTree14, "leaf", group12);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputPositiveOutputVoid0009761588d26572762() throws Exception {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final int depth = 1;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_463_790_080);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 680_547_840);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_648);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", -1_466_935_808);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group5, "actualData", arrayList5);
    Reflector.setField(group5, "id", -1_466_935_809);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group6, "actualData", arrayList6);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", -1_466_935_808);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive0011e874fcf5bf72d85()
      throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive001a1a0dddb675b47d0()
      throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive7() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive8() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -2_147_483_648);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 1);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({GroupTree.class, System.class})
  @Test
  public void printInputZeroOutputVoid() throws Exception {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final int depth = 0;

    // Act
    groupTree.print(depth);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive9() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree2 = new GroupTree();
    Reflector.setField(groupTree2, "leaf", null);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree3, "right", groupTree4);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree3, "left", groupTree5);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    final GroupTree groupTree7 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group4);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree6, "right", groupTree7);
    final GroupTree groupTree8 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree8, "leaf", group5);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree6, "left", groupTree8);
    Reflector.setField(groupTree2, "left", groupTree6);
    Reflector.setField(groupTree, "left", groupTree2);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive10() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", Double.NaN);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x0.4012080911a96p-1022 /* -5.56881e-309 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", -0x1.8p+512 /* -2.01117e+154 */);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group4);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(group5, "actualData", arrayList);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group5);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group6);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    final GroupTree groupTree10 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", -0x0.4012080010086p-1022 /* -5.56881e-309 */);
    Reflector.setField(groupTree10, "leaf", group7);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group8, "actualData", null);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group8);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group9, "actualData", null);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", Double.NaN);
    Reflector.setField(groupTree14, "leaf", group9);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x0.4012080911a96p-1022 /* -5.56881e-309 */);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive11() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", Double.NaN);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", -1);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0x1.faf7deffbfefep+896 /* 1.04621e+270 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 2_147_483_647);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", Double.NaN);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", Double.NaN);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0x1p+1017 /* 1.40445e+306 */);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", -0x1p+513 /* -2.68156e+154 */);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(group6, "actualData", arrayList);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0x1p+993 /* 8.37116e+298 */);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    final GroupTree groupTree9 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group7);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 1);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group8, "actualData", null);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0x1.faf7def6be4eep+1023 /* 1.78003e+308 */);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    Reflector.setField(groupTree11, "leaf", null);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    Reflector.setField(groupTree12, "leaf", null);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group9, "actualData", null);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group9);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group10, "actualData", null);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", Double.NaN);
    Reflector.setField(groupTree14, "leaf", group10);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0x1.faf7deffbfefep+896 /* 1.04621e+270 */);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive12() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree6 = new GroupTree();
    Reflector.setField(groupTree6, "leaf", null);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree, "left", groupTree6);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive13() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    Reflector.setField(groupTree4, "leaf", null);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree5 = new GroupTree();
    Reflector.setField(groupTree5, "leaf", null);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    Reflector.setField(groupTree5, "right", null);
    Reflector.setField(groupTree5, "left", null);
    Reflector.setField(groupTree, "left", groupTree5);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive14() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", -1);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group1, "actualData", null);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", Double.NaN);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group2, "actualData", null);
    Reflector.setField(group2, "id", -2_147_483_648);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group3, "actualData", null);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 1);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group4, "actualData", null);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", -1);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group6, "actualData", null);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group7, "actualData", null);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 1);
    Reflector.setField(groupTree8, "right", null);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputPositive15() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x0.0000000000001p-1022 /* -4.94066e-324 */);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 1);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  headCountInputNotNullOutputZero000bcc724590476c0c3() throws Exception {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group base = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkBalanceOutputVoid00009c8cd7066a3e6bb() {

    // Arrange
    final GroupTree groupTree = new GroupTree();

    // Act
    groupTree.checkBalance();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero3() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -1.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 262_144);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_648);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    Reflector.setField(groupTree8, "leaf", null);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", 0);
    final GroupTree groupTree9 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group7);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group8);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group9, "actualData", arrayList8);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group9);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    final GroupTree groupTree12 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(0.0);
    Reflector.setField(group10, "actualData", arrayList9);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree12, "leaf", group10);
    Reflector.setField(groupTree12, "depth", 0);
    Reflector.setField(groupTree12, "count", 0);
    Reflector.setField(groupTree12, "size", 0);
    final GroupTree groupTree13 = new GroupTree();
    final Group group11 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList10 = new ArrayList<Double>();
    arrayList10.add(-0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(group11, "actualData", arrayList10);
    Reflector.setField(group11, "id", 0);
    Reflector.setField(group11, "count", 0);
    Reflector.setField(group11, "centroid", 0.0);
    Reflector.setField(groupTree13, "leaf", group11);
    Reflector.setField(groupTree13, "depth", 0);
    Reflector.setField(groupTree13, "count", 0);
    Reflector.setField(groupTree13, "size", 0);
    Reflector.setField(groupTree13, "right", null);
    Reflector.setField(groupTree13, "left", null);
    Reflector.setField(groupTree12, "right", groupTree13);
    final GroupTree groupTree14 = new GroupTree();
    final Group group12 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList11 = new ArrayList<Double>();
    arrayList11.add(0.0);
    Reflector.setField(group12, "actualData", arrayList11);
    Reflector.setField(group12, "id", 0);
    Reflector.setField(group12, "count", 0);
    Reflector.setField(group12, "centroid", 0.0);
    Reflector.setField(groupTree14, "leaf", group12);
    Reflector.setField(groupTree14, "depth", 0);
    Reflector.setField(groupTree14, "count", 0);
    Reflector.setField(groupTree14, "size", 0);
    Reflector.setField(groupTree14, "right", null);
    Reflector.setField(groupTree14, "left", null);
    Reflector.setField(groupTree12, "left", groupTree14);
    Reflector.setField(groupTree8, "left", groupTree12);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1p+31 /* -2.14748e+09 */);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero4() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -1.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 262_144);
    final GroupTree groupTree1 = new GroupTree();
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", -2_147_483_648);
    final GroupTree groupTree2 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group1);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", 0);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group2);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group3);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group4);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 0);
    final GroupTree groupTree6 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group5, "actualData", null);
    Reflector.setField(group5, "id", 0);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group5);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group6, "actualData", arrayList5);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group6);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "right", groupTree1);
    final GroupTree groupTree8 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group7, "actualData", arrayList6);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 1.0);
    Reflector.setField(groupTree8, "leaf", group7);
    Reflector.setField(groupTree8, "depth", 0);
    Reflector.setField(groupTree8, "count", 0);
    Reflector.setField(groupTree8, "size", -2_147_483_648);
    final GroupTree groupTree9 = new GroupTree();
    final Group group8 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group8, "actualData", arrayList7);
    Reflector.setField(group8, "id", 0);
    Reflector.setField(group8, "count", 0);
    Reflector.setField(group8, "centroid", 0.0);
    Reflector.setField(groupTree9, "leaf", group8);
    Reflector.setField(groupTree9, "depth", 0);
    Reflector.setField(groupTree9, "count", 0);
    Reflector.setField(groupTree9, "size", 0);
    final GroupTree groupTree10 = new GroupTree();
    final Group group9 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList8 = new ArrayList<Double>();
    arrayList8.add(0.0);
    Reflector.setField(group9, "actualData", arrayList8);
    Reflector.setField(group9, "id", 0);
    Reflector.setField(group9, "count", 0);
    Reflector.setField(group9, "centroid", 0.0);
    Reflector.setField(groupTree10, "leaf", group9);
    Reflector.setField(groupTree10, "depth", 0);
    Reflector.setField(groupTree10, "count", 0);
    Reflector.setField(groupTree10, "size", 0);
    Reflector.setField(groupTree10, "right", null);
    Reflector.setField(groupTree10, "left", null);
    Reflector.setField(groupTree9, "right", groupTree10);
    final GroupTree groupTree11 = new GroupTree();
    final Group group10 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList9 = new ArrayList<Double>();
    arrayList9.add(0.0);
    Reflector.setField(group10, "actualData", arrayList9);
    Reflector.setField(group10, "id", 0);
    Reflector.setField(group10, "count", 0);
    Reflector.setField(group10, "centroid", 0.0);
    Reflector.setField(groupTree11, "leaf", group10);
    Reflector.setField(groupTree11, "depth", 0);
    Reflector.setField(groupTree11, "count", 0);
    Reflector.setField(groupTree11, "size", 0);
    Reflector.setField(groupTree11, "right", null);
    Reflector.setField(groupTree11, "left", null);
    Reflector.setField(groupTree9, "left", groupTree11);
    Reflector.setField(groupTree8, "right", groupTree9);
    Reflector.setField(groupTree8, "left", null);
    Reflector.setField(groupTree, "left", groupTree8);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", -0x1p+31 /* -2.14748e+09 */);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero5() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero6() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", -1_463_790_080);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree, "leaf", group);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", -2_147_483_648);
    Reflector.setField(groupTree, "right", null);
    final GroupTree groupTree1 = new GroupTree();
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList1 = new ArrayList<Double>();
    arrayList1.add(0.0);
    Reflector.setField(group1, "actualData", arrayList1);
    Reflector.setField(group1, "id", 680_547_840);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0.0);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    final GroupTree groupTree2 = new GroupTree();
    final Group group2 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList2 = new ArrayList<Double>();
    arrayList2.add(0.0);
    Reflector.setField(group2, "actualData", arrayList2);
    Reflector.setField(group2, "id", -1_466_935_808);
    Reflector.setField(group2, "count", 0);
    Reflector.setField(group2, "centroid", 0.0);
    Reflector.setField(groupTree2, "leaf", group2);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 0);
    final GroupTree groupTree3 = new GroupTree();
    final Group group3 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList3 = new ArrayList<Double>();
    arrayList3.add(0.0);
    Reflector.setField(group3, "actualData", arrayList3);
    Reflector.setField(group3, "id", 0);
    Reflector.setField(group3, "count", 0);
    Reflector.setField(group3, "centroid", 0.0);
    Reflector.setField(groupTree3, "leaf", group3);
    Reflector.setField(groupTree3, "depth", 0);
    Reflector.setField(groupTree3, "count", 0);
    Reflector.setField(groupTree3, "size", 0);
    Reflector.setField(groupTree3, "right", null);
    Reflector.setField(groupTree3, "left", null);
    Reflector.setField(groupTree2, "right", groupTree3);
    final GroupTree groupTree4 = new GroupTree();
    final Group group4 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList4 = new ArrayList<Double>();
    arrayList4.add(0.0);
    Reflector.setField(group4, "actualData", arrayList4);
    Reflector.setField(group4, "id", 0);
    Reflector.setField(group4, "count", 0);
    Reflector.setField(group4, "centroid", 0.0);
    Reflector.setField(groupTree4, "leaf", group4);
    Reflector.setField(groupTree4, "depth", 0);
    Reflector.setField(groupTree4, "count", 0);
    Reflector.setField(groupTree4, "size", 0);
    Reflector.setField(groupTree4, "right", null);
    Reflector.setField(groupTree4, "left", null);
    Reflector.setField(groupTree2, "left", groupTree4);
    Reflector.setField(groupTree1, "right", groupTree2);
    final GroupTree groupTree5 = new GroupTree();
    final Group group5 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList5 = new ArrayList<Double>();
    arrayList5.add(0.0);
    Reflector.setField(group5, "actualData", arrayList5);
    Reflector.setField(group5, "id", -1_466_935_808);
    Reflector.setField(group5, "count", 0);
    Reflector.setField(group5, "centroid", 0.0);
    Reflector.setField(groupTree5, "leaf", group5);
    Reflector.setField(groupTree5, "depth", 0);
    Reflector.setField(groupTree5, "count", 0);
    Reflector.setField(groupTree5, "size", 1);
    final GroupTree groupTree6 = new GroupTree();
    final Group group6 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList6 = new ArrayList<Double>();
    arrayList6.add(0.0);
    Reflector.setField(group6, "actualData", arrayList6);
    Reflector.setField(group6, "id", 0);
    Reflector.setField(group6, "count", 0);
    Reflector.setField(group6, "centroid", 0.0);
    Reflector.setField(groupTree6, "leaf", group6);
    Reflector.setField(groupTree6, "depth", 0);
    Reflector.setField(groupTree6, "count", 0);
    Reflector.setField(groupTree6, "size", 0);
    Reflector.setField(groupTree6, "right", null);
    Reflector.setField(groupTree6, "left", null);
    Reflector.setField(groupTree5, "right", groupTree6);
    final GroupTree groupTree7 = new GroupTree();
    final Group group7 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList7 = new ArrayList<Double>();
    arrayList7.add(0.0);
    Reflector.setField(group7, "actualData", arrayList7);
    Reflector.setField(group7, "id", 0);
    Reflector.setField(group7, "count", 0);
    Reflector.setField(group7, "centroid", 0.0);
    Reflector.setField(groupTree7, "leaf", group7);
    Reflector.setField(groupTree7, "depth", 0);
    Reflector.setField(groupTree7, "count", 0);
    Reflector.setField(groupTree7, "size", 0);
    Reflector.setField(groupTree7, "right", null);
    Reflector.setField(groupTree7, "left", null);
    Reflector.setField(groupTree5, "left", groupTree7);
    Reflector.setField(groupTree1, "left", groupTree5);
    Reflector.setField(groupTree, "left", groupTree1);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", -1_466_935_808);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNotNullOutputVoid000b1ffde1f51156b9d() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);

    // Act
    groupTree.add(group);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull7() throws NoSuchMethodException, IllegalAccessException,
                                              InvocationTargetException, InvocationTargetException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    Reflector.setField(groupTree1, "val$start", null);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    Reflector.setField(groupTree1, "currentState", null);
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(group, "actualData", null);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 0.0);
    Reflector.setField(groupTree1, "next", group);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull9() throws InvocationTargetException, InvocationTargetException,
                                              IllegalAccessException, NoSuchMethodException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    Reflector.setField(groupTree1, "val$start", null);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    final Class<?> stateType =
        Reflector.forName("com.clearspring.analytics.util.AbstractIterator$State");
    final Method stateValueOf = stateType.getDeclaredMethod("valueOf", String.class);
    final Enum stateInstance = (Enum)stateValueOf.invoke(null, "DONE");
    Reflector.setField(groupTree1, "currentState", stateInstance);
    Reflector.setField(groupTree1, "next", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeNextOutputNull000f212e1dae7758352()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
             InvocationTargetException {

    // Arrange
    final AbstractIterator groupTree1 = (AbstractIterator)Reflector.getInstance(
        "com.clearspring.analytics.stream.quantile.GroupTree$1");
    Reflector.setField(groupTree1, "val$start", null);
    final LinkedList<GroupTree> linkedList = new LinkedList<GroupTree>();
    Reflector.setField(groupTree1, "stack", linkedList);
    Reflector.setField(groupTree1, "this$0", null);
    Reflector.setField(groupTree1, "currentState", null);
    Reflector.setField(groupTree1, "next", null);
    final Class<?> classUnderTest =
        Reflector.forName("com.clearspring.analytics.stream.quantile.GroupTree$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("computeNext");
    methodUnderTest.setAccessible(true);

    // Act
    final Group actual = (Group)methodUnderTest.invoke(groupTree1);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNullOutputZero0004abee94e2a278575() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headCountInputNotNullOutputZero2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headCount(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNotNullOutputZero2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void headSumInputNullOutputZero000195c7cff10a9fc15() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertEquals(0, groupTree.headSum(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNotNullOutputNull2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void floorInputNullOutputNull0007127be5036538e2c() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.floor(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNullOutputNull000195e4e6947b80bcf() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void ceilingInputNotNullOutputNull2() throws InvocationTargetException {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    final Group base =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(base, "actualData", null);
    Reflector.setField(base, "id", 0);
    Reflector.setField(base, "count", 0);
    Reflector.setField(base, "centroid", 0.0);

    // Act and Assert result
    Assert.assertNull(groupTree.ceiling(base));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkBalanceOutputVoid2() {

    // Arrange
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);

    // Act
    groupTree.checkBalance();

    // The method returns void, testing that no exception is thrown
  }
}
