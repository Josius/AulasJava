public class Aula77{
	public static void main(String[] args){
		
		String java = "Java"; //uma string é um arranjo de caracteres
		
		//charAt - acessar cada caracter dentro da string
		for(int i=0; i<java.length(); i++){
			System.out.println("charAt: " + java.charAt(i));
		}
		
		//getChars - extrai caracteres de uma string e atribui os mesmos a um arranjo de chars
		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);// precisamos passar 4 parametros para esse método, 1-índice do caractere inicial a copiar; 2-indice do caracter final, 3-destino dos caracteres, 4-indice inicial do destino
		
		System.out.println();
		System.out.println("getChars:");
		System.out.println(jav);
		
		//o código acima é o mesmo que abaixo
		for(int i=0, j=0; i<3; i++, j++){
			jav[j] = java.charAt(i);// não entendi pq colocou 'i' e 'j', sendo que é possível ter a mesma saída somento com o 'i'
		}
		System.out.println();
		System.out.println("getChars c/for: ");
		System.out.println(jav);
/*
CODIGO ABAIXO FOI DESCONTINUADO 
		byte[] javBytes = new byte[3];
		java.getBytes(0, 3, javBytes, 0); ***** deprecated
		System.out.println(Arrays.toString(javBytes));
*/
		
		//toCharArray - transformar uma string em um arranjo de chars
		char[] javaChars = java.toCharArray();
		System.out.println();
		System.out.println("javaChars:");
		System.out.println(javaChars);
	}
}