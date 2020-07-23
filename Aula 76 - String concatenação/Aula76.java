public class Aula76{
	public static void main(String[] args){
		
		String curso = "Curso ";
		String java = "Java";
		
		String cursoJava = curso + java;
		System.out.println(cursoJava);
		
		//concatenação de string com int é necessário usar parenteses, pois nesse caso, será feito 1º a soma entre parenteses e depois a concatenação com a string
		String resultado2Com2 = "Resultado de 2+2= " + (2+2);
		System.out.println(resultado2Com2);
		
		//já sem os parenteses, ocorrerá a concatenação da string com os vlrs numéricos, estes sendo convertidos para string
		String resultado2Com2_ = "Resultado de 2+2= " + 2+2;
		System.out.println(resultado2Com2_);
		
		//convertendo o vlr '1' de int para string
		String um = String.valueOf(1);
		System.out.println(um);
		
		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
				"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
				"minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " + 
				"commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " + 
				"essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " + 
				"non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

		System.out.println(concatenacao);

/*
	Na concatenação abaixo, cada nova concatenação gera uma nova string na memória. Ou seja, a 1ª concatenação é em um certo endereço da memória, a soma da 2ª com a 1ª gera outra string em outro endereço de memória e a concatenação anterior é disponibilizada para o garbage colector do JAVA
	Fazer um concatenação dessa forma é uma má prática, além de influir na performance do programa
*/
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
		concatenacao2 += "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad ";
		concatenacao2 += "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea ";
		concatenacao2 += "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit ";
		concatenacao2 += "essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat ";
		concatenacao2 += "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
	
		System.err.println(concatenacao2);
		
	}
}