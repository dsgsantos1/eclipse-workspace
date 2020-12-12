package carros_atv;

public class Teste {
	
	public static void main(String[] args) {
		
		Carro car = new Carro();
		Proprietario dono = new Proprietario();
		
		double valor = 400000;
		
		System.out.println(car.tipo = "esportivo");
		System.out.println(car.placa = "BOAT - 202");
		System.out.println(car.nome = "celta");
		System.out.println(car.cor = "azul");
		System.out.println(car.ano = 1998);
		System.out.println(car.qnt_portas = 2);
		System.out.println(car.chassi = "FFOFKFKF448854f8d8");
		System.out.println(car.combustivel = "Gasolina");
		
		System.out.println();
		
		System.out.println(dono.cpf = "12345678910");
		System.out.println(dono.rg = "0258245");
		System.out.println(dono.rg = "0258245");
		System.out.println(dono.full_name = "Roberto Carlos");
		System.out.println(dono.dat_nas = "13/05/1900");
		System.out.println(dono.local_nas = "Serra Pelada");
		System.out.println(dono.estado_nas = "Pará");
		System.out.println(dono.endereco = "Rua Roberto Carlos");
		System.out.println(dono.telefone = 123123123);
		System.out.println(dono.email = "roberto_calos@gmail.com");
		System.out.println(dono.profissao = "Cantor");

		car.ipva(valor);
		
		
	}

}
