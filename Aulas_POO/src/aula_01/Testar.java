package aula_01;

import java.util.Scanner;

public class Testar{
	public static void main(String[] args) {
		
        Conta minha_conta = new Conta();
        Scanner ler = new Scanner(System.in);
        
        double quantidade; 
        
        System.out.printf("Digite o número da sua conta:\n");
        minha_conta.num_conta = ler.nextInt();
        System.out.printf("Digite o seu saldo:\n");
        minha_conta.saldo = ler.nextDouble();
        System.out.printf("Digite o seu nome:\n");
        minha_conta.titular = ler.next();

        System.out.printf("Nome: %s\nNúmero da conta: %d\nSaldo: %.2f", minha_conta.titular, minha_conta.num_conta, minha_conta.saldo);
        
        System.out.println();
        
        System.out.println("Digite a quantidade que queres sacar: ");
        quantidade = ler.nextDouble();
        
        if(minha_conta.sacar(quantidade)) {
        	System.out.println("Ação concluida");
        }
        
        else {
        	System.out.println("Impossível concluir a ação.\nSaldo insuficiente");
        }
        
        ler.close();
		
	}
}
