/*
 * Autor: Daniel dos Santos
 * Turma: 228
 * Version: 1.0
 * Esse programa quebra todas as leis da programação e é protegido pelas leisdivinas
 * Não sei como está funcionando, apenas Deus sabe
 * Tenha cuidado
 */

package aulinhas;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		double valor, lucro, montante;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da compra: ");
		
		valor = ler.nextDouble();
		
		if(valor <= 1000) {
			
			lucro = valor * 25/100;	
			montante = valor + lucro;
			
			System.out.printf("Valor da venda: R$%.2f\nLucro: R$%.2f", montante, lucro);
			
		}
		
		if(valor > 1000 && valor <= 2000) {
			
			lucro = valor * 20/100;
			montante = valor + lucro;
			
			System.out.printf("Valor da venda: R$%.2f\nLucro: R$%.2f", montante, lucro);
			
		}
		
		if(valor > 2000) {
			
			lucro = valor * 15/100;
			montante = valor + lucro;
			
			System.out.printf("Valor da venda: R$%.2f\nLucro: R$%.2f", montante, lucro);
			
		}
		
		ler.close();
		
	}

}
