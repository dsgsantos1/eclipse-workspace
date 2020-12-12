/*
 * Autor: Daniel dos Santos
 * Turma: 228
 * Version: 1.3
 * Esse programa quebra todas as leis da programação e é protegido pelas leis 	
 * divinas
 * Não sei como está funcionando, apenas Deus sabe
 * Tenha cuidado
 */

package exMatriz;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double m[][] = new double [5][1];
		double c; 
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 1; j++) {
				
				m[i][j] = 0;
				
			}
			
		}
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 1; j++) {
				
				System.out.printf("\nFuncionário nº cortes: ");
				c = ler.nextDouble();
				System.out.println();
				m[i][j] = c*25*50/100.0 + m[i][j];
				
				System.out.printf("Funcionário nº tranças: ");
				c = ler.nextDouble();
				System.out.println();
				m[i][j] = c*250/2 + m[i][j];
				
				System.out.printf("Funcionário nº dread's: ");
				c = ler.nextDouble();
				System.out.println();
				m[i][j] = c*300/2 + m[i][j];
				
				System.out.println("------------------------------------------------------------");
			}
		
		}
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 1; j++) {
				
				System.out.printf("Total: %.2f reais \n---------------------------", m[i][j]);
				
			}
			
			System.out.println();
			
		}
		
		ler.close();
	}

}
