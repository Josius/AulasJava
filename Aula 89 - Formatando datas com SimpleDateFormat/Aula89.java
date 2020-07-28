import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Aula89{
	
	public static void main(String[] args){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss a z");
		
		Calendar data = new GregorianCalendar(2010, 2, 20, 14, 32, 25);

//O método format retorna string		
		System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		
		System.out.println(sdf.format(hoje));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
//Passando String para Date
		String minhaData = "20/02/2000";
		
		try{
			Date minhaDataEmDate = sdf1.parse(minhaData);
			System.out.println(minhaDataEmDate);
			System.out.println(sdf.format(minhaDataEmDate));
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
}
