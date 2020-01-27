//AULA 45 - ORIENTAÇÃO A OBJETOS: CASTING E INSTANCEOF

//INSTANCEOF
//Usado para saber o tipo de classe
/*
Pessoa pessoa = new Pessoa();
Pessoa aluno = new Aluno();
Pessoa professor = new Professor();

if(pessoa instanceof Pessoa){
	System.out.println("Objeto do tipo Pessoa");
}

if(aluno instanceof Aluno){
	System.out.println("Objeto do tipo Aluno");
}

if(professor instanceof Professor){
	System.out.println("Objeto do tipo Professor");
}
*/

public class Teste3{
	public static void main(String[] args){
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		if(pessoa instanceof Pessoa){
			System.out.println("Objeto do tipo Pessoa");
		}

		if(aluno instanceof Aluno){
			System.out.println("Objeto do tipo Aluno");
		}

		if(professor instanceof Professor){
			System.out.println("Objeto do tipo Professor");
		}
	}
}