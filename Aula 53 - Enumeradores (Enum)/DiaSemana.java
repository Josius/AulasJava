//AULA 53 - ENUM (ENUMERADORES)
//Enum seguem o padrao de constantes, ou seja, utilizam caixa alta e _ no lugar de espaco ou uma segunda palavra

//Para usar o enum, precisamos declarar o seu tipo, por exemplo:
//		DiaSemana segunda = DiaSemana.SEGUNDA;

//A vantagem de usar enum e o fato de declarar atributos que torna-se mais simples, alem de ser mais elegante

//Usar enum tambem melhora a seguranca em questao da declaracao do atributo, por exemplo:
//		int segunda = DiaSemanaConstantes.SEGUNDA;
//		DiaSemana segunda = DiaSemana.SEGUNDA;
//Com int [...], na da me impede de atribuir outro valor a variavel int, ja com enum DiaSemana, eu nao consigo atribuir outro valor que nao seja do proprio enum criado

public enum DiaSemana{
	
	SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
}