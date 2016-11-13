package HomeWork2;

/**2*. Написать программу, которая вычисляет факториал введенного с клавиатуры числа.*/
import java.util.Scanner;

public class Java2dif {

	public static void main(String[] args) {

		/** через сканер на вход получаем от пользователя число n */
		Scanner val = new Scanner(System.in);
		System.out.println("Введите целое положительное число: ");
		int x = val.nextInt();
		val.close();
		int result = 1;
		/** отсекаем ноль */
		if (x == 0) {
			System.out.println("Факториал равен нулю");
		}
		/** отсекаем отрицательные значения */
		if (x < 0) {
			System.out.println("Вы ввели отрицательное число");
		}
		/** если положительное вычисляем факториал */
		if (x > 0) {
			for (int i = 1; i <= x; i++) {
				result *= i;
			}
			System.out.println("Факториал вашего числа равен: " + result);
		}

	}

}
