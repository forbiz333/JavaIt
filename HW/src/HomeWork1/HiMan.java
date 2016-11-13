package HomeWork1;

import java.util.Scanner;

public class HiMan {
	public static void main(String[] args){
		Scanner name = new Scanner(System.in);
		System.out.println("Введите свое имя:");
		String yourName = name.nextLine();
		name.close();
		System.out.println("Привет, " + yourName + "!");
	}
}
