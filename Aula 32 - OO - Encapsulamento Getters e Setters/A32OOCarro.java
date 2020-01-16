//AULA 32 - ORIENTAÇÃO A OBJETOS: ENCAPSULAMENTO: GETTERS E SETTERS

//ENCAPSULAMENTO
//Modo padrão de get
//Get serve para obter o valor do atributo private da classe
/*
public <tipoDoAtributo> get<NomeDoAtributo>(){
	return this.<nomeDoAtributo>;
}
*/

//Modo padrão de set
//Eles nao retornam nada, entao eh tipo void, sempre
//Set serve para alocar valores ao atributo private da classe
/*
public void set<NomeDoAtributo>(<parametroComTipoEnomeDoAtributo>){
	this.<nomeDoAtributo> = <nomeDoAtributo>;
}
*/

public class A32OOCarro{
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	public String getMarca(){
		return this.marca;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public int getNumPassageiros(){
		return this.numPassageiros;
	}
	
	public void setNumPassageiros(int numPassageiros){
		this.numPassageiros = numPassageiros;
	}
	
}
