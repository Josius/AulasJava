//AULA 46 - ORIENTAÇÃO A OBJETOS: INTERFACE E HERANCA

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML{
	
	void abrirConexao();
	void fecharConexao();
}