//AULA 14 - FOR
//Executa um bloco de código que está dentro do comando for enquanto uma expressão for verdadeira.
//O for não permite o uso da variável 'i' fora de seu corpo.
/*
for(inicialização/contador; condição/expressão booleana ; atualizador){
	bloco de codigo
}
*/
//FOR Normal
/*
for normal

for(int i = 0; i < 5 ; i++){
	System.out.println("i tem valor de " + i);
}
*/
//FOR com mais de uma variável
/*
for(int i = 0, j = 10; i < j; i++, j--){
	System.out.println("i tem valor: " + i + " e j tem valor: " + j);
}
*/
//FOR com partes ausentes - incomum
/*
int i = 0;
for( ; i < 5; ){
	System.out.println("i tem valor: " + i);
}
*/
//LOOP infinito - NÃO FAZER.
// for(;; );

//LOOP sem corpo > utilizado para somar valores
/*
int soma = 0;
for(int i = 1; i < 5; soma += i++);
System.out.println("O valor da soma eh: " + soma);
*/

//FOR sem as chaves{}
//Não utilizamos as chaves para o switch-case
//Não recomendado, pois se precisar utilizar algum print no final, o 2º print não saira na mesma quantidade de vezes que o 1º print
/*
for(int i = 0; i < 5 ; i++)
	System.out.println("i tem valor de " + i);
	System.out.println("soh eh impresso uma vez, ao inves da quantidade de vezes igual ao tamanho do for");	
*/

//LOOP MELHORADO
//Muito usado com Arrays
//explicado na aula de Arrays

public class A17For{
	public static void main(String[] args){
			
		for(int i = 0; i < 5 ; i++){
			System.out.println("i tem valor de " + i);
		}
		
		System.out.println();
		
		for(int i = 5; i > 0 ; i--){
			System.out.println("i tem valor de " + i);
		}
		
		System.out.println();
		
		for(int i = 0, j = 10; i < j; i++, j--){
			System.out.println("i tem valor: " + i + " e j tem valor: " + j);
		}
		
		System.out.println();
		
		int count = 0;
		for( ;count < 10; ){
			System.out.println("count tem valor: " + count);
			count +=2;//precis necessariamente deste count, pq senão dá loop infinito
		}
		//desta forma podemos acessar a variável de inicialização (i, count ou cont)
		System.out.println("count " + count);
		
		System.out.println();
		
		int soma = 0;
		for(int i = 1; i < 5; soma += i++);
		System.out.println("O valor da soma eh: " + soma);
		
		System.out.println();
		
		//FOR sem as chaves{}
		//Não utilizamos as chaves para o switch-case
		for(int i = 0; i < 5 ; i++)
			System.out.println("i tem valor de " + i);
			System.out.println("soh eh impresso uma vez, ao inves da quantidade de vezes igual ao tamanho do for");
		
		System.out.println();
	}
}