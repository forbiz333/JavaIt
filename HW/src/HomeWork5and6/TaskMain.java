package HomeWork5and6;

/**
 * Создать классы, спецификации которых приведены ниже. Определить конструкторы
 * и методы setТип(), getТип(), toString(). Определить дополнительно методы в
 * классе, создающем массив объектов. Задать критерий выбора данных и вывести
 * эти данные на консоль. В каждом классе, обладающем информацией, должно быть
 * объявлено несколько конструкторов. TaskMain: id, Фамилия, Имя, Отчество, Адрес,
 * Номер кредитной карточки,Дебет, Кредит, Время городских и междугородных
 * разговоров. Создать массив объектов. Вывести: a) сведения об абонентах, у
 * которых время внутригородских разговоров превышает заданное; b) сведения об
 * абонентах, которые пользовались междугородной связью; c) сведения об
 * абонентах в алфавитном порядке.
 */
import java.util.*;

public class TaskMain {

	public static void main(String[] args) {

		List<Phone> phoneList = new ArrayList<Phone>();

		phoneList.add(new Phone(1561, "Alex", "Alexovich", "Alexov", "Arol", 156111111110l, 156.1, 15.1, 100, 10));
		phoneList.add(new Phone(3215, "Max", "Maxovich", "Maxov", "Minsk", 321511111110l, 321.5, 32.5, 110, 11));
		phoneList.add(new Phone(4568, "Paha", "Pahavich", "Pahov", "Polock", 456811111110l, 456.8, 45.8, 120, 12));
		phoneList.add(new Phone(9878, "Vova", "Vovavich", "Vovov", "Vavilon", 987811111110l, 987.8, 98.8, 130, 0));
		phoneList.add(new Phone(9636, "Foma", "Fomavich", "Fomov", "Frankfurt", 963611111110l, 963.6, 96.6, 140, 14));
		phoneList.add(new Phone(1234, "Miha", "Mishavich", "Mishov", "Moskow", 123411111110l, 123.4, 12.4, 150, 15));

		Iterator<Phone> iter = phoneList.iterator();
		int counter = 0; // using the counter just to know the length of using
							// phoneList
		while (iter.hasNext()) {
			iter.next();
			counter++;
		}

		// System.out.println(counter); // for printing the counter

		Scanner input = new Scanner(System.in);

		for (;;) {// infinite cycle for non-stop using program

			/** menu */
			System.out.println("Введите число от 1 до 4 включительно:\n"
					+ "1. сведения об абонентах, у которых время внутригородских разговоров превышает заданное Вами;\n"
					+ "2. сведения об абонентах, которые пользовались междугородной связью;\n"
					+ "3. сведения об абонентах в алфавитном порядке;\n" + "4. для выхода их программы");

			int value = input.nextInt();

			/**
			 * 1. Task a. ----- 2. Task b ------ 3. Task c ------ 4. Quit
			 */

			switch (value) {
			case 1:
				System.out.println(
						"Введите целое число (время внутригородских разговоров), свыше которого будут отфильтрованы данные");
				int valueCityCall = input.nextInt();
				PrintTopTable.topTable();
				for (int i = 0; i < counter; i++) {
					if ((phoneList.get(i).getTimeCityCall()) > valueCityCall) {
						System.out.println(phoneList.get(i));
					}
				}
				break;

			case 2:
				PrintTopTable.topTable();
				for (int i = 0; i < counter; i++) {
					if ((phoneList.get(i).getTimeCityOutCall()) > 0) {
						System.out.println(phoneList.get(i));
					}
				}
				break;

			case 3:
				Comparator<Phone> comp = new Comparator<Phone>() {
					public int compare(Phone one, Phone two) {
						return one.getSername().compareTo(two.getSername());
					}
				};
				Collections.sort(phoneList, comp);
				PrintTopTable.topTable();
				for (int i = 0; i < counter; i++) {

					System.out.println(phoneList.get(i));
				}
				break;
			case 4:
				input.close();
				return;

			default:
				System.out.println("Вы ввели неверное число");
			}

		}

	}

}
