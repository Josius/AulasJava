public class A36OOEndereco{
	
	private String nomeRua;
	private String numero;
	private String complemento;
	private String cidade;
	private String estado;
	private String CEP;
	
	public String getNomeRua(){
		return nomeRua;
	}
	public void setNomeRua(String nomeRua){
		this.nomeRua = nomeRua;
	}
	
	public String getNumero(){
		return numero;	
	}
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getComplemento(){
		return complemento;
	}
	public void setComplemento(String complemento){
		this.complemento = complemento;
	}
	
	public String getCidade(){
		return cidade;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public String getCEP(){
		return CEP;
	}
	public void setCEP(String CEP){
		this.CEP = CEP;
	}
}