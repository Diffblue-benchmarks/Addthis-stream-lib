package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Lists;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListsTest {

  // Test written by Diffblue Cover.

  @Test
  public void newArrayListInput0Output00002f9ee707451cf7db() {

    // Arrange
    final ArrayList source = new ArrayList();

    // Act
    final List actual = Lists.newArrayList(source);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void newArrayListInput1Output10018f6c648c9a646fab() {

    // Arrange
    final ArrayList source = new ArrayList();
    source.add(null);

    // Act
    final List actual = Lists.newArrayList(source);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final Lists actual = new Lists();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void newArrayListInput0Output02() {

    // Arrange
    final ArrayList source = new ArrayList();

    // Act
    final List actual = Lists.newArrayList(source);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void newArrayListInput1Output1() {

    // Arrange
    final ArrayList source = new ArrayList();
    source.add(null);

    // Act
    final List actual = Lists.newArrayList(source);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void newArrayListInputNotNullOutput0000999a5cb64d82d040() {

    // Arrange
    final ArrayList source = new ArrayList();

    // Act
    final List actual = Lists.newArrayList(source);

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void newArrayListOutput0() {

    // Act
    final List actual = Lists.newArrayList();

    // Assert result
    final ArrayList arrayList = new ArrayList();
    Assert.assertEquals(arrayList, actual);
  }
}
