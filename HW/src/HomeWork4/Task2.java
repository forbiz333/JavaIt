package HomeWork4;
/**
 * 2. Из небольшого текста удалить все символы, кроме пробелов, не являющиеся
 * буквами.
 */

public class Task2 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(
				"Welcome to the active, web, search tool. for? the license plate starting with ZXKFJ.");
		System.out.println(str);
		char arr[] = new char[str.length()];// создаем объект для передачи в
											// него будущего массива
		str.getChars(0, str.length(), arr, 0);// строку в массив

		// массив знаков препинания
		char dot[] = { '.', ',', '?', '!', ':', ';', '{', '}', '"', '\'' };

		/**
		 * вводим счетчик, который показывает количество знаков препинания для
		 * удаления. Т.к. я удалял символы из строки, то счетчик необходим для
		 * правильного индексирования удаляемых символов - строка уменьшается на
		 * количество ранее удаленных символов, а массив нет (сравнивал по
		 * массиву, а удалял из строки)
		 */

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < dot.length; j++) {
				if (arr[i] == dot[j]) {// сравниваем массивы по-символьно
					str.deleteCharAt(i - counter);// удаляем найденное
													// совпадение из строки
													// (здесь вычитаем счетчик)
					counter++;
				}
			}
		}
		System.out.println(str);
	}
}
