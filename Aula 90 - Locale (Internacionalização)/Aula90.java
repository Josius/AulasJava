import java.text.NumberFormat;
import java.util.Locale;

public class Aula90{
	
	public static void main(String[] args){
		
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		
		for(Locale loc : locales){
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Codigo da lingua: " + loc.getLanguage());
			System.out.println("Lingua: " + loc.getDisplayLanguage());
			System.out.println("Cod Pais: " + loc.getCountry());
			System.out.println("Pais: " + loc.getDisplayCountry());
			System.out.println("***************************");
		}
		
		//forçando o locale
		Locale br = new Locale("pt", "Brazil");
		
		System.out.println(br);
		
		Locale.setDefault(br);
		
		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(500000000000d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(500000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(500000000000d));
	}
}