package HomeWork4;

/**5. Для двух строк напишите метод, определяющий, является ли одна строка перестановкой другой.*/
import java.util.*; // подключаем библиотеку для Arrays.sort

public class Task5 {

	/**
	 * Метод, получающий на вход 2 строки и определяющий, является ли одна
	 * строка перестановкой другой
	 */
	public static void isSubstring(String string1, String string2) {
		if (string1.length() == string2.length()) { // если количество символов
													// равно, то смотрим дальше
			char arr1[] = string1.toLowerCase().toCharArray();// в нижний
																// регистр
			char arr2[] = string2.toLowerCase().toCharArray();
			Arrays.sort(arr1); // сортируем каждый массив
			Arrays.sort(arr2);

			System.out.println(arr1);
			System.out.println(arr2);

			int counter = 0; // вводим счетчик на количество совпадающих
								// символов
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == (arr2[i])) { // по-символьно сравниваем массивы
					counter++; // при каждом совпадении счетчик доьавляет
								// единицу
				}
			}
			/*
			 * если количество совпадений равно длине массива - ответ ДА, иначе
			 * - НЕТ
			 */
			if (counter == arr1.length) {
				System.out.println("Одна строка является перестановкой другой");
			} else {
				System.out.println("Одна строка НЕ является перестановкой другой");
			}
		} else { // если количество символов не равно, то ответ НЕТ
			System.out.println("Одна строка НЕ является перестановкой другой");
		}
	}

	public static void main(String[] args) {
		String str = new String("Welcome"); // здесь создаем первую строку
		String str2 = new String("Wlecoem"); // здесь создаем вторую строку
		isSubstring(str, str2);
	}

}
