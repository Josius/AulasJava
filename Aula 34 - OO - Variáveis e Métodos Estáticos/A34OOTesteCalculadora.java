public class A34OOTesteCalculadora{
	//Para que o metodo main acesse a variavel abaixo, faz-se necessario o uso da palavra reservada 'static', do contrario, ela nao sera acessivel.
	static int resultSoma;
	
	public static void main(String[] args){
		
		//acessando a variavel resultSoma
		resultSoma = A34OOMinhaCalculadora.soma(5, 6);
		
		//A34OOMinhaCalculadora calc = new A34OOMinhaCalculadora();
		
		//calc.soma(1, 2);
		
		//Usando a classe 'A34OOMinhaCalculadora' sem instanciar o objeto
		A34OOMinhaCalculadora.soma(1, 2);
		
		//acessando o metodo soma2Valores
		
		int s2v = soma2Valores(3, 4);
		soma2Valores(7, 8);
		System.out.println(resultSoma);
		//System.out.println(soma); não funciona
		System.out.println(s2v);
		//System.out.println(soma2Valores); não funciona
	}
	
	//Declarando um metodo que sera acessado somente pelo main
	static int soma2Valores(int num1, int num2){
		return A34OOMinhaCalculadora.soma(num1, num2);
	}
}