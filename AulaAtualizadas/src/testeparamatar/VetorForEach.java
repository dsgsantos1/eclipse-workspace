package testeparamatar;

import java.util.Arrays;

//import java.util.Arrays;

public class VetorForEach {
	
	public static void main(String[] args) {
		
		int a[] = {5, 6, 4, 8, 9, 5, 7, 52};
		
		/*for(int valor: a) {
			
			System.out.println(valor);
			
		}
		*/
		
		//função para ordenar valor do vetor em ordem crescente 
		
		Arrays.sort(a);
		
		for(int valor: a) {
			
			System.out.println(valor);
			
		}
		
		System.out.println();
		
		//função para preencher vetor com um valor para todas as casas
		
		int b[] = new int[5];
		
		Arrays.fill(b, 1); //todas as casas terão valor 1
		
		for(int valor:b) {
			
			System.out.println(valor);
			
		}
		
		System.out.println();
		
		//função para achar a casa de um vetor com um valor especifico, porem o vetor precisa estar ordenado
		
		
		int c[] = {5, 3, 65, 1, 8, 3, 8};
		Arrays.sort(c);
		int i = Arrays.binarySearch(c, 8*8+1);
		
		System.out.println(i);
		
	}

}
