package HomeWork3;
/**
 * 6. В массиве из 10 чисел переставить все нули в конец массива, не меняя
 * порядок ненулевых элементов.
 */

public class Java6 {

	public static void main(String[] args) {
		/** создаем массив и заполняем случайными числами, выводим на экран */
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10 - 6);
			System.out.print(arr[i] + " | ");
		}
		System.out.println();

		int val = 0;// вводим в переменную нужное нам значение, кот. необходимо
					// перенести в конец

		/**
		 * используем пузырьковый метод для перевода значения val в конец
		 * массива
		 */
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] == val) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " | ");
		}
	}

}
