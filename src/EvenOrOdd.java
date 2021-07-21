/**
 * @author Stanislav Rakitov
 */
public class EvenOrOdd {
  /**
   * Takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
   *
   * @param number The number to check
   * @return "Even" for even or "Odd" for odd
   */
  public static String even_or_odd(int number) {
    return number %2 == 0 ? "Even" : "Odd";
  }
}
