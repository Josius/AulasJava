//AULA 39 - ORIENTAÇÃO A OBJETOS: HERANCA MODIFICADORES DE ACESSO + PROTECTED
//protected fiquei em duvida, procurar depois

public class A38OOAluno extends A38OOPessoa{
	
	private String curso;
	private double[] notas;
	
	public A38OOAluno(){
		super();
	}
	
	public A38OOAluno(String nome, String endereco, String telefone, String curso){
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	public void verificarAcesso(){
		//Com 'super.' eu tenho acesso a tudo que é public da superclasse
		//super.nome = "Maria";	//Mas desta forma, eu não tenho acesso, ele dá um erro
		this.nomeVisibilidade = "Maria"; //deste jeito funciona pq nomeVisibilidade eh default
		super.nomeVisibilidade = "Jo"; //deste jeito funciona pq nomeVisibilidade eh default
	}
	
	public void metodoQualquer(String nome){
		this.nome = nome;
	
		super.setCpf("345345345345");
	
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

