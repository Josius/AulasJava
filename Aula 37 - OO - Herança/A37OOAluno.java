//AULA 37 - ORIENTAÇÃO A OBJETOS: HERANCA
//Para usar a heranca, eh necessario usar a palavra chave 'extends' na declaracao da classe seguinda do nome da classe

public class A37OOAluno extends A37OOPessoa{
	
	private String curso;
	private double[] notas;
	
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

