//AULA 57 - WRAPPERS - CLASSES DE TIPOS PRIMITIVOS
//As classes wrappers representação os tipos primitivos no java

//No java 12 (verificar a partir de qual) ja nao se usa a declaracao de wrappers como abaixo; o programa nao compila
/*

		Short num7 = new Short(num1);
		
		ou
		
		Short num77 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
*/

//Metodo .parse<Tipo>() (.parceDouble(), etc), converte String no tipo desejado
//Metodo .<tipo>Value() (.inValue(), etc), converte o tipo da variavel no <tipo> desejado
//Metodo .valueOf() (Integer.valueOf(1343)), converte em uma instancia

public class TesteWrapper{
	
	public static void main(String[] args){
		
		//tipos primitivos do java
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag  = true;
		char a = 'a';
		
		//Declarando a classe Short que empacota o tipo primitivo short
		Short num7 = num1;
		//ou
		Short num77 = (short) 1;
		Byte num8 = (byte) 10;
		Integer num9 = 100;
		Long num10 = 10000l;
		Float num11 = 3.5f;
		Double num12 = 3.555;
		Boolean flag2 = true;
		Character b = 'b';
		
		//As declaracoes das linhas abaixo nao funcionam como no video:
		//Integer num13 = new Integer("1000");
		//Integer num13 = (int)"1000";
		//Integer num13 = "1000";
		//Double num14 = (double)"3.5";
		Integer num13 = 1000;
		Double num14 = 3.5;
		
		System.out.println(num7);
		System.out.println(num77);
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());
		
		Long num15 = num13.longValue();
		
		int num16 = Integer.parseInt("100000");
		
		System.out.println(num15);
		System.out.println(num16);
		
		double num17 = Double.parseDouble("3.555");
		
		System.out.println(num17);
		
		Integer num18 = Integer.valueOf(1343);
		System.out.println(num18);
		
		//Loiane diz que nao pode comparar como abaixo, porem ela usava a linha 52 como comparacao, ja que ela nao funciona no java12, a comparacao abaixo vai funcionar
		System.out.println(num9 == num13);
		//.equals() tambe, funciona
		System.out.println(num9.equals(num13));
	}
}