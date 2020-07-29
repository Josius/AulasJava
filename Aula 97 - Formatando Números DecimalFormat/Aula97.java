import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97{
	
	public static void main(String[] args){
		
		String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);
				
//		df.applyPattern(padrao);// forma de aplicar o padrao diretamente

		System.out.println(df.format(1234567890.123));
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator('.');//decimal
		dfs.setGroupingSeparator(',');//milhar
		
		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(1234567890.123));
		
		String padrao3 = "###,###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);//agrupando os nºs de 4 em 4
		System.out.println(df.format(1234567890.123));
		
		String padrao4 = "-###,###,000.00%";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(0.1));
		
		
	}
}