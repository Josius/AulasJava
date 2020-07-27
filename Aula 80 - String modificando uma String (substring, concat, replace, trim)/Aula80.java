public class Aula80{
	
	public static void main(String[] args){
		
		String teste = "This is a teste.";
		
		System.out.println(teste);
		
		//substring - método que extraí pedaços da string
		System.out.println(teste.substring(10));//somente índice de início
		System.out.println(teste.substring(7,13));//índice de início(inclusivo) e fim(não inclusivo)
		
		//concat - método que une strings (concatena)
		String ola = "ola";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
		
		//replace - troca um caractere por outro
		String espacos = "i s p a c o";//1ª letra errada
		String semEspacos = espacos.replace('i','e');//corrigindo o erro
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", "");//o 1º é uma expressão regular e o segundo é o substituto
		System.out.println(semEspacos);
		
		String nome = " meu nome eh: ";//com espaços sobrando antes e depois
		System.out.println(nome);
		//trim - remove todos os espaços que estiverem sobrando antes e depois
		System.out.println(nome.trim());
		
	}
}