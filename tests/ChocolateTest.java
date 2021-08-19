import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Stanislav Rakitov
 */
public class ChocolateTest {

  @Test
  public void myTests() {
    assertEquals(24, Chocolate.breakChocolate(5, 5));
    assertEquals(2, Chocolate.breakChocolate(3, 1));
    assertEquals(1, Chocolate.breakChocolate(2, 1));
    assertEquals(0, Chocolate.breakChocolate(1, 1));
  }
}
