import java.util.Calendar;

public class Aula87{
	
	public static void main(String[] args){
		
		//NÃO INSTANCIAMOS CALENDAR
		Calendar hoje = Calendar.getInstance(); //Padrão de Projeto - Singleton
		
//o print abaixo retorna o toString da classe, com várias infos
		System.out.println(hoje);

//usando o get + a constante, conseguimos obter a info 
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);//Os meses começam do 0 (jan=0, fev=1, etc...)
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.println("Ano: " + ano);
		System.out.println("Mes: " + mes);
		System.out.println("Dia: " + dia);
		System.out.println("Hora: " + hora);
		
		System.out.printf("Hoje eh: %02d/%02d/%d %02d:%02d:%02d%n", dia, (mes+1), ano, hora, minutos, segundos);
		
		hoje.add(Calendar.DAY_OF_MONTH, 3);//somar
		
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		hoje.add(Calendar.DAY_OF_MONTH, -8);//subtrair
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	}
}