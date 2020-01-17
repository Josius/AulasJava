//AULA 41 - ORIENTAÇÃO A OBJETOS: HERANCA - CLASSES ABSTRATAS


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
	
	public String obterEtiquetaEndereco(){
		
		String s = "Endereco do Aluno: ";
		
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
	
	//Metodo obrigatorio por conta do metodo abstract presente na classe Pessoa
	public void imprimirEtiquetaEndereco(){
		System.out.println(this.obterEtiquetaEndereco());
	}
	
}