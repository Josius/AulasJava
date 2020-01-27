//AULA 45 - ORIENTAÇÃO A OBJETOS: CASTING E INSTANCEOF

//O que acontece se chamar um metodo para tres instancias de tipos diferentes?
/*
Pessoa pessoa = new Pessoa();
Pessoa aluno = new Aluno();
Pessoa professor = new Professor();

pessoa.obterEtiquetaEndereco();
aluno.obterEtiquetaEndereco();
professor.obterEtiquetaEndereco();
*/

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	public Aluno(){
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso){
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	public void metodoQualquer(String nome){
		
		
		super.setCpf("345345345345");
		
		this.setCpf("345345");
	}
	
	//Sobreescrevendo o metodo obterEtiquetaEndereco da classe Pessoa; pois pode ser que queiramos mudar o comportamento do metodo que herdamos da superclasse, neste caso modificamos o metodo herdado.	
	public String obterEtiquetaEndereco(){
		
		String s = "Endereco do Aluno: ";
		//s += this.getEndereco();
		//ou, soh escolher um, o de cima com 'this.' ou o de baixo com 'super.'
		s += super.getEndereco();
		
		return s;
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