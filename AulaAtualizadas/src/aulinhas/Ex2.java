/*
 * Autor: Daniel dos Santos
 * Turma: 228
 * Version: 2.3
 * Esse programa quebra todas as leis da programa��o e � protegido pelas leis 	
 * divinas
 * N�o sei como est� funcionando, apenas Deus sabe
 * Tenha cuidado
 */

package aulinhas;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		double n1, n2, cont;

		char opc;
		
		System.out.println("Escolha uma das op��es:\nA - M�dia dos dois n�meros\nB - Resto da divis�o do primeiro n�mero pelo segundo\nC - Quociente da divis�o do priemiro n�mero pelo segundo\nD - Produto entre os dois n�emros\nE - Diferen�a do primeiro n�emro pelo segundo\nS - Sair");
   
		opc = ler.next().charAt(0);

		System.out.println(opc);
		
		switch(opc) {
		
			case 'A':

				System.out.println("Digite dois n�meros: ");

				n1 = ler.nextDouble();
				n2 = ler.nextDouble();

				cont = (n1 + n2) / 2;

				System.out.printf("M�dia: %.2f\n", cont);
			
				break;
			
			case 'a':
				
				System.out.println("Digite dois n�meros: ");

				n1 = ler.nextDouble();
				n2 = ler.nextDouble();

				cont = (n1 + n2) / 2;

				System.out.printf("M�dia: %.2f\n", cont);
				
				break;

			case 'B':

				System.out.println("Digite dois n�meros: ");

				n1 = ler.nextDouble();
				n2 = ler.nextDouble();

				cont = (n1 % n2);

				System.out.printf("Resto: %.2f\n", cont);

				break;

			case 'b':
			
				System.out.println("Digite dois n�meros: ");

				n1 = ler.nextDouble();
				n2 = ler.nextDouble();

				cont = (n1 % n2);

				System.out.printf("Resto: %.2f\n", cont);
				
				break;
			
			case 'C':

				System.out.println("Digite dois n�meros: ");
			
				n1 = ler.nextDouble();
				n2 = ler.nextDouble();			

				cont = (n1 / n2);

				System.out.printf("Quociente: %.2f\n", cont);

				break;
				
			case 'c':

				System.out.println("Digite dois n�meros: ");
			
				n1 = ler.nextDouble();
				n2 = ler.nextDouble();			

				cont = (n1 / n2);

				System.out.printf("Quociente: %.2f\n", cont);

				break;


			case 'D':

				System.out.println("Digite dois n�meros: ");

				n1 = ler.nextDouble();
				n2 = ler.nextDouble();

				cont = (n1 * n2);

				System.out.printf("Produto: %.2f\n", cont);
				
				break;
				
			case 'd':
				
				System.out.println("Digite dois n�meros: ");

				n1 = ler.nextDouble();
				n2 = ler.nextDouble();

				cont = (n1 * n2);

				System.out.printf("Produto: %.2f\n", cont);
				
				break;


			case 'E':

				System.out.println("Digite dois n�meros: ");

				n1 = ler.nextDouble();
				n2 = ler.nextDouble();

				cont = (n1 - n2);

				System.out.printf("Diferen�a: %.2f\n", cont);

				break;
				
			case 'e':
				
				System.out.println("Digite dois n�meros: ");

				n1 = ler.nextDouble();
				n2 = ler.nextDouble();

				cont = (n1 - n2);

				System.out.printf("Diferen�a: %.2f\n", cont);

				break;
				
			default:
				
				System.out.println("Op��o inv�lida!");
		
		 }
		
		ler.close();

	}

}