//AULA 21 - FOR EACH (FOR MELHORADO)

//COMO FUNCIONA A ESTRUTURA DO FOR EACH
//FOR EACH NÃO FUNCIONA COM SCANNER DO TECLADO
	/*
	
	ESTE É UM FOR EACH
	for(int nota : notas){
		System.out.println("Array: " + nota);
	}
	
	ESTA É A FORMA COMO UM FOR EACH FUNCIONA INTERNAMENTE
	for(int i = 0; i < notas.length; i++){
		int nota = notas[i];
		System.out.println(notas[i]);
	}
	
	*/

import java.util.Random;

public class A21ForEach{
	public static void main(String[] args){
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < notas.length; i++){
			
			notas[i] = random.nextInt(10);
			
		}
		
		for(int i = 0; i < notas.length; i++){
			System.out.println("Array " + i + ": " + notas[i]);
		}
		
		//COMO FUNCIONA A ESTRUTURA DO FOR EACH
		
		System.out.println();
		System.out.println("IMPRESSO COM UM FOR QUE SIMULA O FOR EACH");
		for(int i = 0; i < notas.length; i++){
			int nota = notas[i];
			System.out.println("Array " + i + ": " + notas[i]);
		}

		System.out.println();
		System.out.println("Usando o for each");
		for(int nota : notas){
			System.out.println("Array: " + nota);
		}
		
		//EXEMPLO 2
		System.out.println();
		System.out.println("EXEMPLO COM ARRAYS MULTIDIMENSIONAIS");
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
		
		for(double[] notasAluno : notasAlunos){
			for(double nota : notasAluno){
				System.out.print(nota + " ");
			}
			System.out.println();
		}
		
	}
	
}