package Avaliacao;

class Usuario {
protected String nomeCompleto;
protected String CPF;
protected String rua;
protected int numeroMoradia;
protected String complementoMoradia;
protected String cep;
protected String bairro;
protected String telefone;
//GET E SET
//Get e Set de nomeCompleto
public String getNomeCompleto(){
return this.nomeCompleto;
}
public void setNomeCompleto(String nomeCompleto){
this.nomeCompleto = nomeCompleto;
}
//Get e Set de CPF
public String getCPF(){
return this.CPF;
}
public void setCPF(String CPF){
this.CPF = CPF;
}
//Get e Set de rua
public String getRua(){
return this.rua;
}
public void setRua(String rua){
this.rua = rua;
}
//Get e Set de numeroMoradia
public int getNumeroMoradia(){
return this.numeroMoradia;
}
public void setNumeroMoradia(int numeroMoradia){
this.numeroMoradia = numeroMoradia;
}
//Get e Set de complementoMoradia
public String getComplementoMoradia(){
return this.complementoMoradia;
}
public void setComplementoMoradia(String complementoMoradia){
this.complementoMoradia = complementoMoradia;
}
//Get e Set de cep
public String getCEP(){
return this.cep;
}
public void setCEP(String cep){
this.cep = cep;
}
//Get e Set de bairro
public String getBairro(){
return this.bairro;
}
public void setBairro(String bairro){
this.bairro = bairro;
}
//Get e Set de telefone
public String getTelefone(){
return this.telefone;
}
public void setTelefone(String telefone){
this.telefone = telefone;
}
//M�todos
public boolean venda(int quantidade){
boolean resposta = Produto.disponivel(quantidade);
if (resposta == false){
System.out.println("Lamentamos.O produto desejado n�o est� dispon�vel!:");
return false;
}
else{
return true;
}
}
public boolean login(String nomeCompleto, String setSenha){
if (this.senha == senha && this.nomeCompleto = nome){
System.out.println("Acesso permitido.");
return true;
}
else {
System.out.println("Acesso negado.");
return false;
}
}
}