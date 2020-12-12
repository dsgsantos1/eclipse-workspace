/*	
 * Leia 10 notas informadas pelo usuário. Calcule a média de todas elas. Exiba o conjunto
	das notas maiores do que a média calculada. Em seguida, de forma agrupada, exiba o
	outro conjunto de notas (menores do que a média).

 */

package exercicios_aleatorios;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double v[] = new double[10];
		double media = 0, menor[] = new double[10], maior[] = new double [10];
		int cont = 0, cont1 = 0;
		
		for(int i = 0; i <= 10; i++) {
			
			v[i] = ler.nextDouble();
			media++;
			
		}
		
		media = media / 10;
		
		for(int i = 0; i <= 10; i++) {
			
			if((v[i] > media) || (v[i] < media)) {
				
				
				
			}
		
	}

}
	
}
