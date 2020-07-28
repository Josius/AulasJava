import java.util.Date;

public class Aula86{
	
	public static void main(String[] args){
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("Milissegundos desde 01/01/70 " + hoje.getTime());
		
//		System.out.println(hoje.getDate()); getDate: fora de uso
		
		
	}
}