//AULA 30 - ORIENTAÇÃO A OBJETOS: THIS
//A palavra chave 'this' referencia ao atributo da classe, ou seja, ele referencia os atributos e metodos da propria classe.
//Ha duas formas de usar o this:
//1ª Referenciar atributos de classe e metodos
//2ª Referenciar outro construtor, emulando assim um 'Classe' 'variavel' = new 'Classe()'; acessando um outro construtor. ESTE EH CONFUSO
//Abaixo, exemplo de nao elegante
/*
Carro(String marca_, String modelo_){
	marca = marca_;
	modelo = modelo_;
}
*/

//O correto:
/*
Carro(String marca, String modelo){
	this.marca = marca;
	this.modelo = modelo;
}
*/

//Outra forma, mas nao muito utilizado, pois ele faz referencia a outro construtor
/*
Carro(){
	this("Fiat", "Uno")
}
*/

//Tambem e possivel utilizar a palavra chave this dentro dos metodos
/*
void exibirAutonomia2(){
	System.out.println("A autonomia do carro eh: " + this.obterAutonomia2() + "km");
}

double obterAutonomia2(){
	return this.capCombustivel * this.consumoCombustivel;
}
*/

public class A30OOCarro{
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public A30OOCarro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
		//'this.marca' eh o atributo da classe e '= marca' eh o parametro do construtor
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public A30OOCarro(){}
	
	//Referenciando outro construtor
	public A30OOCarro(String marca, String modelo){
		this(marca, modelo, 10);
		System.out.println("Chamando construtor com 2 parametros");
	}//Ou seja, este construtor chama o construtor abaixo 1º e dps executa o seu proprio SOP
	
	public A30OOCarro(String marca, String modelo, int numPassageiros){
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parametros");
	}
	
	//Os 'this' abaixo explicitam que eh o atributo da classe
	void exibirAutonomia(){
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel);
	}
	
	double obterAutonomia(){
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calculaCombustivel(double km){
		double qtdCombustivel = km/this.consumoCombustivel;
		return qtdCombustivel;
	}
	
}