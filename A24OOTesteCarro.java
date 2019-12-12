public class A24OOTesteCarro{
	public static void main(String[] args){
		
		A24OOCarro van = new A24OOCarro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van); //<<< passa o endereço de memória >>> não usar
		
		//output correto
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		A24OOCarro fusca = new A24OOCarro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		
	}
}