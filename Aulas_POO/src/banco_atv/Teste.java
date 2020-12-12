package banco_atv;

public class Teste {

	public static void main(String[] args) {
		
		Conta cont1 = new Conta();
		Conta cont2 = new Conta();
		
		double quantidade = 100;
		
		cont1.numConta = 1666;
		cont1.nomeCliente = "Roberto Carlos";
		cont1.saldoConta = 100;
		cont1.limiteConta = 1000000000;
		
		cont2.numConta = 1666;
		cont2.nomeCliente = "Carlinhos Aguiar";
		cont2.saldoConta = 100;
		cont2.limiteConta = 1000000000;
	
		
		cont1.sacar(quantidade);
		cont1.depositar(quantidade);
		cont1.imprimirNome();
		cont1.mostrarSaldo();
		cont1.tranferir(quantidade, cont2);
		cont1.mostrarSaldo();
		
	}
	
}
