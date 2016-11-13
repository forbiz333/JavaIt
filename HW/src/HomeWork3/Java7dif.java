package HomeWork3;
/**
 * 7*. Даны натуральное число n, действительная матрица А размером n x n.
 * Получить последовательность элементов главной и побочной диагонали.
 */

public class Java7dif {

	public static void main(String[] args) {
		int n = 5; // задаем значение n
		int num[][] = new int[n][n]; // создаем двумерный массив

		/** заполняем двумерный массив и выводим на экран */
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = (int) (Math.random() * 10);
				System.out.print(num[i][j] + " | ");
			}
			System.out.println();
		}
		/** выводим на экран главную диагональ */
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (i == j) {
					System.out.print(num[i][j]);
				}
			}
		}
		System.out.println();

		/** переставляем стобцы местами - зеркалим матрицу по вертикали */
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < (num[i].length) / 2; j++) {
				int a = num[i][j];
				num[i][j] = num[i][num[i].length - 1 - j];
				num[i][num[i].length - 1 - j] = a;
			}
		}

		/*
		 * for(int i=0; i<num.length; i++){ // закомментировал вывод мытрицы
		 * после зеркаливания for(int j=0; j<num[i].length; j++){
		 * System.out.print(num[i][j] + " | "); } System.out.println(); }
		 */

		/** выводим на экран побочную диагональ */
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (i == j) {
					System.out.print(num[i][j]);
				}
			}
		}
	}

}
