package Avaliacao;

class Cliente extends Usuario{
private String formaPagamento;
private String senha;
//Get e Set de formaPagamento
public String getFormaPagamento(){
return this.formaPagamento;
}
public void setFormaPagamento(String formaPagamento){
this.formaPagamento = formaPagamento;
}
//Get e Set de senha
public String getSenha(){
return this.senha;
}
public void setSenha(String senha){
this.senha = senha;
}
//Métodos
public double comprar (double preco,int quantidade, int pedido){
this.quantidade = quantidade - pedido;
compra = this.preco*pedido;
return compra;
}
public void informarPegarReceber (String rua, int numeroMoradia, String
complementoMoradia, String cep, String bairro){
System.out.println ("Confimação de endereço.");
System.out.println ("Rua:" + rua);
System.out.println ("Número da Moradia: " + numeroMoradia);
System.out.println ("Complemento da Moradia: " + complementoMoradia);
System.out.println ("CEP: " + cep);
System.out.println ("Bairro: " + bairro);
}
public Integer pegarReceber (int opcao){
switch (opcao){
case 1:
System.out.println("Desejo receber minhas compras em casa.");
cliente1.informarPegarReceber(String rua, int numeroMoradia, String
complementoMoradia,String cep, String bairro);
break;
case 2:
System.out.println("Desejo buscar minhas compras.");
System.out.println("Bairro:" + agricultor1.bairroHorta);
System.out.println("rua:" + agricultor1.ruaHorta);
System.out.println("CEP:" + agricultor1.cepHorta);
System.out.println("Número do local:" + agricultor1.numeroHorta);
System.out.println("Complemento:" + agricultor1.complementoHorta);
System.out.println("Certificado:" + agricultor1.certificado );
break;
}
}
}
