//AULA 26 - ORIENTAÇÃO A OBJETOS: CLASSES E MÉTODOS COM RETORNO

//Método com retorno, exemplo:

//'double' seria o tipo de informação que o método irá retornar
//'return' palavra chave com o valor que queremos retornar
/*
double obterAutonomia(){
	return capCombustivel * consumoCombustivel;
}
*/

public class A26OOCarro{
	
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
	
}