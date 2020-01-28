//AULA 47 - EXCEPTIONS - TRY-CATCH
/*
try{
	BLOCO QUE E MONITORADO PARA ERROS
}catch(<TIPO DE EXCECAO PARA SER TRATADA> exception){
	TRATAMENTO DO ERRO
}
*/

public class Excecao{
	
	public static void main(String[] args){
		
		try{
			int[] vetor = new int[4];
		
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto nao sera impresso");
		} catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Excecao ao acessar um indice do vetor que nao existe");
		}
		System.out.println("Esse texto sera impresso apos a exception");
		
	}
}