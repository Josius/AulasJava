//AULA 37 - ORIENTAÇÃO A OBJETOS: Herança
//Se os atributos forem 'private', as outras classes teram acesso somente aos metodos 'public', nao a seus atributos.
//Ao criar um atributo que seja global, que seja de comum uso com as outras classes, ao criar esse atributo aqui nesta classe A37OOPessoa, desde que seja 'public' ou tenha metodos 'get' e 'set', o atributo ou seus metodos terao acesso as outras classes.
//A37OOPessoa eh uma super-classe

public class A37OOPessoa{
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEndereco(){
		return endereco;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getTelefone(){
		return telefone;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
}