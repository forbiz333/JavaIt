package HomeWork3;
/**
 * 5. В массиве из 10 чисел вычислить произведение элементов массива до первого
 * нуля.
 */

public class Java5 {

	public static void main(String[] args) {
		/** создаем массив и заполняем случайными числами, выводим на экран */
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) { //
			arr[i] = (int) (Math.random() * 10 - 6);
			System.out.print(arr[i] + " | ");
		}
		/**
		 * если первое число ноль - выводим соответствующее сообщение, иначе
		 * ищем первый ноль и умнажаем все элементы до него
		 */
		if (arr[0] == 0) {
			System.out.println();
			System.out.println("Первое число - ноль!!!");
		} else {
			int mult = 1;
			for (int i = 0; i < 10; i++) {
				if (arr[i] == 0) {
					break;
				}
				mult *= arr[i];
			}
			System.out.println();
			System.out.println("Произведение элементов до ближайшего нуля  = " + mult);
		}
	}

}
