package com.empresaxy.clases;

public class Cliente {
	public String nombre;
	private String dni;
	private Integer edad;
	
	//constructor
	Cliente(){
		this.nombre = "";
		this.dni = "";
		this.edad = 0;
	}
	
	//constructor con parametros
	Cliente(String nombre, String dni, Integer edad){
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Integer getEdad() {
		return edad;
	}
	//solo permite valores en positivo
	public void setEdad(Integer edad) {
		if(edad>=0) {
			this.edad = edad;			
		}
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	
	
}
