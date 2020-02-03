//AULA 58 - WRAPPERS - AUTOBOXING E UNBOXING
//Processo de transformar um tipo primitivo em objeto e vice-versa

public class TesteAutoboxing{
	
	public static void main(String[] args){
		
		//autoboxing - mesmo processo utilizado na aula anterior, pois instanciando com 'new' nao funciona
		Short num77 = (short) 1;
		Byte num8 = (byte) 10;
		Integer num9 = 100;
		Long num10 = 100l;
		Float num11 = 3.5f;
		Double num12 = 3.555;
		Boolean flag2 = true;
		Character d = 'd';
		
		//auto un-boxing - transformando um tipo de uma classe em um tipo primitivo
		int num13 = num9;//eh a mesma coisa que: num9.intValue();
		
		//autoboxing em expressoes
		num9++;
		
		System.out.println(num9);
		
		//auto unboxing num9 -> autoboxing num13/num9 -> num14
		Integer num14 = num13/num9;
		System.out.println(num14);
		
		//mau uso
		//Se for usar muitas expressoes, eh melhor usar os tipos primitivos e nao as classes wrappers
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		Double media = (a+b+c)/ 3;
		System.out.println(media);
		
		
	}
}