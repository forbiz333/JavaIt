package HomeWork3;
/** 3. В массиве из 15 чисел найти наименьший элемент и его индекс в массиве. */

public class Java3 {

	public static void main(String[] args) {
		/** создаем массив и заполняем случайными числами, выводим на экран*/
		int arr[] = new int[10]; 
		for (int i = 0; i < 10; i++) { 
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int min = arr[0];
		int i;
		/** сравниваем по очереди все элементы*/
		for (i = 0; i < 10; i++) { 
			if (min > arr[i]) { // ищем минимум
				min = arr[i];
			}
		}
		int num = -1; // присваиваем любое число не являющееся индексом в массиве
		/**	перебираем сравнивая с значением min, как только находим - останавливаем*/			
		for (i = 0; i < 10; i++) {
			if (arr[i] == min) {
				num = i;
				break;
			}
		}

		System.out.println("min value = " + min + ";");
		System.out.println("индекс в массиве = " + num + ".");
	}

}
