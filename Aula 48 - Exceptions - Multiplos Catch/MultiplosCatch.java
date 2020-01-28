//AULA 48 - EXCEPTIONS - MULTIPLOS CATCH
//A ordem que se encontra a exception eh a ordem em que ela sera tratada, ou seja, a prioridade eh sempre do catch que foi declarado primeiro
//Capturando exception generica com a SuperClasse Throwable - NÃO É UMA BOA PRÁTICA
/*
[...]

catch(Throwable exc){
	TRATAMENTO DA EXCEPTION

}
[...]
*/


public class MultiplosCatch{
	
	public static void main(String[] args){
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			}catch(ArithmeticException e){
				System.out.println("Erro ao dividir por zero");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posica do array invalida");
				//System.out.println(numeros[i] + "/" + "2" + " = " + (numeros[i]/2));
			}
			
		}
	}
}