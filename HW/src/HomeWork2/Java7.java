package HomeWork2;

/**7. Напишите программу, которая запрашивает у пользователя номер дня недели, 
 * затем выводит название дня недели или сообщение об ошибке, если введены неверные данные. */
import java.util.Scanner;

public class Java7 {

	public static void main(String[] args) {
		/** через сканер на вход получаем от пользователя число n */
		System.out.println("Введите номер дня недели");
		Scanner val = new Scanner(System.in);
		int x = val.nextInt();
		val.close();

		/**
		 * в зависимости от введенного числа получаем день недели и выводим на
		 * экран
		 */
		switch (x) {
		case 1:
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Суббота");
			break;
		case 7:
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("Дня с таким номером не существует");
		}

	}

}
