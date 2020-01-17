//AULA 41 - ORIENTAÇÃO A OBJETOS: HERANCA - CLASSES ABSTRATAS

public abstract class Pessoa{
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	public Pessoa(){}
	
	public Pessoa(String nome, String endereco, String telefone){
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
	
	
	public String obterEtiquetaEndereco(){
		
		return endereco;
	}
	
	//USANDO 'abstract' na declaracao do metodo - Obrigatoriamente, para o codigo funcionar, sera necessario declarar o metodo abaixo nas outras classes filhas, Professor e Aluno
	public abstract void imprimirEtiquetaEndereco();
}