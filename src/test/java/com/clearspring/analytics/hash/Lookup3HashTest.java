package com.clearspring.analytics.hash;

import com.clearspring.analytics.hash.Lookup3Hash;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Lookup3HashTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycs64InputNotNullPositivePositiveNegativeOutputStringIndexOutOfBoundsException2() {

    // Arrange
    final CharSequence s =
        "\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\ufc38\udbf7\u0ce8\u5800\udb2f\uc7f3\udbfa\u9bb0\uda19\ubc13\ud801\u0339\udbfb\ue095\uda33\u3ba9\u5a20\udbf7\udbf7";
    final int start = 19;
    final int end = 97;
    final long initval = -7_886_328_821_075_847_639L;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveZeroOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s =
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, 77, 79, 0L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveZeroOutputStringIndexOutOfBoundsException3() {

    // Arrange
    final CharSequence s =
        "\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\uda00";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, 14, 17, 0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveZeroOutputStringIndexOutOfBoundsException2() {

    // Arrange
    final CharSequence s =
        "\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, 77, 79, 0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveZeroOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s =
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, 87, 89, 0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycsInputNotNullPositivePositivePositiveOutputStringIndexOutOfBoundsException3() {

    // Arrange
    final CharSequence s =
        "\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\ud816\u6500\udbff\ufa3f\ud908\u099c\udba4\uc7c0\udb0b\u3176\udb47\uc032\u37fc\u077d\uaa46\uedee\u0eff\u707d\u55f8\udf77\u580c\ud919\u7d99\uf800\ud96f\ufede";
    final int start = 74;
    final int end = 536_870_922;
    final int initval = 730_724_656;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycsInputNotNullPositivePositivePositiveOutputStringIndexOutOfBoundsException2() {

    // Arrange
    final CharSequence s =
        "\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\u2e35\udbf6\ufe1f\uda87\u953f\ud8b7\u00ee\udbff\u4ea0\ud9ad\ubb4e\uda6f\u1dc7\ud9fd\u293e\uc683\ud980\ua1a1";
    final int start = 37;
    final int end = 365;
    final int initval = 447_352_876;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycsInputNotNullPositivePositivePositiveOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s =
        "\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\ud97f\u2e35\udbf6\ufe1f\uda87\u953f\ud8b7\u00ee\udbff\u4ea0\ud9ad\ubb4e\uda6f\u1dc7\ud9fd\u293e\uc683\ud980\ua1a1\uf400";
    final int start = 37;
    final int end = 365;
    final int initval = 447_352_876;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void
  lookup3ycs64InputNotNullNegativePositiveNegativeOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s =
        "\uf3de\uf300\ud83e\uf9d6\ud807\u0d38\udbbf\udeac\ud9b7\u6fef\udbff\u5e29\udbc0\ue4a3\uda75\ub9c0\uda8f\ua998\ud8a0\u01c0???????????????????????????????????????????";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, -2, 20, -7_051_559_810_472_762_644L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void
  lookup3ycs64InputNotNullNegativePositiveNegativeOutputStringIndexOutOfBoundsException2() {

    // Arrange
    final CharSequence s =
        "\u5680\uda00\uc67c\uda77\uc417\uc3b0\ufa90\udadd\u3903\u8000\u0083\ucfff";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, -6, 7, -5_491_425_987_816_765_552L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullNegativeZeroZeroOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s = "?";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, -5, 0, 0L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycs64InputNotNullPositivePositiveNegativeOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s =
        "\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\uf99d\u03c1\ud800\ud817\ud816\u49ea\udae3\uef3d\udbb0\u12bd\udb99";
    final int start = 33;
    final int end = 47;
    final long initval = -9_140_672_397_542_573_345L;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveZeroOutputStringIndexOutOfBoundsException4() {

    // Arrange
    final CharSequence s =
        "\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0ffe\u0fff\u0ffe";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, 62, 16_777_216, 0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycs64InputNotNullPositivePositiveNegativeOutputStringIndexOutOfBoundsException3() {

    // Arrange
    final CharSequence s =
        "\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\udb38\ufe02\uda17\u0372\u5800\ud803\u0a15\udb78\u03b9\ud859\u4474\ud81a\u5250\udbfa\ud275\udbf9\u34ea\ud800\u8f5a\u58c7\ud932";
    final int start = 18;
    final int end = 101;
    final long initval = -4_932_948_316_599_991_509L;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycs64InputNotNullPositivePositivePositiveOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s =
        "\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\ud8e4\u53f0\u8e75\u04df\udb3a\u4d66\u96bc\ubcaa\u6be5";
    final int start = 36;
    final int end = 47;
    final long initval = 8_088_623_261_277_317_391L;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycs64InputNotNullPositivePositivePositiveOutputStringIndexOutOfBoundsException2() {

    // Arrange
    final CharSequence s =
        "\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\udb78\ucd05\ud8fd\uffee\udc00\ud859\ub3f2\ud99f\ufcc4\udbfe\u6687\uda5f\u9842\ud9bf\ud52f\udb13\u0ce4\udb08\u4082\udbff\ufe29\ud9d3\u92ab\udbdf\uea2c\ud804\ufb46\udaa3\u04af\udad7\u0343\ud800\u0c44\ud802\u6fac\u6fc2\u1f5b\udaf1\uf285\ufbed\udbcb\ufbc8\ud8b8";
    final int start = 26;
    final int end = 1_073_741_855;
    final long initval = 6_317_410_134_231_990_464L;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveZeroOutputStringIndexOutOfBoundsException2() {

    // Arrange
    final CharSequence s =
        "\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, 77, 79, 0L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveZeroOutputStringIndexOutOfBoundsException3() {

    // Arrange
    final CharSequence s =
        "\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\uda00";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, 76, 1_610_612_737, 0L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveZeroOutputStringIndexOutOfBoundsException4() {

    // Arrange
    final CharSequence s = "\u0ffe\u0ffe\u0fff\u0ffe";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, 1, 5, 0L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void lookup3ycs64InputNotNullZeroPositiveNegativeOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s =
        "\u2b91\u8685\ud800\udb59\u471e\ud800\u18ff\ud879\u1b76\uda14\ued7d\ud938";
    final int start = 0;
    final int end = 41;
    final long initval = -8_397_626_257_621_246_726L;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs64(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycsInputNotNullPositivePositiveNegativeOutputStringIndexOutOfBoundsException3() {

    // Arrange
    final CharSequence s =
        "\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\udab0\u761b\ud837";
    final int start = 13;
    final int end = 18;
    final int initval = -300_990_598;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycsInputNotNullPositivePositiveNegativeOutputStringIndexOutOfBoundsException2() {

    // Arrange
    final CharSequence s =
        "\uda40\uda40\u9e10\u0130\u6830\ud80a\u00ce\u8808\ueb00\uda96\uff51\uc800\u0d90\udbfc";
    final int start = 1;
    final int end = 28;
    final int initval = -297_520_767;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void
  lookup3ycsInputNotNullPositivePositiveNegativeOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s =
        "\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\ud8f5\u0400\udbff\ubc00\u1c00\udaf3\u07ba\ud956\uccdf\ud9c7\u97bd\udbbc\uf022\ud9fd\ufe7e\udbff\ufca7\ubc80\ud800";
    final int start = 22;
    final int end = 47;
    final int initval = -98_826_991;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, start, end, initval);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void
  lookup3ycsInputNotNullNegativePositivePositiveOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s = "???????????????????????????????????????????????????????????";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, -17, 2_147_483_631, 1_189_206_293);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullNegativeZeroZeroOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence s = "?";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Lookup3Hash.lookup3ycs(s, -5, 0, 0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputPositive3() {

    // Arrange
    final CharSequence s =
        "\ud8be\u3255\ud9a5\u6de5\uda85\u8ab5\uda02H\u4024\ud801\u270d\udbc2\ub67f\ud876\ue526\ud8fe\u6cec\ud8b1\u1668\uda6e\uf896\ud8e5\ud57a\ud980\uff3a\u2c9a\u5998";

    // Act and Assert result
    Assert.assertEquals(1_032_465_835_995_112_151L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputPositive4() {

    // Arrange
    final CharSequence s = "\u0000";

    // Act and Assert result
    Assert.assertEquals(7_265_518_900_484_235_803L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputPositive5() {

    // Arrange
    final CharSequence s = "\ud801";

    // Act and Assert result
    Assert.assertEquals(6_257_257_925_178_294_819L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputPositive6() {

    // Arrange
    final CharSequence s = "\u0000\ud801";

    // Act and Assert result
    Assert.assertEquals(1_884_641_024_012_370_659L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputPositive7() {

    // Arrange
    final CharSequence s = "\u0000\u0000\ud801\u0000";

    // Act and Assert result
    Assert.assertEquals(6_791_112_804_976_923_885L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputPositive8() {

    // Arrange
    final CharSequence s = "\u0000\u0000\u0000\u0000";

    // Act and Assert result
    Assert.assertEquals(1_886_476_249_982_024_086L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveNegativeOutputNegative() {

    // Arrange
    final CharSequence s =
        "\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\udbb6\u9d82\uda37\uf4ab\u58d1\udac2\u5139\udbd6\ufd78\ud980\u0be4\ud9be\ue248\udb3e\u8c20\uda1f\ud6aa\udb7c\u2e0c\ufff3\u3941\u83f1??????????????????";

    // Act and Assert result
    Assert.assertEquals(-36_033_999_789_925_415L,
                        Lookup3Hash.lookup3ycs64(s, 60, 79, -3_480_850_343_124_554_907L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveNegativeOutputNegative2() {

    // Arrange
    final CharSequence s =
        "\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ud966\ue308\ufa31\u14d1\udac2\u5139\udbd6\ufd78\ud980\u0be4\ud9be\ue248\udb3e\u8c20\uda1f\ud6aa\udb7c\u2e0c\ufff3\u3941\u83f1??????????????????";

    // Act and Assert result
    Assert.assertEquals(-36_033_999_789_925_415L,
                        Lookup3Hash.lookup3ycs64(s, 61, 79, -3_483_302_778_039_917_089L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveNegativeOutputNegative3() {

    // Arrange
    final CharSequence s =
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000?????";

    // Act and Assert result
    Assert.assertEquals(-9_192_409_788_767_010_816L,
                        Lookup3Hash.lookup3ycs64(s, 91, 92, -6_122_080_740_686_413_551L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveNegativeOutputNegative4() {

    // Arrange
    final CharSequence s =
        "\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\udc00\uda00???";

    // Act and Assert result
    Assert.assertEquals(-7_061_644_213_626_731_754L,
                        Lookup3Hash.lookup3ycs64(s, 94, 96, -1_975_148_296_753_027_311L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveNegativeOutputNegative5() {

    // Arrange
    final CharSequence s =
        "\uf6fe\uf6fe\uf6fe\uf6fe\u4503\udbf8\ubabc?????????????????????????????????????????????????????????????????????????????????????????????";

    // Act and Assert result
    Assert.assertEquals(-4_787_388_133_603_972_328L,
                        Lookup3Hash.lookup3ycs64(s, 3, 7, -7_231_299_319_959_006_087L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveNegativeOutputPositive() {

    // Arrange
    final CharSequence s =
        "\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\u2ef1\udab7\uf3de\uf300\ud83e\uf9d6\ud807\u0d38\udbbf\udeac\ud9b7\u6fef\udbff\u5e29\udbc0\ue4a3\uda75\ub9c0\uda8f\ua998\ud8a0\u01c0???????";

    // Act and Assert result
    Assert.assertEquals(4_761_263_134_675_452_416L,
                        Lookup3Hash.lookup3ycs64(s, 34, 56, -7_051_559_810_472_762_644L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveNegativeOutputPositive2() {

    // Arrange
    final CharSequence s =
        "\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\udbfe\uf99d\u03c1\ue4fb\ud816\u4642\udae2\ude4d\udbb0\u12ad\u0bf9\u1984\ud802\u038b\u8eb0\ub4ff\ufae1????";

    // Act and Assert result
    Assert.assertEquals(6_474_822_281_574_506_483L,
                        Lookup3Hash.lookup3ycs64(s, 34, 47, -9_140_646_988_516_050_209L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositiveNegativeOutputPositive3() {

    // Arrange
    final CharSequence s =
        "\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\ud900\uea43";

    // Act and Assert result
    Assert.assertEquals(6_657_297_019_284_616_312L,
                        Lookup3Hash.lookup3ycs64(s, 60, 62, -4_753_552_796_978_562_449L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullZeroPositiveNegativeOutputNegative() {

    // Arrange
    final CharSequence s = "\ud9fb?????";

    // Act and Assert result
    Assert.assertEquals(-205_210_236, Lookup3Hash.lookup3ycs(s, 0, 1, -859_670_835));
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final Lookup3Hash actual = new Lookup3Hash();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositivePositiveOutputPositive2() {

    // Arrange
    final CharSequence s =
        "\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\udbd2\u79bf";

    // Act and Assert result
    Assert.assertEquals(632_325_935, Lookup3Hash.lookup3ycs(s, 92, 94, 887_994_430));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositivePositiveOutputNegative() {

    // Arrange
    final CharSequence s =
        "\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\uf800\udac0\u071a\u0a39\ud899\ude61\ucfa6\u590c\uc32c\ud84f\udd17\uda5e\u6926\u69a4\udb00\u5ba1\ud800\u7aec\u5802\u3d37\udb46\u407c\u86b0\ud817\u2fff\ua617\uebdf\uaff0\ud8fe\u4828\udc04\ud9cc\ucfa6\udd40????????????????";

    // Act and Assert result
    Assert.assertEquals(-5_836_894_945_109_476_337L,
                        Lookup3Hash.lookup3ycs64(s, 43, 75, 3_181_425_152_097_659_050L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositivePositiveOutputNegative2() {

    // Arrange
    final CharSequence s =
        "\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\uffe7\u0683\u5804\ud8c1\ud60d\ud8f7\u00fa\ud888\ua010\udbf8\ude7a\uda3a\u9944\ud869\u1238\udbd8\u9587\udbf3\uf424\uef55\udb01\uf978\ud80f\uffed\ud911\ud79e\u0262\ud89c\uf6fb\u4f76\ud800\ucd88\udbf1\u99f0\ud8fe\uca70\ud804\uda8c\udcf7\uca11?????????????????";

    // Act and Assert result
    Assert.assertEquals(-7_933_407_107_821_201_533L,
                        Lookup3Hash.lookup3ycs64(s, 38, 76, 8_584_008_318_661_567_224L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositivePositiveOutputNegative3() {

    // Arrange
    final CharSequence s = "\u0081\u0081\u0081\u0081\u0000?";

    // Act and Assert result
    Assert.assertEquals(-495_384_962_409_170_301L,
                        Lookup3Hash.lookup3ycs64(s, 3, 5, 3_600_096_304_440_826_641L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositivePositiveOutputPositive() {

    // Arrange
    final CharSequence s =
        "\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\ud9f8\u008e\udbff\uf63d\ue000\ud940\u84e8\udb07\u1220\udab4\ue880\udb84\uf501\udb80\ubdb1\udb05\udf57\ucfdf\ud800\ufa3e\uf410??????";

    // Act and Assert result
    Assert.assertEquals(1_693_445_167_793_272_073L,
                        Lookup3Hash.lookup3ycs64(s, 70, 89, 1_096_992_406_031_144_010L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositivePositiveOutputPositive2() {

    // Arrange
    final CharSequence s =
        "\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\uda51\u9054\ud830\ucba1\ud800\udb59\udbff\ucdd4\udbb0A\udbda\ud271\ud8d7\u8510\ud800\u521b\udbb0\udc49\ud87f\ud9ed\ud860\ud0e0???????????????????";

    // Act and Assert result
    Assert.assertEquals(7_698_666_618_615_622_944L,
                        Lookup3Hash.lookup3ycs64(s, 59, 78, 3_290_017_694_555_596_018L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositivePositiveOutputPositive3() {

    // Arrange
    final CharSequence s =
        "\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\udbff\uffe7\u0683\u5804\ud8c1\ud60d\ud8f7\u00fa\ud888\ua010\udbf8\ude7a\uda3a\u9944\ud869\u1238\udbd8\u9587\udbf3\uf424\uef55\udb01\uf978\ud80f\uffed\ud911\ud79e\u0262\ud89c\uf6fb\u4f76\ud800\ucd88\udbf1\u99f0\ud8fe\uca70\udc04\uda8c\udcf7\ud8f7\uca11????????????????????????";

    // Act and Assert result
    Assert.assertEquals(7_736_710_354_771_595_590L,
                        Lookup3Hash.lookup3ycs64(s, 30, 72, 8_584_008_318_661_567_224L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullPositivePositivePositiveOutputPositive4() {

    // Arrange
    final CharSequence s =
        "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\u905a\u2b5f??????";

    // Act and Assert result
    Assert.assertEquals(8_059_613_174_143_983_743L,
                        Lookup3Hash.lookup3ycs64(s, 62, 65, 8_362_116_168_765_423_890L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputNegative() {

    // Arrange
    final CharSequence s =
        "\ud9e2\u8410\ud9fa\u013b\ud803\u0013\ud913\ud912\ud913\ud9e2\udc00\ud912\ud9f2\ud9f2\ud812\ud812\ud813\ud813\ud813\ud813\ud813\ud813\ud952";

    // Act and Assert result
    Assert.assertEquals(-607_655_579_947_593_051L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputNegative2() {

    // Arrange
    final CharSequence s =
        "\ud9e2\u8400\ud9fa\u011b\ud803\u0013\udc01\ud801\ud9e2\ud900\ud800\udc00\udc21\udc00\ud901";

    // Act and Assert result
    Assert.assertEquals(-8_797_870_087_284_015_363L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositivePositiveOutputNegative5() {

    // Arrange
    final CharSequence s =
        "\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ueffc\ud8db???????????????????????????????";

    // Act and Assert result
    Assert.assertEquals(-1_231_047_325, Lookup3Hash.lookup3ycs(s, 62, 64, 345_293_496));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositivePositiveOutputPositive() {

    // Arrange
    final CharSequence s =
        "\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\udbfd\ue400\ud87f\u5a00\u7a00\uda75\ufd3f\ud900\u2017\uda9c\u56ba\u0093\ue749\u36ed\udaa8\u1987";

    // Act and Assert result
    Assert.assertEquals(555_964_077, Lookup3Hash.lookup3ycs(s, 33, 48, 1_332_377_873));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputNegative4() {

    // Arrange
    final CharSequence s =
        "\ud821\u01e4\u0525\ud885\ubb74\ud940\u426b\ud87b\u0c0a\uda41\u98f5\ud903\u49c1\udbbf\uba90\ud956\uc505\udab1\u09f2\udaf6\u91ac\u6f95\ud000\u0fef\ud3f1\u03c4\u2bfe\ub997\u1972";

    // Act and Assert result
    Assert.assertEquals(-9_001_755_919_994_792_983L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositivePositiveOutputNegative6() {

    // Arrange
    final CharSequence s =
        "\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u970a\u04f7\uc035??";

    // Act and Assert result
    Assert.assertEquals(-1_778_286_592, Lookup3Hash.lookup3ycs(s, 95, 98, 559_022_300));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputNegative6() {

    // Arrange
    final CharSequence s = "\ud801\u0000";

    // Act and Assert result
    Assert.assertEquals(-1_245_633_486_810_562_021L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullZeroPositivePositiveOutputZero() {

    // Arrange
    final CharSequence s = "\ud801";

    // Act and Assert result
    Assert.assertEquals(0L, Lookup3Hash.lookup3ycs64(s, 0, 1, 576_460_752_728_244_497L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositivePositiveOutputNegative4() {

    // Arrange
    final CharSequence s =
        "\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\ud9fd\u2708\ud8b7\u10d1\ud808\u057d\u0773\u5b2b\u5a01\uc30f\u8dee\u0384\udbf8\uf2a8\u6b87\u2445\ud88a\u908a\ua623\u7a98\ud945\u7684\udc00\u40ff\ud82a\ud800";

    // Act and Assert result
    Assert.assertEquals(-331_523_225, Lookup3Hash.lookup3ycs(s, 39, 63, 1_332_369_681));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositivePositiveOutputNegative3() {

    // Arrange
    final CharSequence s =
        "\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\ud801\u6541\u213f\ud823?\udbf8\u009f\ud800\u094d\uec69\u58ee\u056d\uea88\u0d01\u35f7\u9403\ud880\u933d\ufbfc\ud80e\uda00\ud94f\uf844\ue941\udc02\u0bb9";

    // Act and Assert result
    Assert.assertEquals(-1_052_303_192, Lookup3Hash.lookup3ycs(s, 37, 48, 1_767_440_900));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositivePositiveOutputNegative2() {

    // Arrange
    final CharSequence s =
        "\u9240\u9240\u9240\u9240\u9240\u9240\u9240\u9240\u9240\u9240\u9240\u9240\u9240\u9240\u9240\u9240\udbf0\u6190\ud9e7\uffe1\udb03\u9d03\ud900\u5367\ue372\ud9eb";

    // Act and Assert result
    Assert.assertEquals(-405_487_553, Lookup3Hash.lookup3ycs(s, 15, 26, 91_135_136));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositivePositiveOutputNegative() {

    // Arrange
    final CharSequence s =
        "\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\ud9ef\u517f\uda3f\uc76b\udb87\u185f\udbdb\ufa99\u8bfe\ud881\ufbbc\ud9ef\uc57f\udb0d\ueb13\ud99f\u60e3\ubd80\uf400";

    // Act and Assert result
    Assert.assertEquals(-1_930_048_064, Lookup3Hash.lookup3ycs(s, 69, 86, 279_584_810));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputNegative7() {

    // Arrange
    final CharSequence s = "\u0000\u0000";

    // Act and Assert result
    Assert.assertEquals(-7_270_198_351_474_189_075L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputNegative8() {

    // Arrange
    final CharSequence s = "\u0000\ud801\u0000";

    // Act and Assert result
    Assert.assertEquals(-2_576_154_517_191_869_203L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputNegative9() {

    // Arrange
    final CharSequence s = "\u0000\u0000\u0000";

    // Act and Assert result
    Assert.assertEquals(-7_270_198_351_474_189_075L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveNegativeOutputPositive3() {

    // Arrange
    final CharSequence s =
        "\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u4136\u42c5?";

    // Act and Assert result
    Assert.assertEquals(1_446_386_070, Lookup3Hash.lookup3ycs(s, 60, 62, -1_272_012_837));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveNegativeOutputPositive2() {

    // Arrange
    final CharSequence s =
        "\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\uda40\u9e10\u0130\u6830\u4cce\u8808\ueb00\uda96\uff51\ud800\u1590\udc00";

    // Act and Assert result
    Assert.assertEquals(285_908_414, Lookup3Hash.lookup3ycs(s, 18, 28, -297_520_767));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveNegativeOutputPositive() {

    // Arrange
    final CharSequence s =
        "\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\uda3f\u84b8\udbff\uf18c\ud807\u01b0\u085c\ud800\u29b0\udbfe\ue37b\uda62\ud830\udc00\uf400\ud9f6\u58bf???????????????????????????????????????????????????????????????";

    // Act and Assert result
    Assert.assertEquals(1_454_987_724, Lookup3Hash.lookup3ycs(s, 15, 24, -299_256_479));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveNegativeOutputNegative4() {

    // Arrange
    final CharSequence s =
        "\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\ua503\uefee\ud800\u884e?????";

    // Act and Assert result
    Assert.assertEquals(-1_697_291_390, Lookup3Hash.lookup3ycs(s, 64, 68, -917_359_359));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveNegativeOutputNegative3() {

    // Arrange
    final CharSequence s =
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000??";

    // Act and Assert result
    Assert.assertEquals(-671_088_640, Lookup3Hash.lookup3ycs(s, 59, 60, -1_991_098_095));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveNegativeOutputNegative2() {

    // Arrange
    final CharSequence s =
        "\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\ufa40\udab0\u761b\ud837";

    // Act and Assert result
    Assert.assertEquals(-1_308_085_344, Lookup3Hash.lookup3ycs(s, 13, 17, -300_990_598));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNotNullPositivePositiveNegativeOutputNegative() {

    // Arrange
    final CharSequence s =
        "\ufe40\ufe40\ufe40\ufe40\ufe40\ufe40\ufe40\ufe40\ufe40\ufe40\ufe40\ufe40\ufe40\ufe40\udab0\u7a1b\udc37\ud3e2\u54fd\u66a1\ud9ad\uc800\u2a8f\udbf9\uf400\ue1de\ud48f???";

    // Act and Assert result
    Assert.assertEquals(-1_792_875_999, Lookup3Hash.lookup3ycs(s, 13, 18, -300_991_622));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputPositive() {

    // Arrange
    final CharSequence s =
        "\ud9e2\u8410\ud9fa\u013b\ud803\u0013\ud913\ud912\ud913\ud9e2\udc00\ud912\ud9f2\ud9f2\ud812\ud812\ud813\ud813\ud813\udc00\ud813";

    // Act and Assert result
    Assert.assertEquals(1_252_318_511_123_424_046L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputPositive2() {

    // Arrange
    final CharSequence s =
        "\ud821\u01e4\u0525\ud885\ubb74\ud940\u426b\ud87b\u0c0a\uda41\u98f5\ud903\u49c1\udbbf\uba90\ud956\uc505\udab1\u09f2\udaf6\u91ac\u6f95\ud000\u0fef\ud3f1\u03c4\u2bfe\ub997\ud9f2";

    // Act and Assert result
    Assert.assertEquals(781_341_200_679_994_345L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input4PositiveNegativeNegativeOutputNegative() {

    // Arrange
    final int[] k = {565_506_072, 565_494_297, 564_407_045, 564_425_533};

    // Act and Assert result
    Assert.assertEquals(-1_163_788_301, Lookup3Hash.lookup3(k, 513, -2_130_706_429, -671_858_440));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput20PositiveZeroPositiveOutputPositive() {

    // Arrange
    final int[] k = {1_108_942_911, 1_331_687_906, 22_802_746,  1_435_569_496, -751_244_908,
                     220_598_481,   757_692_389,   757_692_389, 1_435_569_496, 1_437_619_034,
                     757_692_389,   -590_205_670,  757_692_389, 1_840_491_651, 1_844_573_602,
                     757_692_389,   22_098_962,    571_725_233, 733_206_194,   757_692_389};

    // Act and Assert result
    Assert.assertEquals(1_303_674_925, Lookup3Hash.lookup3ycs(k, 48, 0, 1_862_713_662));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput20PositiveNegativePositiveOutputPositive() {

    // Arrange
    final int[] k = {1_108_942_911, 1_331_687_906, 22_802_746,  1_435_569_496, -751_244_908,
                     220_598_481,   757_692_389,   757_692_389, 1_435_569_496, 1_437_619_034,
                     757_692_389,   -590_205_670,  757_692_389, 1_840_491_651, 1_844_573_602,
                     757_692_389,   22_098_962,    571_725_233, 733_206_194,   757_692_389};

    // Act and Assert result
    Assert.assertEquals(1_303_674_925,
                        Lookup3Hash.lookup3ycs(k, 48, -1_073_741_820, 1_862_713_662));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput19PositivePositivePositiveOutputNegative() {

    // Arrange
    final int[] k = {-1_103_856_053, 684_796_685,    -318_227_342,  704_242_491,    -384_945_138,
                     -818_357_046,   1_748_745_382,  1_748_745_382, 994_978_886,    1_748_745_382,
                     1_748_745_382,  -1_225_773_989, 61_418_939,    -1_200_687_051, 1_188_482_630,
                     -1_064_110_512, 525_160_086,    1_748_745_382, 994_978_887};

    // Act and Assert result
    Assert.assertEquals(-1_324_465_364, Lookup3Hash.lookup3ycs(k, 11, 7, 1_631_560_385));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput17PositivePositivePositiveOutputPositive() {

    // Arrange
    final int[] k = {565_525_452,    -1_217_368_566, 1_921_612_277,  -1_233_606_978, 1_989_112_200,
                     1_354_340_685,  -1_332_291_810, -1_529_910_848, -1_529_927_350, -1_560_604_235,
                     -1_878_049_859, -1_261_475_392, -1_355_472_605, 1_492_236_530,  -1_004_887_769,
                     -1_532_024_546, -1_529_910_848};

    // Act and Assert result
    Assert.assertEquals(1_888_239_554, Lookup3Hash.lookup3ycs(k, 9, 8, 1_423_251_775));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput10PositivePositivePositiveOutputPositive() {

    // Arrange
    final int[] k = {-20_902_969, 256_076_174, 155_323_051, 621_522_861,   554_220_994,
                     823_687_851, 155_323_051, 188_397_965, 2_144_676_806, 2_144_676_806};

    // Act and Assert result
    Assert.assertEquals(67_391_323, Lookup3Hash.lookup3ycs(k, 6, 2, 1_677_561_788));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput10PositivePositivePositiveOutputNegative() {

    // Arrange
    final int[] k = {528_563_143,  -293_381_746, -394_118_485, -40_783_955,   -124_584_510,
                     -394_118_485, -394_118_485, -761_202_291, 1_603_611_590, 1_603_611_590};

    // Act and Assert result
    Assert.assertEquals(-132_883_055, Lookup3Hash.lookup3ycs(k, 6, 3, 541_020_092));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput10PositivePositiveNegativeOutputPositive() {

    // Arrange
    final int[] k = {1_673_724_846, -2_033_622_045, -222_229_820,   739_223_488,   -1_358_185_049,
                     958_165_703,   -1_803_026_234, -2_092_985_887, 1_490_494_018, 1_490_494_018};

    // Act and Assert result
    Assert.assertEquals(701_497_344, Lookup3Hash.lookup3ycs(k, 6, 1, -895_336_175));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput5ZeroPositivePositiveOutputZero() {

    // Arrange
    final int[] k = {559_038_726, 592_609_541, 1_901_216_005, 559_731_508, 559_038_727};

    // Act and Assert result
    Assert.assertEquals(0, Lookup3Hash.lookup3ycs(k, 0, 3, 12));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput0PositiveZeroNegativeOutputNegative() {

    // Arrange
    final int[] k = {};

    // Act and Assert result
    Assert.assertEquals(-559_045_901, Lookup3Hash.lookup3ycs(k, 2_147_483_646, 0, -7164));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput0NegativeNegativePositiveOutputNegative() {

    // Arrange
    final int[] k = {};

    // Act and Assert result
    Assert.assertEquals(-559_038_733, Lookup3Hash.lookup3ycs(k, -2, -2_147_483_647, 4));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input4PositiveZeroNegativeOutputNegative() {

    // Arrange
    final int[] k = {565_506_072, 565_494_297, 564_407_045, 564_425_533};

    // Act and Assert result
    Assert.assertEquals(-1_163_788_301, Lookup3Hash.lookup3(k, 513, 0, -604_749_564));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input7PositiveNegativePositiveOutputNegative() {

    // Arrange
    final int[] k = {760_791_111, -1_494_171_199, 658_047_470,   2_024_432_128,
                     623_954_308, -1_546_599_994, -1_494_166_464};

    // Act and Assert result
    Assert.assertEquals(-542_245_121, Lookup3Hash.lookup3(k, 17, -2_147_483_648, 16_793_616));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input7PositivePositiveZeroOutputZero() {

    // Arrange
    final int[] k = {559_038_726, 559_038_726, 592_609_541, 1_901_216_005,
                     559_038_727, 559_038_727, 559_038_727};

    // Act and Assert result
    Assert.assertEquals(0, Lookup3Hash.lookup3(k, 1, 3, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInput20PositivePositiveNegativeOutputNegative() {

    // Arrange
    final int[] k = {-1_877_112_196, -1_655_460_845, 1_722_234_339,  -1_777_127_822, 346_070_359,
                     270_516_146,    -1_769_988_024, -1_769_988_024, -1_782_982_250, 346_070_359,
                     -1_769_988_024, 287_501_441,    -2_004_755_114, -1_350_838_433, -1_782_982_250,
                     346_070_359,    -1_782_982_250, -1_769_988_024, -1_782_982_250, 346_070_359};

    // Act and Assert result
    Assert.assertEquals(-928_364_884, Lookup3Hash.lookup3ycs(k, 11, 9, -1_693_349_533));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input7PositiveZeroPositiveOutputNegative() {

    // Arrange
    final int[] k = {492_355_655, -1_762_606_655, 121_176_558,   2_024_432_128,
                     623_954_308, -2_083_470_906, -1_494_166_464};

    // Act and Assert result
    Assert.assertEquals(-273_809_665, Lookup3Hash.lookup3(k, 17, 0, 285_229_072));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input9PositivePositiveNegativeOutputNegative() {

    // Arrange
    final int[] k = {-2_009_892_599, -2_009_892_599, -2_009_630_455, -2_009_892_599, -2_009_892_599,
                     -2_009_892_599, -2_009_892_599, -2_009_892_599, -2_009_892_599};

    // Act and Assert result
    Assert.assertEquals(-2_044_066_953, Lookup3Hash.lookup3(k, 7, 2, -1_014_215_040));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input20ZeroPositiveNegativeOutputPositive() {

    // Arrange
    final int[] k = {-2_134_900_046, -385_940_819,   -2_147_417_663, -2_120_924_776, -886_096_149,
                     1_025_898_556,  -1_368_834_876, -762_903_754,   1_623_343_207,  -395_174_993,
                     -848_886_625,   -1_529_486_600, -2_134_900_046, -831_135_148,   -2_134_900_046,
                     -168_623_477,   -934_605_068,   1_610_781_734,  -385_940_819,   -274_109_983};

    // Act and Assert result
    Assert.assertEquals(1_234_845_895, Lookup3Hash.lookup3(k, 0, 12, -366_537_238));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input20PositivePositivePositiveOutputPositive() {

    // Arrange
    final int[] k = {1_816_751_712, -1_052_184_591, -448_204_815,  -985_075_727,  -985_075_725,
                     -985_075_727,  -943_132_687,   -985_075_727,  -310_276_510,  -597_135_423,
                     1_548_700_003, -985_076_751,   1_759_096_564, -985_076_239,  1_968_930_483,
                     1_876_504_309, -985_075_727,   -985_075_727,  1_816_751_712, -985_075_727};

    // Act and Assert result
    Assert.assertEquals(1_578_232_468, Lookup3Hash.lookup3(k, 18, 2, 56_789_685));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input19PositivePositivePositiveOutputPositive() {

    // Arrange
    final int[] k = {1_816_751_712, -1_052_184_591, -448_204_815,  -985_075_727, -985_075_725,
                     -985_075_727,  -943_132_687,   -985_075_727,  -310_276_510, -597_135_423,
                     1_548_700_003, -985_076_751,   1_759_096_564, -985_076_239, 1_968_930_483,
                     1_876_504_309, -985_075_727,   -985_075_727,  1_816_751_712};

    // Act and Assert result
    Assert.assertEquals(2_016_881_076, Lookup3Hash.lookup3(k, 18, 1, 56_789_689));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3Input10PositivePositivePositiveOutputNegative() {

    // Arrange
    final int[] k = {488_596_591,  -871_400_467,   -1_627_259_443, -66_094_125, 655_490_117,
                     -871_400_467, -1_627_259_443, 117_490_340,    655_490_117, -871_400_467};

    // Act and Assert result
    Assert.assertEquals(-1_713_160_635, Lookup3Hash.lookup3(k, 9, 1, 216_679_232));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNullPositivePositivePositiveOutputPositive() {

    // Act and Assert result
//    Assert.assertEquals(630_167_556,
//                        Lookup3Hash.lookup3ycs(null, 2_147_483_647, 1_610_612_771, 1_189_206_293));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNullPositivePositivePositiveOutputPositive2() {

    // Act and Assert result
//    Assert.assertEquals(1_208_402_163,
//                        Lookup3Hash.lookup3ycs(null, 2_080_374_783, 1_065_353_215, 1_767_440_900));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycsInputNullZeroZeroPositiveOutputZero() {

    // Act and Assert result
//    Assert.assertEquals(0, Lookup3Hash.lookup3ycs(null, 0, 0, 559_038_737));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputNegative003bfde8d0fb238f0ce() {

    // Arrange
    final CharSequence s = "";

    // Act and Assert result
    Assert.assertEquals(-2_401_053_097_466_151_187L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNotNullOutputNegative5() {

    // Arrange
    final CharSequence s = "";

    // Act and Assert result
    Assert.assertEquals(-2_401_053_097_466_151_187L, Lookup3Hash.lookup3ycs64(s));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNullPositivePositiveNegativeOutputNegative() {

    // Act and Assert result
    Assert.assertEquals(
        -9_137_037_936_439_172_528L,
        Lookup3Hash.lookup3ycs64(null, 1_073_741_823, 1_058_136_004, -6_191_418_246_080_169_607L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNullPositivePositiveNegativeOutputNegative2() {

    // Act and Assert result
    Assert.assertEquals(
        -4_341_817_450_885_295_203L,
        Lookup3Hash.lookup3ycs64(null, 1_152_909_308, 716_570_626, -8_888_681_153_078_164_199L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void lookup3ycs64InputNullZeroZeroPositiveOutputZero() {

    // Act and Assert result
    Assert.assertEquals(0L, Lookup3Hash.lookup3ycs64(null, 0, 0, 559_038_737L));
  }
}
