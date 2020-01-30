//AULA 55 - ENUMERADORES - METODOS VALUES E VALUEOF

public class TesteEnum2{
	
	public static void main(String[] args){
		
		//No println abaixo, nao eh necessario declarar: DiaSemana2 dia[...]
		System.out.println(Enum.valueOf(DiaSemana2.class, "DOMINGO"));
		
		DiaSemana2 dia = Enum.valueOf(DiaSemana2.class, "SABADO");
		
		System.out.println(dia);
	}
}