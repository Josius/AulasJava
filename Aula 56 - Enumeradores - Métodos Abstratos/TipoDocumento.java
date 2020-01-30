//AULA 56 - ENUMERADORES - METODOS ABSTRATOS

//Os metodos abstratos podem ser implementados por meio de uma interface ou entao podemos declarar o metodo abstratos dentro do enum

public enum TipoDocumento{
	
	CPF{
		public String geraNumeroTeste(){
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ{
		public String geraNumeroTeste(){
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
}