public class Teste{
	
	public static void main(String[] args){
		
		Thread t1 = new Thread(new MinhaThreadRunnable("#1", 500));
		Thread t2 = new Thread(new MinhaThreadRunnable("#2", 700));
		Thread t3 = new Thread(new MinhaThreadRunnable("#3", 800));
	
		//t1.setPriority(5); //prioridade maior, maior parte dos casos na execucao, ela sera executada primariamente
		t1.setPriority(Thread.MAX_PRIORITY);//com constante da classe Thread  para priordade máx, sendo que há normal e mín.
		t2.setPriority(3);
		t3.setPriority(1);
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}