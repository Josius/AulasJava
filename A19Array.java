//AULA 19 - ARRAYS
//FOR MELHORADO

public class A19Array{
	public static void main(String[] args){
		
		//pratica java
		double[] temperaturas = new double[30];
		
		//há diferença com o de cima
		//double temp[] = new double[365];
		
		//uma forma de acessar o array pelo indice
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatuda do dia 1 eh: " + temperaturas[0]);
		System.out.println("O valor da temperatuda do dia 3 eh: " + temperaturas[2]);
		
		System.out.println("O tamanho do array eh: " + temperaturas.length);
		
		for(int i = 0; i <= temperaturas.length; i++){
			System.out.println("Temperatura do dia " + (i+1) + " eh: " + temperaturas[i]);
		}
		
		//'for' melhorado
		//a variavel 'temp' demonstra o valor do array no 'for' normal, mas nao o indice (ver 'for' acima) 
		for(double temp : temperaturas){
			System.out.println(temp);
		}
		
		
	}
}