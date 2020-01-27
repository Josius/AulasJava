//AULA 46 - ORIENTAÇÃO A OBJETOS: INTERFACE E HERANCA

public interface SqlDML{
	
	void select(String query);
	void insert(String query);
	void delete(String query);
	void update(String query);
}