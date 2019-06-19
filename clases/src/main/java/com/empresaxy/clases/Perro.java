package com.empresaxy.clases;

public class Perro {

	public String raza;
	private String razaAgua;
	
	//constructor
	Perro(){
		this.raza = "";
		this.raza = "mix";
		this.razaAgua = "Pastor de aguas";
		
		
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getRazaAgua() {
		return razaAgua;
	}

	public void setRazaAgua(String razaAgua) {
		this.razaAgua = razaAgua;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", razaAgua=" + razaAgua + "]";
	}
	
	

}
