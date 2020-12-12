package aulinhas;

import java.util.Scanner;

public class aula06Segundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l1, l2, l3, soma;
		boolean v = true;
		
		Scanner ler = new Scanner(System.in);
		
		l1 = ler.nextInt();
		l2 = ler.nextInt();
		l3 = ler.nextInt();
		
		while(v) {
			
			soma = l1 + l2;
			
			if(soma <= l3) {
				
				System.out.println("Não é um triangulo!");
				break;
			}
			
			soma = l1 + l3;
			
			if(soma <= l2) {
				
				System.out.println("Não é um triangulo");
				break;
				
			}
			
			soma = l2 + l3;
			
			if(soma <= l1) {
				
				System.out.println("Não é um triangulo");
				break;
				
			}
			
			if(l1 == l2 && l2 == l3) {
				
				System.out.println("é um equilatero");
				
			}
			
			if(l2 == l1 && l3 > l1){
				
				System.out.println("é um isosceles");
				
			}
			
			if(l1 != l2 && l2 != l3) {
				
				System.out.println("Escaleno");
				
			}
			
			v = false;
		}
		
		ler.close();
  
	}

}
