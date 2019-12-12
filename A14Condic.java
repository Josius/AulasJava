//AULA 14 - CONDICIONAIS IF-ELSE
//IF
//Comandos dentro de um bloco if somente são executados se a condição for verdadeira(true);
//Caso contrário, não serão executados;
//ELSE
//Comandos dentro de um bloco else somente são executados se a condição do if for falsa;
//MULTIPLOS IF-ELSE
//É possível ter vários if else aninhados;
import java.util.Scanner;

public class A14Condic{
	public static void main(String[] args){
		Scanner ent = new Scanner(System.in);
/*
		System.out.println("Digite sua idade:");
		int idade = ent.nextInt();
		
		if(idade >= 18){
			System.out.println("Eh maior de idade");
		}
		else{
			System.out.println("Nao eh maior de idade");
		}
		*/
		//comprar um item
		//barato <= R$ 10
		//10 < valor < 15 - pedir desconto
		//15 <= valor 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.println("Entre com o preco do item:");
		double valor = ent.nextDouble();
		
		if(valor <= 10){
			System.out.println("Esta barato, pode comprar.");
		}
		else if(valor > 10 && valor < 15){
			System.out.println("Voce pode pedir um desconto.");
		}
		else if(valor >= 15 && valor < 17){
			System.out.println("Pode pesquisar mais.");
		}
		else{// valor >= 17
			System.out.println("Esta muito caro");
		}
	}
}