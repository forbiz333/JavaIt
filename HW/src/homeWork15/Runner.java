package homeWork15;

/**
 * Напишите программу, моделирующую кассы в магазине. Существует несколько касс,
 * работающих одновременно. Каждый покупатель - отдельный поток. Общее
 * количество покупателей может быть больше чем количество касс, но одновременно
 * не может обрабатываться больше покупателей чем имеется рабочих касс. У
 * каждого покупателя есть набор товаров, которые должны быть выведены в
 * процессе обслуживания.
 */

public class Runner {

	public static void main(String[] args) {
		for (String k : Products.products) {
			System.out.println(k);
		}
	}

}
