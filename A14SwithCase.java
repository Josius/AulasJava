//AULA 14 - CONDICIONAl SWITCH-CASE
//SWITCH-CASE
//Funciona como múltiplos If-Else
//Alternativa mais elegante ao invés de if else
//SWITCH-CASE não aceita DOUBLE
//SWITCH-CASE aceita INTEIROS e STRING
import java.util.Scanner;

public class A14SwithCase{
	public static void main(String[] args){
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1 a 7):");
		
		int diaSemana = ent.nextInt();
		
		//se não tiver 'else if' em todos, o último 'else' sera executado em qualquer situação
		if(diaSemana == 1){
			System.out.println("Domingo");
		}
		else if(diaSemana == 2){
			System.out.println("Segunda");
		}
		else if(diaSemana == 3){
			System.out.println("Terca");
		}
		else if(diaSemana == 4){
			System.out.println("Quarta");
		}
		else if(diaSemana == 5){
			System.out.println("Quinta");
		}
		else if(diaSemana == 6){
			System.out.println("Sexta");
		}
		else if(diaSemana == 7){
			System.out.println("Sabado");
		}
		else{
			System.out.println("Nao eh um dia da semana valido!");
		}
		
		//break eh como se fosse um 'fechar parenteses', sem ele será executada todas as linhas de código do switch-case;
		switch(diaSemana){
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terca"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sabado"); break;
			default: System.out.println("Nao eh um dia da semana valido!");
		}
		switch(diaSemana){
			
			//esta configuração quer dizer: de 2 A 6 > dia da semana
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: System.out.println("Dia util"); break;
			
			//esta configuração quer dizer: caso seja 1 OU 7 > final de semana
			case 1: 
			case 7: System.out.println("Final de semana"); break;
			default: System.out.println("Nao eh um dia da semana valido!");
		}
	}
}
