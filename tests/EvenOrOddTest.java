import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Stanislav Rakitov
 */
public class EvenOrOddTest {
  @Test
  public void testEvenOrOdd() {
    assertEquals("Even", EvenOrOdd.even_or_odd(6));
    assertEquals("Odd", EvenOrOdd.even_or_odd(7));
  }
}