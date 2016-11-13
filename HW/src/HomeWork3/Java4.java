package HomeWork3;
/**
 * 4. В массиве из 10 чисел подсчитать количество отрицательных элементов
 * массива.
 */

public class Java4 {

	public static void main(String[] args) {
		/** создаем массив и заполняем случайными числами, выводим на экран */
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10 - 6);
			System.out.print(arr[i] + " | ");
		}

		/**
		 * вводим счетчик с нулевым значением и при обнаружении числа < 0
		 * добавляем к нему
		 */
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("Количество отрицательных чисел = " + count);
	}

}
