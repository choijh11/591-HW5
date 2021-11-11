import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SpellChecker {

	public SpellChecker() {
		// TODO: You can modify the body of this constructor,
		// or you can leave it blank. You must keep the signature, however.
	}

	public void start() {

		Scanner scnr = new Scanner(System.in);

		// prompt user for a dictionary to use for spell check
		System.out.printf(Util.DICTIONARY_PROMPT);
		String dictionaryChoice = scnr.nextLine();

		try {
			FileInputStream dictionaryStream = new FileInputStream(dictionaryChoice);
		} catch (FileNotFoundException e) {
			System.out.printf(Util.FILE_OPENING_ERROR);
			System.out.printf(Util.DICTIONARY_PROMPT);
			dictionaryChoice = scnr.nextLine();
		}

		System.out.printf(Util.DICTIONARY_SUCCESS_NOTIFICATION, dictionaryChoice);

		// prompt user for a file to spell check
		System.out.printf(Util.FILENAME_PROMPT);
		String fileChoice = scnr.nextLine();
		
		try {
			FileOutputStream spellChecked = new FileOutputStream(fileChoice);
		} catch (FileNotFoundException e) {
			System.out.printf(Util.FILE_OPENING_ERROR);
			System.out.printf(Util.FILENAME_PROMPT); 
			fileChoice = scnr.nextLine(); 
		}
		
		System.out.printf(Util.FILE_SUCCESS_NOTIFICATION, fileChoice); 
	}

	public static void main(String[] args) {
		SpellChecker sc = new SpellChecker(); 
		sc.start();
	}
}