package obiNova;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
	       Scanner ler = new Scanner(System.in);
	       
	       String nome;
	       
	       double salary, sales;
	       
	       nome = ler.nextLine();
	       
	       salary = ler.nextDouble();
	       sales = ler.nextDouble();
	       
	       System.out.printf("TOTAL = %.2f", salary + (sales*15/100));

	       ler.close();
	}
	
}
