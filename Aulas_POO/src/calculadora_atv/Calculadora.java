package calculadora_atv;

public class Calculadora{
	
	double n1, n2;
	
	void somar() {
		
		System.out.printf("A soma �: %.2f\n", this.n1 + this.n2);
		
	}
	
	void subtrair () {
		
		System.out.printf("A diferen�a �: %.2f\n", this.n1 - this.n2);
		
	}
	
	void multiplicar () {
		
		System.out.printf("O produto �: %.2f\n", this.n2 * this.n1);
		
	}
	
	void dividir () {
		
		System.out.printf("O quociente �: %.2f\n", this.n1 / this.n2);
		
	}
	
}
