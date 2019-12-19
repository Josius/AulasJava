//AULA 29 - ORIENTAÇÃO A OBJETOS: CONSTRUTORES
//Pode possuir quantos construtores quiser, desde que eles sejao diferentes
//Dica de boa pratica eh criar sempre um construtor vazio quando houver um(desde que esse nao seja vazio) ou mais construtores na classe
//Instânciando um objeto no método main:
/*
	Carro van = new Carro(); >>> 'new Carro();' instanciamos a classe, e a van é a referência para o objeto do tipo carro, com ele
também  estamos chamando o construtor dessa classe, que é o método que vai inicializar a classe. Ou seja, ele fala para o computador:
'Aloca memória para guardar esses atributos para essa variável chamada van, e caso necessário, inicializar o código.

	ATRIBUTOS:
	van.marca = "Fiat";
	van.modelo = "Ducato";
	van.numPassageiros = 10;
	van.capCombustivel = 100.0;
	van.consumoCombustivel = 0.2;
*/

//CONSTRUTOR SIMPLES E VAZIO (ver linha 28): 
//O java, por padrão, já oferece um construtor simples e vazio, que é por causa da classe object, que é a mãe de todas as classes do java.
//Carro(){} >>>>>>> construtor simples e vazio é um método sem retorno e sem parâmetro algum.
/*
	class Carro{
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro(){} >>>>>>> construtor simples e vazio
	
	void exibirAutonomia(){
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
	}
	
	double obterAutonomia(){
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}

	double calculaCombustivel(double km){
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}
*/

//INICIALIZANDO UMA VARIAVEL NO CONSTRUTOR
//Se precisarmos inicializar a variável, podemos fazer assim:
//Se já existe um vlr padrão p/aquele atributo, é mais elegante fazer da forma abaixo:
/*
Carro(){
	numPassageiros = 4;
}
*/

//CONSTRUTOR COM PARÂMETROS
//Ao invés de instânciar a classe e setando atributo por atributo, podemos já passar todos os atributos no construtor da classe.
/*
Carro(String marca_, String modelo_){
	marca = marca_;
	modelo = modelo_;
}
*/

public class A29OOCarro{
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//Que no caso seria o construtor Carro(){}
	A29OOCarro(){
		System.out.println("Classe carro foi instanciada");
		numPassageiros = 4;
	}
	
	//Outro construtor Carro inicializando a classe com todos os parametros
	A29OOCarro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
	void exibirAutonomia(){
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
	}
	
	double obterAutonomia(){
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calculaCombustivel(double km){
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
}