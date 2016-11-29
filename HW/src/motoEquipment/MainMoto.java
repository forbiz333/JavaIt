/**Создать консольное приложение, удовлетворяющее следующим требованиям:
•  Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
•  Каждый класс должен иметь отражающее смысл название и информативный состав.
•  Наследование должно применяться только тогда, когда это имеет смысл.
•  При кодировании должны быть использованы соглашения об оформлении 
	кода java code convention.
•  Классы должны быть грамотно разложены по пакетам.
•  Консольное меню должно быть минимальным.
•  Использовать коллекции в проекте
•  Добавить обработку исключений в проект.
•  Добавить в проект сохранение объектов в файл и извлечение из файла дополнительным пунктом меню
 * 
 *  7.  Мотоциклист.Определить иерархию амуниции. Экипировать мотоциклиста. Подсчитать стоимость.
 *   Провести сортировку амуниции на основе веса.
 *   Найти элементы амуниции, соответствующие заданному диапазону параметров цены.*/

package motoEquipment;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class MainMoto {

	public static void main(String[] args) {

		List<Equipment> equipList = new ArrayList<Equipment>();
		List<Equipment> equipListSort = new ArrayList<Equipment>();

		equipList.add(new Clothes("jacket", 1500, 100, "leather", "black", "xxl"));
		equipList.add(new Clothes("trousers", 1000, 60, "leather", "black", "xxl"));
		equipList.add(new Clothes("overalls", 2000, 250, "leather", "black and red", "xxl"));
		equipList.add(new Clothes("gloves", 80, 30, "leather", "black", "xl"));

		equipList.add(new Protection("turtle", 3000, 300, "polypropylene and poliester", "black", "xl", 5));
		equipList.add(new Protection("kneeProtection", 250, 25, "polypropylene and poliester", "black", "xl", 3));
		equipList.add(new Protection("elbowProtection", 200, 25, "polypropylene and poliester", "black", "xl", 3));
		equipList.add(new Protection("shoulderProtection", 200, 20, "polypropylene and poliester", "black", "xl", 3));
		equipList.add(new Protection("helmet", 500, 80, "polypropylene and plastic", "black and red", "xxxl", 4));

		equipList.add(new ForManAcc("belt", 300, 20, "leather", "dark brown", 4));
		equipList.add(new ForManAcc("bandanna", 30, 5, "cottton and poliester", "black", 3));

		equipList.add(new ForWomanAcc("glasses", 80, 50, "glass", "pink", 5));
		equipList.add(new ForWomanAcc("bracelet", 100, 500, "gold", "golden", 5));

		// System.out.println(equipList);

		int counter = equipList.size();

		try (Scanner input = new Scanner(System.in)) {// try-with-resources
			for (;;) {// infinite cycle for non-stop using program

				/* menu */
				System.out.println("\n1. Экипировать мотоциклиста.\n" + "2. Подсчитать стоимость.\n"
						+ "3. Провести сортировку амуниции на основе веса.\n"
						+ "4. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.\n"
						+ "5. Сериализацияю\n" + "6. Десериализация\n" + "7. Выход");

				int value = input.nextInt();

				switch (value) {
				case 1:
					System.out.println(equipList);

					break;

				case 2:
					int sum = 0;
					for (int i = 0; i < counter; i++) {
						sum += equipList.get(i).getPrice();
					}
					System.out.println(sum + " USD;");
					break;

				case 3:
					Comparator<Equipment> comp = new Comparator<Equipment>() {
						public int compare(Equipment one, Equipment two) {
							return one.getWeight().compareTo(two.getWeight());
						}
					};
					Collections.sort(equipList, comp);
					for (int i = 0; i < counter; i++) {

						System.out.print(equipList.get(i));
					}
					break;

				case 4:
					System.out.println(
							"Введите диапазон цены: цифру-начало диапазона  - ввод, затем цифру-конец диапазона - ввод ");
					int floorPrice = input.nextInt();
					int ceilPrice = input.nextInt();

					for (int i = 0; i < counter; i++) {
						if ((equipList.get(i).getPrice()) >= floorPrice && (equipList.get(i).getPrice()) <= ceilPrice) {
							System.out.print(equipList.get(i));
							equipListSort.add(equipList.get(i));
						}
					}
					// System.out.print("\n" + equipListSort);
					break;
				case 5:
					System.out.print("\n" + equipListSort);
					FileOutputStream fos = null;
					ObjectOutputStream out = null;
					try {
						fos = new FileOutputStream("moto.tmp");
						out = new ObjectOutputStream(fos);
						// MainMoto object = new MainMoto();
						out.writeObject(equipListSort);
						// out.flush();
						out.close();
					} catch (IOException ex) {
						ex.printStackTrace();
					}

					//System.out.println(equipList);

					break;

				case 6:
					FileInputStream fis = null;
					ObjectInputStream oin = null;
					try {
						fis = new FileInputStream("moto.tmp");
						oin = new ObjectInputStream(fis);
						Equipment object = (Equipment) oin.readObject();
						System.out.println(object);
						oin.close();
					} catch (IOException ex) {
						ex.printStackTrace();
					} catch (ClassNotFoundException ex) {
						ex.printStackTrace();
					}

					break;

				case 7:

					return;

				default:
					System.out.println("Вы ввели неверное число");

				}
			}
		}
	}
}
