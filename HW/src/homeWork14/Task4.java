/**Написать приложение, в котором используются 2 потока(класс один и тот же). 
 * Класс потока задать как наследник Thread. Класс потока должен обеспечивать в 
 * методе run построчный несинхронизированный вывод в консольное окно чисел от 1 
 * до 100 порциями по 10 чисел в строке, разделенных пробелами, причем перед каждой 
 * такой порцией должна стоять надпись: "Thread 1:" для первого потока, "Thread 2:"
 *  — для второго  - можно использовать название потока (есть соответствующий метод). 
 *  В приложении при вводе с клавиатуры "start" потоки должны стартовать.
Thread 1: 1 2 3 4 5 6 7 8 9 10
Thread 1: 11 12 13 14 15 16 17 18 19 20
Thread 2: 1 2 3 4 5 6 7 8 9 10
*/

package homeWork14;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		MegaThread numbersOne = new MegaThread();
		numbersOne.setName("Thread 1");
		MegaThread numbersTwo = new MegaThread();
		numbersTwo.setName("Thread 2");
		MegaThread numbersThree = new MegaThread();
		numbersThree.setName("Thread 3");

		System.out.println("to start the program write \"start\"\n" + "to exit the program write \"exit\"");

		try (Scanner in = new Scanner(System.in)) {

			String str = in.nextLine();
			String start = new String("start");
			String exit = new String("exit");

			if (str.equals(start)) {
				numbersOne.start();
				numbersTwo.start();
				numbersThree.start();
				in.close();
				return;
			} else if (str.equals(exit)) {
				in.close();
				return;
			} else {
				System.out.println("to start the program write \"start\"\n" + "to exit the program write \"exit\"");
			}
		}
		/*
		 * System.out.println(numbersTwo); System.out.println(numbersOne);
		 * System.out.println(numbersThree);
		 */
	}

}
