package homeWork18Pattern;
/** Паттерн Builder. Разработать модель системы Комплексный обед. 
 * Написать код  приложения,  позволяющий  создавать  как  стандартные  
 * комплексные обеды, так и обеды, в которые включены дополнительные блюда 
 * из меню. Минимум 3 типа дополнительных типа блюд.
 */

public class Runner {

	public static void main(String[] args) {
		CookDirector cook = new CookDirector();
		DinnerBuilder wantEat = new MegaFatDinnerBuilder();
		cook.setDinnerBuilder(wantEat);
		cook.constructDinner();
		
		//Dinner dinner = cook.getDinner();
		
	
		System.out.println(cook.getDinner());
		
	}

}
