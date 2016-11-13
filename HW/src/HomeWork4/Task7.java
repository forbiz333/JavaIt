package HomeWork4;
/**7*. Напишите алгоритм, реализующий следующее условие: если элемент матрицы M × N 
 * в точке равен 0, то весь столбец и вся строка обнуляются.*/
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите целое положительное число");
		int m = scan.nextInt();
		System.out.println("Введите целое положительное число");
		int n = scan.nextInt();
		scan.close();
		
		int arr[][] = new int[m][n]; 
		for (int i=0; i<arr.length; i++){ // заполняем двумерный массив случайными числами
			for (int j=0; j<arr[i].length; j++){
				arr[i][j] = (int)(Math.random()*10-1);
				System.out.print(arr[i][j]+ " | ");
			}
			System.out.println();
		}
		System.out.println(); // разделяем для удобства чтения второго массива
		
		int rows[] = new int[m]; // вводим массив на количесьтво строк
		int columns [] = new int [n];// вводим массив на количество столбцов
		
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[i].length; j++){
				if(arr[i][j] == 0){
					rows[i] = 1; // вводим число один в массив рядов в ту позицию, где стоит ноль в матрице
					columns[j] = 1; // вводим число один в массив столбцов в ту позицию, где стоит ноль в матрице
				}
			}
		}
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[i].length; j++){
				if(rows[i]==1 || columns[j]==1){ // если в одном из массивов ряды или 
					arr[i][j] = 0;
					
				}
			}
		}
		
		for (int i=0; i<arr.length; i++){         // выводим новую матрицу
			for (int j=0; j<arr[i].length; j++){
				
				System.out.print(arr[i][j]+ " | ");
			}
			System.out.println();
		}
		
	}

}
