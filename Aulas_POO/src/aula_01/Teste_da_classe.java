package aula_01;

import java.util.Scanner;

public class Teste_da_classe(
    public static void main(String[] args){
		
        Conta minha_conta = new Conta();
        Scanner ler = new Scanner(System.in);
            
        System.out.printf("Digite o número da sua conta:");
        minha_conta.num_conta = ler.nextInt();
        minha_conta.saldo = 100.0;
        minha_conta.titular = "Roberto";

        System.out.printf("Nome: %s\nNúmero da conta: %d\nSaldo: %.2f", minha_conta.titular, minha_conta.num_conta, minha_conta.saldo);

    }

)
