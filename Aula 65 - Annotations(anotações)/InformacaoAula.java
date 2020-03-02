//Annotation - recurso que permite embutir informacoes complementares no codigo fonte. Ha 3 maneiras:
	//Informações para o compilador
	//Runtime (tempo de execucao)
	//Compile ou Deploy-time (tempo de compilacao ou deploy-web)
//Precedida de @
//Exemplo:
//@Override - informa que estamos sobreescrevendo um metodo da superclasse

@interface InformacaoAula{
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "http://loiane.com";
	
	String site() default "http://loiane.training";
}