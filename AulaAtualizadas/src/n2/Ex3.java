/*
 * Autor: Daniel dos Santos
 * Turma: 228
 * Version: 1.0
 * Esse programa quebra todas as leis da programação e é protegido pelas leis divinas
 * Não sei como está funcionando, apenas Deus sabe
 * Tenha cuidado
 */

package n2;

public class Ex3 {

	public static void main(String[] args) {
		
		int soma, i, j;
		
		for(i = 1; i <= 6; i++) {
			
			for(j = 1; j <= 6; j++) {
				
				soma = i + j;
				
				if(soma == 7) {
					
					System.out.printf("%d + %d\n", i, j);
					
				}
				
			}
			
		}

	}

}
