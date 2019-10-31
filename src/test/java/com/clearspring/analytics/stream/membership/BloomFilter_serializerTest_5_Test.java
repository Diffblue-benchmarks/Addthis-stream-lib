package com.clearspring.analytics.stream.membership;

import com.clearspring.analytics.stream.membership.BloomFilter;
import com.clearspring.analytics.stream.membership.BloomFilterSerializer;
import com.clearspring.analytics.stream.membership.ICompactSerializer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BloomFilter_serializerTest_5_Test {
  @Test
  public void serializerTest() throws Exception {
    // Arrange and Act
    ICompactSerializer<BloomFilter> actual = BloomFilter.serializer();

    // Assert
    Assert.assertTrue(actual instanceof BloomFilterSerializer);
    Assert.assertNotNull(((BloomFilterSerializer) actual).toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
