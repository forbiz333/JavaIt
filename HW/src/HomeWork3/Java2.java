package HomeWork3;
/**
 * 2. Создайте массив с 10-ю переменными типа int. Используя оператор "for"
 * найдите и выведите на экран наименьшее и наибольшее значение в массиве. min
 * value = "значение которое у вас получилось". max value = "значение которое у
 * вас получилось".
 * 
 * При выводе данных постарайтесь использовать форматирование описанное в статье
 * про форматирование строк.
 */

public class Java2 {

	public static void main(String[] args) {

		/** создаем массив и заполняем случайными числами */
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int min = arr[0];
		int max = arr[0];

		/** сравниваем по очереди все элементы массива */
		for (int i = 0; i < 10; i++) {

			if (min > arr[i]) { // ищем минимум
				min = arr[i];
			}
			if (max < arr[i]) {// ищем максимум
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("min value = " + min + ";");
		System.out.println("max value = " + max + ".");
	}

}
