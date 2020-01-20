//AULA 42 - ORIENTAÇÃO A OBJETOS: PALAVRA CHAVE FINAL + CONSTANTES
//Com a palavra chave 'final' declarada na classe, esta nao pode ser estendida, ou seja, não há herança com uma classe do tipo 'final'

//Com a palavra chave 'final' declarada em um atributo ou uma variavel, o valor destes nao pode mudar, ele eh constante.
//EXEMPLOS:
/*
public final class Constantes{
	public static final String URL_BLOG = "http://loiane.com";
	public static final String URL_CURSO_COMPLETO = "http://loiane.training";
}

public static void main(String[] args){
	System.out.println(Constantes.URL_BLOG);
	System.out.println(Constantes.URL_CURSO_COMPLETO);
}
*/

//BOM USO DE PRATICAS JAVA
//Sempre que usar constantes, o nome da constante deve ser todo em maiusculo e palavras devem ser separadas com um underscore. EXEMPLO: 'public static final String URL_BLOG = "http://loiane.com";'

public class Teste{
	
	public static void main(String[] args){
		
		//Com a palavra chave 'final' nao funciona as instancias abaixo
		/*
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		*/
		
		//O correto agora eh:
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//Exemplo com a classe Constantes alterando o valor de uma constante sem 'final' na declaracao
		System.out.println(Constantes.URL_BLOG);
		Constantes.URL_BLOG = "Como a constante URL_BLOG nao eh final, eh possivel alterar seu valor, como feito nesta linha";
		System.out.println(Constantes.URL_BLOG);
		//Exemplo com a classe Constantes sem alterar o valor de uma constante com 'final' na declaracao
		System.out.println("Ja a constante 'CURSO_COMPLETO' nao pode ser alterado pois ela possui 'final' em sua declaracao");
		System.out.println(Constantes.CURSO_COMPLETO);
		//Constantes.CURSO_COMPLETO = "teste";
		
		//Exemplo com variavel
		final int TOTAL = 1;
		//total = total + 1;
		System.out.println(TOTAL);
		
	}
}