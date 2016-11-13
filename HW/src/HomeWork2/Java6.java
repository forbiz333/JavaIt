package HomeWork2;

/**6. Написать программу, которая после введенного с клавиатуры числа (в диапазоне от 1 до 999), 
 * обозначающего денежную единицу, дописывает слово "рубль" в правильной форме. Например, 12 рублей, 
 * 21 рубль и т. д.*/

import java.util.Scanner;

public class Java6 {

	public static void main(String[] args) {
		/** через сканер на вход получаем от пользователя число от 1 до 999 */
		Scanner enter = new Scanner(System.in);
		System.out.println("Введите число от 1 до 999");
		int val;
		if (enter.hasNextInt()) {
			val = enter.nextInt();
			enter.close();
			int x = val % 100;
			int y = val % 10;

			/** все числа, оканчивающиеся на 0, 5 - 9, а также 11 - 20 */
			if ((x >= 10 && x <= 20) || ((x < 10 || x > 20) && y >= 5)) {
				System.out.println(val + " рублей");
			}

			/** все числа, оканчивающиеся на 1 но не на 11 */
			if (x == 1 || (x > 20 && y == 1)) {
				System.out.println(val + " рубль");
			}
			/** все числа, оканчивающиеся на 2-4 кроме 12-14 */
			if ((x < 5 || x > 21) && (y > 1 && y < 5)) {
				System.out.println(val + " рубля");
			}
			// также делаем сообщение для неверного числа
		} else {
			System.out.println("Вы ввели неверное число");
		}

	}

}
