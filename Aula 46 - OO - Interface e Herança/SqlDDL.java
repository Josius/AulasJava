//AULA 46 - ORIENTAÇÃO A OBJETOS: INTERFACE E HERANCA

public interface SqlDDL{
	
	void create(String query);
	void alter(String query);
	void drop(String query);
}