//AULA 54 - ENUMERADORES COMO CLASSE (CONSTRUTOR E METODOS)

public class TesteEnum{
	
	public static void main(String[] args){
		
		DiaSemana dia = DiaSemana.SEGUNDA;
		//DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		//dia.toString() -> chama o proprio nome do enum
		//dia.getValor() -> imprime o valor do enum do dia.
		
		//Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
		Data data = new Data(1, 4, 2016, DiaSemana.SEGUNDA);
		
		System.out.println(data);
		
		Formulario pessoa = new Formulario();
		
		/*
		Como acessar o enum dentro da classe?
		*/
		pessoa.setNome("Walala");
		
		
		
		
		
	}
}