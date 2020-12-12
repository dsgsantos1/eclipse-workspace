package aula_classes;

import java.util.Scanner;

public class ClinicaVeterinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		
		System.out.println("Digite o nome do cachorro: ");
		cachorro.nome = ler.nextLine();
		System.out.println("Digite a raça: ");
		cachorro.raca = ler.nextLine();
		System.out.println("Digite o sexo: ");
		cachorro.sexo = ler.nextLine();
		System.out.println("Digite a cor: ");
		cachorro.cor = ler.nextLine();
		System.out.println("Digite o nome do dono: ");
		cachorro.dono = ler.nextLine();
		
		System.out.println(); System.out.println(); System.out.println();
		
		System.out.printf("Nome do cachorro: %s\n", cachorro.nome);
		System.out.printf("Raça: %s\n", cachorro.raca);
		System.out.printf("Sexo: %s \n", cachorro.sexo);
		System.out.printf("Cor: %s\n", cachorro.cor);
		System.out.printf("Dono: %s \n", cachorro.dono);
		
		System.out.println(cachorro);
		
		ler.close();
	}

}
