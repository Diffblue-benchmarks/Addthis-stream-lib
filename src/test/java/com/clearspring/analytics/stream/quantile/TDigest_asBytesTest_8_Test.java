package com.clearspring.analytics.stream.quantile;

import com.clearspring.analytics.stream.quantile.GroupTree;
import com.clearspring.analytics.stream.quantile.TDigest;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class TDigest_asBytesTest_8_Test {
//failed_compile   @Test
//  public void asBytesTest() throws Exception {
//    // Arrange
//    TDigest tDigest = new TDigest(1.0);
//    ByteBuffer buf = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    tDigest.asBytes(buf);
//    String toStringResult = tDigest.toString();
//    int sizeResult = tDigest.size();
//    Iterable<TDigest.Group> centroidsResult = tDigest.centroids();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(1.0, tDigest.compression());
//    Assert.assertTrue(centroidsResult instanceof GroupTree);
//    Assert.assertEquals(0, sizeResult);
//    String toStringResult1 = ((GroupTree) centroidsResult).toString();
//    int sumResult = ((GroupTree) centroidsResult).sum();
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(0, ((GroupTree) centroidsResult).size());
//    Assert.assertEquals(0, sumResult);
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
