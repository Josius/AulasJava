public class Teste{
	
	public static void main(String[] args){
		
		MinhaThread thread = new MinhaThread("Thread #1", 600);
//		3-startando a thread
//		thread.start(); 4-mas ainda assim, não está bom, pq senão teremos que startar a thread sempre. O ideal é startar a thread no construtor da classe MinhaThread

//		7-Trabalhando agora com duas threads
/*
		Mas da forma que se encontra:
			[MinhaThread thread2 = new MinhaThread("Thread #2")]
		elas executaram ao mesmo tempo, logo o ideal é passar o tempo também
*/
		MinhaThread thread2 = new MinhaThread("Thread #2", 900);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);
		
		
	}
}