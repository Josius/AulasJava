import java.math.BigInteger;
import java.math.BigDecimal;

public class Aula98{
	
	public static void main(String[] args){
		
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c);
		
		BigDecimal aa = new BigDecimal("1.03");
		BigDecimal bb = new BigDecimal("0.03");
		BigDecimal cc = bb.subtract(aa);
		System.out.println(cc);
		
		BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
		BigDecimal bd2 = new BigDecimal("987654321.9876543210");
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.multiply(bd2));
		System.out.println(bd1.divide(new BigDecimal(2)));
		
		BigInteger bi = new BigInteger("10000000000000000000");
		System.out.println(bi); 
	}
}