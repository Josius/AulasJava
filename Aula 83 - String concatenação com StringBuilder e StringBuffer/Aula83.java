public class Aula83{
	
	public static void main(String[] args){
		
		String[] letras = {"B", "C", "D", "E", "F"};
		
		String alfabeto = "";
		
		//forma errada abaixo
		
		for(String letra : letras){
			alfabeto += letra;
		}
		System.out.println(alfabeto);
		
		//StringBuffer é thread safe
		StringBuffer sb = new StringBuffer();
		for(String letra : letras){
			sb.append(letra);
		}
		alfabeto = sb.toString();
		System.out.println(alfabeto);
		//ou
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		System.out.println(sb.reverse());
		
		//faz a mesma coisa que StringBuffer, mas não é thread safe
		StringBuilder sb_ = new StringBuilder();
		for(String letra : letras){
			sb_.append(letra);
		}
		System.out.println(alfabeto);
	}
}