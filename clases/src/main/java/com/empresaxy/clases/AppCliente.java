package com.empresaxy.clases;

public class AppCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente;
		cliente = new Cliente();
		
		cliente.nombre = "BBVA";
		System.out.println(cliente.nombre);
		cliente.setEdad(-1);
		System.out.println(cliente.getEdad());
		cliente.setDni("45859842J");
		System.out.println(cliente.getDni());
		
		//no voy a poder coger dni porque es un atributo privado
		//cliente.dni;
		
		Cliente bbva = new Cliente("BBVA", "48555599L", 36);
		System.out.println("este el cliente bbva "+bbva);
		
		
	}

}
