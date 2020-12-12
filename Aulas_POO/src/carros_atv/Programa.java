package carros_atv;

public class Programa {
	
	public static void main(String[] args) {
		
		Carro car = new Carro();
		Proprietario dono = new Proprietario();
		
		car.tipo = "esportivo";
		car.placa = "BOAT - 202";
		car.nome = "celta";
		car.cor = "azul";
		car.ano = 1998;
		car.qnt_portas = 2;
		car.chassi = "FFOFKFKF448854f8d8";
		car.combustivel = "Gasolina";
		
		dono.cpf = "12345678910";
		dono.rg = "0258245";
		dono.full_name = "Roberto Carlos";
		dono.dat_nas = "13/05/1900";
		dono.local_nas = "Serra Pelada";
		dono.estado_nas = "Pará";
		dono.endereco = "Rua Roberto Carlos";
		dono.telefone = 123123123;
		dono.email = "roberto_calos@gmail.com";
		dono.profissao = "Cantor";
		
		
	}

}
