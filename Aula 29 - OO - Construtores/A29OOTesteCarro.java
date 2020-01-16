public class A29OOTesteCarro{
	public static void main(String[] args){
		
		A29OOCarro van = new A29OOCarro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		//van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println("Numero de passageiros: " + van.numPassageiros);
		
		A29OOCarro van2 = new A29OOCarro("Fiat", "Ducatex", 15, 200, 0.5);
		
		System.out.println("Marca: " + van2.marca);
		System.out.println("Modelo: " + van2.modelo);
		System.out.println("Numero de Passageiros: " + van2.numPassageiros);
		System.out.println("Capacidade Combustivel: " + van2.capCombustivel);
		System.out.println("Consumo Combustivel: " + van2.consumoCombustivel);
		
		
	}
}