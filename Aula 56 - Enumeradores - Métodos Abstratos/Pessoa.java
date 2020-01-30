//AULA 56 - ENUMERADORES - METODOS ABSTRATOS

public class Pessoa{
	
	private TipoDocumento tipoDocumento;
	private String numeroDocumento; 
	
	public Pessoa(){
		super();
	}
	public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento){
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	
	public TipoDocumento getTipoDocumento(){
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento){
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getNumeroDocumento(){
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento){
		this.numeroDocumento = numeroDocumento;
	}
	
	public String toString(){
		return "Pessoa [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + "]";
	}
}