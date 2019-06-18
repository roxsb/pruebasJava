package com.miempresa.miapp;


public class App 
{
    public static void main( String[] args ){
    	
    	//declaro variables
    	int i = 1;
    	int j = 1;
    	int x = 1;
    	    	
    	//4.Bucle while
        while(i<11) {
        	System.out.println("soy i "+i); 
        	i++;
        }
        
        //5.Bucle do-while
        do {
        	System.out.println("soy j" +j);
        	j++; 
        }         
        while (j<11);    
        
        //6.Bucle for
        for(x=0;x<11;x++) {
        System.out.println("soy x" +x);
        }
        
        
        //7.Ejercicio edad con if-else
        
        int edad = 15;
        
        if (edad >= 18){
        	System.out.println("puede conducir");
        } else {
        	System.out.println("no puede conducir");
        }
        
        /* int edad3 = 18;        
        (edad3>18) ? System.out.println("puede conducir"):System.out.println(" no puede conducir");
        */
        
        //8.Ejercicio edad multicondiciones con switch-case
        
        int edad2 = 21;
        
        switch (edad2) {
        
        case 18: 
        	System.out.println("puede conducir");
        	
        	break;
        	
        case 21: 
        	System.out.println("podria beber en USA");
        	
        	break;
        	
        default:
        	System.out.println(edad2);
        	
        	break;
        }
        
        
        //9.Bucle While 10 vueltas e imprima el número de vuelta por pantalla. Dentro del bucle, su el valor que utilizas de contador de vueltas es 5, haz que se salga con un break, si es 2 que haga un continue.
        int h = 1;
        
        while(h<11) {
        	System.out.println("soy h "+h); 
        	h++;
        	
        	switch (h) {
        	
        	case 5:
        		System.out.println("voy por 5");
        		break;
        		
        	case 2:
        		System.out.println("voy por 2");
        		continue;
        	}
        }       
        
        
    }
    
    
}
