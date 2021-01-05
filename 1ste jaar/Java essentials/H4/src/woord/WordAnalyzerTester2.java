package woord;

/*
There's a bug in the method firstMultipleCharacter. Find the bug.
 */
public class WordAnalyzerTester2 {

	public static void main(String[] args) {
		test("missisippi"); // expect: i (not m or s)
		test("mate"); // expect: 0 (no duplicate letters)
		test("test"); // expect: t
	}

	public static void test(String word) {
		WordAnalyzer wordAnalyzer = new WordAnalyzer(word);
		char result = wordAnalyzer.firstMultipleCharacter();
		if (result == 0) {
			System.out.println("No multiple character.");
		} else {
			System.out.println("First multiple character = " + result);
		}
	}
}
