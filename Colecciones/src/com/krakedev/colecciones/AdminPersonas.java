package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}
	public void agregar (Persona persona) {
		personas.add(persona);
	}
	
	public void imprimir() {
		Persona elementoPersona;
		for ( int a=0;a<personas.size();a++) {
			elementoPersona=personas.get(a);
			System.out.println(elementoPersona.getNombre()+" "+elementoPersona.getEdad());
		}
	}
	public Persona buscarPersona(String nombre) {
		Persona personaEncontrada=null;
		Persona elementoPersona=null;
		for (int a=0; a<personas.size();a++) {
			elementoPersona=personas.get(a);
			if(nombre.equals(elementoPersona.getNombre())) {
				personaEncontrada=elementoPersona;
			}
		}
		return personaEncontrada;
	}
	
	public ArrayList<Persona> buscarVarios(int edad){
		ArrayList<Persona> mayores = new ArrayList<Persona>();
		Persona elementoPersona;
		for ( int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if (elementoPersona.getEdad()>edad) {
				mayores.add(elementoPersona);
			}
			
		}
		return mayores;
	}

}
