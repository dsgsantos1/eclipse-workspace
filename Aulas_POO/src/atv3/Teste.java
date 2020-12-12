package atv3;

public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario ();
		Gerente ger1 = new Gerente();
		
		fun1.setNome("Roberto Carlos");
		fun1.setData("12 de abril");
		fun1.setDepartamento("T.I");
		fun1.setSalario(1230);
		fun1.setRg("123");
		fun1.trabalhar();
		
		ger1.setNome("Roberto Carlos");
		ger1.setData("12 de abril");
		ger1.setDepartamento("T.I");
		ger1.setSalario(1230);
		ger1.setRg("123");
		ger1.setSenha(123);
		ger1.setNumero(1);
		ger1.gerenciarFuncionario();
		
	}
	
}
