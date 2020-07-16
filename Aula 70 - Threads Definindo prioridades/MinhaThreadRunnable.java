//Com o uso da interface Runnable não é preciso usar o método 'start()'

public class MinhaThreadRunnable implements Runnable{
	
	private String nome;
	private int tempo;
	
	public MinhaThreadRunnable(String nome, int tempo){
		
		this.nome = nome;
		this.tempo = tempo;
//		Thread t = new Thread(this);
//		t.start();
	}
	
	public void run(){
		
		System.out.println(nome + " foi iniciada");	
		try{
			for(int i=0; i<6; i++){
				System.out.println(nome + " contador " + i);				
				Thread.sleep(tempo);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execucao");
	}
	
}