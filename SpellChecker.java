import java.util.Scanner;

public class SpellChecker {

	public SpellChecker() {
		// TODO: You can modify the body of this constructor,
		// or you can leave it blank. You must keep the signature, however.
	}

	public static void start() {
		Scanner scnr = new Scanner(System.in);
		System.out.printf(Util.DICTIONARY_PROMPT);
		String dictionaryChoice = scnr.nextLine();
		while (!dictionaryChoice.equals("engDictionary.txt")) {
			System.out.printf(Util.FILE_OPENING_ERROR);
			System.out.printf(Util.DICTIONARY_PROMPT);
			dictionaryChoice = scnr.nextLine(); 
		}
		System.out.printf(Util.DICTIONARY_SUCCESS_NOTIFICATION, dictionaryChoice);
	}

	// You can of course write other methods as well.

	public static void main(String[] args) {
		SpellChecker.start();
	}
}