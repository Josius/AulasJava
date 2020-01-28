//AULA 50 - EXCEPTIONS - STACKTRACE E THROWS

//Classe Throwable eh a superClasse de todas as exceptions e possui metodos uteis
//Modo correto de usar a superClasse Throwable
/*
[...]

catch(Exception exc){
	
	TRATAMENTO DA EXCEPTION
	
}

[...]
*/

//'.getMessage()' pega o que aconteceu na exception
//'.printStackTrace();' verifica em qual local/linha ocorreu o erro sem que o programa seja finalizado prematuramente	

//ERROR: resulta na finalizacao do programa
//EXCEPTION: possivel tratar o erro e continuar a execucao do programa

public class ExceptionGenerica{
	
	public static void main(String[] args){
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			}catch(Exception e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}