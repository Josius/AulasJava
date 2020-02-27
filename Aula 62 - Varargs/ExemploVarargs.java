//Varargs - Recurso da linguagem java que permite passar 'n' parametros para um metodo sem ter que declarar todos os parametros
//Varargs somente aceitam parametros de classes - ver sobre wrappers

public class ExemploVarargs{
	
	public static void main(String[] args){
		
		System.out.println(soma(1, 2));
		System.out.println(soma(1, 2, 3));
		
		int[] vetor = {1,2,3,4,5,6,7};
		System.out.println(soma(vetor));
		
		int[] vetor2 = new int[25];
		for(int i=0;i<vetor2.length; i++){
			vetor2[i] = i;
			//System.out.println(vetor2[i]);
		}
		System.out.println(soma(vetor2));
		
		//VARARGS
		System.out.println(soma(1,2,3,4,5,6,7,8,9,10));
		System.out.println(soma(vetor2));
		//System.out.println(soma(vetor, 13, vetor2)); ESTA LINHA NAO FUNCIONA, ERRO DE COMPILACAO
		System.out.println(soma2(1,2,3,4,5,6,7,8,9,10));
		//System.out.println(soma2(vetor2)); ESTA LINHA NAO FUNCIONA, ERRO DE COMPILACAO
	}
	
	static int soma(int a, int b){
		return a + b;
	}
	static int soma(int a, int b, int c){
		return a + b + c;
	}
	static int soma(int[] vetor){
		int total = 0;
		for(int i=0; i<vetor.length; i++){
			total += vetor[i];
		}
		return total;
	}
	//VARARGS
	
	static int soma(Integer... vetor){
		int total = 0;
		for(int i=0; i<vetor.length; i++){
			total += vetor[i];
		}
		return total;
	}
	//VARARGS COM PARAMETROS - o varargs precisa ser o ultimo quando ha parametros, para que o java saiba onde termia os parametros e onde comeca o varargs
	static int soma2(int a, int b, Integer... vetor){
		int total = 0;
		for(int i=0; i<vetor.length; i++){
			total += vetor[i];
		}
		return total;
	}
	
}