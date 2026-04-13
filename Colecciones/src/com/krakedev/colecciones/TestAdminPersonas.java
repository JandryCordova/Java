package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Juan","Sanchez",15));
		admin.agregar(new Persona("Leonardo","Pulgarin",55));
		admin.agregar(new Persona("Julian","Cordova",65));
		admin.agregar(new Persona("Juancito","Torres",25));
		admin.agregar(new Persona("Patricio","Lopez",95));
		admin.agregar(new Persona("Susuan","Zambrano",75));
		admin.agregar(new Persona("Chicherito","Socola",35));
		admin.imprimir();
		Persona personaBuscada=admin.buscarPersona("Emita");
		if(personaBuscada!=null) {
			System.out.println("Encontrado: "+personaBuscada.getApellido()+" "+personaBuscada.getEdad());
		}else {
			System.out.println("No existes la persona con ese nombre");
		}
		ArrayList<Persona> personasMayores=admin.buscarVarios(50);
		
		System.out.println(personasMayores.size());
		
	}
	
}
