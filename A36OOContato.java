//AULA 36 - ORIENTAÇÃO A OBJETOS: RELACIONAMENTO ENTRE CLASSES

//Como declarar uma classe dentro de outra classe, ou seja, como declarar um classe como tipo;
//Como declarar um array/vetor de uma classe dentro de outra classe;

public class A36OOContato{
	
	private String nome;
	private A36OOEndereco endereco;
	private A36OOTelefone[] telefones;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	//Relacionamento tipo um -> 'um contato tem um endereco'
	public A36OOEndereco getEndereco(){
		return endereco;
	}
	public void setEndereco(A36OOEndereco endereco){
		this.endereco = endereco;
	}
	
	public A36OOTelefone[] getTelefones(){
		return telefones;
	}
	public void setTelefones(A36OOTelefone[] telefones){
		this.telefones = telefones;
	}
	
	
}