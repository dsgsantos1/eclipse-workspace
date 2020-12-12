package exerciciosClass;

import java.util.Random;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Random al = new Random();
		Scanner ler = new Scanner(System.in);
		Ajuda ajuda = new Ajuda();
		
		String nome;
		double nota[] = new double [5];
		int n, i, n1[] = new int [5];
		
		for(int k = 0; k < 5; k++) {
			
			n1[k] = al.nextInt(100);
			nota[k] = al.nextDouble();
			
		}
		
		System.out.println("Olá, seja bem vindo!\n1 - Verifica se um número inteiro está em vetor\n2 - Cacula a nota ponderada\n3 - Imprime o cabeçalho do IFMS com seu nome");
		i = ler.nextInt();
		
		if(i == 1) {
			
			System.out.println("Digite um numero: ");
			n = ler.nextInt();
			System.out.println(ajuda.estaNoVetor(n1, n));

		}
		
		if(i == 2) {
			
			System.out.printf("A nota pondera é: %.2f", ajuda.mediaPonderada(nota, n1));
			
		}
		
		if(i == 3) {
			
			System.out.println("Digite seu nome:");
			nome = ler.next();
			ajuda.cabecalho(nome);
			
		}

		
		if(i != 1 && i != 2 && i != 3) {
			
			System.out.println("Opção inválida!");
			
		}
		
		ler.close();
		
	}
	

}