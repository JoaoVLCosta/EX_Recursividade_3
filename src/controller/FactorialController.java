package controller;

public class FactorialController {

	public FactorialController() {
		
		super();

	}

	public int fnFat(int f) {
		
		if(f > 12) {
			System.out.println("Valor acima do limite");
			System.exit(0);;
		}
		
		//A condição de parada se da ao f chegar a 1, o último número válido no cálculo de um fatorial.
		if(f == 1) {
			
			return 1;
			
		} else {
			
			return f * fnFat(f - 1);
			//O termo f deve ser multiplicado pelo retorno da função fnFat, o qual tem seu valor proceduralmente reduzido até alcançar 1. 
			//onde então ocorre o retorno que é multiplicado.
		}
		
	}
	
}
