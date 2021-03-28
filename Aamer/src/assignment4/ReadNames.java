package assignment4;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ReadNames {

	private static String[] names;
	public static void main(String[] args) {
		

		readNames();
		Arrays.sort(names);
		writeNames();
	}
	public static void writeNames() {
		try {
			FileWriter fileWriter = new FileWriter(new File("sorted_names.txt"));
			for(int i = 0; i < names.length; i++) {
				fileWriter.write(names[i]+"\n");
			}
			fileWriter.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void readNames() {
		try {
			Scanner fileReader = new Scanner(new File("names.txt"));
			String nameString = "";
			while(fileReader.hasNextLine()) {
				nameString += fileReader.nextLine()+",";
			}
			names = nameString.substring(0, nameString.length()-1).split(",");
			
			fileReader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
