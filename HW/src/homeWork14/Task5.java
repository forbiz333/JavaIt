
/** * Усовершенствовать предыдущее приложение, 
 * обеспечив синхронизацию, чтобы потоки выводили 
 * строки по очереди.
Thread 1: 1 2 3 4 5 6 7 8 9 10
Thread 2: 1 2 3 4 5 6 7 8 9 10
Thread 1: 11 12 13 14 15 16 17 18 19 20
Thread 2: 11 12 13 14 15 16 17 18 19 20
 */

package homeWork14;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		SuperThreadOne numbersOne = new SuperThreadOne();
		numbersOne.setName("Thread 1");
		SuperThreadTwo numbersTwo = new SuperThreadTwo();
		numbersTwo.setName("Thread 2");
		
		/**menu - make your choice*/ 
		System.out.println("to start the program write \"start\"\n" + "to exit the program write \"exit\"");
		for (;;) {
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			String start = new String("start");
			String exit = new String("exit");

			if (str.equals(start)) {
				numbersOne.start();
				numbersTwo.start();
				
				in.close();
				return;
			} else if (str.equals(exit)) {
				in.close();
				System.exit(0);
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
