package HomeWork2;

/**2. Написать программу, которая сравнивает два введенных с клавиатуры числа.*/

import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {

		/** через сканер на вход получаем от пользователя 2 числа */
		Scanner num = new Scanner(System.in);
		System.out.println("Введите первое число: ");
		int first = num.nextInt();
		System.out.println("Введите второе число:");
		int second = num.nextInt();
		num.close();
		/**
		 * сравниваем числа, если равны - выводим на экран "Числа равны",если нет, то
		 * большее выводим на экран
		 */
		if (first == second) {
			System.out.println("Числа равны");
		} else {
			if (first > second) {
				System.out.println("Первое число больше");
			} else {
				System.out.println("Второе число больше");
			}
		}
	}
}
