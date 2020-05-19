package CollectionJava;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileLineCount {

	public static void main(String[] args) throws IOException {

		File file = new File("/Users/anandmane/eclipse-workspace/geeksforgeeks/Paytm/text1.txt");

		// FileInputStream fileStream = new FileInputStream(file);
		// InputStreamReader inputStream = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String line;
		int lineCount = 0;
		int wordCount = 0;
		int characterCount = 0;
		int whitespaceCount = 0;
		
		int maxCount = 0;
		ArrayList<String> linesArrayList = new ArrayList<String>();

		while ((line = reader.readLine()) != null) {

			// System.out.println(line);

			characterCount += line.length();

			String[] wordList = line.split("\\s+");
			wordCount += wordList.length;
			

			int wordcount1 = line.split("\\s+").length;
			if (maxCount < wordcount1) { 
				linesArrayList.clear(); 
				linesArrayList.add(line); 
				maxCount = wordcount1;

			} else if (maxCount == wordcount1) {
				linesArrayList.clear(); //clear previous line
				linesArrayList.add(line); //adding current line into ArrayList
			}

			whitespaceCount = wordCount - 1;

			lineCount++;
		}

		System.out.println(characterCount);

		System.out.println(lineCount);

		System.out.println("WordCount"+ wordCount);
		System.out.println(whitespaceCount);

		System.out.println("Maxcount:" + maxCount);
		System.out.println(linesArrayList);

	}

}
