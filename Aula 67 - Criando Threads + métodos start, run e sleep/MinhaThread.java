/*
MULTITAREFAS: PROCESSOS E THREADS
	
	Processo é um programa sendo executado (Ex.: firefox, skype, word, etc.).
	Thread é a menor unidade de código que pode ser executada (Ou seja, dentro de um processo/programa podemos ter várias threads).
		Ou seja, permite ao programa executar 2 ou mais tarefas ao mesmo tempo. E essas tarefas são chamadas de threads.
	Exemplo
		Editor de texto que pode formatar um texto e ao mesmo tempo pode enviar o texto para impressão.
		
	Criar uma Thread - 2 maneiras
		Extender a classe Thread
		Implementar classe Runnable
	
	Métodos star, run, sleep
	
	star - inicia o método run
	run - executa a tarefa da thread
	sleep - coloca a thread para dormir por X milissegundos
*/

public class MinhaThread extends Thread{
	
	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo){
		
		this.nome = nome;
		this.tempo = tempo;
		start(); // 5-aqui sim vai executar a thread sem precisar chamar
		
	}
	
// 1-Para a thread ser executada, precisamos sobreescrever o método run
// 2-Mas ainda assim será necessário startar a thread (ver no metodo main) que chamará o método run e executará ele.
	public void run(){
		
		//System.out.println("Executando a thread");

// 6-Colocando a thread para dormir		
		try{
			for(int i=0; i<6; i++){
				System.out.println(nome + " - contador " + i);

				// colocando para dormir
//				Thread.sleep(100);
				Thread.sleep(tempo); 
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(nome + " terminou a execucao");
	}
}