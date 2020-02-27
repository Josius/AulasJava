//CLASSE ANINHADA INTERNA
//Geralmente usado em hibernate/jpa(chave primaria composta)
//Classes internas tem acesso aos atributos das classes externas
public class Externa{
	
	private String texto = "texto externo";
	
	public class Interna{
		
		private String texto = "texto interno";
		
		public void imprimeTexto(){
			System.out.println(texto);
			
			//consegue ver membros da classe externa
			System.out.println(Externa.this.texto);
		}
	}
	
	public static void main(String[] args){
		
		Externa externa = new Externa();
		Interna interna = externa.new Interna(); //se a classe interna fosse estatica, nao precisariamos da instancia da classe externa para instanciar a classe interna
		
		interna.imprimeTexto();
	}
}