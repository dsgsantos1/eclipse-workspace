/*
 * Autor: Daniel dos Santos
 * Turma: 228
 * Version: 1.0
 * Esse programa quebra todas as leis da programação e é protegido pelas leis divinas
 * Não sei como está funcionando, apenas Deus sabe
 * Tenha cuidado
 */

package n2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int v, um, dois, tres, quatro, b, nu;
		double por, cont;
		
		cont = 0;
		v = 1;
		um = 0;
		dois = 0;
		tres = 0;
		quatro = 0;
		b = 0;
		nu = 0;
		
		while(v != 0) {
			
			System.out.println("Informe o número do cantidato: ");
			v = ler.nextInt();
			cont++;
			//System.out.println(cont);
			
			if(v == 1) {
				
				um++;
				
			}
			
			if(v == 2) {
				
				dois++;
				
			}
			
			if(v == 3) {
				
				tres++;
				
			}
			
			if(v == 4) {
				
				quatro++;
				
			}
			
			if(v == 5) {
				
				nu++;
			}
			
			if(v == 6) {
				
				b++;
				
			}
			
			if(v == 0) {
				cont--;
				break;
			}
			
		}
		
		por = um/cont*100;
		System.out.printf("O contidato 1 obteve: %d votos e %.2f porcento\n", um, por);
		
		por = dois/cont*100.0;
		System.out.printf("O contidato 2 obteve: %d votos e %.2f porcento\n", dois, por);
		
		por = tres/cont*100.0;
		System.out.printf("O contidato 3 obteve: %d votos e %.2f porcento\n", tres, por);
		
		por = quatro/cont*100.0;
		System.out.printf("O contidato 4 obteve: %d votos e %.2f porcento\n", quatro, por);
		
		por = b/cont*100.0;
		System.out.printf("O contidato 5 obteve: %d votos e %.2f porcento\n", b, por);
		
		por = nu/cont*100.0;
		System.out.printf("O contidato 6 obteve: %d votos e %.2f porcento\n", nu, por);
		
		ler.close();
	}

}
	