public class Aula75{
	
	public static void main(String[] args){
		
		String vazia = new String();
		//acima é a mesma coisa que abaixo
		String vazia2 = "";
		
		System.out.println(vazia);
		System.out.println(vazia2);
		
		String java = new String("JAVA");
		System.out.println(java);
		
		//abaixo: criando uma string a partir de outra string
		String java1 = new String(java);
		System.out.println(java1);
		
		//array de char's
		char[] charJava = {'J','A','V','A'};
		String java2 = new String(charJava);
		System.out.println(java2);
		
		//abaixo, escolhendo um índice de início e de fim (offset).
		char[] abcdef = {'A','B','C','D','E','F'};
		String abc = new String(abcdef, 1, 3);
		System.out.println(abc);
		
		//usando a tabela ASCII
		byte[] ascii = {65, 66, 67, 68, 69};
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		//offset do array ascii
		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);
		
		String java3 = "JAVA";
		String java4 = "JAVA";
		System.out.println(java3);
		System.out.println(java4);
		
/*
		Quando criamos duas string com nomes diferentes mas com valores idênticos por atribuição simples (linhas 38 e 39), na memória do JAVA, as duas variáveis apontam para a mesma área de memória, logo elas compartilham a mesma referência.
		Já quando criamos uma ou mais strings de nomes diferentes mas valores idênticos com o operador 'new', para cada nova variável alocamos um novo espaço na memória, não ocorrendo referência entre elas.
*/		
		
	}
}