//AULA 27 - ORIENTAÇÃO A OBJETOS: CLASSES E MÉTODOS COM PARÂMETROS

//Método com parâmetros, exemplo:
//Quando usar parâmetros no método? 
//Quando eu precisar de uma informação que não está disponível na classe.
/*
double calculaCombustivel(double km){
	return km/consumoCombustivel;
}
*/

public class A27OOCarro{
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
	}
	
	double obterAutonomia(){
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	//entre parênteses é o parâmetro
	double calculaCombustivel(double km){
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
}