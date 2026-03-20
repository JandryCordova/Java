package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona1 = new Persona ();
		persona1.setNombre("Jandry");
		persona1.setApellido("Cordova");
		persona1.setEdad(15);
		persona1.setEstatura(1.96);
		Direccion direccion1 = new Direccion();
		direccion1.setCallePrimaria("Siempre Cruza");
		direccion1.setCalleSecundaria("Por la callesita");
		direccion1.setNumero("N-45");
		direccion1.setLatitud(98.62);
		direccion1.setLongitud(659.32);
		persona1.setDireccion(direccion1);
		
		String nombre =persona1.getNombre();
		String apellido = persona1.getApellido();
		int edad = persona1.getEdad();
		double estatura=persona1.getEstatura();
		Direccion dir=persona1.getDireccion();
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Edad: "+edad);
		System.out.println("Estatura: "+estatura);
		System.out.println("Calle Primaria: "+dir.getCallePrimaria());
		System.out.println("Calle Secundaria: "+dir.getCalleSecundaria());
		System.out.println("Numero: "+dir.getNumero());
		System.out.println("Latitud: "+dir.getLatitud());
		System.out.println("Longitud: "+dir.getLongitud());
		System.out.println("************************************");
		System.out.println("Direccion: "+dir);
	}

}
