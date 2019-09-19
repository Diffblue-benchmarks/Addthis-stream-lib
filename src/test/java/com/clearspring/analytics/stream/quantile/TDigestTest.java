package com.clearspring.analytics.stream.quantile;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest.Group;
import com.clearspring.analytics.stream.quantile.TDigest;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(PowerMockRunner.class)
public class TDigestTest {

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = AtomicInteger.class)
  @Test
  public void
  createWeightedInputZeroZero3OutputNotNull() throws Exception {

    // Arrange
    final double x = 0.0;
    final int w = 0;
    final ArrayList data = new ArrayList();
    data.add(null);
    data.add(null);
    data.add(null);

    // Act
    final Group actual = Group.createWeighted(x, w, data);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  addInputZeroZeroOutputVoid3() throws Exception, InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", true);
    Reflector.setField(tDigest, "gen", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act
    tDigest.add(0.0, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = AtomicInteger.class)
  @Test
  public void
  createWeightedInputZeroZero1OutputNotNull00242e4f5c3d8c7a9b4() throws Exception {

    // Arrange
    final double x = 0.0;
    final int w = 0;
    final ArrayList data = new ArrayList();
    data.add(null);

    // Act
    final Group actual = Group.createWeighted(x, w, data);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = AtomicInteger.class)
  @Test
  public void
  createWeightedInputZeroZero0OutputNotNull001b9c617a49c929d52() throws Exception {

    // Arrange
    final double x = 0.0;
    final int w = 0;
    final ArrayList data = new ArrayList();

    // Act
    final Group actual = Group.createWeighted(x, w, data);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = AtomicInteger.class)
  @Test
  public void
  createWeightedInputZeroZero0OutputNotNull000b9c617a49c929d52() throws Exception {

    // Arrange
    final double x = 0.0;
    final int w = 0;
    final ArrayList data = new ArrayList();

    // Act
    final Group actual = Group.createWeighted(x, w, data);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  constructorInputZeroZeroTrueOutputNotNull0010462a65b116c12eb() throws Exception {

    // Act, creating object to test constructor
    final Group actual = new Group(0.0, 0, true);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  addInputZeroOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", true);
    Reflector.setField(tDigest, "gen", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act
    tDigest.add(0.0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void mergeInputZero0OutputIllegalArgumentException000c6d961c9b75f64ae() {

    // Arrange
    final double compression = 0.0;
    final ArrayList<TDigest> subData = new ArrayList<TDigest>();

    // Act
    thrown.expect(IllegalArgumentException.class);
    TDigest.merge(compression, subData);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void cdfInputZeroOutputZero() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = new Random();
    Reflector.setField(tDigest, "gen", random);
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
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", 0x1.ap+27 /* 2.18104e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 1);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", -2_082_650_093);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(0.0, tDigest.cdf(0.0), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void cdfInputNegativeOutputPositive() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
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
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "left", groupTree1);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(1.0, tDigest.cdf(-0x1p+31 /* -2.14748e+09 */), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void cdfInputZeroOutputPositive() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
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
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(1.0, tDigest.cdf(0.0), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void cdfInputNegativeOutputZero() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
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
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", 2.0);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "left", groupTree1);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(0.0, tDigest.cdf(-0x1p+31 /* -2.14748e+09 */), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void cdfInputZeroOutputIllegalStateException() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = new Random();
    Reflector.setField(tDigest, "gen", random);
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
    final Group group1 =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.ap+27 /* -2.18104e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", -2_082_650_093);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act
    thrown.expect(IllegalStateException.class);
    tDigest.cdf(0.0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void quantileInputNegativeOutputIllegalArgumentException()
      throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = new Random();
    Reflector.setField(tDigest, "gen", random);
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
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", -1_073_983_155);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    tDigest.quantile(-0x1.8fdfebcp+27 /* -2.0965e+08 */);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void quantileInputNegativeOutputIllegalArgumentException2()
      throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = new Random();
    Reflector.setField(tDigest, "gen", random);
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
    Reflector.setField(groupTree1, "leaf", null);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
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
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", -1);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    tDigest.quantile(-1.0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void quantileInputZeroOutputIllegalArgumentException() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act
    thrown.expect(IllegalArgumentException.class);
    tDigest.quantile(0.0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void decodeInputNotNullOutputIllegalStateException() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getMethod = DTUMemberMatcher.method(ByteBuffer.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn((byte)-128)
         .doReturn((byte)-128)
         .doReturn((byte)-128)
         .doReturn((byte)-128)
         .doReturn((byte)-128))
        .when(buf, getMethod)
        .withNoArguments();

    // Act
    thrown.expect(IllegalStateException.class);
    TDigest.decode(buf);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void fromBytesInputNotNullOutputIllegalStateException3() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getMethod = DTUMemberMatcher.method(ByteBuffer.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn((byte)-128)
         .doReturn((byte)-128)
         .doReturn((byte)-128)
         .doReturn((byte)-128)
         .doReturn((byte)-128))
        .when(buf, getMethod)
        .withNoArguments();
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(1))
        .when(buf, getIntMethod)
        .withNoArguments();
    final Method getDoubleMethod = DTUMemberMatcher.method(ByteBuffer.class, "getDouble");
    PowerMockito.doReturn(0.0).when(buf, getDoubleMethod).withNoArguments();
    final Method getFloatMethod = DTUMemberMatcher.method(ByteBuffer.class, "getFloat");
    PowerMockito.doReturn(Float.NaN).when(buf, getFloatMethod).withNoArguments();
    final TDigest tDigest = PowerMockito.mock(TDigest.class);
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(tDigest, "gen", random);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);
    PowerMockito.whenNew(TDigest.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(tDigest);

    // Act
    thrown.expect(IllegalStateException.class);
    TDigest.fromBytes(buf);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeInputZero0OutputIllegalArgumentException2() {

    // Arrange
    final ArrayList<TDigest> subData = new ArrayList<TDigest>();

    // Act
    thrown.expect(IllegalArgumentException.class);
    TDigest.merge(0.0, subData);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void mergeInputZeroNotNullOutputIllegalArgumentException000335d74ac53053001() {

    // Arrange
    final ArrayList<TDigest> subData = new ArrayList<TDigest>();

    // Act
    thrown.expect(IllegalArgumentException.class);
    TDigest.merge(0.0, subData);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void fromBytesInputNotNullOutputIllegalStateException() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    PowerMockito.doReturn(-2_147_483_647).when(buf, getIntMethod).withNoArguments();

    // Act
    thrown.expect(IllegalStateException.class);
    TDigest.fromBytes(buf);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void fromBytesInputNotNullOutputIllegalStateException2() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    PowerMockito.doReturn(0).when(buf, getIntMethod).withNoArguments();

    // Act
    thrown.expect(IllegalStateException.class);
    TDigest.fromBytes(buf);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNegativeNegativeOutputVoid4() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    Reflector.setField(tDigestGroup, "actualData", arrayList);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 527_204_357);
    Reflector.setField(tDigestGroup, "centroid", 0x1.65a203p+2 /* 5.58801 */);

    // Act
    tDigestGroup.add(-0x1.480c080802b73p+3 /* -10.2515 */, -1);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = AtomicInteger.class)
  @Test
  public void
  toStringOutputNotNull4() throws Exception, InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 1);
    Reflector.setField(tDigestGroup, "centroid", 0.0);

    // Act
    final String actual = tDigestGroup.toString();

    // Assert result
    Assert.assertEquals("Group{centroid=foo, count=1}", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNegativeNegativeOutputVoid6() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    Reflector.setField(tDigestGroup, "actualData", arrayList);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", -1_954_932_116);
    Reflector.setField(tDigestGroup, "centroid", -0x1.00001e4c00001p-1021 /* -4.45016e-308 */);

    // Act
    tDigestGroup.add(-0x1.d8784a1b91cf9p-1022 /* -4.10656e-308 */, -3);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  toStringOutputNotNull3() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(Double.NEGATIVE_INFINITY);

    // Act and Assert result
    Assert.assertEquals("Group{centroid=-Infinity, count=1}", tDigestGroup.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputPositiveNegativeOutputVoid2() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(tDigestGroup, "actualData", arrayList);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", -4090);
    Reflector.setField(tDigestGroup, "centroid", 0x1.8aaaaaab02aabp+1022 /* 6.92861e+307 */);

    // Act
    tDigestGroup.add(0x1.c0000000b0001p+1021 /* 3.93245e+307 */, -6);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  toStringOutputNotNull2() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(1.0);

    // Act and Assert result
    Assert.assertEquals("Group{centroid=1.0, count=1}", tDigestGroup.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputPositivePositiveOutputVoid001ff3e3ccd27618b4e()
      throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    Reflector.setField(tDigestGroup, "actualData", arrayList);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", -133_701_632);
    Reflector.setField(tDigestGroup, "centroid", 2.08896e+06);

    // Act
    tDigestGroup.add(0x1.0001p+21 /* 2.09718e+06 */, 133_701_632);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  addInputZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act
    tDigest.add(0.0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = AtomicInteger.class)
  @Test
  public void
  toStringOutputNotNull6() throws Exception, InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(1.0);
    Reflector.setField(tDigestGroup, "actualData", arrayList);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 1);
    Reflector.setField(tDigestGroup, "centroid", 1.0);

    // Act
    final String actual = tDigestGroup.toString();

    // Assert result
    Assert.assertEquals("Group{centroid=foo, count=1}", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  compareToInputNotNullOutputNegative() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(-0x1.008p+30 /* -1.07584e+09 */, 0, false);
    final Group o = new Group(-2.0, 0, false);

    // Act and Assert result
    Assert.assertEquals(-1, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputNegative2() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 0);
    Reflector.setField(tDigestGroup, "centroid", -0x0.0000000000001p-1022 /* -4.94066e-324 */);
    final Group o =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(o, "actualData", null);
    Reflector.setField(o, "id", 0);
    Reflector.setField(o, "count", 0);
    Reflector.setField(o, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(-1, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  compareToInputNotNullOutputPositive001d998bdf27745948d() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);
    final Group o = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(1, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive0011fb18d0bfa6f4783()
      throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 0);
    Reflector.setField(tDigestGroup, "centroid", 1.0);
    final Group o =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(o, "actualData", null);
    Reflector.setField(o, "id", 0);
    Reflector.setField(o, "count", 0);
    Reflector.setField(o, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputPositive001dc6642f7c8e117c3()
      throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 0);
    Reflector.setField(tDigestGroup, "centroid", 0.0);
    final Group o =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(o, "actualData", null);
    Reflector.setField(o, "id", 0);
    Reflector.setField(o, "count", 0);
    Reflector.setField(o, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(1, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  compareToInputNotNullOutputZero000fc9dc9d649fbfd91() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);
    final Group o = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  compareToInputNotNullOutputZero2() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0);
    final Group o = new Group(0.0, 0, false);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  compareToInputNotNullOutputZero3() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0);
    final Group o = new Group(0.0, 0, true);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  compareToInputNotNullOutputZero4() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);
    final Group o = new Group(0.0, 0, true);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero0009f41504100d1a4ab()
      throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 0);
    Reflector.setField(tDigestGroup, "centroid", 0.0);
    final Group o =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(o, "actualData", null);
    Reflector.setField(o, "id", 0);
    Reflector.setField(o, "count", 0);
    Reflector.setField(o, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero6() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 0);
    Reflector.setField(tDigestGroup, "centroid", 0.0);
    final Group o =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(o, "actualData", null);
    Reflector.setField(o, "id", 0);
    Reflector.setField(o, "count", 0);
    Reflector.setField(o, "centroid", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.compareTo(o));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  meanOutputZero5() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, true);

    // Act and Assert result
    Assert.assertEquals(0.0, tDigestGroup.mean(), 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  constructorInputZeroOutputNotNull0003662bcfa92883399() throws Exception {

    // Act, creating object to test constructor
    final Group actual = new Group(0.0);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(TDigest.class)
  @Test
  public void constructorInputZeroOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.suppress(PowerMockito.constructorsDeclaredIn(Object.class));

    // Arrange
    final double compression = 0.0;
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(tDigest, "gen", random);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);
    PowerMockito.whenNew(TDigest.class)
        .withParameterTypes(double.class, Random.class)
        .withArguments(anyDouble(), or(isA(Random.class), isNull(Random.class)))
        .thenReturn(tDigest);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final TDigest actual = new TDigest(compression);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  constructorInputZeroZeroFalseOutputNotNull0007f249186a4274a37() throws Exception {

    // Act, creating object to test constructor
    final Group actual = new Group(0.0, 0, false);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  constructorInputZeroZeroOutputNotNull000c6b5f0bd8d5ee81b() throws Exception {

    // Act, creating object to test constructor
    final Group actual = new Group(0.0, 0);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  addInputZeroPositiveOutputVoid() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act
    tDigestGroup.add(0.0, 1_610_612_749);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  countOutputPositive0002b24b2d647852c56() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(1, tDigestGroup.count());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  countOutputPositive2() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0);

    // Act and Assert result
    Assert.assertEquals(1, tDigestGroup.count());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  countOutputPositive3() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(1, tDigestGroup.count());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  countOutputPositive4() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, false);

    // Act and Assert result
    Assert.assertEquals(1, tDigestGroup.count());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  countOutputPositive5() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, true);

    // Act and Assert result
    Assert.assertEquals(1, tDigestGroup.count());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  createWeightedInputPositiveNegative0OutputNotNull() throws Exception {

    // Arrange
    final ArrayList data = new ArrayList();

    // Act
    final Group actual = Group.createWeighted(3.0, -536_870_912, data);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  addInputZeroZeroOutputVoid000cb9a4f997d05c281() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act
    tDigestGroup.add(0.0, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  createWeightedInputZeroZero0OutputNotNull2() throws Exception {

    // Arrange
    final ArrayList data = new ArrayList();

    // Act
    final Group actual = Group.createWeighted(0.0, 0, data);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  addInputZeroZeroOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act
    tDigest.add(0.0, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  createWeightedInputZeroZero1OutputNotNull() throws Exception {

    // Arrange
    final ArrayList data = new ArrayList();
    data.add(null);

    // Act
    final Group actual = Group.createWeighted(0.0, 0, data);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  addInputNegativeNegativeOutputVoid() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(-1.0, 0, false);

    // Act
    tDigestGroup.add(-2.0, -1);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNaNZeroOutputVoid2() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    Reflector.setField(tDigestGroup, "actualData", arrayList);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 0);
    Reflector.setField(tDigestGroup, "centroid", 0x1p-967 /* 8.01667e-292 */);

    // Act
    tDigestGroup.add(Double.NaN, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  createWeightedInputZeroZeroNotNullOutputNotNull000254647340495e2fc() throws Exception {

    // Arrange
    final ArrayList data = new ArrayList();

    // Act
    final Group actual = Group.createWeighted(0.0, 0, data);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  createWeightedInputZeroZeroNullOutputNotNull000058400de9a4af148() throws Exception {

    // Act
    final Group actual = Group.createWeighted(0.0, 0, null);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  dataOutput1() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, true);

    // Act
    final Iterable actual = tDigestGroup.data();

    // Assert result
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(0.0);
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  dataOutputNull00020b739f61eef351a() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertNull(tDigestGroup.data());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  dataOutputNull2() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0);

    // Act and Assert result
    Assert.assertNull(tDigestGroup.data());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  dataOutputNull3() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertNull(tDigestGroup.data());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  dataOutputNull4() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, false);

    // Act and Assert result
    Assert.assertNull(tDigestGroup.data());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = AtomicInteger.class)
  @Test
  public void
  toStringOutputNotNull000a60db80e7d34ef79() throws Exception, InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 1);
    Reflector.setField(tDigestGroup, "centroid", 0.0);

    // Act
    final String actual = tDigestGroup.toString();

    // Assert result
    Assert.assertEquals("Group{centroid=foo, count=1}", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  meanOutputZero4() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, false);

    // Act and Assert result
    Assert.assertEquals(0.0, tDigestGroup.mean(), 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  meanOutputZero3() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(0.0, tDigestGroup.mean(), 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  meanOutputZero2() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0);

    // Act and Assert result
    Assert.assertEquals(0.0, tDigestGroup.mean(), 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  meanOutputZero000250303629445769b() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(0.0, tDigestGroup.mean(), 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  idOutputZero5() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, true);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.id());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  idOutputZero4() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, false);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.id());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  idOutputZero3() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.id());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  idOutputZero2() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.id());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  idOutputZero000678126e4bed03202() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.id());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  hashCodeOutputZero5() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, true);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputZeroZeroOutputVoid5() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    Reflector.setField(tDigestGroup, "actualData", arrayList);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 0);
    Reflector.setField(tDigestGroup, "centroid", -0x1.0000000540447p-1003 /* -1.16658e-302 */);

    // Act
    tDigestGroup.add(0.0, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  addInputNegativeNegativeOutputVoid2() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0);

    // Act
    tDigestGroup.add(-1.0, -1);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = AtomicInteger.class)
  @Test
  public void
  toStringOutputNotNull5() throws Exception, InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 1);
    Reflector.setField(tDigestGroup, "centroid", 1.0);

    // Act
    final String actual = tDigestGroup.toString();

    // Assert result
    Assert.assertEquals("Group{centroid=foo, count=1}", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void fromBytesInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(0))
        .when(buf, getIntMethod)
        .withNoArguments();
    final Method getDoubleMethod = DTUMemberMatcher.method(ByteBuffer.class, "getDouble");
    PowerMockito.doReturn(0.0).when(buf, getDoubleMethod).withNoArguments();
    final TDigest tDigest = PowerMockito.mock(TDigest.class);
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(tDigest, "gen", random);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);
    PowerMockito.whenNew(TDigest.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(tDigest);

    // Act
    final TDigest actual = TDigest.fromBytes(buf);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void fromBytesInputNotNullOutputNotNull2() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(1).doReturn(0))
        .when(buf, getIntMethod)
        .withNoArguments();
    final Method getDoubleMethod = DTUMemberMatcher.method(ByteBuffer.class, "getDouble");
    PowerMockito.doReturn(0.0).when(buf, getDoubleMethod).withNoArguments();
    final TDigest tDigest = PowerMockito.mock(TDigest.class);
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(tDigest, "gen", random);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);
    PowerMockito.whenNew(TDigest.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(tDigest);

    // Act
    final TDigest actual = TDigest.fromBytes(buf);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void fromBytesInputNotNullOutputNotNull3() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(1).doReturn(0))
        .when(buf, getIntMethod)
        .withNoArguments();
    final Method getDoubleMethod = DTUMemberMatcher.method(ByteBuffer.class, "getDouble");
    PowerMockito.doReturn(0.0).when(buf, getDoubleMethod).withNoArguments();
    final TDigest tDigest = PowerMockito.mock(TDigest.class);
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(tDigest, "gen", random);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);
    PowerMockito.whenNew(TDigest.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(tDigest);

    // Act
    final TDigest actual = TDigest.fromBytes(buf);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void fromBytesInputNotNullOutputNotNull4() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(0))
        .when(buf, getIntMethod)
        .withNoArguments();
    final Method getDoubleMethod = DTUMemberMatcher.method(ByteBuffer.class, "getDouble");
    PowerMockito.doReturn(0.0).when(buf, getDoubleMethod).withNoArguments();
    final TDigest tDigest = PowerMockito.mock(TDigest.class);
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(tDigest, "gen", random);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);
    PowerMockito.whenNew(TDigest.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(tDigest);

    // Act
    final TDigest actual = TDigest.fromBytes(buf);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ByteBuffer.class, TDigest.class})
  @Test
  public void fromBytesInputNotNullOutputNotNull5() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(1).doReturn(1).doReturn(0))
        .when(buf, getIntMethod)
        .withNoArguments();
    final Method getDoubleMethod = DTUMemberMatcher.method(ByteBuffer.class, "getDouble");
    ((PowerMockitoStubber)PowerMockito.doReturn(0.0).doReturn(0.0))
        .when(buf, getDoubleMethod)
        .withNoArguments();
    final TDigest tDigest = PowerMockito.mock(TDigest.class);
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(tDigest, "gen", random);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);
    PowerMockito.whenNew(TDigest.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(tDigest);

    // Act
    final TDigest actual = TDigest.fromBytes(buf);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ByteBuffer.class, TDigest.class})
  @Test
  public void fromBytesInputNotNullOutputNotNull6() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getMethod = DTUMemberMatcher.method(ByteBuffer.class, "get");
    PowerMockito.doReturn((byte)0).when(buf, getMethod).withNoArguments();
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(1))
        .when(buf, getIntMethod)
        .withNoArguments();
    final Method getDoubleMethod = DTUMemberMatcher.method(ByteBuffer.class, "getDouble");
    PowerMockito.doReturn(0.0).when(buf, getDoubleMethod).withNoArguments();
    final Method getFloatMethod = DTUMemberMatcher.method(ByteBuffer.class, "getFloat");
    PowerMockito.doReturn(Float.POSITIVE_INFINITY).when(buf, getFloatMethod).withNoArguments();
    final TDigest tDigest = PowerMockito.mock(TDigest.class);
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(tDigest, "gen", random);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);
    PowerMockito.whenNew(TDigest.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(tDigest);

    // Act
    final TDigest actual = TDigest.fromBytes(buf);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ByteBuffer.class, TDigest.class})
  @Test
  public void fromBytesInputNotNullOutputNotNull7() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getMethod = DTUMemberMatcher.method(ByteBuffer.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn((byte)-127).doReturn((byte)0))
        .when(buf, getMethod)
        .withNoArguments();
    final Method getIntMethod = DTUMemberMatcher.method(ByteBuffer.class, "getInt");
    ((PowerMockitoStubber)PowerMockito.doReturn(2).doReturn(1))
        .when(buf, getIntMethod)
        .withNoArguments();
    final Method getDoubleMethod = DTUMemberMatcher.method(ByteBuffer.class, "getDouble");
    PowerMockito.doReturn(0.0).when(buf, getDoubleMethod).withNoArguments();
    final Method getFloatMethod = DTUMemberMatcher.method(ByteBuffer.class, "getFloat");
    PowerMockito.doReturn(Float.NaN).when(buf, getFloatMethod).withNoArguments();
    final TDigest tDigest = PowerMockito.mock(TDigest.class);
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = PowerMockito.mock(Random.class);
    Reflector.setField(tDigest, "gen", random);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);
    PowerMockito.whenNew(TDigest.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(tDigest);

    // Act
    final TDigest actual = TDigest.fromBytes(buf);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  hashCodeOutputZero00000786e4eeec9dd4a() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.hashCode());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  hashCodeOutputZero2() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.hashCode());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  hashCodeOutputZero3() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.hashCode());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"},
                  value = {AtomicInteger.class})
  @Test
  public void
  hashCodeOutputZero4() throws Exception {

    // Arrange
    final Group tDigestGroup = new Group(0.0, 0, false);

    // Act and Assert result
    Assert.assertEquals(0, tDigestGroup.hashCode());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void decodeInputNotNullOutputZero001034ba4921c4cc35c() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getMethod = DTUMemberMatcher.method(ByteBuffer.class, "get");
    ((PowerMockitoStubber)PowerMockito.doReturn((byte)-128).doReturn((byte)0))
        .when(buf, getMethod)
        .withNoArguments();

    // Act and Assert result
    Assert.assertEquals(0, TDigest.decode(buf));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void encodeInputNotNullPositiveOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer).doReturn(byteBuffer1))
        .when(buf, putMethod)
        .withArguments(anyByte());

    // Act
    TDigest.encode(buf, 8192);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void encodeInputNotNullPositiveOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(byteBuffer))
        .when(buf, putMethod)
        .withArguments(anyByte());

    // Act
    TDigest.encode(buf, 8192);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void encodeInputNotNullNegativeOutputVoid2() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null))
        .when(buf, putMethod)
        .withArguments(anyByte());

    // Act
    TDigest.encode(buf, -2_147_483_648);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void encodeInputNotNullNegativeOutputVoid0013aed026a6e294a59() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null))
        .when(buf, putMethod)
        .withArguments(anyByte());

    // Act
    TDigest.encode(buf, -2_147_483_648);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void encodeInputNotNullPositiveOutputVoid3() throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null).doReturn(byteBuffer))
        .when(buf, putMethod)
        .withArguments(anyByte());

    // Act
    TDigest.encode(buf, 65_536);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void encodeInputNotNullPositiveOutputVoid4() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null))
        .when(buf, putMethod)
        .withArguments(anyByte());

    // Act
    TDigest.encode(buf, 128);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void cdfInputZeroOutputNaN2() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(Double.NaN, tDigest.cdf(0.0), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void byteSizeOutputZero() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 357_913_940);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigest.byteSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void cdfInputNegativeOutputNaN() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
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
    Reflector.setField(groupTree1, "right", null);
    final GroupTree groupTree2 = new GroupTree();
    final Group group =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    Reflector.setField(group, "actualData", arrayList);
    Reflector.setField(group, "id", 0);
    Reflector.setField(group, "count", 0);
    Reflector.setField(group, "centroid", -0x1p+31 /* -2.14748e+09 */);
    Reflector.setField(groupTree2, "leaf", group);
    Reflector.setField(groupTree2, "depth", 0);
    Reflector.setField(groupTree2, "count", 0);
    Reflector.setField(groupTree2, "size", 1);
    Reflector.setField(groupTree2, "right", null);
    Reflector.setField(groupTree2, "left", null);
    Reflector.setField(groupTree1, "left", groupTree2);
    Reflector.setField(groupTree, "left", groupTree1);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(Double.NaN, tDigest.cdf(-0x1p+31 /* -2.14748e+09 */), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void centroidCountOutputZero() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    final GroupTree groupTree = new GroupTree();
    Reflector.setField(groupTree, "leaf", null);
    Reflector.setField(groupTree, "depth", 0);
    Reflector.setField(groupTree, "count", 0);
    Reflector.setField(groupTree, "size", 0);
    Reflector.setField(groupTree, "right", null);
    Reflector.setField(groupTree, "left", null);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigest.centroidCount());
  }

  // Test written by Diffblue Cover.
  @Test
  public void cdfInputZeroOutputNaN() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    final Random random = new Random();
    Reflector.setField(tDigest, "gen", random);
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
    final ArrayList<Double> arrayList = new ArrayList<Double>();
    arrayList.add(null);
    Reflector.setField(group1, "actualData", arrayList);
    Reflector.setField(group1, "id", 0);
    Reflector.setField(group1, "count", 0);
    Reflector.setField(group1, "centroid", -0x1.ap+27 /* -2.18104e+08 */);
    Reflector.setField(groupTree1, "leaf", group1);
    Reflector.setField(groupTree1, "depth", 0);
    Reflector.setField(groupTree1, "count", 0);
    Reflector.setField(groupTree1, "size", 0);
    Reflector.setField(groupTree1, "right", null);
    Reflector.setField(groupTree1, "left", null);
    Reflector.setField(groupTree, "left", groupTree1);
    Reflector.setField(tDigest, "summary", groupTree);
    Reflector.setField(tDigest, "count", -2_082_650_093);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(Double.NaN, tDigest.cdf(0.0), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeOutputZero() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    Reflector.setField(tDigest, "summary", null);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(0, tDigest.size());
  }

  // Test written by Diffblue Cover.
  @Test
  public void centroidsOutputNull() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    Reflector.setField(tDigest, "summary", null);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertNull(tDigest.centroids());
  }

  // Test written by Diffblue Cover.
  @Test
  public void compressionOutputZero() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    Reflector.setField(tDigest, "summary", null);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act and Assert result
    Assert.assertEquals(0.0, tDigest.compression(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void recordAllDataOutputNotNull() throws InvocationTargetException {

    // Arrange
    final TDigest tDigest =
        (TDigest)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest");
    Reflector.setField(tDigest, "recordAllData", false);
    Reflector.setField(tDigest, "gen", null);
    Reflector.setField(tDigest, "summary", null);
    Reflector.setField(tDigest, "count", 0);
    Reflector.setField(tDigest, "compression", 0.0);

    // Act
    final TDigest actual = tDigest.recordAllData();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void encodeInputNotNullZeroOutputVoid000ed42ab126f35baa6() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    PowerMockito.doReturn(null).when(buf, putMethod).withArguments(anyByte());

    // Act
    TDigest.encode(buf, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void encodeInputNotNullZeroOutputVoid00051fa10a40f74dbba()
      throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    PowerMockito.doReturn(byteBuffer).when(buf, putMethod).withArguments(anyByte());

    // Act
    TDigest.encode(buf, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TDigest.class, ByteBuffer.class})
  @Test
  public void decodeInputNotNullOutputZero000afda6010a0c92977() throws Exception {

    // Arrange
    final ByteBuffer buf = PowerMockito.mock(ByteBuffer.class);
    final Method getMethod = DTUMemberMatcher.method(ByteBuffer.class, "get");
    PowerMockito.doReturn((byte)0).when(buf, getMethod).withNoArguments();

    // Act and Assert result
    Assert.assertEquals(0, TDigest.decode(buf));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames = {"com.clearspring.analytics.stream.quantile.TDigest$Group"})
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final AtomicInteger atomicInteger = PowerMockito.mock(AtomicInteger.class);
    PowerMockito.whenNew(AtomicInteger.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(atomicInteger);

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputZeroZeroOutputVoid4() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 0);
    Reflector.setField(tDigestGroup, "centroid", -0x1.0000000540447p-1003 /* -1.16658e-302 */);

    // Act
    tDigestGroup.add(0.0, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputPositivePositiveOutputVoid00032644be862904282()
      throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", -133_701_632);
    Reflector.setField(tDigestGroup, "centroid", 2.08896e+06);

    // Act
    tDigestGroup.add(0x1.0001p+21 /* 2.09718e+06 */, 133_701_632);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputPositiveNegativeOutputVoid() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", -268);
    Reflector.setField(tDigestGroup, "centroid", 0.0);

    // Act
    tDigestGroup.add(0x1.59p-1022 /* 2.99863e-308 */, -8);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNegativeNegativeOutputVoid5() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", -1_954_932_116);
    Reflector.setField(tDigestGroup, "centroid", -0x1.00001e4c00001p-1021 /* -4.45016e-308 */);

    // Act
    tDigestGroup.add(-0x1.d8784a1b91cf9p-1022 /* -4.10656e-308 */, -3);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNegativeNegativeOutputVoid3() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 527_204_357);
    Reflector.setField(tDigestGroup, "centroid", 0x1.65a203p+2 /* 5.58801 */);

    // Act
    tDigestGroup.add(-0x1.480c080802b73p+3 /* -10.2515 */, -1);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void addInputNaNZeroOutputVoid() throws InvocationTargetException {

    // Arrange
    final Group tDigestGroup =
        (Group)Reflector.getInstance("com.clearspring.analytics.stream.quantile.TDigest$Group");
    Reflector.setField(tDigestGroup, "actualData", null);
    Reflector.setField(tDigestGroup, "id", 0);
    Reflector.setField(tDigestGroup, "count", 0);
    Reflector.setField(tDigestGroup, "centroid", 0x1p-967 /* 8.01667e-292 */);

    // Act
    tDigestGroup.add(Double.NaN, 0);

    // The method returns void, testing that no exception is thrown
  }
}
