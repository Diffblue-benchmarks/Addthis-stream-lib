package com.clearspring.analytics.stream.membership;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.clearspring.analytics.stream.membership.Filter;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class FilterTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final Filter actual = new Filter();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.hashCount);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHashCountOutputZero() throws InvocationTargetException {

    // Arrange
    final Filter filter =
        (Filter)Reflector.getInstance("com.clearspring.analytics.stream.membership.Filter");
    filter.hashCount = 0;

    // Act and Assert result
    Assert.assertEquals(0, filter.getHashCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInputNotNullOutput02() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    PowerMockito.doCallRealMethod().when(filter);
    filter.getHashBuckets(or(isA(String.class), isNull(String.class)));
    final Method bucketsMethod = DTUMemberMatcher.method(Filter.class, "buckets");
    PowerMockito.when(filter, bucketsMethod).withNoArguments().thenReturn(0);
    filter.hashCount = 0;
    final String key = "\u1825";

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInputNotNullOutput1() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    PowerMockito.doCallRealMethod().when(filter);
    filter.getHashBuckets(or(isA(String.class), isNull(String.class)));
    final Method bucketsMethod = DTUMemberMatcher.method(Filter.class, "buckets");
    PowerMockito.when(filter, bucketsMethod).withNoArguments().thenReturn(1);
    filter.hashCount = 1;
    final String key = "\u3413\u7fd1\u669d";

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInputNotNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final Object myJava::array[int] = Reflector.getInstance("java::array[int]");
    Reflector.setField(myJava::array[int], "data", null);
    Reflector.setField(myJava::array[int], "length", 0);
    PowerMockito.when(filter.getHashBuckets(or(isA(String.class), isNull(String.class))))
        .thenReturn(myJava::array[int]);
    filter.hashCount = 0;

    // Act
    final int[] actual = filter.getHashBuckets("\u0000");

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInputNotNullOutput13() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    PowerMockito.doCallRealMethod().when(filter);
    filter.getHashBuckets(or(isA(String.class), isNull(String.class)));
    final Method bucketsMethod = DTUMemberMatcher.method(Filter.class, "buckets");
    PowerMockito.when(filter, bucketsMethod).withNoArguments().thenReturn(189_136_896);
    filter.hashCount = 1;
    final String key = "\u0df7";

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {1_775_518}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInputNotNullOutput12() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    PowerMockito.doCallRealMethod().when(filter);
    filter.getHashBuckets(or(isA(String.class), isNull(String.class)));
    final Method bucketsMethod = DTUMemberMatcher.method(Filter.class, "buckets");
    PowerMockito.when(filter, bucketsMethod).withNoArguments().thenReturn(-335_548_672);
    filter.hashCount = 1;
    final String key = "\ub2b2\u99a4\u085e\u3d82\ud0d4\u1aa0\ud231";

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {265_133_965}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInputNotNullOutput7() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    PowerMockito.doCallRealMethod().when(filter);
    filter.getHashBuckets(or(isA(String.class), isNull(String.class)));
    final Method bucketsMethod = DTUMemberMatcher.method(Filter.class, "buckets");
    PowerMockito.when(filter, bucketsMethod).withNoArguments().thenReturn(536_870_912);
    filter.hashCount = 7;
    final String key = "\ucb65\ucf0c\u095a\u9f00\u2333";

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {412_378_773, 211_635_539, 10_892_305, 347_019_983,
                                        390_594_163, 54_466_485, 255_209_719},
                             actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInputNotNullOutput0() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    PowerMockito.doCallRealMethod().when(filter);
    filter.getHashBuckets(or(isA(String.class), isNull(String.class)));
    final Method bucketsMethod = DTUMemberMatcher.method(Filter.class, "buckets");
    PowerMockito.when(filter, bucketsMethod).withNoArguments().thenReturn(0);
    filter.hashCount = 0;
    final String key = "\u3413\u7fd1\u669d";

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput6Output1() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {593_908_983};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 1;
    final byte[] key = {(byte)119, (byte)-86, (byte)-2, (byte)39, (byte)-26, (byte)93};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {593_908_983}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHashBucketsInputNotNullPositivePositiveOutput1() {

    // Act
    final int[] actual = Filter.getHashBuckets("foo", 1, 71_968_356);

    // Assert result
    Assert.assertArrayEquals(new int[] {30_847_986}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput13Output1() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {2_868_394};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 1;
    final byte[] key = {(byte)0,    (byte)0,  (byte)0,  (byte)0,   (byte)81, (byte)122, (byte)88,
                        (byte)-104, (byte)89, (byte)50, (byte)-17, (byte)-5, (byte)39};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {2_868_394}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getHashBucketsInputNotNullPositivePositiveOutput12() {

    // Arrange
    final String key = "\uc829\u2ba1\u7479";
    final int hashCount = 1;
    final int max = 137_371_648;

    // Act
    final int[] actual = Filter.getHashBuckets(key, hashCount, max);

    // Assert result
    Assert.assertArrayEquals(new int[] {10_696_936}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput0Output10019d5b16bc9770887b() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {0};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 1;
    final byte[] key = {};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHashBucketsInput6PositiveNegativeOutput3() {

    // Arrange
    final byte[] b = {(byte)-125, (byte)110, (byte)-40, (byte)-14, (byte)36, (byte)82};

    // Act
    final int[] actual = Filter.getHashBuckets(b, 3, -488_620_032);

    // Assert result
    Assert.assertArrayEquals(new int[] {171_049_609, 338_404_400, 26_768_663}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput10Output1() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {306_802_344};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 1;
    final byte[] key = {(byte)-6, (byte)56, (byte)-45,  (byte)1,   (byte)99,
                        (byte)97, (byte)34, (byte)-105, (byte)-52, (byte)32};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {306_802_344}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput8Output1() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {185_713_523};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 1;
    final byte[] key = {(byte)98, (byte)-89, (byte)39,  (byte)62,
                        (byte)22, (byte)43,  (byte)104, (byte)67};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {185_713_523}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getHashBucketsInputNotNullPositiveNegativeOutput1() {

    // Arrange
    final String key = "\ubae0\u5832\u58b6";
    final int hashCount = 1;
    final int max = -415_236_096;

    // Act
    final int[] actual = Filter.getHashBuckets(key, hashCount, max);

    // Assert result
    Assert.assertArrayEquals(new int[] {204_667_251}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getHashBucketsInputNotNullPositiveNegativeOutput2() {

    // Arrange
    final String key = "\u0211\ua2ef";
    final int hashCount = 2;
    final int max = -74_547_200;

    // Act
    final int[] actual = Filter.getHashBuckets(key, hashCount, max);

    // Assert result
    Assert.assertArrayEquals(new int[] {65_982_242, 62_540_294}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getHashBucketsInputNotNullPositiveNegativeOutput5() {

    // Arrange
    final String key =
        "\uce9d\ucc15\u380c\uc6b0\ud645\ucf64\ud1e0\ucfef\u7edc\u82f0\ua586\u8202\u8826\u1081\u363d";
    final int hashCount = 5;
    final int max = -2_012_884_960;

    // Act
    final int[] actual = Filter.getHashBuckets(key, hashCount, max);

    // Assert result
    Assert.assertArrayEquals(
        new int[] {881_386_945, 1_081_547_978, 1_281_709_011, 1_481_870_044, 1_682_031_077},
        actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getHashBucketsInputNotNullPositiveNegativeOutput12() {

    // Arrange
    final String key = "\u9aba\u430f\ub330\u4055\u405c\u0000";
    final int hashCount = 1;
    final int max = -1_073_741_824;

    // Act
    final int[] actual = Filter.getHashBuckets(key, hashCount, max);

    // Assert result
    Assert.assertArrayEquals(new int[] {1_008_903_670}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput8Output0() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 0;
    final byte[] key = {(byte)98, (byte)-89, (byte)39,  (byte)62,
                        (byte)22, (byte)43,  (byte)104, (byte)67};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput10Output0() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 0;
    final byte[] key = {(byte)-6, (byte)56, (byte)-45,  (byte)1,   (byte)99,
                        (byte)97, (byte)34, (byte)-105, (byte)-52, (byte)32};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput0OutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final Object myJava::array[int] = Reflector.getInstance("java::array[int]");
    Reflector.setField(myJava::array[int], "data", null);
    Reflector.setField(myJava::array[int], "length", 0);
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myJava::array[int]);
    filter.hashCount = 0;
    final byte[] key = {};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput3Output0() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 0;
    final byte[] key = {(byte)38, (byte)50, (byte)91};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput13Output0() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 0;
    final byte[] key = {(byte)0,    (byte)0,  (byte)0,  (byte)0,   (byte)81, (byte)122, (byte)88,
                        (byte)-104, (byte)89, (byte)50, (byte)-17, (byte)-5, (byte)39};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput9Output0() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 0;
    final byte[] key = {(byte)-45, (byte)76, (byte)-110, (byte)-90, (byte)-89,
                        (byte)43,  (byte)21, (byte)95,   (byte)-88};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Filter.class)
  @Test
  public void getHashBucketsInput6Output0() throws Exception {

    // Arrange
    final Filter filter = PowerMockito.mock(Filter.class);
    final int[] myIntArray = {};
    PowerMockito.when(filter.getHashBuckets(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn(myIntArray);
    filter.hashCount = 0;
    final byte[] key = {(byte)119, (byte)-86, (byte)-2, (byte)39, (byte)-26, (byte)93};

    // Act
    final int[] actual = filter.getHashBuckets(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHashBucketsInput6ZeroNegativeOutput0() {

    // Arrange
    final byte[] b = {(byte)-125, (byte)110, (byte)-40, (byte)-14, (byte)36, (byte)82};

    // Act
    final int[] actual = Filter.getHashBuckets(b, 0, -488_620_032);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHashBucketsInputNotNullZeroZeroOutput0() {

    // Act
    final int[] actual = Filter.getHashBuckets("foo", 0, 0);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getHashBucketsInputNotNullZeroZeroOutput02() {

    // Arrange
    final String key = "";
    final int hashCount = 0;
    final int max = 0;

    // Act
    final int[] actual = Filter.getHashBuckets(key, hashCount, max);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getHashBucketsInputNotNullZeroZeroOutput03() {

    // Arrange
    final String key = "\u2a4d\u7804";
    final int hashCount = 0;
    final int max = 0;

    // Act
    final int[] actual = Filter.getHashBuckets(key, hashCount, max);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getHashBucketsInputNotNullZeroZeroOutput04() {

    // Arrange
    final String key =
        "\uc649\u2d85\u3451\u5a21\u47dd\u039c\u761e\u0000\u0000 \ub037\ucb2e\u2bd3\u039a";
    final int hashCount = 0;
    final int max = 0;

    // Act
    final int[] actual = Filter.getHashBuckets(key, hashCount, max);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHashBucketsInputNotNullZeroZeroOutputNotNull() {

    // Act
    final int[] actual = Filter.getHashBuckets("\u0000", 0, 0);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHashBucketsInput3ZeroPositiveOutput0() {

    // Arrange
    final byte[] b = {(byte)85, (byte)-73, (byte)16};

    // Act
    final int[] actual = Filter.getHashBuckets(b, 0, 4_813_550);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }
}
