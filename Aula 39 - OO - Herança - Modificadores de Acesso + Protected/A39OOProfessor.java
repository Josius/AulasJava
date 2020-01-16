//AULA 39 - ORIENTAÇÃO A OBJETOS: HERANCA MODIFICADORES DE ACESSO + PROTECTED

public class A38OOProfessor extends A38OOPessoa{
	
	private double salario;
	private String nomeCurso;
	
	public double getSalario(){
		return salario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public String getNomeCurso(){
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso){
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido(){
		return 0;
	}
	
}