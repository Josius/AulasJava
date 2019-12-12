//AULA 13 - OPERADORES(ARITMÉTICOS, LÓGICOS E RELACIONAIS)
public class A13Operadores{
	public static void main(String[] args){
		
		//OPERADORES ARITMÉTICOS
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta eh ";
		String segundoNome = "uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		//5
		System.out.println(resultado++);
		//a linha de comando acima é a mesma coisa que, consecutivamente de cima para baixo:
		//System.out.println(resultado);
		//resultado = resultado + 1; ou resultado += 1;
		
		
		//7 > é 7 pq acima printou 5 e somou +1 ao 5, totalizando 6 na memória, porém não printou o 6. Aí usa o 6 que está na
		//memória e executa os comandos abaixo para resultar 7.
		System.out.println(++resultado);
		//a linha de comando acima é a mesma coisa que, consecutivamente de cima para baixo:
		//resultado += 1;
		//System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		
		//OPERADORES RELACIONAIS
		int valor1 = 1;
		int valor2 = 2;
		
		System.out.println("valor1 == valor2: " + (valor1 == valor2));
		System.out.println("valor1 != valor2: " + (valor1 != valor2));
		System.out.println("valor1 > valor2: " + (valor1 > valor2));
		System.out.println("valor1 >= valor2: " + (valor1 >= valor2));
		System.out.println("valor1 < valor2: " + (valor1 < valor2));
		System.out.println("valor1 <= valor2: " + (valor1 <= valor2));
		
		
	
		//OPERADORES LÓGICOS
	/*
		&  - AND
		|  - OR
		^  - XOR
		|| - OR curto circuito > usado em JAVA
		&& - AND curto circuito > usado em JAVA
		!  - NOT
	*/
		//Ver tabela verdade para entender melhor os operadores acima
		
		
	
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 eh 1 AND valor2 eh 2 - resultado: " + resultado1);
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 eh 1 OR valor2 eh 2 - resultado: " + resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
	
		
		
		//CURTO CIRCUITO (&& e ||)
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro; // neste caso ele analisa as duas variáveis para dar o resultado
		boolean resultado2 = falso && verdadeiro; //neste caso ele analisa 1º a 1ª variável e se já a comparação já der o resultado
												// ele não verifica a 2ª variável
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	
	}
}