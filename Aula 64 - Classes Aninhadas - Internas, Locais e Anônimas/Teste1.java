public class Teste1{
	public static void main(String[] args){
		Teste t = new Teste(){
			public void imprimeTexto2(){
				System.out.println("blablabla");
			}
		};
		
		t.imprimeTexto1();
		t.imprimeTexto2();
		t.imprimeTexto3();
	}
}