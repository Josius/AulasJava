//AULA 54 - ENUMERADORES COMO CLASSE (CONSTRUTOR E METODOS)

//Para declarar enumeradores como construtores, primeiro precisamos ter um atributo ou+, e ai podemos ter os construtores ou metodos. Ao criar o construtor, nao usamos nenhum modificador de acesso, como nas classes (public, private, etc.), usamos somente o enum

//Enums extends a classe java.lang.Enum
//Enum podem ser comparados com '=='
//Nao podem ser instanciados com 'new' - Isso e feito implicitamente
//Podem implementar interfaces
//Podem ser declarados separadamente ou dentro de classes

public enum DiaSemana{
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;
	
	DiaSemana(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return this.valor;
	}
}