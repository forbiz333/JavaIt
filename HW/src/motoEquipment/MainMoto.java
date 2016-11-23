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
import java.util.*;

public class MainMoto {

	public static void main(String[] args) {

		Equipment jacket = new Clothes("jacket", 1500, 100, "leather", "black", "xxl");
		Equipment trousers = new Clothes("trousers", 1000, 60, "leather", "black", "xxl");
		Equipment overalls = new Clothes("overalls", 2000, 250, "leather", "black and red", "xxl");
		Equipment gloves = new Clothes("gloves", 80, 30, "leather", "black", "xl");

		Equipment turtle = new Protection("turtle", 3000, 300, "polypropylene and poliester", "black", "xl", 5);
		Equipment kneeProtection = new Protection("kneeProtection", 250, 25, "polypropylene and poliester", "black",
				"xl", 3);
		Equipment elbowProtection = new Protection("elbowProtection", 200, 25, "polypropylene and poliester", "black",
				"xl", 3);
		Equipment shoulderProtection = new Protection("shoulderProtection", 200, 20, "polypropylene and poliester",
				"black", "xl", 3);
		Equipment helmet = new Protection("helmet", 500, 80, "polypropylene and plastic", "black and red", "xxxl", 4);

		Equipment belt = new ForManAcc("belt", 300, 20, "leather", "dark brown", 4);
		Equipment bandanna = new ForManAcc("bandanna", 30, 5, "cottton and poliester", "black", 3);

		Equipment glasses = new ForWomanAcc("glasses", 80, 50, "glass", "pink", 5);
		Equipment bracelet = new ForWomanAcc("bracelet", 100, 500, "gold", "golden", 5);
		
		List <Equipment> equipList = new ArrayList<Equipment>();
		equipList.add(jacket);
		equipList.add(new Clothes("trosaefsers", 1000, 60, "leather", "black", "xxl"));
		System.out.println(equipList);
		
		
	}

}
