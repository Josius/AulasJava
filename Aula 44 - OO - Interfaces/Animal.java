//AULA 44 - ORIENTAÇÃO A OBJETOS: INTERFACES

//INTERFACE - E uma classe abstrata que somente possui somente metodos abstratos (classes AnimalEstimacao e AnimalDomesticado)
//Todos os metodos/atributos de uma interface sao 'public', 'static', 'final' e 'abstract', logo, nao precisam dessas palavras em suas declaracoes de metodos
//Os atributos das interface sao 'public final <tipo> <NOME>', ou seja, eles sao constantes

//IMPLEMENTS - A classe que ira usar a interface precisa dessa palavra em sua assinatura:
//		'public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao'

//Com o metodo emitirSom abaixo, todas as classes deveriam tem um metodo emitirSom tambem, porem, as classes Ave e Mamifero nao precisam. Isto acontece porque em suas assinaturas, elas possuem a palavra abstract. Exemplo:
//		'public abstract class Ave extends Animal'
//Somente necessitaram usar tal metodo, as classes sem abstract em suas assinaturas

public abstract class Animal{
	
	private String nome;
	
	public abstract void emitirSom();
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
}