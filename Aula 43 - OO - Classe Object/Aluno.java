//AULA 43 - ORIENTAÇÃO A OBJETOS: CLASSE OBJECT
import java.util.Arrays;//Para a ultima funcao funcionar, faz-se necessario importar esse 'util'

public class Aluno{
	
	private String curso;
	private double[] notas;
	
	public Aluno(){
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso){
		//super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	public void metodoQualquer(String nome){
		
		
		//super.setCpf("345345345345");
		
		//this.setCpf("345345");
	}
	
	public String obterEtiquetaEndereco(){
		
		String s = "Endereco do Aluno: ";
		
		//s += super.getEndereco();
		
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
	
	//Metodo obrigatorio por conta do metodo abstract presente na classe Pessoa
	public void imprimirEtiquetaEndereco(){
		System.out.println(this.obterEtiquetaEndereco());
	}
	
	//Com o metodo 'toString' abaixo, quando formos printar os valores setados na classe Teste, eles sairam corretos, ao inves de sair a referencia da memoria apontada
	/*public String toString(){
		String s = curso + "\n";
		for(double nota : notas){
			s += nota + " ";
		}
		return s; 
	}*/
	
	//Tambem funciona da seguinte forma, mas precisa importar 'import java.util.Arrays' para funcionar
	public String toString(){
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	//Outra forma de comparacao com metodo equals
	//Desta forma alteramos o metodo para que ele dê true em comparacao com o nome do curso.
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if(curso.equalsIgnoreCase(other.getCurso())){
			return true;
		}
		return false;
	}
	
}