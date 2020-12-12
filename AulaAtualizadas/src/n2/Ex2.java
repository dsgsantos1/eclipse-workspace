/*
 * Autor: Daniel dos Santos
 * Turma: 228
 * Version: 1.0
 * Esse programa quebra todas as leis da programação e é protegido pelas leis divinas
 * Não sei como está funcionando, apenas Deus sabe
 * Tenha cuidado
 */

package n2;

//import java.awt.desktop.PrintFilesEvent;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, f, op, i;
		
		n1 = 0;
		n2 = 1;
		
		System.out.println("Informe até qual sequencia: ");
		op = ler.nextDouble();
		
		if(op == 1) {
			
			System.out.printf("%.0f\n", n1);
			
		}
		
		if(op == 2) {
			
			System.out.printf("%.0f\n", n1);
			System.out.printf("%.0f\n", n2);
			
		}
		
		if(op > 2) {

			System.out.printf("%.0f\n", n1);
			System.out.printf("%.0f\n", n2);
			
			for(i = 3; i <= op; i++) {
			
				f = n1 + n2;
				n1 = n2;
				n2 = f;
			
				System.out.printf("%.0f\n", f);
			
			}
			
		}
		
		if(op <= 0) {
			
			System.out.println("Erro");
			
		}
		
		ler.close();
				
	
	}

}
