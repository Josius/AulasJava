//AULA 45 - ORIENTAÇÃO A OBJETOS: CASTING E INSTANCEOF

//Casting - Converter uma subclasse para o tipo superclasse ou vice-versa (Upcasting e Downcasting)

//Exemplo de upcasting:
/*
Aluno aluno = new Aluno();
Pessoa alunoPessoa = aluno;
*/
//esta eh a forma de upcasting automatica
/*
Aluno aluno = new Aluno();
Pessoa pessoaAluno = aluno;
*/
//esta eh a forma de upcasting manual
/*
Pessoa aluno = new Aluno();
*/
//eh o mesmo que:
/*
Pessoa aluno = (Pessoa) new Aluno();
*/

//Exemplo de downcasting:
/*
Aluno aluno = new Aluno();
Pessoa pessoaAluno = aluno;

Aluno aluno2 = (Aluno) pessoaAluno;   //downcasting
*/


public class Teste{
	public static void main(String args){
		//Upcasting
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno;
		
		Pessoa aluno2 = (Pessoa) new Aluno();	
		
		//Downcasting
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = aluno3; // Nao funciona essa linha porque nao eh possivel converter pessoa em aluno por conta dos atributos da classe
		//ou
		//Aluno aluno4 = (Aluno)aluno3;
	}	
}

