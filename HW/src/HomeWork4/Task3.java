package HomeWork4;
/**
 * 3. Из текста удалить все слова заданной длины, начинающиеся на согласную
 * букву.
 */

public class Task3 {

	public static void main(String[] args) {
		String str = new String(
				"Welcome to the active, web, search, tool. for? the license plate starting with ZXKFJK.");
		System.out.println(str);

		/** удаляем ненужные символы из строки */
		str = str.replace(".", "").replace(",", "").replace("?", "");

		String latter[] = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "r", "s", "t", "v", "w", "x",
				"z", "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V", "W", "X", "Z" };
		String latter2[] = { "a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y" };

		/** разбиваем на массив слов через пробел */
		String strParts[] = str.split(" ");

		/*
		 * for (int i=0; i<strParts.length; i++){//распечатка массива
		 * System.out.print(strParts[i]+ "|"); } System.out.println();
		 */

		int n = 6; // нужное нам число букв в слове
		String s = "";
		/**
		 * перебираем начальные буквы с массивом согласных. Если начинается с
		 * согласной и не равно n - заносим в строку. Если слово начинается с
		 * гласной - заносим в строку
		 */
		for (int i = 0; i < strParts.length; i++) {
			for (int j = 0; j < latter.length; j++) {
				if (strParts[i].startsWith(latter[j]) && strParts[i].length() != n) {
					s = s.concat(" ").concat(strParts[i]);
				}
			}
			for (int k = 0; k < latter2.length; k++) {
				if (strParts[i].startsWith(latter2[k])) {
					s = s.concat(" ").concat(strParts[i]);
				}
			}
		}
		System.out.println(s.trim()); // - печатем получившуюся строку с
										// обрезанием пробелов по краям
	}

}
