package atv3;

public class Gerente extends Funcionario {
	
	private int senha, numero;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void gerenciarFuncionario() {
		
		System.out.println("Gerenciar Funcionário");
		
	}

}
