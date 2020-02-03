//AULA 59 - IMPORTACAO ESTATICA
//Todos os metodos da classe Math sao estaticos, pois nao precisamos instancia-los

//Importacao Estatica - eh soh colocar a palavra static apos a palavra import e colocar o nome desse metodo apos o nome da classe, como abaixo com a classe Math:

//PARA SOMENTE UM METODO:
/*
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
*/
//PARA TODOS OS METODOS:
import static java.lang.Math.*;
//Porem eh mais elegante usar cada import, pois fica explicito o que estamos usando para o codigo

public class StaticImport{
	
	public static void main(String[] args){
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		System.out.println(Math.pow(a, b));

		System.out.println(Math.sqrt(c));
		
		System.out.println(pow(a, b));
		
		System.out.println(sqrt(c));
		
	}
}