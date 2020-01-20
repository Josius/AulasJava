//AULA 43 - ORIENTAÇÃO A OBJETOS: CLASSE OBJECT

public class Teste{
	
	public static void main(String[] args){
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciencia da Computacao");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		//Com o metodo 'toString' na classe 'Teste', quando formos printar os valores setados, eles sairam corretos, ao inves de sair a referencia da memoria apontada
		System.out.println(aluno);
		
		String s1 = "asdfasfd";
		String s2 = "asdfasfD";
		String s3 = "asdfasfD";
		
		//Comparacao - com '==' estamos comparando as referencias de memoria, e nao os valores
		System.out.println("s1: " + s1 + "\ns2: " + s2 + "\ns3: " + s3);
		System.out.print("Comparando s1 e s2 com '==' ");
		System.out.println(s1==s2);
		//Comparacao - para fazermos a comparacao de objetos, necessitamos do metodo 'equals'
		System.out.println("Comparando s1 e s2 com 'equals' " + s1.equals(s2));
		System.out.println("Comparando s2 e s3 com 'equals' " + s2.equals(s3));
		System.out.println("Comparando s1 e s2 com 'equalsIgnoreCase' " + s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciencia da Computacao");
		double[] notas2 = {10, 9, 8, 7};
		aluno2.setNotas(notas2);
		
		//Comparando novamente referencia, vai dar false.
		System.out.println(aluno == aluno2);
		
		//Ainda vai dar false, porque equals compara os atributos, mas dara true com o metodo equals alterado na classe aluno
		System.out.println(aluno.equals(aluno2));
		
	}
}