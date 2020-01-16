//AULA 18 - COMANDOS BREAK E CONTINUE
//Break
//Usado para saída de loops;
//Pode ser usado juntamente com um rótulo(label); > raro ver label ser usado no java

//Continue
//Continua o loop na proxima iteracao
//seria um complemento do 'break'; este pede para sair do loop, 'continue' ele pede para continuar na proxima iteracao
//mais usado quando houver um 'for' aninhado ('for' dentro de outro 'for')



import java.util.Scanner;

public class A18BreakContinue{
	public static void main(String[] args){
		
		//break saindo de um loop
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		
		int num = ent.nextInt();
		
		System.out.println("Entre com um limite");
		
		int max = ent.nextInt();
		
		
		//encontrar o primeiro numero divisivel por 7 depois do 'num' informado e com limite de 'max'.
		//o break vai parar o programa assim que encontrar o primeiro numero divisivel
		//ou seja, num = 8 e max = 30, o loop roda até encontrar 14, que é o primeiro numero divisivel por 7.
		//retirar o 'break' o loop vai até o 'max', demonstrando os outros numeros divisiveis por 7.
		for(int i = num; i <= max; i++){
			if(i % 7 == 0){
				System.out.println("O valor de i eh: " + i);
				
				break;
			}
			System.out.println("Valor de i: " + i);
		}
		
		//goto > nao utilizado na programacao
		for(int i = 0; i <= 4; i++){
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if(i == 1){
							break rotulo1;
						}
						if(i == 2){
							break rotulo2;
						}
						if(i == 3){
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println(i);
		}
		
		//continue
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		
		int num = ent.nextInt();
		
		System.out.println("Entre com um limite");
		
		int max = ent.nextInt();
		
		//imprimir o valor de 'i' em todas as vezes que entrar no for
		//porem nao quero imprimir quando 'i' for um divisivel por 7
		//ou seja, 'i' eh divisivel por 7, ele pula e continua os comandos do bloco de comandos.
		for(int i = num; i <= max; i++){
			if(i % 7 == 0){
				continue;
			}
			System.out.println("O valor de i eh: " + i);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}