//CLASSE ANINHADA LOCAL
//Geralmente usado em Swing (actions)
public class Externa2{
	
	public void metodoQualquer(){
		// a ClasseLocal soh tem escopo dentro do metodoQualquer, com isso ela nao pode ser instanciada
		class ClasseLocal{
			
			private String texto = "texto classe local";
			
			public void imprimeTexto(){
				System.out.println(texto);
			}
		}
		
		ClasseLocal local = new ClasseLocal();
		
		local.imprimeTexto();
	}
	
	//ClasseLocal local2 = new ClasseLocal(); //NAO INSTANCIA
	
	public static void main(String[] args){
		//ClasseLocal local3 = new ClasseLocal(); //NAO INSTANCIA
		Externa2 externa = new Externa2();
		
		externa.metodoQualquer();
	}
}