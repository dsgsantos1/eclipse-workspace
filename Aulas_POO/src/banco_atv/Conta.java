package banco_atv;

public class Conta {
	
	int numConta;
	String nomeCliente;
	double saldoConta, limiteConta;
	
	boolean verificarSaldo(double quantidade) {
		
		if(this.saldoConta >= quantidade) {
			return true;
		}
		
		return false;
		
	}
	
	void sacar (double quantidade){
		
		if(this.verificarSaldo(quantidade)) {
			this.saldoConta = this.saldoConta - quantidade;
		}
		
		else {
			System.out.println("Impossível");
		}
		
	}
	
	void depositar (double quantidade){
		
		this.saldoConta = this.saldoConta + quantidade;
		
	}
	
	void imprimirNome() {
		
		System.out.println("Cliente: " + this.nomeCliente);
		
	}
	
	void mostrarSaldo() {
		
		System.out.printf("Saldo: R$%.2f\n", this.saldoConta);
		
	}
	
	void tranferir(double quantidade, Conta cont2) {
		
		if(this.verificarSaldo(quantidade)){
			
			cont2.saldoConta = cont2.saldoConta + quantidade;
			this.saldoConta = this.saldoConta - quantidade;
		}
		
		else {
			System.out.println("Impossível");
		}
		
	}

}
