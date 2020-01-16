public class A27OOTesteCarro{
	public static void main(String[] args){
		
		A27OOCarro van = new A27OOCarro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100.0;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		System.out.println();
		
		System.out.println("Com \"van.obterAutonomia();\":");
		van.obterAutonomia();
		System.out.println();
		
		System.out.println("Atribuindo a variável \"double autonomia\" a chamada do método obterAutonomia.");
		double autonomia = van.obterAutonomia();
		System.out.println("Autonomia do carro é: " + autonomia);
		System.out.println();
		
		System.out.println("Chamando o método obterAutonomia no S.O.P.ln.");
		System.out.println("Autonomia do carro é: " + van.obterAutonomia());
		System.out.println();
		
		System.out.println("Chamando o método calculaCombustivel");
		
		//entre parênteses é o argumento
		double qtdCombustivel10 = van.calculaCombustivel(10.0);
		double qtdCombustivel15 = van.calculaCombustivel(15.0);
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
		
		
		
	}
}