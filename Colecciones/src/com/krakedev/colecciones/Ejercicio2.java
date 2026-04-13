package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		
		personas.add(new Persona("Jandry","Cordova"));
		personas.add(new Persona("Juan","Lopez"));
		personas.add(new Persona("Benito","Clarines"));
		personas.add(new Persona("Pedro","Ponce"));
		Persona elementoPersona;
		for ( int a=0;a<personas.size();a++) {
			elementoPersona=personas.get(a);
			System.out.println(elementoPersona.getNombre()+" "+elementoPersona.getApellido());
		}
		

	}

}
