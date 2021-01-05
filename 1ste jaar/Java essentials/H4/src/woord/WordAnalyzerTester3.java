package woord;

/*
There's something wrong with the method countRepeatedCharacters(). The third test gives 3 instead of 4. Find out what's wrong.
 */
public class WordAnalyzerTester3 {

	public static void main(String[] args) {
		test("mississippiii"); // expect: 4 (ss, ss, pp, iii)
		test("test"); // expect: 0 (no repeated letters)
		test("aabbcdaaaabb"); // expect: 4 (aa, bb, aaaa, bb)
	}

	public static void test(String word) {
		WordAnalyzer wordAnalyzer = new WordAnalyzer(word);
		int result = wordAnalyzer.countRepeatedCharacters();
		System.out.println(result + " repeated characters.");
	}
}
