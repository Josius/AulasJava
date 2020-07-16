public class Teste{
	
	public static void main(String[] args){
		
		Thread t1 = new Thread(new MinhaThreadRunnable("#1", 500));
		Thread t2 = new Thread(new MinhaThreadRunnable("#2", 500));
		Thread t3 = new Thread(new MinhaThreadRunnable("#3", 500));
		
//		t1.setPriority(5); // maior prioridade 
		t1.setPriority(Thread.MAX_PRIORITY);// a classe 'Thread' possuí constantes utilizáveis
		t2.setPriority(3);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}