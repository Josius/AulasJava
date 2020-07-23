public class Aula78{
	public static void main(String[] args){
		
		String ola = "Ola";
		String ola2 = "OLA";
		String ola3 = "Ola";
		String ola4 = new String(ola);
		
		System.out.println("ola equals ola2 = " + ola.equals(ola2)); //false
		System.out.println("ola equals ola3 = " + ola.equals(ola3)); //true
		
		System.out.println("ola equalsIgnoreCase ola2 = " + ola.equalsIgnoreCase(ola2)); //true
		
		System.out.println("ola == ola2 " + (ola==ola2));//false
		System.out.println("ola == ola3 " + (ola==ola3)); //true - pq há referenciação ao mesmo endereço de memória, mas precisa estar entre parênteses
		
		System.out.println("ola == ola4 " + (ola==ola4));//false - verifica a refência de memória, ou seja, os locais onde estão apontando cada variável
		System.out.println("ola equals ola4 = " + ola.equals(ola4)); //true - verifica o conteúdo de cada variável ao invés de sua refência
		System.out.println("ola equalsIgnoreCase ola4 = " + ola.equalsIgnoreCase(ola4)); //true
		
//comparações de regiões de strings
		String banana = "banana"; //1-índice inicial da variável para comparação
		String ana = "ana"; //2-variável para comparar
		String ban = "Ban"; //2-variável para comparar
					
		/*
		4 parametros 
			1-índice inicial da variável para comparação
			2-variável para comparar
			3-índice inicial da variável para comparar
			4-qtd de caracteres para comparar			
		*/	
		System.out.println(banana.regionMatches(1, ana, 0, 3));//true
		System.out.println(banana.regionMatches(1, ana, 1, 2));//false
		System.out.println(banana.regionMatches(2, ana, 1, 2));//true
		
		//com equalsIgnoreCase(1º parametro)
		System.out.println(banana.regionMatches(true, 0,ban, 0, 3));
		
		//endsWith - termina com
		//startsWith - começa com
		System.out.println(banana.endsWith(ana)); //true
		System.out.println(banana.startsWith(ban));//false
		
		//compareTo - usado para comparar objetos e tem 3 return
		//Esses return são as diferenças entre os vlrs dos caracteres baseados na tabela ascii
		/*
			-1 qndo a>b
			0 qndo a==b
			1 ou >1 qndo a<b
		*/
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		
		System.out.println(a.compareTo(b)); //-1
		System.out.println(b.compareTo(a)); // 1
		System.out.println(a.compareTo("a")); // 0
		System.out.println(a.compareTo(aMaiusculo)); // 32
	}
}