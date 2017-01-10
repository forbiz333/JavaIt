package HomeWork4;
/**
 * 1. В английском тексте каждую букву заменить ее порядковым номером в
 * алфавите. При выводе в одной строке печатать текст с двумя пробелами между
 * буквами, в следующей строке внизу под каждой буквой печатать ее номер.
 */

public class Task1 {

	public static void main(String[] args) {

		String str = new String("Hello, Java Developers abc!");
		char arr1[] = str.toCharArray();// переводим строку в массив для
										// последующего вывода с пробелами

		String s = str.toLowerCase(); // приводим все к одному регистру для
										// подсчета позиций букв
		char arr[] = s.toCharArray();// массив текста с нижним регистром
		int num = 0;
		System.out.println("tread is waitin 5 sec");
		try{Thread.sleep(5000);}
		catch(InterruptedException e){
			System.out.println("Exc");
		}
		for (int i = 0; i < arr1.length; i++) {// Распечатываем исходный текст с
												// пробелами
			System.out.print(arr1[i] + "  ");
		}
		System.out.println();

		/**
		 * вычисляем номер буквы в массиве цифровой код чара приводим в инт с
		 * вычитанием '\u0060'чтобы буква a = 1, тут Google помог. При такой
		 * структуре пробелы и символы получаются меньше нуля - распечатываем 3
		 * пробела, где однозначное число - 2 пробела, двузначное число - 3
		 * пробела
		 */
		for (int i = 0; i < arr.length; i++) {
			num = (int) ((arr[i]) - '\u0060');
			if (num < 0) {
				System.out.print("   ");
			}
			if (num < 10 && num > 0) {
				System.out.print(num + "  ");
			}
			if (num >= 10) {
				System.out.print(num + " ");
			}
		}
	}

}
