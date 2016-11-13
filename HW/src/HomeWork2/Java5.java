package HomeWork2;

/**5. Написать программу, которая вычисляет оптимальный вес для пользователя, 
 * сравнивает его с реальным и выдает рекомендацию о необходимости поправиться 
 * или похудеть. Оптимальный вес вычисляется по формуле: Рост (см) — 100.*/

import java.util.Scanner;

public class Java5 {

	public static void main(String[] args) {
		/** через сканер на вход получаем от пользователя вес и рост */
		Scanner enter = new Scanner(System.in);
		System.out.println("Введите вес - можно дробное число");
		double w;
		if (enter.hasNextDouble()) { // Удивило, что 44,5 проходит, а 44.5 нет -
										// ожидал наоборот

			w = enter.nextDouble();
			System.out.println("Введите рост - целое число");

			int h;
			if (enter.hasNextInt()) {
				h = enter.nextInt();
				enter.close();
				/** вводим переменную, кот. показывает результат по формуле */
				Double result = (double) h - w - 100;
				if (result == 0) {
					System.out.println("Вы - КРАСАВЧЕГ");
				} else {
					if (result < 0) {
						System.out.println("Вам нужно похудеть на " + Math.abs(result) + " кг");
					} else {
						System.out.println("Вам нужно поправиться на " + result + " кг");
					}
				}
				// делаем сообщение для неверно введенных чисел 
			} else {
				System.out.println("Вы ввели неверное число");
			}
			// делаем сообщение для неверно введенных чисел
		} else {
			System.out.println("Вы ввели неверное число");
		}

	}

}
