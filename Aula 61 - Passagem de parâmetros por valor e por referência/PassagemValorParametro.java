public class PassagemValorParametro{
	
	public static void main(String[] args){
		
		Contato contato = new Contato("Contato 1","1234-4567","contato1@email.com");
		int valor = 10;
		
		System.out.println("\n***** Valores originais *****");
		
		System.out.println("Stack/Pilha do Programa = " + contato);
		System.out.println("Stack/Pilha do Programa = " + valor);
		
		System.out.println("\n***** Exemplo 1 *****");
		
		testePassagemValorReferencia(valor, contato);
		
		System.out.println("Stack/Pilha do Programa = " + contato);
		System.out.println("Stack/Pilha do Programa = " + valor);
		
		System.out.println("\n***** Exemplo 2 *****");
		
		testePassagemValorReferencia2(valor, contato);
		
		System.out.println("Stack/Pilha do Programa = " + contato);
		System.out.println("Stack/Pilha do Programa = " + valor);
	}
	
	private static void testePassagemValorReferencia(int valor, Contato contato){
		
		int novoValor = valor + 10;
		//System.out.println("valor " + valor);
		valor = novoValor;
		
		contato = new Contato("Contato 2", "2345-6789", "contato2@gmail.com");
		System.out.println("Stack/Pilha do método 1 = " + contato);
		
		//System.out.println("novoValor " + novoValor);
		//System.out.println("valor " + valor);
		
		
	}
	private static void testePassagemValorReferencia2(int valor, Contato contato){
		
		int novoValor = valor + 10;
		//System.out.println("valor " + valor);
		valor = novoValor;
		
		System.out.println("Stack/Pilha do método 2 = " + contato);
		contato.setNome("Contato" + novoValor);
		System.out.println("Stack/Pilha do método 2 = " + contato);
		
		//System.out.println("novoValor " + novoValor);
		//System.out.println("valor " + valor);
		
	}
	
}
	