package com.empresaxy.clases;

public class MiClase {
	public Integer numAlumnos;
	private String nombre;
	
	MiClase(){
		this.numAlumnos = 0;
		this.nombre = "";
	}
	
	MiClase(Integer numAlumnos){
		this.numAlumnos = numAlumnos;
		this.nombre = "";
	}
	
	public String getNombre() {
		return this.nombre;
		
		//si desde un método quiero usar atributo de la clase, es recomendable poner this.
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	
}
