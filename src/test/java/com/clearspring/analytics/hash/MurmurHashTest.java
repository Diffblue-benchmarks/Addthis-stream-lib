package com.clearspring.analytics.hash;

import com.clearspring.analytics.hash.MurmurHash;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class MurmurHashTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final MurmurHash actual = new MurmurHash();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputNegative004cc72aea246c84814() {

    // Act and Assert result
    Assert.assertEquals(-1_285_986_640, MurmurHash.hash(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero12() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0.0f));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero11() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero10() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero9() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero8() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0.0f));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero7() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0.0f));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero6() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0.0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero5() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0.0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero4() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero0047b2ddd071e694f2e() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero002f932fb3e2bc7bdb8() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0.0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero00052ed6f5599c67a59() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputPositive4() {

    // Act and Assert result
    Assert.assertEquals(134_221_825, MurmurHash.hash(0.0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputPositive3() {

    // Act and Assert result
    Assert.assertEquals(1_476_860_658, MurmurHash.hash(0.0f));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputPositive2() {

    // Act and Assert result
    Assert.assertEquals(151_228_943, MurmurHash.hash(0.0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(641_631_723, MurmurHash.hash(0.0f));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputNegative4() {

    // Act and Assert result
    Assert.assertEquals(-2_059_983_298, MurmurHash.hash(0.0f));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputNegative3() {

    // Act and Assert result
    Assert.assertEquals(-1_694_354_914, MurmurHash.hash(0.0f));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputNegative2() {

    // Act and Assert result
    Assert.assertEquals(-181_014_761, MurmurHash.hash(0.0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputNegative() {

    // Act and Assert result
    Assert.assertEquals(-1_447_745_644, MurmurHash.hash(0.0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputPositiveOutputZero() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(1.0f));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputPositiveOutputPositive2() {

    // Act and Assert result
    Assert.assertEquals(1_943_201_700, MurmurHash.hash(2_162_182_756L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputPositiveOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(457_264_958, MurmurHash.hash(2_074_513_412));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNullOutputZero3() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNullOutputZero0009ba908b5814a1192() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNullOutputZero() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputPositive3() {

    // Act and Assert result
    Assert.assertEquals(1_284_185_937, MurmurHash.hash("\u0000\u0000\u0000\u0000\u0000"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputPositive2() {

    // Act and Assert result
    Assert.assertEquals(844_762_802, MurmurHash.hash("\u0000\u0000\u0000"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(1_741_070_284, MurmurHash.hash("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputNegative7() {

    // Act and Assert result
    Assert.assertEquals(-1_725_167_783, MurmurHash.hash("\u0000"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputNegative6() {

    // Act and Assert result
    Assert.assertEquals(-835_021_447, MurmurHash.hash("\u0000\u0000"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputNegative5() {

    // Act and Assert result
    Assert.assertEquals(-1_285_986_640, MurmurHash.hash(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputNegative4() {

    // Act and Assert result
    Assert.assertEquals(-46_734_661, MurmurHash.hash("\u0000\u0000\u0000\u0000\u0000\u0000"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputNegative3() {

    // Act and Assert result
    Assert.assertEquals(-835_021_447, MurmurHash.hash("\u0000\u0000"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNotNullOutputNegative2() {

    // Act and Assert result
    Assert.assertEquals(-1_725_167_783, MurmurHash.hash("\u0000"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputZeroOutputZero13() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(0.0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNegativeOutputPositive3() {

    // Act and Assert result
    Assert.assertEquals(1_732_114_846, MurmurHash.hash(-6_160_990_026_084_918_242L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNegativeOutputPositive2() {

    // Act and Assert result
    Assert.assertEquals(406_711_705, MurmurHash.hash(-1_885_783_083));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNegativeOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(387_762_331, MurmurHash.hash(-2_558_713_158_760_906_418L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNegativeOutputNegative2() {

    // Act and Assert result
    Assert.assertEquals(-1_329_288_982, MurmurHash.hash(-7_984_070_956_118_237_579L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNegativeOutputNegative() {

    // Act and Assert result
    Assert.assertEquals(-76_051_068, MurmurHash.hash(-420_465_437));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput15OutputNegative2() {

    // Arrange
    final byte[] data = {(byte)-1,  (byte)64,  (byte)-51, (byte)-43, (byte)92,
                         (byte)111, (byte)-94, (byte)80,  (byte)21,  (byte)-93,
                         (byte)62,  (byte)-72, (byte)-1,  (byte)-82, (byte)5};

    // Act and Assert result
    Assert.assertEquals(-739_224_851, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput0OutputNegative00138e9baad228a6d02() {

    // Arrange
    final byte[] data = {};

    // Act and Assert result
    Assert.assertEquals(-1_285_986_640, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput0OutputNegative00238e9baad228a6d02() {

    // Arrange
    final byte[] data = {};

    // Act and Assert result
    Assert.assertEquals(-1_285_986_640, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1OutputZero000f817e956b9d7bdd2() {

    // Arrange
    final byte[] data = {(byte)-2};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1OutputZero2() {

    // Arrange
    final byte[] data = {(byte)-2};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2OutputNegative() {

    // Arrange
    final byte[] data = {(byte)122, (byte)-18};

    // Act and Assert result
    Assert.assertEquals(-2_109_890_064, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2OutputPositive() {

    // Arrange
    final byte[] data = {(byte)-66, (byte)87};

    // Act and Assert result
    Assert.assertEquals(639_749_170, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2OutputPositive2() {

    // Arrange
    final byte[] data = {(byte)-2, (byte)-96};

    // Act and Assert result
    Assert.assertEquals(2_017_953_386, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2OutputZero001d33f25769e925150() {

    // Arrange
    final byte[] data = {(byte)0, (byte)-3};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2OutputZero2() {

    // Arrange
    final byte[] data = {(byte)0, (byte)-3};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput24OutputNegative() {

    // Arrange
    final byte[] data = {(byte)-108, (byte)55,  (byte)47,  (byte)-70, (byte)-37, (byte)-128,
                         (byte)67,   (byte)85,  (byte)43,  (byte)106, (byte)70,  (byte)-28,
                         (byte)-95,  (byte)-1,  (byte)103, (byte)-72, (byte)38,  (byte)5,
                         (byte)33,   (byte)115, (byte)3,   (byte)-25, (byte)78,  (byte)122};

    // Act and Assert result
    Assert.assertEquals(-516_540_473, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput23OutputPositive() {

    // Arrange
    final byte[] data = {(byte)0,   (byte)-31,  (byte)-40, (byte)-101, (byte)53,   (byte)-54,
                         (byte)105, (byte)66,   (byte)-18, (byte)-1,   (byte)44,   (byte)-99,
                         (byte)-74, (byte)-110, (byte)94,  (byte)-76,  (byte)-128, (byte)-25,
                         (byte)-63, (byte)6,    (byte)52,  (byte)73,   (byte)30};

    // Act and Assert result
    Assert.assertEquals(3_690_550, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3OutputNegative() {

    // Arrange
    final byte[] data = {(byte)-2, (byte)121, (byte)-1};

    // Act and Assert result
    Assert.assertEquals(-710_706_341, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3OutputNegative2() {

    // Arrange
    final byte[] data = {(byte)-2, (byte)-96, (byte)-113};

    // Act and Assert result
    Assert.assertEquals(-817_340_776, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3OutputPositive() {

    // Arrange
    final byte[] data = {(byte)29, (byte)-31, (byte)-28};

    // Act and Assert result
    Assert.assertEquals(2_136_801_126, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3OutputZero() {

    // Arrange
    final byte[] data = {(byte)0, (byte)0, (byte)-4};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput0OutputNegative3() {

    // Arrange
    final byte[] data = {};

    // Act and Assert result
    Assert.assertEquals(-1_285_986_640, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput4OutputNegative() {

    // Arrange
    final byte[] data = {(byte)0, (byte)-3, (byte)82, (byte)-72};

    // Act and Assert result
    Assert.assertEquals(-1_464_245_024, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput4OutputPositive() {

    // Arrange
    final byte[] data = {(byte)-114, (byte)-31, (byte)-72, (byte)-50};

    // Act and Assert result
    Assert.assertEquals(1_949_117_168, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput4OutputZero() {

    // Arrange
    final byte[] data = {(byte)-12, (byte)-87, (byte)82, (byte)-5};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput15OutputNegative() {

    // Arrange
    final byte[] data = {(byte)-58, (byte)56,  (byte)44,   (byte)-8,   (byte)83,
                         (byte)42,  (byte)-24, (byte)-27,  (byte)-126, (byte)78,
                         (byte)36,  (byte)121, (byte)-118, (byte)-58,  (byte)-58};

    // Act and Assert result
    Assert.assertEquals(-864_578_325, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput14OutputPositive() {

    // Arrange
    final byte[] data = {(byte)-1,  (byte)64, (byte)45, (byte)-62, (byte)-89, (byte)87, (byte)121,
                         (byte)-11, (byte)2,  (byte)-8, (byte)24,  (byte)-3,  (byte)-1, (byte)-82};

    // Act and Assert result
    Assert.assertEquals(1_342_218_240, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput5OutputNegative() {

    // Arrange
    final byte[] data = {(byte)-2, (byte)-96, (byte)-113, (byte)-30, (byte)-4};

    // Act and Assert result
    Assert.assertEquals(-1_693_711_258, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput5OutputPositive() {

    // Arrange
    final byte[] data = {(byte)-114, (byte)-31, (byte)-72, (byte)-50, (byte)83};

    // Act and Assert result
    Assert.assertEquals(83_648_249, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput5OutputPositive2() {

    // Arrange
    final byte[] data = {(byte)55, (byte)-52, (byte)-54, (byte)-106, (byte)92};

    // Act and Assert result
    Assert.assertEquals(510_825_680, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput5OutputPositive3() {

    // Arrange
    final byte[] data = {(byte)98, (byte)-77, (byte)-122, (byte)63, (byte)77};

    // Act and Assert result
    Assert.assertEquals(1_839_509_481, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput12OutputPositive() {

    // Arrange
    final byte[] data = {(byte)-1,  (byte)64,  (byte)-51, (byte)-43, (byte)-89, (byte)87,
                         (byte)121, (byte)-11, (byte)2,   (byte)-8,  (byte)24,  (byte)-3};

    // Act and Assert result
    Assert.assertEquals(463_445_449, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput7OutputNegative() {

    // Arrange
    final byte[] data = {(byte)-117, (byte)-21,  (byte)-49, (byte)21,
                         (byte)82,   (byte)-103, (byte)-26};

    // Act and Assert result
    Assert.assertEquals(-1_356_658_979, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput7OutputPositive() {

    // Arrange
    final byte[] data = {(byte)-70, (byte)8, (byte)-3, (byte)65, (byte)102, (byte)59, (byte)83};

    // Act and Assert result
    Assert.assertEquals(503_021_995, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput12OutputNegative() {

    // Arrange
    final byte[] data = {(byte)-70,  (byte)8,    (byte)-3, (byte)65, (byte)102, (byte)11,
                         (byte)-105, (byte)-104, (byte)96, (byte)80, (byte)64,  (byte)64};

    // Act and Assert result
    Assert.assertEquals(-584_018_322, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput8OutputNegative() {

    // Arrange
    final byte[] data = {(byte)7, (byte)-87, (byte)-92, (byte)9,
                         (byte)0, (byte)64,  (byte)-78, (byte)-112};

    // Act and Assert result
    Assert.assertEquals(-1_022_885_542, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput11OutputZero() {

    // Arrange
    final byte[] data = {(byte)7,   (byte)-87,  (byte)-92, (byte)9, (byte)0, (byte)64,
                         (byte)-78, (byte)-112, (byte)0,   (byte)0, (byte)-2};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1ZeroOutputZero00150a167d2daf830cf() {

    // Arrange
    final byte[] data = {(byte)1};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1ZeroOutputZero2() {

    // Arrange
    final byte[] data = {(byte)1};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2NegativeOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-84, (byte)13};

    // Act and Assert result
    Assert.assertEquals(1_567_571_695, MurmurHash.hash(data, -224_841_357));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3PositiveOutputZero0037de65aaae048a17e() {

    // Arrange
    final byte[] data = {(byte)0, (byte)91, (byte)91};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 23_384));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1NegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)-84};

    // Act and Assert result
    Assert.assertEquals(-99_503_431, MurmurHash.hash(data, -224_841_360));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3ZeroOutputZero() {

    // Arrange
    final byte[] data = {(byte)0, (byte)0, (byte)3};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput4NegativeOutputPositive() {

    // Arrange
    final byte[] data = {(byte)1, (byte)-59, (byte)-123, (byte)5};

    // Act and Assert result
    Assert.assertEquals(1_443_064_000, MurmurHash.hash(data, -1_818_686_459));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1NegativeOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-103};

    // Act and Assert result
    Assert.assertEquals(844_270_328, MurmurHash.hash(data, -869_863_443));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1NegativeOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)79};

    // Act and Assert result
    Assert.assertEquals(548_623_650, MurmurHash.hash(data, -1_277_840_952));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput0ZeroOutputZero000eb40f0bb5bc12476() {

    // Arrange
    final byte[] data = {};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput5NegativeOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-79, (byte)-75, (byte)-44, (byte)69, (byte)124};

    // Act and Assert result
    Assert.assertEquals(214_048_642, MurmurHash.hash(data, -506_089_012));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1PositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)1};

    // Act and Assert result
    Assert.assertEquals(-380_735_811, MurmurHash.hash(data, 1));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput4ZeroOutputZero() {

    // Arrange
    final byte[] data = {(byte)-12, (byte)102, (byte)108, (byte)-106};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput5NegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)3, (byte)60, (byte)-99, (byte)9, (byte)1};

    // Act and Assert result
    Assert.assertEquals(-808_649_707, MurmurHash.hash(data, -2_130_603_194));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput14NegativeOutputPositive() {

    // Arrange
    final byte[] data = {(byte)25,  (byte)-58, (byte)83, (byte)27, (byte)-71, (byte)125, (byte)-15,
                         (byte)-43, (byte)2,   (byte)53, (byte)65, (byte)0,   (byte)34,  (byte)33};

    // Act and Assert result
    Assert.assertEquals(819_188_327, MurmurHash.hash(data, -887_003_358));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput5NegativeOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)-84, (byte)13, (byte)-92, (byte)103, (byte)21};

    // Act and Assert result
    Assert.assertEquals(84_271_941, MurmurHash.hash(data, -224_841_356));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput30NegativeOutputNegative001fae61cce17d3a4aa() {

    // Arrange
    final byte[] data = {(byte)-84, (byte)-18, (byte)52,   (byte)-17, (byte)18,  (byte)-62,
                         (byte)-70, (byte)17,  (byte)121,  (byte)83,  (byte)-7,  (byte)30,
                         (byte)12,  (byte)-34, (byte)-105, (byte)8,   (byte)-10, (byte)-71,
                         (byte)58,  (byte)-53, (byte)1,    (byte)-58, (byte)57,  (byte)65,
                         (byte)64,  (byte)81,  (byte)93,   (byte)96,  (byte)-69, (byte)102};

    // Act and Assert result
    Assert.assertEquals(-604_318_442, MurmurHash.hash(data, -2_038_280_226));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2PositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)1, (byte)1};

    // Act and Assert result
    Assert.assertEquals(-1_042_988_829, MurmurHash.hash(data, 1_474_067_842));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2PositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-96, (byte)101};

    // Act and Assert result
    Assert.assertEquals(18_056_321, MurmurHash.hash(data, 1_091_567_619));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2PositiveOutputZero00208e9f934311a207f() {

    // Arrange
    final byte[] data = {(byte)1, (byte)3};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 257));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput13NegativeOutputPositive003cd2bd0db11ab3982() {

    // Arrange
    final byte[] data = {(byte)105, (byte)15, (byte)58, (byte)-107, (byte)3,  (byte)-75, (byte)66,
                         (byte)119, (byte)40, (byte)-5, (byte)86,   (byte)80, (byte)48};

    // Act and Assert result
    Assert.assertEquals(2_016_403_834, MurmurHash.hash(data, -941_515_413));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2ZeroOutputZero() {

    // Arrange
    final byte[] data = {(byte)0, (byte)2};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput7NegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)3, (byte)60, (byte)-99, (byte)9, (byte)1, (byte)46, (byte)77};

    // Act and Assert result
    Assert.assertEquals(-1_452_200_670, MurmurHash.hash(data, -2_130_603_196));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput19NegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)-84,  (byte)13,   (byte)-92, (byte)103, (byte)21,
                         (byte)-114, (byte)-124, (byte)-8,  (byte)-41, (byte)118,
                         (byte)-3,   (byte)26,   (byte)-54, (byte)-77, (byte)47,
                         (byte)16,   (byte)-88,  (byte)-8,  (byte)-61};

    // Act and Assert result
    Assert.assertEquals(-1_198_047_435, MurmurHash.hash(data, -224_841_374));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3NegativeOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-103, (byte)-78, (byte)49};

    // Act and Assert result
    Assert.assertEquals(1_432_102_114, MurmurHash.hash(data, -869_863_441));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3NegativeOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)1, (byte)-59, (byte)5};

    // Act and Assert result
    Assert.assertEquals(30_374_408, MurmurHash.hash(data, -1_073_741_822));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3NegativeOutputPositive3() {

    // Arrange
    final byte[] data = {(byte)79, (byte)74, (byte)43};

    // Act and Assert result
    Assert.assertEquals(968_309_150, MurmurHash.hash(data, -1_277_840_950));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput27NegativeOutputPositive002bf74039aef553c8b() {

    // Arrange
    final byte[] data = {(byte)-84, (byte)-18, (byte)52,   (byte)-17, (byte)18,  (byte)-62,
                         (byte)-70, (byte)17,  (byte)121,  (byte)83,  (byte)-7,  (byte)30,
                         (byte)12,  (byte)-34, (byte)-105, (byte)8,   (byte)-10, (byte)-71,
                         (byte)58,  (byte)-53, (byte)1,    (byte)-58, (byte)57,  (byte)65,
                         (byte)64,  (byte)81,  (byte)93};

    // Act and Assert result
    Assert.assertEquals(732_078_867, MurmurHash.hash(data, -2_038_280_229));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput23PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-77,  (byte)18,  (byte)-81, (byte)-107, (byte)126, (byte)-109,
                         (byte)-15,  (byte)-23, (byte)25,  (byte)-55,  (byte)83,  (byte)74,
                         (byte)-108, (byte)103, (byte)-63, (byte)-75,  (byte)-62, (byte)-110,
                         (byte)120,  (byte)108, (byte)106, (byte)-54,  (byte)119};

    // Act and Assert result
    Assert.assertEquals(431_113_372, MurmurHash.hash(data, 17, 1_852_956_556));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput9PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-90, (byte)87, (byte)-91, (byte)-81, (byte)87,
                         (byte)87,  (byte)99, (byte)-25, (byte)-96};

    // Act and Assert result
    Assert.assertEquals(1_784_854_640, MurmurHash.hash(data, 3, 1_235_551_447));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput7PositivePositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)1, (byte)65, (byte)33, (byte)-80, (byte)44, (byte)-75, (byte)-34};

    // Act and Assert result
    Assert.assertEquals(-972_540_952, MurmurHash.hash(data, 4, 1_742_134_332));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput5PositivePositiveOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)1, (byte)38, (byte)1, (byte)77, (byte)-79};

    // Act and Assert result
    Assert.assertEquals(1_831_941_727, MurmurHash.hash(data, 3, 1_603_815_584));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput13NegativeNegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)1,  (byte)65, (byte)33,  (byte)-80, (byte)44, (byte)-75, (byte)-34,
                         (byte)84, (byte)21, (byte)-63, (byte)-57, (byte)20, (byte)-81};

    // Act and Assert result
    Assert.assertEquals(-1_969_287_270, MurmurHash.hash(data, -2_147_221_504, -405_611_464));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput5PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-105, (byte)56, (byte)-55, (byte)66, (byte)-102};

    // Act and Assert result
    Assert.assertEquals(736_773_259, MurmurHash.hash(data, 3, 1_312_093_530));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput13PositivePositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)1,   (byte)38, (byte)1,  (byte)77, (byte)-79, (byte)-17, (byte)-36,
                         (byte)-21, (byte)2,  (byte)59, (byte)0,  (byte)0,   (byte)2};

    // Act and Assert result
    Assert.assertEquals(-74_643_074, MurmurHash.hash(data, 7, 1_603_815_588));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInputNullZeroZeroOutputZero000d1a472aa67a6583f() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(null, 0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput4PositiveZeroOutputZero2() {

    // Arrange
    final byte[] data = {(byte)0, (byte)2, (byte)2, (byte)2};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 2, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput4PositiveZeroOutputZero() {

    // Arrange
    final byte[] data = {(byte)-12, (byte)102, (byte)108, (byte)-106};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 4, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput3PositiveZeroOutputZero() {

    // Arrange
    final byte[] data = {(byte)0, (byte)0, (byte)3};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 3, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput16PositivePositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)-34, (byte)64,   (byte)99, (byte)-101, (byte)127, (byte)-102,
                         (byte)70,  (byte)-57,  (byte)55, (byte)40,   (byte)99,  (byte)93,
                         (byte)79,  (byte)-115, (byte)1,  (byte)-119};

    // Act and Assert result
    Assert.assertEquals(-75_821_203, MurmurHash.hash(data, 2, 236_839_546));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput16PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)1,  (byte)65,   (byte)58,  (byte)117, (byte)95, (byte)-124,
                         (byte)86, (byte)102,  (byte)119, (byte)-44, (byte)80, (byte)84,
                         (byte)79, (byte)-115, (byte)1,   (byte)-119};

    // Act and Assert result
    Assert.assertEquals(1_741_316_729, MurmurHash.hash(data, 15, 956_766_026));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput16PositivePositiveOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)-34, (byte)64,   (byte)99, (byte)-101, (byte)67, (byte)-99,
                         (byte)100, (byte)-109, (byte)55, (byte)40,   (byte)99, (byte)93,
                         (byte)79,  (byte)-115, (byte)1,  (byte)-119};

    // Act and Assert result
    Assert.assertEquals(1_950_833_541, MurmurHash.hash(data, 5, 2_082_333_309));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput16PositivePositiveOutputPositive3() {

    // Arrange
    final byte[] data = {(byte)-128, (byte)85,  (byte)-63, (byte)-82, (byte)65,  (byte)112,
                         (byte)-57,  (byte)-89, (byte)-18, (byte)-49, (byte)-17, (byte)-17,
                         (byte)-81,  (byte)-81, (byte)-81, (byte)-89};

    // Act and Assert result
    Assert.assertEquals(100_782_881, MurmurHash.hash(data, 4, 2_007_699_460));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput16PositivePositiveOutputPositive4() {

    // Arrange
    final byte[] data = {(byte)-128, (byte)85,   (byte)-63,  (byte)-82, (byte)65,  (byte)112,
                         (byte)-57,  (byte)-89,  (byte)-18,  (byte)-49, (byte)-17, (byte)-17,
                         (byte)-127, (byte)-127, (byte)-127, (byte)-127};

    // Act and Assert result
    Assert.assertEquals(748_519_193, MurmurHash.hash(data, 1, 2_007_699_457));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput17PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-128, (byte)85,   (byte)-63,  (byte)-82,  (byte)65,  (byte)112,
                         (byte)-57,  (byte)-89,  (byte)-127, (byte)-41,  (byte)-5,  (byte)-17,
                         (byte)-44,  (byte)-124, (byte)0,    (byte)-128, (byte)-128};

    // Act and Assert result
    Assert.assertEquals(1_066_782_736, MurmurHash.hash(data, 3, 2_007_699_459));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2ZeroZeroOutputZero() {

    // Arrange
    final byte[] data = {(byte)1, (byte)1};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2PositiveNegativeOutputNegative2() {

    // Arrange
    final byte[] data = {(byte)38, (byte)112};

    // Act and Assert result
    Assert.assertEquals(-153_408, MurmurHash.hash(data, 1, -1_626_022_933));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput9PositiveNegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)4,   (byte)66, (byte)-17, (byte)86, (byte)-64,
                         (byte)-16, (byte)98, (byte)121, (byte)-47};

    // Act and Assert result
    Assert.assertEquals(-1_967_080_477, MurmurHash.hash(data, 1, -1_475_293_878));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput2PositiveNegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)38, (byte)112};

    // Act and Assert result
    Assert.assertEquals(-153_408, MurmurHash.hash(data, 2, -1_626_014_274));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1PositiveZeroOutputZero2() {

    // Arrange
    final byte[] data = {(byte)1};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 1, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput27PositivePositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)59,  (byte)56, (byte)59,  (byte)1,   (byte)71, (byte)85,  (byte)-3,
                         (byte)-90, (byte)-8, (byte)-94, (byte)42,  (byte)36, (byte)114, (byte)78,
                         (byte)-95, (byte)40, (byte)95,  (byte)36,  (byte)50, (byte)-25, (byte)53,
                         (byte)123, (byte)22, (byte)-24, (byte)-99, (byte)25, (byte)127};

    // Act and Assert result
    Assert.assertEquals(-968_831_299, MurmurHash.hash(data, 26, 1_993_905_634));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput27PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)59,  (byte)56, (byte)59,  (byte)1,   (byte)71, (byte)85,  (byte)-3,
                         (byte)-90, (byte)-8, (byte)-94, (byte)42,  (byte)36, (byte)114, (byte)78,
                         (byte)-95, (byte)40, (byte)95,  (byte)36,  (byte)50, (byte)-25, (byte)53,
                         (byte)123, (byte)22, (byte)-24, (byte)-99, (byte)25, (byte)127};

    // Act and Assert result
    Assert.assertEquals(2_054_096_824, MurmurHash.hash(data, 27, 1_993_905_635));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput27PositivePositiveOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)59,   (byte)56,  (byte)59,  (byte)1,   (byte)-13, (byte)-27,
                         (byte)-111, (byte)-32, (byte)116, (byte)-52, (byte)83,  (byte)-4,
                         (byte)-31,  (byte)-76, (byte)-20, (byte)-73, (byte)30,  (byte)-122,
                         (byte)70,   (byte)96,  (byte)59,  (byte)-26, (byte)-29, (byte)82,
                         (byte)92,   (byte)24,  (byte)-67};

    // Act and Assert result
    Assert.assertEquals(2_083_455_850, MurmurHash.hash(data, 25, 1_044_374_139));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput27PositivePositiveOutputPositive3() {

    // Arrange
    final byte[] data = {(byte)-77, (byte)18,  (byte)-81, (byte)-107, (byte)-20,  (byte)32,
                         (byte)-31, (byte)83,  (byte)25,  (byte)89,   (byte)104,  (byte)125,
                         (byte)45,  (byte)77,  (byte)-87, (byte)15,   (byte)45,   (byte)59,
                         (byte)98,  (byte)57,  (byte)36,  (byte)-101, (byte)-127, (byte)-2,
                         (byte)81,  (byte)-59, (byte)7};

    // Act and Assert result
    Assert.assertEquals(992_547_747, MurmurHash.hash(data, 10, 1_852_956_567));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput1PositiveZeroOutputZero001f2ef69919b42348e() {

    // Arrange
    final byte[] data = {(byte)1};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 1, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput30PositivePositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)1,    (byte)65,  (byte)33, (byte)-80, (byte)44,   (byte)-75,
                         (byte)-34,  (byte)84,  (byte)21, (byte)-63, (byte)-57,  (byte)20,
                         (byte)-81,  (byte)74,  (byte)85, (byte)66,  (byte)-97,  (byte)36,
                         (byte)-126, (byte)69,  (byte)97, (byte)73,  (byte)-104, (byte)21,
                         (byte)-128, (byte)-41, (byte)26, (byte)6,   (byte)0,    (byte)0};

    // Act and Assert result
    Assert.assertEquals(-106_660_555, MurmurHash.hash(data, 7, 1_742_134_335));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput30PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)1,    (byte)65,  (byte)33, (byte)-80, (byte)44,   (byte)-75,
                         (byte)-34,  (byte)84,  (byte)21, (byte)-63, (byte)-57,  (byte)20,
                         (byte)-81,  (byte)74,  (byte)85, (byte)66,  (byte)-97,  (byte)36,
                         (byte)-126, (byte)69,  (byte)97, (byte)73,  (byte)-104, (byte)21,
                         (byte)-128, (byte)-41, (byte)26, (byte)6,   (byte)0,    (byte)63};

    // Act and Assert result
    Assert.assertEquals(447_384_528, MurmurHash.hash(data, 29, 1_742_134_309));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput30PositivePositiveOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)1,    (byte)65,  (byte)33, (byte)-80, (byte)44,   (byte)-75,
                         (byte)-34,  (byte)84,  (byte)21, (byte)-63, (byte)-57,  (byte)20,
                         (byte)-81,  (byte)74,  (byte)85, (byte)66,  (byte)-97,  (byte)36,
                         (byte)-126, (byte)69,  (byte)97, (byte)73,  (byte)-104, (byte)21,
                         (byte)-128, (byte)-41, (byte)26, (byte)6,   (byte)0,    (byte)0};

    // Act and Assert result
    Assert.assertEquals(447_384_528, MurmurHash.hash(data, 30, 1_742_134_310));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput30PositivePositiveOutputPositive3() {

    // Arrange
    final byte[] data = {(byte)50,  (byte)-103, (byte)108, (byte)-59, (byte)126, (byte)-109,
                         (byte)-15, (byte)-23,  (byte)118, (byte)-63, (byte)80,  (byte)-126,
                         (byte)120, (byte)95,   (byte)-18, (byte)98,  (byte)58,  (byte)-43,
                         (byte)58,  (byte)-10,  (byte)17,  (byte)-60, (byte)-51, (byte)110,
                         (byte)82,  (byte)-102, (byte)76,  (byte)79,  (byte)-2,  (byte)-71};

    // Act and Assert result
    Assert.assertEquals(322_078_750, MurmurHash.hash(data, 27, 1_790_024_312));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput0ZeroZeroOutputZero000f89255def2baffed() {

    // Arrange
    final byte[] data = {};

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hash(data, 0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashInput9PositivePositiveOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)2,   (byte)97, (byte)47,  (byte)115, (byte)-64,
                         (byte)-16, (byte)98, (byte)121, (byte)97};

    // Act and Assert result
    Assert.assertEquals(421_600_290, MurmurHash.hash(data, 7, 515_193_766));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64InputNotNullOutputPositive2() {

    // Act and Assert result
    Assert.assertEquals(6_786_464_938_362_976_718L, MurmurHash.hash64("\u0001\u0000\u0000lK"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64InputNotNullOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(1_133_734_680_756_547_060L,
                        MurmurHash.hash64("\u0002\u0001\u0000\u0000\u0000\u0000\u0000"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64InputNotNullOutputNegative6() {

    // Act and Assert result
    Assert.assertEquals(-1_738_468_650_916_469_272L, MurmurHash.hash64("\u0000|u"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64InputNotNullOutputNegative5() {

    // Act and Assert result
    Assert.assertEquals(-6_227_735_630_102_846_791L,
                        MurmurHash.hash64("\u0000\u0017\u0014V-\u0002"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64InputNotNullOutputNegative() {

    // Act and Assert result
    Assert.assertEquals(-7_543_503_121_564_824_726L, MurmurHash.hash64("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64InputNotNullOutputNegative3() {

    // Act and Assert result
    Assert.assertEquals(-3_500_746_588_601_195_382L, MurmurHash.hash64("\u0002\u0015"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashLongInputZeroOutputZero() {

    // Act and Assert result
    Assert.assertEquals(0, MurmurHash.hashLong(0L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64InputNotNullOutputNegative2() {

    // Act and Assert result
    Assert.assertEquals(-7_207_201_254_813_729_732L, MurmurHash.hash64(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64InputNotNullOutputNegative4() {

    // Act and Assert result
    Assert.assertEquals(-7_207_201_254_813_729_732L, MurmurHash.hash64(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64InputNullOutputZero000f2946a1c52cd53bd() {

    // Act and Assert result
    Assert.assertEquals(0L, MurmurHash.hash64(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input9PositiveOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)-21, (byte)93, (byte)20, (byte)-74, (byte)121,
                         (byte)-18, (byte)95, (byte)7,  (byte)98};

    // Act and Assert result
    Assert.assertEquals(5_128_465_342_808_163_917L, MurmurHash.hash64(data, 7));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input20PositiveOutputPositive3() {

    // Arrange
    final byte[] data = {(byte)-31, (byte)124,  (byte)-68, (byte)-37,  (byte)76,
                         (byte)-37, (byte)-85,  (byte)25,  (byte)-111, (byte)-127,
                         (byte)-78, (byte)-120, (byte)64,  (byte)127,  (byte)-89,
                         (byte)114, (byte)29,   (byte)-24, (byte)-84,  (byte)5};

    // Act and Assert result
    Assert.assertEquals(9_016_197_362_968_425_881L, MurmurHash.hash64(data, 6));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input20PositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)113, (byte)112, (byte)-69, (byte)56,   (byte)-58,
                         (byte)-56, (byte)-65, (byte)121, (byte)-111, (byte)15,
                         (byte)-70, (byte)-63, (byte)74,  (byte)87,   (byte)58,
                         (byte)11,  (byte)29,  (byte)-24, (byte)-84,  (byte)5};

    // Act and Assert result
    Assert.assertEquals(-6_711_209_277_253_511_698L, MurmurHash.hash64(data, 1));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input19PositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)49,  (byte)-32, (byte)-37, (byte)-51, (byte)-77,
                         (byte)-20, (byte)-86, (byte)127, (byte)96,  (byte)-103,
                         (byte)2,   (byte)12,  (byte)105, (byte)30,  (byte)108,
                         (byte)-88, (byte)14,  (byte)2,   (byte)81};

    // Act and Assert result
    Assert.assertEquals(-7_710_295_434_375_346_950L, MurmurHash.hash64(data, 19));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input16PositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-47, (byte)-76, (byte)42,   (byte)-128, (byte)-17, (byte)-98,
                         (byte)120, (byte)-55, (byte)-111, (byte)-127, (byte)-78, (byte)-120,
                         (byte)64,  (byte)127, (byte)-89,  (byte)114};

    // Act and Assert result
    Assert.assertEquals(2_704_628_142_545_313_271L, MurmurHash.hash64(data, 13));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input15NegativeOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-67, (byte)102, (byte)114, (byte)58,  (byte)80,
                         (byte)39,  (byte)104, (byte)25,  (byte)46,  (byte)-104,
                         (byte)7,   (byte)57,  (byte)-72, (byte)-34, (byte)-64};

    // Act and Assert result
    Assert.assertEquals(3_994_030_985_882_303_755L, MurmurHash.hash64(data, -1_666_014_748));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input20PositiveOutputPositive4() {

    // Arrange
    final byte[] data = {(byte)-31, (byte)124,  (byte)-68, (byte)-37,  (byte)76,
                         (byte)-37, (byte)-85,  (byte)25,  (byte)-111, (byte)-127,
                         (byte)-78, (byte)-120, (byte)64,  (byte)127,  (byte)-89,
                         (byte)114, (byte)29,   (byte)-24, (byte)-84,  (byte)5};

    // Act and Assert result
    Assert.assertEquals(776_393_270_769_594_272L, MurmurHash.hash64(data, 7));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input20PositiveOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)18,  (byte)-70,  (byte)-5,  (byte)33,  (byte)17,
                         (byte)118, (byte)-109, (byte)-60, (byte)-94, (byte)-44,
                         (byte)-29, (byte)95,   (byte)-47, (byte)-17, (byte)103,
                         (byte)64,  (byte)114,  (byte)-20, (byte)123, (byte)-96};

    // Act and Assert result
    Assert.assertEquals(5_515_149_906_411_674_423L, MurmurHash.hash64(data, 10));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input20PositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-6,   (byte)126, (byte)-90, (byte)-88, (byte)78,
                         (byte)-11,  (byte)-11, (byte)-88, (byte)4,   (byte)20,
                         (byte)36,   (byte)-12, (byte)-34, (byte)19,  (byte)51,
                         (byte)-103, (byte)97,  (byte)-20, (byte)123, (byte)-96};

    // Act and Assert result
    Assert.assertEquals(3_802_854_812_094_129_382L, MurmurHash.hash64(data, 20));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input9PositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-21, (byte)93, (byte)20, (byte)-74, (byte)121,
                         (byte)-18, (byte)95, (byte)7,  (byte)98};

    // Act and Assert result
    Assert.assertEquals(2_560_926_067_176_303_966L, MurmurHash.hash64(data, 4));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input9PositiveOutputNegative5() {

    // Arrange
    final byte[] data = {(byte)-21, (byte)93, (byte)20, (byte)-74, (byte)121,
                         (byte)-18, (byte)95, (byte)7,  (byte)98};

    // Act and Assert result
    Assert.assertEquals(-468_572_537_038_345_339L, MurmurHash.hash64(data, 3));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input9PositiveOutputNegative4() {

    // Arrange
    final byte[] data = {(byte)-21, (byte)93, (byte)20, (byte)-74, (byte)121,
                         (byte)-18, (byte)95, (byte)7,  (byte)98};

    // Act and Assert result
    Assert.assertEquals(-7_986_981_722_169_948_151L, MurmurHash.hash64(data, 2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input9PositiveOutputNegative3() {

    // Arrange
    final byte[] data = {(byte)-21, (byte)93, (byte)20, (byte)-74, (byte)121,
                         (byte)-18, (byte)95, (byte)7,  (byte)98};

    // Act and Assert result
    Assert.assertEquals(-5_570_444_689_810_411_600L, MurmurHash.hash64(data, 6));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input9PositiveOutputNegative2() {

    // Arrange
    final byte[] data = {(byte)-21, (byte)93, (byte)20, (byte)-74, (byte)121,
                         (byte)-18, (byte)95, (byte)7,  (byte)98};

    // Act and Assert result
    Assert.assertEquals(-8_766_539_322_848_892_586L, MurmurHash.hash64(data, 1));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input9PositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)119, (byte)-96, (byte)107, (byte)3, (byte)-41,
                         (byte)-64, (byte)20,  (byte)-97, (byte)47};

    // Act and Assert result
    Assert.assertEquals(-8_876_318_087_003_998_366L, MurmurHash.hash64(data, 5));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input9NegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)88,  (byte)-68, (byte)76,  (byte)7,  (byte)-121,
                         (byte)-31, (byte)98,  (byte)-48, (byte)-94};

    // Act and Assert result
    Assert.assertEquals(-2_706_653_790_718_784_607L, MurmurHash.hash64(data, -872_422_794));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input0NegativeNegativeOutputNegative() {

    // Arrange
    final byte[] data = {};

    // Act and Assert result
    Assert.assertEquals(-5_564_760_533_459_966_581L,
                        MurmurHash.hash64(data, -210_812_950, -671_701_823));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input10PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-101, (byte)-1, (byte)-1,  (byte)-123, (byte)-43,
                         (byte)-70,  (byte)64, (byte)-61, (byte)-116, (byte)-6};

    // Act and Assert result
    Assert.assertEquals(6_683_536_329_050_391_845L, MurmurHash.hash64(data, 5, 595_546_226));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input10PositivePositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)-5,  (byte)-1, (byte)-1,  (byte)-46, (byte)-99,
                         (byte)-24, (byte)43, (byte)-94, (byte)-6,  (byte)-6};

    // Act and Assert result
    Assert.assertEquals(-6_490_385_259_295_583_801L, MurmurHash.hash64(data, 7, 2_047_057_128));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input10PositiveNegativeOutputNegative3() {

    // Arrange
    final byte[] data = {(byte)-27, (byte)0,  (byte)0,  (byte)122, (byte)66,
                         (byte)-61, (byte)-3, (byte)79, (byte)111, (byte)-19};

    // Act and Assert result
    Assert.assertEquals(-2_248_859_730_799_230_406L, MurmurHash.hash64(data, 4, -92_338_093));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input10PositiveNegativeOutputNegative2() {

    // Arrange
    final byte[] data = {(byte)-27, (byte)0,  (byte)0,  (byte)122, (byte)66,
                         (byte)-61, (byte)-3, (byte)79, (byte)111, (byte)-19};

    // Act and Assert result
    Assert.assertEquals(-5_528_944_507_288_487_966L, MurmurHash.hash64(data, 3, -62_057_800));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input10PositiveNegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)-27, (byte)0,  (byte)0,  (byte)122, (byte)66,
                         (byte)-61, (byte)-3, (byte)79, (byte)111, (byte)-19};

    // Act and Assert result
    Assert.assertEquals(-6_279_401_520_187_569_398L, MurmurHash.hash64(data, 6, -1_121_023_381));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input10PositivePositiveOutputPositive3() {

    // Arrange
    final byte[] data = {(byte)-27, (byte)0,  (byte)0,  (byte)122, (byte)66,
                         (byte)-61, (byte)-3, (byte)79, (byte)111, (byte)-19};

    // Act and Assert result
    Assert.assertEquals(305_961_964_670_689_185L, MurmurHash.hash64(data, 1, 1_259_608_704));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input19PositiveNegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)-89, (byte)-120, (byte)74,  (byte)-6, (byte)-8,  (byte)42, (byte)101,
                         (byte)-12, (byte)-64,  (byte)-44, (byte)13, (byte)-41, (byte)59, (byte)-40,
                         (byte)55,  (byte)-76,  (byte)30,  (byte)-3, (byte)-127};

    // Act and Assert result
    Assert.assertEquals(-1_810_814_188_279_689_038L, MurmurHash.hash64(data, 11, -1_189_986_985));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input20PositiveNegativeOutputNegative() {

    // Arrange
    final byte[] data = {(byte)71,  (byte)-49, (byte)-45,  (byte)-50, (byte)27,
                         (byte)60,  (byte)12,  (byte)-126, (byte)-70, (byte)-44,
                         (byte)13,  (byte)-41, (byte)59,   (byte)-40, (byte)55,
                         (byte)-76, (byte)42,  (byte)-82,  (byte)5,   (byte)39};

    // Act and Assert result
    Assert.assertEquals(-8_587_826_391_206_320_955L, MurmurHash.hash64(data, 20, -1_118_777_746));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input19PositivePositiveOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)-89, (byte)-120, (byte)74,  (byte)-6, (byte)92,  (byte)44, (byte)-50,
                         (byte)-18, (byte)-64,  (byte)-44, (byte)13, (byte)-41, (byte)59, (byte)-40,
                         (byte)55,  (byte)-76,  (byte)30,  (byte)-3, (byte)-127};

    // Act and Assert result
    Assert.assertEquals(6_419_158_345_280_471_097L, MurmurHash.hash64(data, 13, 526_640_559));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input14PositiveNegativeOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-3,  (byte)-115, (byte)-117, (byte)-112, (byte)1,
                         (byte)-51, (byte)-60,  (byte)101,  (byte)-70,  (byte)-44,
                         (byte)13,  (byte)-41,  (byte)59,   (byte)-40};

    // Act and Assert result
    Assert.assertEquals(109_757_996_112_752_407L, MurmurHash.hash64(data, 14, -514_991_402));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input12PositivePositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)-6,   (byte)-8,   (byte)58,  (byte)-127, (byte)-28,  (byte)-112,
                         (byte)-123, (byte)-123, (byte)-77, (byte)-78,  (byte)-117, (byte)-41};

    // Act and Assert result
    Assert.assertEquals(-5_356_345_477_542_903_368L, MurmurHash.hash64(data, 8, 256_230_496));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input10ZeroZeroOutputZero() {

    // Arrange
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};

    // Act and Assert result
    Assert.assertEquals(0L, MurmurHash.hash64(data, 0, 0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input19PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-89, (byte)-120, (byte)74,  (byte)-6, (byte)-8,  (byte)42, (byte)101,
                         (byte)-12, (byte)-64,  (byte)-44, (byte)13, (byte)-41, (byte)59, (byte)-40,
                         (byte)55,  (byte)-76,  (byte)30,  (byte)-3, (byte)-127};

    // Act and Assert result
    Assert.assertEquals(498_616_050_979_970_295L, MurmurHash.hash64(data, 9, 1_903_559_181));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input7PositivePositiveOutputPositive() {

    // Arrange
    final byte[] data = {(byte)-3, (byte)-115, (byte)-117, (byte)-112,
                         (byte)73, (byte)102,  (byte)-79};

    // Act and Assert result
    Assert.assertEquals(6_714_737_699_161_646_946L, MurmurHash.hash64(data, 7, 1_720_352_739));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input6PositivePositiveOutputNegative() {

    // Arrange
    final byte[] data = {(byte)-3, (byte)-115, (byte)-117, (byte)-112, (byte)73, (byte)35};

    // Act and Assert result
    Assert.assertEquals(-6_303_034_382_291_424_287L, MurmurHash.hash64(data, 2, 1_402_261_466));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hash64Input10PositivePositiveOutputPositive2() {

    // Arrange
    final byte[] data = {(byte)-101, (byte)-1, (byte)-1,  (byte)-123, (byte)-43,
                         (byte)-70,  (byte)64, (byte)-61, (byte)-116, (byte)-6};

    // Act and Assert result
    Assert.assertEquals(7_233_900_709_053_736_552L, MurmurHash.hash64(data, 2, 1_449_582_401));
  }
}
