import java.util.Arrays;
import java.util.Objects;

/**
 * Consider an array/list of sheep where some sheep may be missing from their place. We need a
 * function that counts the number of sheep present in the array (true means present).
 *
 * @author Stanislav Rakitov
 */

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return (int) Arrays.stream(arrayOfSheeps).filter(Objects::nonNull).filter(Boolean::booleanValue).count();
  }
}