/*
 * Autor: Daniel dos Santos
 * Turma: 228
 * Version: 1.0
 * Esse programa quebra todas as leis da programação e é protegido pelas leis 	
 * divinas
 * Não sei como está funcionando, apenas Deus sabe
 * Tenha cuidado
 */

package exMatriz;

import java.util.Random;

//import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Scanner ler = new Scanner(System.in);
		
		Random p = new Random();
		
		double m[][] = new double [5][10];
		double real[][] = { {0, 0, 0, 0, 0} };
	
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 10; j++){
				
				m[i][j] = p.nextDouble()*2.3;
				//m[i][j] = ler.nextDouble();
				
				if(i == 0 && m[i][j] > real[0][0]) {
					
					real[0][0] = m[i][j];
					
				}
				
				if( (i == 1) && (m[i][j] > real[0][1])) {
					
					real[0][1] = m[i][j];
					
				}
				
				if(i == 2 && m[i][j] > real[0][2]) {
					
					real[0][2] = m[i][j];
				
				}
				
				if(i == 3 && m[i][j] > real[0][3]) {
					
					real[0][3] = m[i][j];
				
				}
				
				if(i == 4 && m[i][j] > real[0][4]) {
					
					real[0][4] = m[i][j];
				
				}

				
			}
			
		}
		
		for(int i = 0; i <= 4; i++) {
			
			System.out.printf("%.2f | ", real[0][i]);
			
		}

	}

}
