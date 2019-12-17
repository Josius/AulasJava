public class A26OOTesteCarro{
	public static void main(String[] args){
		
		A26OOCarro van = new A26OOCarro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100.0;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		System.out.println("Com \"van.obterAutonomia();\":");
		van.obterAutonomia();
		System.out.println();
		
		System.out.println("Atribuindo a variável \"double autonomia\" a chamada do método obterAutonomia.");
		double autonomia = van.obterAutonomia();
		System.out.println("Autonomia do carro é: " + autonomia);
		System.out.println();
		
		System.out.println("Chamando o método obterAutonomia no S.O.P.ln.");
		System.out.println("Autonomia do carro é: " + van.obterAutonomia());
		
	}
}