package HomeWork2;
import java.util.Scanner;

/** 4*. Написать программу вычисления суммы чисел от 1 до n. */

public class Java4dif {

	public static void main(String[] args) {

		/** через сканер на вход получаем от пользователя число n */

		Scanner val = new Scanner(System.in);
		System.out.println("Введите целое положительное число: ");
		int n = val.nextInt();
		val.close();
		
		/** получаем сумму через формулу и выводим на экран*/
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result += i;
		}
		System.out.println(result);
	}

}
