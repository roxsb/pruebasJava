package com.miempresa.miapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //4. Crea un array de números enteros de 4 posiciones con el nombre miarray    	  
    	
    		//int miarray[];
    		//miarray = new int[4];    	
    		int miarray[] = new int[4];
    	
    	//5. Inicializa manualmente cada una de las posiciones del array
    	
    	int i= 0;
    	//int miarray[] = {4,5,5,8};    	
    	miarray[0] = 5;
    	miarray[1] = 8;
    	miarray[2] = 3;
    	miarray[3] = 2;
    	
    	
    	//6. Recorre el array con un bucle for con un bucle e imprime el valor asignado a cada una de las posiciones
    	
    	for(i=0;i<4;i++) {
    		System.out.println("for:"+miarray[i]);
    	}

    	
    	//7. Recorre el array con un bucle while con un bucle e imprime el valor asignado a cada una de las posiciones
    	int p = 0;
    	while(p<4) {
    		System.out.println("while:"+miarray[p]); 
        p++;
    	}
    	
    	//8. Recorre el array con un bucle do-while con un bucle e imprime el valor asignado a cada una de las posiciones
    	
    	int h = 0;
    	do {
    		System.out.println("do-while:"+miarray[h]);
    		h++;
    	}while(h<4);
    	
    	//9. Declara un array de 2000 posiciones de números de tipo float llamado flotantes, inicializa con un bucle todos los valores a 0 del array, cambia la segunda posición del array y ponle el valor 7.3f y saca su valor por pantalla
    	
    	float f;
    	float flotantes[]=new float[2000];
    	for(f=0;f<2001;f++);
    	flotantes[1] = 7.3f;
    	System.out.println(flotantes[1]);
    	
    	//10. Saca por pantalla el número de elementos de array
    	
    	System.out.println(flotantes.length);
    	
    }
}
