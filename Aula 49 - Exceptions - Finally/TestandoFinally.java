//AULA 49 - EXCEPTIONS - FINALLY

/*
try{
	
	BLOCO QUE EH MONITORADO PARA ERROS
	
}catch(TipoDaException1 exception){
	
	TRATAMENTO ERRO 1
	
}catch(TipoDaException2 exception){
	
	TRATAMENTO ERRO 2
	
}finally{
	
	SEMPRE EXECUTADO APOS O TRY OU CATCH
	
}
*/

public class TestandoFinally{
	
	public static void main(String[] args){
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			}
			catch(ArithmeticException e){
				System.out.println("Erro ao dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posica do array invalida");
			}
			finally{
				System.out.println("Essa linha eh impressa sempre apos o try ou o catch");
			}
			
		}
	}
}