package testeparamatar;

import java.util.Scanner;


public class Vetorzinho {
	
	public static void main(String[] args) {
		
		//B� criar um vetor man
		
		Scanner ler = new Scanner(System.in);
		
		int [] v = new int [5]; //vetorzinho de 5 casinhas
		int v1[] = {4, 4, 4, 4, 4}; //vetorzinho de 5 casinha again hehe
		
		//lenght mostra o tamanho do vetor
		
		//ex:
		
//		System.out.println("Tamanho do vetorzinho: " + v.length);
		
		for(int i = 0; i < v.length; i++) {
			
			v[i] = ler.nextInt();
			System.out.printf("\n%d\n", v[i]);
			
		}
		
		//usar o foreach man kkkkkjjj
		
		for(int a: v1) {
			
			System.out.println(a);
			
		} // a cada intera��o do vetor a variavel "a" assume o valor que estiver na posi��o, o vetor come�a na posi��o 0 ent�o na primeira intera��o a variavel ter� o valor da posi��o
		
		ler.close();
	}

}
