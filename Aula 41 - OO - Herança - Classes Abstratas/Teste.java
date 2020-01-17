//AULA 41 - ORIENTAÇÃO A OBJETOS: HERANCA - CLASSES ABSTRATAS

//Com a superclasse Pessoa declarada como 'public', conseguimos instanciar outras classes com ela, por exemplo:
/*
Pessoa pessoa = new Pessoa();
Pessoa aluno = new Aluno();
Pessoa professor = new Professor();
*/
//Agora, se na declaracao da classe alocarmos a palavra 'abstract' (public abstract class Pessoa), a classe nao podera ser instanciada diretamente, ou seja 'Pessoa pessoa = new Pessoa();' nao funcionara. Ela somente pode ser estendida para outras classes ('extends').
//Tambem podemos usar 'abstract' na declaracao de metodos(ver na classe Pessoa), porem sera obrigatorio declarar o mesmo metodo nas outras classes filhas.

public class Teste{
	
	public static void main(String[] args){
		
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}
}