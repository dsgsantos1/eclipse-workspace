package Avaliacao;

class Agricultor extends Usuario{
public String ruaHorta;
public int numeroHorta;
public String complementoHorta;
public String bairroHorta;
public String cepHorta;
private String senha;
public String certificado;
//Get e Set de senha
public String getSenha(){
return this.senha;
}
public void setSenha(String senha){
this.senha = senha;
}
//Métodos
@Override
public boolean venda(int quantidade){

	boolean resposta= Produto.disponivel(quantidade);

	if (resposta == false){
		System.out.println("É preciso repor o estoque do produto!");
		return false;					
	}
else{
return true;
}
}
public boolean estoque (int quantidade){
if (quantidade < 30){
System.out.println("Seu estoque está acabando, precisamos de mais produtos.;D");
}
else {
System.out.println("A quantidade de produtos no seu estoque está OK.;");
}
}
