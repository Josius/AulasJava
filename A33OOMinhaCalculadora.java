//AULA 33 - ORIENTAÇÃO A OBJETOS: SOBRECARGA DE METODOS E CONSTRUTORES (OVERLOAD)

//Declarando dois ou mais metodos com o mesmo nome, a assinatura do metodo precisa ser diferente, ou seja, o retorno e/ou os parametros passados por esse metodo precisam ser diferentes na quantidade entre eles, ou até mesmo o tipo pode ser diferente
//NAO PODE mudar o nome da variavel do parametro, somente o tipo
//SOBRECARGA DE METODOS eh um polimorfismo em tempo de compilacao.

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
*/

//Sobrecarga de construtores foi visto nas aulas 29 e 30, com construtores vazios, com um parametro, com dois parametros, com tres parametros, com construtor chamando outro construtor, etc..

public class A33OOMinhaCalculadora{

	public int soma(int num1, int num2){
		return num1 + num2;
	}
	
	public double soma(double num1, double num2){
		return num1 + num2;
	}
	
	public int soma(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public int soma(int[] vetorInteiros){
		int total = 0;
		for(int i=0; i<vetorInteiros.length; i++){
			total += vetorInteiros[i];
		}
		return total;
	}
}
