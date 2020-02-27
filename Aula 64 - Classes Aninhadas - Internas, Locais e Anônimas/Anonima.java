//CLASSE ANINHADA ANONIMA
//Geralmente usado em Collections(comparar objetos, entre outros)
//Altera o comportamento da classe em tempo de execucao

public class Anonima{
	
	public void imprimeTexto(){
		System.out.println("Qualquer texto");
	}
	
	public static void main(String[] args){
		
		Anonima anonima = new Anonima(){
			public void imprimeTexto(){
				System.out.println("Qualquer texto que foi sobrescrito");
			}
		};
		
		anonima.imprimeTexto();
		
		//usando interface
		
		Texto texto = new Texto(){
			
			public void imprimeTexto(){
				System.out.println("qualquer texto - interface");
			}
		};
		
		texto.imprimeTexto();
	}
}
