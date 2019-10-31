package com.clearspring.analytics.util;

import com.clearspring.analytics.util.Lists;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Lists_newArrayListTest_1_Test {
  @Test
  public void newArrayListTest() throws Exception {
    // Arrange
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("aaaaa");

    // Act
    List<Object> actual = Lists.<Object>newArrayList(arrayList);

    // Assert
    Assert.assertTrue(actual instanceof ArrayList);
    Assert.assertEquals(1, arrayList.size());
    Object getResult = arrayList.get(0);
    Assert.assertTrue(getResult instanceof String);
    Assert.assertEquals("aaaaa", getResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
