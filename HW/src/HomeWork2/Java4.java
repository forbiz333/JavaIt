package HomeWork2;

/** 4. Написать программу, которая проверяет, является ли год високосным. */
import java.util.Scanner;

public class Java4 {
	public static void main(String[] args) {

		/** через сканер на вход получаем от пользователя год */

		Scanner val = new Scanner(System.in);
		System.out.println("Введите целое положительное число: ");
		int year = val.nextInt();
		val.close();

		/**
		 * Чтобы год был високосным, необходимо чтобы он делился на 4 без
		 * остатка и: не делился на 100 без остатка BKB делился на 100 без
		 * остатка и на 400 без остатка
		 */

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Год является високосным");
				} else {
					System.out.println("Год не является високосным");
				}
			} else {
				System.out.println("Год является високосным");
			}
		} else {
			System.out.println("Год не является високосным");
		}
	}
}
