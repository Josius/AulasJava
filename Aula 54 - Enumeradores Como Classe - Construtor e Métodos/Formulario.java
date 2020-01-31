//AULA 54 - ENUMERADORES COMO CLASSE (CONSTRUTOR E METODOS)

public class Formulario{
	
	//Declarando enum dentro de uma classe - modo da Loiane
	enum Genero{
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}

		public char getValor(){
			return this.valor;
		}
	}
		
	//Declarando de outra forma - que também não funcionou
	/*
	enum Genero{FEMININO, MASCULINO;}
	
	
	*/
	
	private String nome;
	private Genero genero;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	//Metodos get-set nao funcionam corretamente com a primeira declaracao do enum Genero
	/*
	public Genero getGenero(){
		return genero;
	}
	public void setGenero(Genero genero){
		this.genero = genero;
	}
	*/
	
}