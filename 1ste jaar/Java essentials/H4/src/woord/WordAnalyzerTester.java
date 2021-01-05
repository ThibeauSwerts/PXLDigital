package woord;

/*
You get an errormessage when the program is executed.
Find out what's wrong.
 */
public class WordAnalyzerTester {

	public static void main(String[] args) {
		test("aardvark"); // expect: a
		test("roommate"); // expect: o (not m)
		test("mate"); // expect: 0 (no duplicate letters)
		test("test"); // expect: 0 (the t isn't repeating)
	}

	public static void test(String s) {
		WordAnalyzer wordAnalyzer = new WordAnalyzer(s);
		char result = wordAnalyzer.firstRepeatedCharacter();
		if (result == 0) {
			System.out.println("No repeated character.");
		} else {
			System.out.println("First repeated character = " + result);
		}
	}

}
