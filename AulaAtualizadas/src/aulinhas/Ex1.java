/*
 * Autor: Daniel dos Santos
 * Turma: 228
 * Version: 1.0
 * Esse programa quebra todas as leis da programação e é protegido pelas leisdivinas
 * Não sei como está funcionando, apenas Deus sabe
 * Tenha cuidado
 * O camando "escolha caso" em java se chama "switch case"
 * Na verdade, na maioria das linguagens é assim
 */

package aulinhas;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escolha uma das opções:\n1 - Bom dia\n2 - Boa tarde\n3 - Boa noite");
		
		int i = ler.nextInt();
		
		switch(i) {
		
			case 1:
				
				System.out.println("Bom dia!");
				break;
				
			case 2:
				
				System.out.println("Boa tarde!");
				break;
				
			case 3:
				
				System.out.println("Boa noite!");
				break;
				
			default:
				
				System.out.println("Opção inválida!");
				break;
		
		}
		
		ler.close();
		
	}
	
}
