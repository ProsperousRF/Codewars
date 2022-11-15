/**
 * Ones and Zeros
 * <p>
 * Given an array of ones and zeroes, convert the equivalent binary value to an integer. Eg: [0, 0,
 * 0, 1] is treated as 0001 which is the binary representation of 1.
 */

import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    return Integer.parseInt(Arrays.toString(binary.toArray()).replaceAll("\\D", ""), 2);
  }
}