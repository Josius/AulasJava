//AULA 24 - ORIENTAÇÃO A OBJETOS: CLASSES E ATRIBUTOS

/* EXEMPLO DE CLASSE
class NomeDaClasse{
	
	//variáveis de instância - atributos
	int var1;
	int var2;
	int var3;
	
	//declaração de métodos
	void metodo1(int parametros){
		//corpo do método
	}
	void metodo2(int parametros){
		//corpo do método
	}
	void metodo3(int parametros){
		//corpo do método
	}
}
*/

//Atributos que um carro pode ter:
//Cor, marca, modelo, nº de passageiros, capacidade do tanque de combustível, consumo de combustível/km

//Traduzindo essas características para java:
/*
class Carro{
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
}
*/

//Criando um objeto e setando valores para seus atributos:
//Criamos uma variável do tipo Carro (van) e setamos seus atributos com nomeDaVariável.atributo.
/*
Carro van = new Carro();
van.marca = "Fiat";
van.modelo = "Ducato";
van.numPassageiros = 10;
van.capCombustivel = 100;
van.consumoCombustivel = 0.2;
*/
public class A24OOCarro{
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
}