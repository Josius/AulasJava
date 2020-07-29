import java.text.ParseException;
import java.math.RoundingMode;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.Locale;

public class Aula96{
	
	public static void main(String[] args) throws ParseException{
		
		//1.000,00 - BR
		//1,000.00 - EUA
		
		Locale en = new Locale("en", "United State");
		NumberFormat nf = NumberFormat.getInstance(en);
		
		String num = nf.format(100.99);
		System.out.println(num);
		
		Locale br = new Locale("pt", "Brazil");
		nf = NumberFormat.getInstance(br);
		num = nf.format(100.99);
		System.out.println(num);
		
		//Moeda
		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		String valor = moeda.format(100.99);
		System.out.println(valor);
		
		Currency currency = moeda.getCurrency();
		System.out.println(currency);
		
		//Porcentagem
		NumberFormat porcent = NumberFormat.getPercentInstance();
		String porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		porcent.setMaximumIntegerDigits(7);
		porcent.setMinimumIntegerDigits(5);
		
		porcent.setMaximumFractionDigits(2);
		porcent.setMinimumFractionDigits(1);
		
		porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		//Arredondamento
		nf = NumberFormat.getInstance(Locale.getDefault());
		
		nf.setRoundingMode(RoundingMode.UP);
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(0);
		System.out.println(nf.format(99.50));
		
//		Number num3 = nf.parse("100.00"); resulta 10000
		Number num3 = nf.parse("100,00");// resulta 100
		System.out.println(num3.intValue());
	}
}