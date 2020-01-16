//AULA 39 - ORIENTAÇÃO A OBJETOS: HERANCA MODIFICADORES DE ACESSO + PROTECTED

public class A38OOPessoa{
	  
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	
	protected String nomeVisibilidade; //em modificador default, visivel dentro do pacote. Se fosse 'public', ele seria visivel por todos. Se fosse 'private' eh visivel somente pela propria classe
	
	
	public A38OOPessoa(){}
	
	public A38OOPessoa(String nome, String endereco, String telefone){
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
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