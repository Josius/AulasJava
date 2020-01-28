//AULA 49 - EXCEPTIONS - FINALLY
//'System.exit(0);' > Termina a execucao do programa

public class FinallyPegadinha{
	
	public static void main(String[] args){
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			}
			catch(ArithmeticException e){
				System.out.println("Erro ao dividir por zero");
				System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posica do array invalida");
				System.exit(0);
			}
			finally{
				System.out.println("Essa linha eh impressa sempre apos o try ou o catch");
				System.out.println();
			}
			
		}
	}
}