package aula_classes;

import java.util.ArrayList;

public class ArraysList {
	
	public static void main(String[] args) {
		
		Produto produto01 = new Produto();
		produto01.cod = 123;
		produto01.nome = "Caixa";
		
		Produto produto02 = new Produto();
		produto02.cod = 123;
		produto02.nome = "Hello";
		
		Produto produto03 = new Produto();
		produto03.cod = 123;
		produto03.nome = "Cavalo";
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(produto02);
		produtos.add(produto01);
		produtos.add(produto03);
		
		for(int i = 0; i < produtos.size(); i++) {
			
			System.out.printf("Código: %d\n", produtos.get(i).cod);
			System.out.printf("Nome: %s\n", produtos.get(i).nome);
			
		}
		
		System.out.println();
		
		/*
		 * remover
		 * produtos.remove(indice ou nome)
		 */
		
		produtos.remove(0);
		
		
		//Outra maneira ==== Utilizando o for each
		
		for(Produto i : produtos) {
			
			System.out.printf("Código: %d\n", i.cod);
			System.out.printf("Nome %s\n", i.nome);
			
		}
		
	}
	
}
