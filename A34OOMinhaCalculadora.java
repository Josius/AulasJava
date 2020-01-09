//AULA 34 - ORIENTAÇÃO A OBJETOS: VARIAVEIS E METODOS ESTATICOS
//OBS: A variavel estatica (static) torna-se a mesma variavel para todas as instancias. Ou seja, o atributo estatico vai ser compartilhado com TODAS AS INSTANCIAS DA CLASSE.
//Uma forma de como declarar a classe MinhaCalculadora e abaixo, um forma de usar a classe, porem de forma um pouco fora do padrao
/*
public class MinhaCalculadora{
	public int soma(int num1, int num2){
		return num1 + num2;
	}
	
	public int soma(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public double soma(double num1, double num2){
		return num1 + num2;
	}
}
public class A33OOTesteCalculadora{
	
	public static void main(String[] args){
		
		A33OOMinhaCalculadora calc = new A33OOMinhaCalculadora();
		int soma1 =  calc.soma(1, 2);
		System.out.println(soma1);
		int soma2 = calc.soma(1.0, 2.0);
		System.out.println(soma2);
		
	}
}
*/
//APLICANDO O STATIC NA CLASSE
//Static permite que nao estanciemos a classe para acessar o metodo ou uma variavel
/*
public class MinhaCalculadora{
	public static int soma(int num1, int num2){
		return num1 + num2;
	}
	
	public static int soma(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public static double soma(double num1, double num2){
		return num1 + num2;
	}
}
*/
//RESULTA EM UM MODO DIFERENTE NO MAIN
//Ou seja, nao declaramos "A33OOMinhaCalculadora calc = new A33OOMinhaCalculadora();"
/*
public class A33OOTesteCalculadora{
	
	public static void main(String[] args){
		
		//A33OOMinhaCalculadora calc = new A33OOMinhaCalculadora();
		int soma1 =  A33OOMinhaCalculadora.soma(1, 2);
		System.out.println(soma1);
		int soma2 = A33OOMinhaCalculadora.soma(1.0, 2.0);
		System.out.println(soma2);
		
	}
}
*/

public class A34OOMinhaCalculadora{
	
	public static int soma(int num1, int num2){
		return num1+num2;
	}
	
	public static double soma(double num1, double num2){
		return num1+num2;
	}
	
	public static int soma(int num1, int num2, int num3){
		return num1+num2+num3;
	}
	
	//VERIFICAR PQ O CÓDIGO ABAIXO NÃO FUNCIONA
	/*
	public static int soma(int[] vetorInteiros){
		int total = 0;
		for(int i=0; i<vetorInteiros; i++){
			total += vetorInteiros[i];
		}
		return total;
	}*/
}