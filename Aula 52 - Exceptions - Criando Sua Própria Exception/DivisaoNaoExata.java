//AULA 52 - EXCEPTIONS - CRIANDO SUA PROPRIA EXCEPTION

public class DivisaoNaoExata extends Exception{
	
	private int num;
	private int dem;
	
	public DivisaoNaoExata(int num, int dem){
		super();
		this.num = num;
		this.dem = dem;
	}
	
	public String toString(){
		
		return "Resultado de " + num + "/" + dem + " nao eh um inteiro!";
	}
}