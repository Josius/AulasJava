//AULA 32 - ORIENTAÇÃO A OBJETOS: ENCAPSULAMENTO: GETTERS E SETTERS
public class A32OOTesteCarro{
	public static void main(String[] args){
		A32OOCarro van = new A32OOCarro();
		//setando os valores nos atributos private com get e set
		van.setMarca("Fiat");
		van.setModelo("Ducato");
		van.setNumPassageiros(10);
		//guetando os valores nos atributos private com get e set
		System.out.println(van.getMarca());
		System.out.println(van.getModelo());
		System.out.println(van.getNumPassageiros());
	
	}
}
