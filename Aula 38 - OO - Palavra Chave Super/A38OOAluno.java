//AULA 38 - ORIENTAÇÃO A OBJETOS: PALAVRA CHAVE SUPER
//Aula mais voltada para o netbeans e eclipse

public class A38OOAluno extends A38OOPessoa{
	
	private String curso;
	private double[] notas;
	
	public A38OOAluno(){
		super(); //Aqui ele chama o construtor da superclasse, que eh a classe 'A38OOPessoa'. Funciona exatamente como o 'this', porem eh voltado para a superclasse, para referencia-la
	}
	
	//Ou seja, podemos criar um construtor em uma classe filha com os parametros da classe super com base no construtor criado nesta classe super(ver semelhanca entre o construtor abaixo e o da classe A38OOPessoa). E se quisermos, ainda podemos add mais parametros na declaracao do construtor, com visto apos String telefone, como abaixo.
	public A38OOAluno(String nome, String endereco, String telefone, String curso){
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	//Ao referenciar a superclasse, podemos criar um metodo qualquer que use os atributos, tanto da classe filha quanto da superclasse
	public void metodoQualquer(String nome){
		this.nome = nome;
		//ou
		super.setCpf("345345345345");
		//ou
		this.setCpf("345345");
	}
	
	public String getCurso(){
		return curso;
	}
	public void setCurso(String curso){
		this.curso = curso;
	}
	
	public double[] getNotas(){
		return notas;
	}
	public void setNotas(double[] notas){
		this.notas = notas;
	}
	
	public double calcularMedia(){
		return 0;
	}
	
	public boolean verificarAprovado(){
		return true;
	}
	
}

