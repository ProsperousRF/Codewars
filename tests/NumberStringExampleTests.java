import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberStringExampleTests {
  @Test
  public void tests() {
    assertEquals("67", numberToStringClass.numberToString(67));
    assertEquals("123", numberToStringClass.numberToString(123));
    assertEquals("999", numberToStringClass.numberToString(999));
  }
}