import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.swing.event.ListSelectionEvent;

import org.w3c.dom.ls.LSInput;

//Convert a List of String to a comma separated String in Java
public class ListToString {

	public static void main(String[] args) {

		ArrayList<String> listOfString = new ArrayList<String>();
		listOfString.add("Geeks");
		listOfString.add("ForGeeks");
		listOfString.add("GeeksForGeeks");

		String string = "";
		for (int i = 0; i < listOfString.size(); i++) {
			if (i == 0) {
				string = listOfString.get(i);
			} else
				string = string + ", " + listOfString.get(i);
		}
		

		// String string = String.join(", ", listOfString);

		System.out.println(string);

	
		
		
		
	}

}
