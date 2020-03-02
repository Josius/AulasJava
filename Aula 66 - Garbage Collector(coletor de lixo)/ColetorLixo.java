public class ColetorLixo{
	
	public static void obterMemoriaUsada(){
		
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime(); //singleton
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB + " MB");
		
		;
		
	}
	
	public static void main(String[] args){
		
		Contato[] contatos = new Contato[1000000]; //se add + um 0 estoura a memoria heap do java
		Contato contato;
		
		for(int i=0; i<contatos.length; i++){
			contato = new Contato("Contato " + i, "1234-56789" + i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}/*
		for(int i=0; i<contatos.length; i++){
			System.out.println(contatos[i]);
		}*/
		
		System.out.println("Contatos criados");
		
		obterMemoriaUsada();
		
		contatos = null;
		
		Runtime.getRuntime().runFinalization(); //Metodo Finalize - toda classe java tem um metodo finalize. Marca os objetos na memoria para serem coletados pelo garbage colector
		
		Runtime.getRuntime().gc(); //chamando o garbage colector - nao eh garantido que ele seja executado
		
		System.out.println("Contatos removidos da memória");
		
		obterMemoriaUsada();
	}
}