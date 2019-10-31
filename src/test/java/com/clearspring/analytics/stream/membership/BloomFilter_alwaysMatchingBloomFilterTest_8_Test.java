package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.BloomFilter;
import com.clearspring.analytics.stream.membership.BloomFilterSerializer;
import com.clearspring.analytics.stream.membership.Filter;
import com.clearspring.analytics.stream.membership.ICompactSerializer;
import java.util.BitSet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BloomFilter_alwaysMatchingBloomFilterTest_8_Test {
//failed_compile   @Test
//  public void alwaysMatchingBloomFilterTest() throws Exception {
//    // Arrange and Act
//    BloomFilter actual = BloomFilter.alwaysMatchingBloomFilter();
//
//    // Assert
//    int bucketsResult = actual.buckets();
//    int hashCount = actual.getHashCount();
//    String toStringResult = actual.toString();
//    BitSet filterResult = actual.filter();
//    ICompactSerializer tserializerResult = actual.tserializer();
//    ICompactSerializer<Filter> serializer = actual.getSerializer();
//    Assert.assertEquals(64, bucketsResult);
//    Assert.assertTrue(serializer instanceof BloomFilterSerializer);
//    Assert.assertTrue(tserializerResult instanceof BloomFilterSerializer);
//    String toStringResult1 = ((BloomFilterSerializer) serializer).toString();
//    Assert.assertSame(serializer, tserializerResult);
//    Assert.assertEquals(1, hashCount);
//    String toStringResult2 = filterResult.toString();
//    boolean isEmptyResult = filterResult.isEmpty();
//    Assert.assertEquals(
//        "{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63}",
//        toStringResult);
//    Assert.assertEquals(64, filterResult.size());
//    Assert.assertFalse(isEmptyResult);
//    Assert.assertEquals(
//        "{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63}",
//        toStringResult2);
//    Assert.assertNotNull(toStringResult1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
