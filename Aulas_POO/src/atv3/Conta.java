package atv3;

 public class Conta {
	
	private int numero;
	private double saldo;
	private String titular;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	
	
	
	public void depositar (double qtd) {
		
		this.saldo += qtd;
		
	}
	
	public boolean sacar(double qtd) {
		
		if(qtd <= this.saldo) {
			this.saldo -= qtd;
			return true;
		}
		
		return false;
		
	}
	
	public boolean tranferir(double qtd, Conta contaB) {
		
		if(qtd <= this.saldo) {
			this.saldo -= qtd;
			contaB.saldo += qtd;
		}
		
		return false;
		
	}
	
}
