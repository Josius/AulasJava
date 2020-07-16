public class MinhaThreadSoma implements Runnable{
	
	private String nome;
	private int[] nums;
	private static Calculadora calc;
	//private static Calculadora calc = new Calculadora();
	
	public 	MinhaThreadSoma(String nome, int[] nums){
		this.nome = nome;
		this.nums = nums;
		this.calc  = new Calculadora();
		new Thread(this, nome).start();
		
		
/*
		O código acima é a mesma coisa que:
		Thread t = new Thread(this, nome);
		t.start();
*/
	}
	
	public void run(){
		
		System.out.println(this.nome + " iniciada");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma para thread " + this.nome + " eh: " + soma);
		
		System.out.println(this.nome + " terminada");
	}
}