package principal;
import controller.FactorialController;
public class Principal {

	public static void main(String[] args) {
		
		FactorialController pc = new FactorialController();
		
		int f = 12;
		
		int result = pc.fnFat(f);
		
		System.out.println(result);
		
	}
	
}
