//AULA 14 - WHILHE E DO-WHILE
//WHILHE 
//Esse comando avalia uma expressão e caso seja verdadeira, executa o bloco dentro do comando while.
//Ou seja, enquanto a expressão for verdadeira execute o bloco de código.
//1º avalia a expressão e depois executa o bloco de codigo.

//DO-WHILE
//Esse comando executa o bloco dentro do comando do e depois avalia a expressão. O bloco deixa de ser executado após a expressão
//ficar falsa.
//Ou seja, faça enquanto a expressão for verdadeira.
//1º executa o bloco de codigo e depois avalia a expressão.
//Um uso próprio do while é o uso da variável 'i' ser acessada fora do loop, diferente do for que não permite isso.

public class A16Whiles{
	public static void main(String[] args){
		
		int i = 1; // i, count e cont > contadores
		int max = 10;
		
		System.out.println("contando ate " + max);
		
		while(/*operação booleana(vdd ou false) usando os operadores lógicos e relacionais*/ i <= max){
			System.out.println("Valor de i: " + i);
			i++; // isso é a mesma coisa que i = i + 1; ou i += 1;
		}
		System.out.println("Quando chega neste valor de " + i + ", que eh o ultimo incremento(10 +1 = 11) volta para i <= max, verifica 	se eh vdd, ao ver que eh falso, sai do loop e imprime.");
		
		do{
			i++; 
			System.out.println("O valor de i: " + i);
		}while(i < 15);
		
		System.out.println(i);
		
	}
}