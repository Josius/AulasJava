//AULA 52 - EXCEPTIONS - CRIANDO SUA PROPRIA EXCEPTION

public class UsandoMinhaException{
	
	public static void main(String[] args){
		
		int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
		int[] denom = {2, 0, 4, 8, 0, 2, 4};
		
		for(int i = 0; i < numeros.length; i++){
			try{
				if(numeros[i] % 2 != 0){
					//throw new Exception("Numero impar, divisao nao exata");
					throw new DivisaoNaoExata(numeros[i], denom[i]);
				}
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e){
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			}/*
			catch(Exception e){
				System.out.println("Aconteceu um erro");
				System.out.println(e.getMessage());
			}
			*/
		}
	}
}