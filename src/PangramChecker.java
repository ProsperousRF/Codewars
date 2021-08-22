import java.util.HashMap;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once. For
 * example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses
 * the letters A-Z at least once (case is irrelevant).
 *
 * <p>Given a string, detect whether or not it is a pangram. Return True if it is, False if not.
 * Ignore numbers and punctuation.
 *
 * @author Stanislav Rakitov
 */
public class PangramChecker {
  public boolean check(String sentence) {
    HashMap<Character, Integer> map =
        new HashMap<>() {
          {
            for (char ch = 'a'; ch <= 'z'; ch++) put(ch, 0);
          }
        };

    sentence = sentence.toLowerCase().replaceAll("[^A-Z-a-z]", "");

    for (int i = 0; i < sentence.length(); i++) {
      char c = sentence.charAt(i);
      if (map.containsKey(c)) {
        Integer integer = map.get(c);
        integer++;
        map.put(c, integer);
      } else {
        map.put(c, 1);
      }
    }

    return !map.containsValue(0);
  }
}
