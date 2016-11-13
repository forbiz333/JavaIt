package HomeWork2;
/**
 * 5*. Напишите программу, которая выводит на экран значения функции у =
 * 2х^2-5х-8 в диапазоне от -4 до 4. Шаг изменения аргумента 0,5. (^ - в
 * степени)
 */

public class Java5dif {

	public static void main(String[] args) {

		int y;
		/** используем формулу и выводим на экран */
		for (double x = -4; x <= 4; x = x + 0.5) {
			y = (int) (2 * x * x - 5 * x - 8);
			System.out.print(y + "  ");
		}
	}

}
