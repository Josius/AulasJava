//AULA 20 - MATRIZES

//PROBLEMA
//Armazenar as 4 notas do ano de 30 alunos.
import java.util.Scanner;

public class A20Matrizes{
	public static void main(String[] args){
		Scanner ent = new Scanner(System.in);
		
				
		double[][] notasAlunos = new double[3][4];
		
		//Primeiro aluno
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		//Segundo aluno
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		//Terceiro aluno
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for(int i = 0; i < notasAlunos.length; i++){
			//System.out.print(notasAlunos[i] + " ");
			for(int j = 0; j < notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println();
		/*	
		//alterando a nota de um aluno	
		notasAlunos[1][3] = 8;
		
		for(int i = 0; i < notasAlunos.length; i++){
			for(int j = 0; j < notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		double soma;
		
		System.out.println("Calculando a media de cada aluno");
		
		for(int i = 0; i < notasAlunos.length; i++){
			
			soma = 0;
			
			for(int j = 0; j < notasAlunos[i].length; j++){
				soma += notasAlunos[i][j];
			}
			System.out.println("A media do aluno " + i + " eh = " + (soma/4));
		}
		
		//Inicializando os vetores/matriz com valores j? incorporados.
		
		double[] notasAluno1 = {7, 8, 9, 10};
		
		double[][] notasAlunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
		
		System.out.println("Output da matriz notasAlunos2");
		
		for(int i = 0; i < notasAlunos2.length; i++){
			for(int j = 0; j < notasAlunos2[i].length; j++){
				System.out.print(notasAlunos2[i][j] + " - ");
			}
			System.out.println();
		}
		*/
		
		//MATRIZES DE 3 DIMENSOES - TERCEIRO V?DEO
		/*
		int[][][] matrizTridimensional = new int[3][3][3];
		
		//Soma dos indices para a matriz
		for(int i = 0; i < matrizTridimensional.length; i++){
			for(int j = 0; j < matrizTridimensional[i].length; j++){
				for(int k = 0; k < matrizTridimensional[i][j].length; k++){
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					matrizTridimensional[i][j][k] = i + j + k;
					
				}
			}
		}
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for(int i = 0; i < matrizTridimensional.length; i++){
			for(int j = 0; j < matrizTridimensional[i].length; j++){
				for(int k = 0; k < matrizTridimensional[i][j].length; k++){
		
					soma += matrizTridimensional[i][j][k];
					
					if(matrizTridimensional[i][j][k] % 2 == 0){
						somaPares += matrizTridimensional[i][j][k];
					}else{
						somaImpares += matrizTridimensional[i][j][k];
					}
				}
			}
		}
		
		System.out.println("Soma total = " + soma);
		System.out.println("Soma pares = " + somaPares);
		System.out.println("Soma impares = " + somaImpares);
		*/
		
		//MATRIZES IRREGULARES
		/*
		System.out.println("Entre com o numero de pessoas que serao entrevistadas:");
		int numEntrevistados = ent.nextInt();
		int qtdFilhos;
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		//Perguntar a qtd de filhos e os seus nomes
		for(int i = 0; i < nomesFilhos.length; i++){
			
			System.out.println("Entre com a quantidade de filhos:");
			qtdFilhos = ent.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j = 0; j < nomesFilhos[i].length; j++){
				System.out.println("Digite o nome do filho " + (j+1));
				
				nomesFilhos[i][j] = ent.next();
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < nomesFilhos.length; i++){
			System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos.");
			
			for(int j = 0; j < nomesFilhos[i].length; j++){
				System.out.println(nomesFilhos[i][j]);
			}
		}
		*/	
	}
}
	