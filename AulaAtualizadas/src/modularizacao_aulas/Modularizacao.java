/*
 * Fazer uma calculadora com dois numeros
 */


package modularizacao_aulas;

import java.util.Scanner;

public class Modularizacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		double n1, n2;
		Calc calculadora = new Calc();
		
		n1 = ler.nextDouble();
		n2 = ler.nextDouble();
		
		System.out.printf("A soma de %.2f e %.2f � %.2f\n", n1, n2, calculadora.soma(n1, n2));
		System.out.printf("Diferen�a: %.2f\n", calculadora.sub(n1, n2));
		System.out.printf("Multiplica��o: %.2f\n", calculadora.mult(n1, n2));
		System.out.printf("Divis�o: %.0f / %.0f = %.2f\n", n1, n2, calculadora.div(n1, n2));
		
		
		ler.close();
		
	}

}
