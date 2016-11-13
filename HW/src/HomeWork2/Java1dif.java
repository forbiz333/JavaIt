package HomeWork2;

/**1*. Написать программу, которая вычисляет сумму первых n членов ряда: 1 + 1/2 + 1/3 + 1/4 +…. 
 * Количество суммируемых членов ряда задается во время работы программы.*/
import java.util.Scanner;

public class Java1dif {

	/** Создаем метод, который на вход получит число n и решает нашу задачу */
	public static void sum(int x) {
		double result = 0;
		for (double i = 1; i <= x; i++) {
			result += 1 / i;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		/** через сканер на вход получаем от пользователя число n */
		Scanner val = new Scanner(System.in);
		System.out.println("Введите целое положительное число: ");
		int n = val.nextInt();
		val.close();

		/** вызываем метод sum, давая ему на вход n */
		sum(n);

	}
}
