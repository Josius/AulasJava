//AULA 55 - ENUMERADORES - METODOS VALUES E VALUEOF

//O Metodo values, todo enum contem esse metodo e ele retorna um array de todos os valores dentro do enum

//O Metodo valueOf retorna o valor de um enum atraves de uma String


public class Teste{
	
	public static void main(String[] args){
		
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i=0; i<dias.length; i++){
			
			System.out.println(dias[i]);
		}
		
		System.out.println();
		
		for(DiaSemana dia : DiaSemana.values()){
			System.out.println(dia); 
		}		
	}
}