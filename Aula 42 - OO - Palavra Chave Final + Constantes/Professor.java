//AULA 42 - ORIENTAÇÃO A OBJETOS: PALAVRA CHAVE FINAL + CONSTANTES

public class Professor{
	
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
	
	public String obterEtiquetaEndereco(){
		
		String s = "Endereco do Professor: ";
		
		//s += super.getEndereco();
		
		return s;
	}
	
	//Metodo obrigatorio por conta do metodo abstract presente na classe Pessoa
	public void imprimirEtiquetaEndereco(){
		System.out.println("Imprimindo endereco do professor");
		System.out.println(this.obterEtiquetaEndereco());
	}
	
}