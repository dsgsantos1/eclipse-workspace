/*In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read value and the list of banknotes.

Input
The input file contains an integer value N (0 < N < 1000000).

Output
Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given example. Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.
 * 
 */

package uriOnline;

import java.util.Scanner;

public class BanBanknotes {
	
    public static void main(String[] args){
    	 
        Scanner ler = new Scanner(System.in);
        int cem = 0, cinq = 0, vinte = 0, dez = 0, cinc = 0, dois = 0;
        
        int sobra = ler.nextInt();
  
        
        if(sobra/100 >= 1) {
        	cem = sobra/100;
        	sobra = sobra - (cem*100);
        }
        
        if(sobra/50 >= 1) {
        	cinq = sobra/50;
        	sobra = sobra - (cinq*50);	
        }
        
        if(sobra/20 >= 1) {
        	vinte = sobra/20;
        	sobra = sobra - (vinte*20);
        }
        
        if(sobra/10 >= 1) {
        	dez = sobra/10;
        	sobra = sobra - (10*dez);
        }
 
        if(sobra/5 >= 1) {
        	cinc = sobra/5;
        	sobra = sobra - (cinc*5);
        }
        
        if(sobra/2 >= 1) {
        	dois = sobra/2;
        	sobra = sobra - (dois*2);
        }
        
        System.out.printf("Nota de 100 = %d\n", cem);
        System.out.printf("Nota de 50 = %d\n", cinq);
        System.out.printf("Nota de 20 = %d\n", vinte);
        System.out.printf("Nota de 10 = %d\n", dez);
        System.out.printf("Nota de 5 = %d\n", cinc);
        System.out.printf("Nota de 2 = %d\n", dois);
        
        ler.close();
 
    }
 
}

