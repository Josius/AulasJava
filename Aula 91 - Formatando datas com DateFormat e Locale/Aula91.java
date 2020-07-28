/*
Quando usarmos Locale, DateFormat é o mais indicado
*/

import java.util.Calendar;
import java.text.ParseException;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;

public class Aula91{
	
	public static void main(String[] args){
		
		Date hoje = new Date();
		
		System.out.println(Locale.getDefault());
		
//Formatando a data de acordo com o locale da aplicação
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		Locale.setDefault(new Locale("en, US"));
		System.out.println(Locale.getDefault());
		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);									
//Transformando uma String em objeto do tipo Date com getInstance e Transformando uma String em objeto do tipo Calendar
		String data = "12-02-2017 14:25";
		try{
			Date dataBase = DateFormat.getInstance().parse(data);
			System.out.println(dataBase);
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataBase);
			System.out.println(calendario);
		}catch(ParseException e){
			e.printStackTrace();
		}
		
	}
}