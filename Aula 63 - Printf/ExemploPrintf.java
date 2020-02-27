public class ExemploPrintf{
	
	public static void main(String[] args){
		//Em printf nao eh recomendado usar \n para pular linha. O correto seria %n.
		//STRINGS
		System.out.printf("%s%n", 1);
		System.out.printf("%s%n", "Óia world!");
		System.out.printf("%S%n", "Óia world!"); //Em maiusculas 
		//CARACTERES - somente aspas simples ''
		System.out.printf("%c%n", 'm');
		System.out.printf("%C%n", 'm'); //Em maiusculas 
		//INTEIROS
		int valor = 123456789;
		System.out.printf("%d%n", valor);
		//PONTO FLUTUANTE
		double ptFlutuante = 3.1456789;
		System.out.printf("%f%n", ptFlutuante);
		
		//COM FLAGS
		String hiWorld = "Hi World!";
		System.out.printf("%20s%n", hiWorld); //Alinhamento a direita - padrao
		System.out.printf("%-20s%n", hiWorld); //Alinhamento a esquerda
		//valor
		int valor2 = -123456789;
		System.out.printf("%+d%n", valor);
		System.out.printf("%d%n", valor2);
		System.out.printf("%015d%n", valor);
		System.out.printf("%15d%n", valor);
		System.out.printf("%,d%n", valor);
		System.out.printf("% d%n", valor);
		System.out.printf("% d%n", valor2);
		//ptFlutuante
		System.out.printf("%.2f%n", ptFlutuante);
		System.out.printf("%.3f%n", ptFlutuante);
		System.out.printf("%.4f%n", ptFlutuante);
		System.out.printf("R$%10.2f%n", ptFlutuante);
		
		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto(){
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		double soma = 0;
		for(int i=0; i<precos.length; i++){
			soma += precos[i];
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
		System.out.printf("%s  :          R$%,10.2f%n", "Total", soma);
	}
}