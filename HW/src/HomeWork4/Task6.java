package HomeWork4;

/**6*. Реализуйте метод, осуществляющий сжатие строки, на основе счетчика повторяющихся символов. 
 * Например, строка aabcccccaaa должна превратиться в a2b1c5a3. Если «сжатая» строка оказывается 
 * длиннее исходной, метод должен  вернуть исходную строку.*/
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/** Через сканер получаем строку от пользователя */
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите строку на английском языке");
		String str = scan.nextLine();
		scan.close();

		String result1 = new String();

		int counter = 1;
		char charEnd = str.charAt(0);

		/*
		 * сравниваем 2 символ с первым, если равны к счетчику прибавляем 1,
		 * иначе записываем в итоговую строку символ + счетчик
		 */
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == charEnd) {
				counter++;
			} else {
				result1 += charEnd + "" + counter;
				charEnd = str.charAt(i); // присваиваем значение i, чтобы
											// следующее сравнение было уже с
											// новым символом
				counter = 1; // и возвращаем счетчику 1
			}
		}
		/*
		 * забиваем все итоги в строку, также добавляем сюда последний символ и
		 * последний счетчик, т.к. в сроку result1 не попадает последний символ
		 * или символы, если они одинаковы
		 */
		String result2 = result1 + "" + charEnd + "" + counter;

		/*
		 * сравниваем длину, если длина после метода <= исходнику - берем
		 * result2, иначе, оставляем вводимую строку
		 */

		if (result2.length() <= str.length()) {
			System.out.println(result2);
		} else {
			System.out.println(str);
		}

	}
}
