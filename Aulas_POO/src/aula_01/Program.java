package aula_01;

public class Program{
	public static void main(String[] args) {
		
        Conta minha_conta = new Conta();
        
        Conta minha_conta1 = new Conta();
        
        minha_conta.num_conta = 123;
        minha_conta.saldo = 100.0;
        minha_conta.titular = "Roberto";

        System.out.printf("Nome: %s\nNúmero da conta: %d\nSaldo: %.2f", minha_conta.titular, minha_conta.num_conta, minha_conta.saldo);
        
		
	}
}
