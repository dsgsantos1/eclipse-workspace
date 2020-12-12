/*
 * Autor: Daniel dos Santos
 * Turma: 228
 * Version: 5.0
 * Esse programa quebra todas as leis da programação e é protegido pelas leis 	
 * divinas
 * Não sei como está funcionando, apenas Deus sabe
 * Tenha cuidado
 * Quase morri fazendo esse códigoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
 */

package exMatriz;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		
		Random pre = new Random();
		
		int m[][] = new int[5][5];
		int v[] = new int[5];
		int v1[] = new int[5];
	//	int v2[] = new int[5];
		int v3[] = new int[5];
		int k = 4;
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				m[i][j] = pre.nextInt(9);
				System.out.print(m[i][j] + " ");
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				 
				if(i == 1) {
					
					v[j] = m[i][j];
					m[1][j] = m[4][j];
					m[4][j] = v[j];
					
				}
				
				if(j == 0) {
					
					v1[i] = m[i][j];
					m[i][j] = m[i][3];
					m[i][3] = v1[i];
					
				}
				
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			v3[i] = m[i][i];
			m[i][i] = m[i][k];
			m[i][k] = v3[i];
			
		}
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				System.out.printf("%d ", m[i][j]);
				
			}
			
			System.out.println();
			
		}
	
}
}

