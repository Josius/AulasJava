 public class A37OOTeste{
	
	public static void main(String[] args){
		
		A37OOAluno aluno = new A37OOAluno();
		
		A37OOProfessor professor = new A37OOProfessor();
		
		aluno.setNome("gol");
		System.out.println(aluno.getNome());
		
		//declarando da forma abaixo, estamos usando a classe 'A37OOPessoa' como super classe, e estamos instanciando o tipo 'A37OOAluno', o qual vai dar acesso a todos os metodos get-set que a classe 'A37OOPessoa' proporciona, mas nao os metodos da classe 'A37OOAluno'.
		A37OOPessoa aluno2 = new A37OOAluno();//Conceito usado no polimorfismo
		
	}
 }