package banco_atv;

public class Programa {
	
	public static void main(String[] args) {
		
		Conta cont1 = new Conta();
		Conta cont2 = new Conta();
		
		cont1.numConta = 1666;
		cont1.nomeCliente = "Roberto Carlos";
		cont1.saldoConta = 10000895;
		cont1.limiteConta = 1000000000;
		
		cont2.numConta = 1666;
		cont2.nomeCliente = "Carlinhos Aguiar";
		cont2.saldoConta = 10000895;
		cont2.limiteConta = 1000000000;
		
	}
	
}
