package aula_01;

public class Conta {
	
	int num_conta;
	Cliente titular;
	double saldo, limite;
	boolean sacar(double quantidade){
		
		if(quantidade > this.saldo) {
			return false;
		}
		
		else {
			this.saldo -= quantidade;
			return true;
		}
		
	}
	
	void depositar (double quantidade) {
		this.saldo += quantidade;
	}

	//void transferir (double)

}
