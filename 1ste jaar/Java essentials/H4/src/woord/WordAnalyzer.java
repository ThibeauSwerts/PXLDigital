package woord;

/**
 * A class that analyzes words.
 */
public class WordAnalyzer {

	private String word;

	/**
	 * Constructs an analyzer for a given word.
	 *
	 * @param word the word to be analyzed
	 */
	public WordAnalyzer(String word) {
		this.word = word;
	}

	/**
	 * Gets the first repeated character. A character is <i>repeated</i>
	 * if it occurs at least twice in adjacent positions. For example,
	 * 'l' is repeated in "hollow", but 'o' is not.
	 *
	 * @return the first repeated character, or 0 if none found
	 */
	public char firstRepeatedCharacter() {
		for (int i = 0; i < word.length() - 1; i++) { // -1 was vergeten, anders bij de if-test out of bounds met laatste char te checken
			char ch = word.charAt(i);
			if (ch == word.charAt(i + 1)) {
				return ch;
			}
		}
		return 0;
	}

	/**
	 * Gets the first multiply occuring character. A character is <i>multiple</i>
	 * if it occurs at least twice in the word, not necessarily in adjacent positions.
	 * For example, both 'o' and 'l' are multiple in "hollow", but 'h' is not.
	 *
	 * @return the first repeated character, or 0 if none found
	 */
	public char firstMultipleCharacter() {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (find(ch, i + 1) >= 0) { // +1 want anders wordt huidige char ook tegen zichzelf gecheckt
				return ch;
			}
		}
		return 0;
	}

	private int find(char c, int pos) {
		for (int i = pos; i < word.length(); i++) {
			if (word.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Counts the groups of repeated characters. For example, "mississippi!!!" has
	 * four such groups: ss, ss, pp and !!!.
	 *
	 * @return the number of repeated character groups
	 */
	public int countRepeatedCharacters() {
		int c = 0;
		for (int i = 0; i < word.length() - 1; i++) { // i op 0 intialiseren
			if (word.charAt(i) == word.charAt(i + 1)) // found a repetition
			{
				if (word.charAt(i - 1) != word.charAt(i)) // it't the start // hier nog ergens fout
				{
					c++;
				}
			}
		}
		return c;
	}
}
