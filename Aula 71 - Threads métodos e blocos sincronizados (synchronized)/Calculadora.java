public class Calculadora{
	
	private int soma;
	
//	Sem a palavra chave 'synchronized' abaixo, as threads irão acessar o atributo 'soma' ao mesmo tempo, somando assim seus valores e resultando em erro. Com a palavra chave as threads acessaram uma de cada vez.
	public synchronized int somaArray(int[] array){
		
		soma = 0;
		
		for(int i=0; i<array.length; i++){
			
			soma += array[i];
			
			System.out.println("Executando a soma " + Thread.currentThread().getName() + " somando o valor " + array[i] + " com total de " + soma);
			
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		return soma;
	}
}