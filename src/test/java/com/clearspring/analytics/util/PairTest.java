package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Pair;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;

public class PairTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroZeroOutputNotNull() {

    // Act, creating object to test constructor
    final Pair actual = new Pair(0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.right);
    Assert.assertEquals(0, actual.left);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final Pair pair = new Pair(1, -5);

    // Act and Assert result
    Assert.assertEquals("(1,-5)", pair.toString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse000f06c95d2a8848399() {

    // Arrange
    final Pair pair = new Pair(1, 0);
    final Pair o = new Pair(0, 0);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse00166a785c2e02443ad() {

    // Arrange
    final Pair pair = new Pair(0, -2_147_483_648);
    final Pair o = new Pair(0, 0);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero0001c6f26696a578474() {

    // Arrange
    final Pair pair = new Pair(-31, 0);

    // Act and Assert result
    Assert.assertEquals(0, pair.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue00275af2523184685c6() {

    // Arrange
    final Pair pair = new Pair(0, 0);
    final Pair o = new Pair(0, 0);

    // Act and Assert result
    Assert.assertTrue(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputZeroZeroOutputNotNull() {

    // Act
    final Pair actual = Pair.create(0, 0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.right);
    Assert.assertEquals(0, actual.left);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive00254f24bb120181044() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", 0);
    Reflector.setField(pair, "left", null);

    // Act and Assert result
    Assert.assertEquals(961, pair.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive2() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", null);

    // Act and Assert result
    Assert.assertEquals(961, pair.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero000eabc4d10b2cd176a() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", -31);

    // Act and Assert result
    Assert.assertEquals(0, pair.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero00117add75cfa45bf1d() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", 0);
    Reflector.setField(pair, "left", -31);

    // Act and Assert result
    Assert.assertEquals(0, pair.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero4() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", -961);
    Reflector.setField(pair, "left", null);

    // Act and Assert result
    Assert.assertEquals(0, pair.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero5() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", -31);

    // Act and Assert result
    Assert.assertEquals(0, pair.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue4() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", null);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", null);
    Reflector.setField(o, "left", null);

    // Act and Assert result
    Assert.assertTrue(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse0011ba8cc50efeb1cad() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", null);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", null);
    Reflector.setField(o, "left", 0);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue2() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", 0);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", null);
    Reflector.setField(o, "left", 0);

    // Act and Assert result
    Assert.assertTrue(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue005bb91d10edcda64c9() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", 0);
    Reflector.setField(pair, "left", null);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", 0);
    Reflector.setField(o, "left", null);

    // Act and Assert result
    Assert.assertTrue(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse003fd62a430b9680e6d() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", 0);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", 0);
    Reflector.setField(o, "left", 0);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse000cd2520bb697d0630() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", null);

    // Act and Assert result
    Assert.assertFalse(pair.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse6() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", -2_147_483_648);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", null);
    Reflector.setField(o, "left", null);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse00479c04a1423d7d3a6() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", null);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", 0);
    Reflector.setField(o, "left", null);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse3() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", 0);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", null);
    Reflector.setField(o, "left", null);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse002b0959c1306727052() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", -2_147_483_648);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", null);
    Reflector.setField(o, "left", 0);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse10() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", null);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", 0);
    Reflector.setField(o, "left", null);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse11() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", null);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", null);
    Reflector.setField(o, "left", 0);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse5() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", null);
    Reflector.setField(pair, "left", 0);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", 0);
    Reflector.setField(o, "left", 0);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse12() throws InvocationTargetException {

    // Arrange
    final Pair pair = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(pair, "right", 0);
    Reflector.setField(pair, "left", null);
    final Pair o = (Pair)Reflector.getInstance("com.clearspring.analytics.util.Pair");
    Reflector.setField(o, "right", null);
    Reflector.setField(o, "left", null);

    // Act and Assert result
    Assert.assertFalse(pair.equals(o));
  }
}
