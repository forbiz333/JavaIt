package HomeWork3;
/**
 * 1. Создайте массив содержащий 10 переменных типа float (заполнить любыми
 * своими числами). Далее используя оператор "for" вывести все значения на экран
 * в виде: "значение" | "значение 2" | "значение 3" | и тд. После этого
 * подсчитайте среднее арифметическое значение всех переменных и результат
 * выведите на экран в виде: average value = "значение которое у вас
 * получилось".
 */

public class Java1 {

	public static void main(String[] args) {
		float numbers[] = { 10.15f, 10.54f, 65.56f, 45.899f, 1.2f, 987.65f, 116.5f, 1025.54f, 55.55f, 66.9842f };

		/** выводим на экран в запрошенном виде */
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("\"значение " + (i + 1) + "\" = " + numbers[i] + "|");
		}
		double sum = 0;

		/** вычисляем сумму массива */
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double aver = sum / (numbers.length);
		System.out.println();
		System.out.print(aver);
	}
}
