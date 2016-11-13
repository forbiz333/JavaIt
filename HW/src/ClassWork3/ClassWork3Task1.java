package ClassWork3;

/**Создать список оценок учеников с помощью ArrayList, 
 * заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.*/
import java.util.*;

public class ClassWork3Task1 {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			marks.add((int) (Math.random() * 10 + 1));
			System.out.println("Mark " + i + " = " + +marks.get(i) + ";");
		}
		System.out.println(marks);

		// Вводим итератор
		Iterator<Integer> iterator = marks.iterator();

		// Удаляем все оценки ниже 5
		while (iterator.hasNext()) {
			if (iterator.next() <= 4) {
				iterator.remove();
			}

		}
		System.out.println(marks);

		// вообще ничего не происходит(код ниже), итераторр используем только 1
		// цикл???
		/*
		 * while (iterator.hasNext()) { System.out.println(iterator.next());
		 * System.out.println(1); }
		 */
	}

}