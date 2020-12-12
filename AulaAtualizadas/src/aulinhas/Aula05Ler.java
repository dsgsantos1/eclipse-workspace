package aulinhas;

import java.util.Scanner; //importar o scanner primeiro

public class Aula05Ler {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); //criar um objeto
		
		int n;
		
		n = ler.nextInt();
		
		System.out.println("n = \n" + n);
		
		ler.close();
		
		
	}

}
