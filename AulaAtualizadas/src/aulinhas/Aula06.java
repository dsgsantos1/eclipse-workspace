package aulinhas;

import java.util.Scanner;

public class Aula06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int i = ler.nextInt();
		
		boolean grande = i >= 100;
	//	System.out.println();
		
		if (i % 2 == 0) {
			
			if(i < 10) {
				
				System.out.println("é menor que 10!");
				
			}
			
			else {
				
				System.out.println("maior que 10");
				
			}
			
			if(grande) {
				
				System.out.println("Mó grande esse número");
				
			}
			
			System.out.println("É um número par!");
				
		}
		
		else {
			
			if(i < 10) {
				
				System.out.println("é menor que 10!");
				
			}
			
			else {
				
				System.out.println("maior que 10");
				
			}
			
			if(grande) {
				
				System.out.println("Mó grande esse número");
				
			}
			System.out.println("É impar!");
			
		}
		
		
		ler.close();

	}

}
