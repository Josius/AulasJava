//AULA 37 - ORIENTAÇÃO A OBJETOS: Herança

public class A37OOProfessor extends A37OOPessoa{
	
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