package exArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Clinica {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Cachorro1 c1 = new Cachorro1();
		Cachorro1 c2 = new Cachorro1();
		Cachorro1 c3 = new Cachorro1();
		Cachorro1 c4 = new Cachorro1();
		Cachorro1 c5 = new Cachorro1();
		
		ArrayList<Cachorro1> cao = new ArrayList<Cachorro1>();
		
		cao.add(c1);
		cao.add(c2);
		cao.add(c3);
		cao.add(c4);
		cao.add(c5);
		
		for(Cachorro1 i: cao) {
			
			System.out.println("==========================");
			
			System.out.println("Digite o nome do cachorro: ");
			i.nome = ler.nextLine();
			
			System.out.println("Digite a raça: ");
			i.raca = ler.nextLine();
			
			System.out.println("Digite o sexo: ");
			i.sexo = ler.nextLine();
			
			System.out.println("Digite a cor: ");
			i.cor = ler.nextLine();
			
			System.out.println("Digite o nome do dono: ");
			i.dono = ler.nextLine();
			
		//	System.out.println("==========================");
			
			System.out.println();
			
		}
		
		System.out.println("====================================");
		System.out.println();
		
		for(Cachorro1 i: cao) {
			
			System.out.printf("Nome do cachorro: %s\n", i.nome);
			System.out.printf("Raça: %s\n", i.raca);
			System.out.printf("Sexo: %s \n", i.sexo);
			System.out.printf("Cor: %s\n", i.cor);
			System.out.printf("Dono: %s \n", i.dono);
			
			System.out.println();
			System.out.println();
			
			
		}
		
		ler.close();
		
	}
	
	

}
