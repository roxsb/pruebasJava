package com.miempresa.miapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//4. Declara una cadena llamada saludo con el valor "Hola"
        String saludo = "Hola";
        System.out.println(saludo);
        
        
        //5. Saca por pantalla el número de caracteres de la cadena        
        
        System.out.println(saludo.length());
        
        
        //6. Saca por pantalla el 4º caracter de la cadena
        
        System.out.println(saludo.charAt(3));
        
        
        //7. Saca por pantalla la cadena en mayúsculas 
        
        System.out.println(saludo.toUpperCase());
        
        
        //8. Saca por pantalla la cadena en minúsculas 
        
        String mayuscula = saludo.toLowerCase();        
        System.out.println(mayuscula);        
        //System.out.println(saludo.toLowerCase());
        
        
        //9. Saca por pantalla la posición del carácter 'l'
        
        System.out.println(saludo.indexOf('l'));
        
        
        //10. Declara otra cadena llamada saludo2 y compárala con la cadena saludo, saca un mensaje por pantalla indicando si son o no iguales
        
        String saludo2 = "Adiós";
        
        if(saludo2.equals(saludo)) {
        	System.out.println("son iguales");
        	
        }else {
        		System.out.println("NO son iguales");
        }
     }
}

