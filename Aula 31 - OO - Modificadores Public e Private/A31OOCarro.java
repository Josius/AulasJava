//AULA 31 - ORIENTAÇÃO A OBJETOS: MODIFICADORES PUBLIC E PRIVATE

//public 
//Usado em um metodo, classe ou atributo significa todo mundo pode ver, ou seja, qlqr classe que esteja dentro daquele projeto 
//pode acessar aquela informação

//private
//Usado em um metodo, classe ou atributo significa que somente a própria classe pode ver aquele atributo ou aquele metodo

class A31OOCarro{
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel; //Com private so eh acessivel esse atributo pela classe, nao pelo metodo main
	
	public void exibirAutonomia(){ //Os metodos geralmente declaramos como public
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel);
	}
	
	public double obterAutonomia(){
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	//metodo privado que so pode ser acessado por esta classe, inclusive, ele eh acessado abaixo no metodo calculaCombustivel.
	private double divideKMPorConsumoCombustivel(double km){
		return km/this.consumoCombustivel;
	}
	
	public double calculaCombustivel(double km){
		return this.divideKMPorConsumoCombustivel(km);
	}
}
