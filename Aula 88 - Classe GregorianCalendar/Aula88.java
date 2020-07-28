import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88{
	
	public static void main(String[] args){
		
		Calendar hoje1 = Calendar.getInstance();
		
		GregorianCalendar hoje = new GregorianCalendar();

//Como a classe GregorianCalendar extends Calendar, é possível passar uma instância dessa classe para o método abaixo, que recebe instâncias da classe Calendar; polimorfismo		
		imprimirData(hoje);

//O método isLeapYear verifica se o ano é bissexto, somente da classe GregorianCalendar
		System.out.println(hoje.isLeapYear(2020));

//Outras formas de instanciar GregorianCalendar		
		GregorianCalendar hoje2 = new GregorianCalendar(2017, 0, 1);
		
		imprimirData(hoje2);
		
		GregorianCalendar hoje3 = new GregorianCalendar(2017, 0, 1, 10, 05, 23);
		
		imprimirData(hoje3);
	}
	
	private static void imprimirData(Calendar hoje){
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje eh: %02d/%02d/%d %02d:%02d:%02d%n", dia, (mes+1), ano, hora, minutos, segundos);	
	}
}