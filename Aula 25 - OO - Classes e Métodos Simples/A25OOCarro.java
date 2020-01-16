//AULA 25 - ORIENTAÇÃO A OBJETOS: CLASSES E MÉTODOS SIMPLES
//Sem retorno ou parâmetro

//BOA PRÁTICA
//Nome de método sempre começa com um verbo

//Método simples, exemplo:
/*
POR SER VOID, NÃO POSSUI RETORNO
void exibirAutonomia(AQUI SERIA OS PARÂMETROS DO MÉTODO){
	System.out.println("A autonomia do carro é: " + capCombustível * consumoCombustível + " km");
}
*/

public class A25OOCarro{
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
}