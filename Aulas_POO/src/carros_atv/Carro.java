package carros_atv;

public class Carro {
	
	String tipo, placa, nome, cor, chassi, combustivel;
	int ano, qnt_portas;
	
	void ipva(double valor) {
		
		double imposto = valor * 2 / 100;
		
		System.out.printf("O ve�culo de placa: %s e n�mero de chassi: %s\nIPVA: R$ %.2f", this.placa, this.chassi, imposto);
		
	}
	
	
}
	