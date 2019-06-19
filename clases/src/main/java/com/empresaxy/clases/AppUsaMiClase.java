package com.empresaxy.clases;

public class AppUsaMiClase {

	public static void main(String[] args) {
		
		MiClase miObjeto;
		miObjeto = new MiClase();
		System.out.println("primera clase");
		System.out.println(miObjeto);
		miObjeto.numAlumnos = 8;
		System.out.println(miObjeto.numAlumnos);
		
		//no es posible asignar, es privado
		//miobjeto.nombre = "carlos";
		miObjeto.setNombre("Goya");
		System.out.println(miObjeto.getNombre());
		
		MiClase otroObjeto = new MiClase();
		otroObjeto.setNombre("El bigotes");
		otroObjeto.numAlumnos = -4;

		MiClase otroOtroObjeto = new MiClase();
		
	}

}
