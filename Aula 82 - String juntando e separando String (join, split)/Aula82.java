public class Aula82{
	
	public static void main(String[] args){
		
		//join - junta strings, o 1º caractere do método é o delimitador, pode ser vírgula, espaço, hífen, etc. Já o 2º em diante são as strings que devem ser juntadas
		String alfabeto = String.join(", ", "A", "b", "C", "D");//este método usa varargs
		
		String alfabeto2 = String.join("g ", "A", "b", "C", "D");//este método usa varargs
		
		System.out.println(alfabeto);
		System.out.println(alfabeto2);
		System.out.println();
		
		String a = "The rest of this chapter introduces the basic concepts of The Sprawl. It discusses characters and how they interact with the rules.";
		String b = "Those interactions are governed by Moves, one of the core concepts of the game which are also explained below.";
		String c = "It also gives an overview of the rules the MC follows when guiding and facilitating the overall conversation of the game.";
		String d = String.join("\n", a, b, c);
		System.out.println(d);
		
		//split - separa strings
		String[] letras = alfabeto.split(", ");//expressão regular que queremos remover
		for(String letra : letras){
			System.out.println(" " + letra);//imprime sem o espaço e sem a vírgula
		}
		
		String doArquivo = "1;Antonio;30;";
		String[] infos = doArquivo.split(";");
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		System.out.println(pessoa);		
	}
}