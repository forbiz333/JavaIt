package ClassWork10;

import java.io.*;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task1 {

	public static void main(String[] args) {

		try (BufferedReader textFile = new BufferedReader(new FileReader("doc.txt"))) {
			String res = textFile.readLine();
			String res2 = res;
			while (res != null) {
				System.out.println(res);
				res = textFile.readLine();
			}

			System.out.println(res2);
			Pattern p = Pattern.compile("[0-9]+");
			Matcher matcher = p.matcher(res2);
			System.out.println(matcher.group());

		} catch (IOException e) {
			System.out.println("IOException everything is Ok");
		}
		

		// textFile.close();
	}
}