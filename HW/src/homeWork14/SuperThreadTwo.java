package homeWork14;

/**
 * Class printing all numbers from Task - each object has it's own thread
 */
public class SuperThreadTwo extends Thread {

	@Override
	public void run() {

		for (int i = 0, j = 1; i < 10; i++) {
			synchronized ("") { // synchronized for one reason: to print one raw
								// of 10 numbers by 1 thread

				System.out.print(getName() + ": ");
				for (int k = 0; k < 10; k++, j++) {
					System.out.print(j + " ");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("AAAAaaaaaaa");
					}
				}
				System.out.println();
			}
		}

	}
}
