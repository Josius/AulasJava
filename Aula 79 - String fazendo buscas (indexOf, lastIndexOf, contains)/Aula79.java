public class Aula79{
	public static void main(String[] args){
		
		String banana = "banana"; //'local a buscar'
		String ana = "ana"; //'caractere a buscar'
		
		//indexOf - retorna o indice do 1º caractere encontrado no 'local a buscar' usando um 'caractere a buscar'
		System.out.println(banana.indexOf('x'));//-1
		System.out.println(banana.indexOf('b'));//0
		System.out.println(banana.indexOf('a'));//1
		
		System.out.println(banana.indexOf(ana));//1
		
		//lastIndexOf - retorna o último vez que o caractere procurado aparece no arranjo
		System.out.println(banana.lastIndexOf('a'));//5
		System.out.println(banana.lastIndexOf(ana));//3
		
		//contains - retorna true ou false
		System.out.println(banana.contains(ana));//true
		System.out.println(banana.contains("ceu"));//false
		
	}
}