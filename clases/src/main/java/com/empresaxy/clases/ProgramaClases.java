package com.empresaxy.clases;

public class ProgramaClases {

	public static void main(String[] args) {
		
		//Toby
		Perro toby;
		toby = new Perro();
		toby.raza = "Terrier";		
		System.out.println(toby.raza);
		
		//Otto
		Perro otto;
		otto = new Perro();
		otto.raza = "Pastor Alemán";
		System.out.println(otto.raza);
		
		System.out.println("las razas de Toby y Otto son: "+toby.raza + " y "+otto.raza);
		
		//Duna
		Perro duna;
		duna = new Perro();
		
		System.out.println("Duna raza: "+duna.raza);
		
		//Fluky
		Perro fluky;
		fluky = new Perro();
		System.out.println("fluky raza: "+fluky.getRazaAgua());
		
			
	}

}
