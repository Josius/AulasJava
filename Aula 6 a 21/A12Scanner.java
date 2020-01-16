//AULA 12 - LENDO DADOS USANDO A CLASSE SCANNER

//lendo uma linha inteira:
//String nome = scan.nextLine();

import java.util.Scanner;

public class A12Scanner{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		//lendo uma linha inteira:
		System.out.println("Digite seu nome:"); //não é obrigatório esse Sout, mas é ideal para não se perder
		String nome = scan.nextLine();
		
		//lendo um tipo específico:		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		
		System.out.println("Digite sua altura:");		
		double altura = scan.nextDouble();
		
		//Não entendi porque ocorre uma exception(inputMismatchException) se eu deixar essas duas linhas abaixo entre as outras acima.
		//Se eu colocar ele como primeira linha, também gera exception nas outras linhas de scanner.
		System.out.println("Lendo um tipo especifico do tipo String:");
		String priNome = scan.next();
		
		System.out.println("Seu nome eh: " + nome);	
		System.out.println("Sua idade eh: " + idade);	
		System.out.println("Sua altura eh: " + altura);	
		System.out.println("Um tipo especifico: " + priNome);		
	}
}