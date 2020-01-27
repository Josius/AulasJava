//AULA 45 - ORIENTAÇÃO A OBJETOS: CASTING E INSTANCEOF

public class Teste2{
	public static void main(String[] args){
		//DOWNCASTING
		//A classe object eh a superclasse de todas as classes
		//Classe string eh a subclasse da classe object
		//O codigo abaixo funciona pq 'obterString' retorna uma 'String', o que nao da erro de compilacao e nem de execucao. 
		Object obj1 = obterString();
		String s1 = obj1;
		
		Object obj2 = "Minha String";
		String s2 = (String) obj2;
		
		//Ja o downcasting abaixo dara erro, porque 'Object obj3 = new Object();' nao faz referencia a uma string
		Object obj3 = new Object();
		String s3 = obj3;
		
		//Tambem dara erro abaixo, pq estamos tentando converter um 'int' em 'String' da forma errada
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;
		
	}
	
	public static String obterString(){
		return "minhaString";
	}
	
	public static int obterInteiro(){
		return 1;
	}
	
}