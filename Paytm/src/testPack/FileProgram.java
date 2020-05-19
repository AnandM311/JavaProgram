package testPack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProgram {

public static void main(String[] agrs) throws IOException
	{
	File file ;
	BufferedReader reader = null ;

	try {
	file = new File("/Users/anandmane/eclipse-workspace/geeksforgeeks/Paytm/text1.txt");
	reader = new BufferedReader(new FileReader(file));
	}
	catch (Exception e) {
		System.out.println("File not found");
	}
	String line ;
	int lineCount=0;
	int wordCount =0;
	int charCount = 0;
	int whiteSapceCount = 0;

	while((line=reader.readLine())!=null)
	{
		//System.out.println(line);
		
		charCount= charCount+line.length();
	
		String[] wordlist =  line.split("\\s+");
		wordCount = wordCount + wordlist.length;
		whiteSapceCount = wordCount-1;
		
		
		lineCount++;
	}
	System.out.println("Character Count :- "+charCount);
	System.out.println("Word Count :- "+wordCount);
	System.out.println("Total number of line : "+lineCount);
	System.out.println("White Space : "+whiteSapceCount);
	}

}
