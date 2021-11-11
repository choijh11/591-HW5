import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner; 

public class SpellChecker {
    public SpellChecker() {
      // TODO: You can modify the body of this constructor,
      // or you can leave it blank. You must keep the signature, however.
    }
    
    public static boolean canOpen(String fileName) {
    	try {
    		FileInputStream is = new FileInputStream(fileName);
    	} catch (IOException e) {
    		return false;
    	}
    	return true;
    }
  
    public static void start() throws IOException {
      // TODO: You can modify the body of this method,
      // or you can leave it blank. You must keep the signature, however.
    	Scanner s = new Scanner(System.in);
    	System.out.printf(Util.DICTIONARY_PROMPT);
    	String dictionaryName = s.nextLine();
    	while (canOpen(dictionaryName) == false) {
    		System.out.printf(Util.FILE_OPENING_ERROR);
        	System.out.printf(Util.DICTIONARY_PROMPT);
        	dictionaryName = s.nextLine();
    	}
    	System.out.printf(Util.DICTIONARY_SUCCESS_NOTIFICATION, dictionaryName);
    	System.out.printf(Util.FILENAME_PROMPT);
    	String fileName = s.nextLine();
    	while (canOpen(fileName) == false) {
    		System.out.printf(Util.FILE_OPENING_ERROR);
        	System.out.printf(Util.FILENAME_PROMPT);
    	}
    	String outputFileName = fileName.substring(0,fileName.indexOf(".")).concat("_chk.txt");
    	System.out.printf(Util.FILE_SUCCESS_NOTIFICATION, fileName, outputFileName);
    	FileOutputStream os = new FileOutputStream(outputFileName);
    	PrintWriter outWriter = new PrintWriter(os);
    	
    	s.close();
    	
    }
  
    public static void main(String[] args) throws IOException {
    	SpellChecker.start(); 
    }
  }