package HomeWork4;
/**
 * 4. Реализуйте алгоритм, определяющий, все ли символы в строке встречаются
 * один раз.
 */

public class Task4 {

	/**
	 * Метод, определяющий, все ли символы в строке встречаются один раз.
	 * Считается с учетом регистра, т.е. W и w два разных символа
	 */
	public static void counting(String string) {

		char ch;
		int counter = 0;
		// перебор строки по-символьно
		for (int i = 0; i < string.length(); i++) {
			counter = -1;
			ch = string.charAt(i); // i-ое значение строки
			counter = string.indexOf(ch, i + 1); // в переменную заносим индекс
													// повторяющегося символа

			// System.out.println(counter);

			if (counter > 0) { // если данный индекс больше нуля, то повторения
								// есть
				System.out.println("В строке есть повторения символов");
				break;
			}
			/*
			 * если счетчик меньше нуля при проверке последнего
			 * символа-повторений нет
			 */
			if (counter < 0 && i == string.length() - 1) {
				System.out.println("В строке нет повторения символов");
			}
		}
	}

	public static void main(String[] args) {
		String str = new String("Welecom"); // здесь создаем строку
		counting(str);
	}

}
