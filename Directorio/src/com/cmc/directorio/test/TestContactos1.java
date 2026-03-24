package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi","96565166655",45);
		Telefono telf2 = new Telefono("movi","86865135351",95);
		Contacto contacto1 = new Contacto("Juan","Perez",telf1,145.23);
		Contacto contacto2 = new Contacto("Pepito","Zapata",telf2,295.03);
		
		AdminContactos admcon = new AdminContactos();
		
		Contacto masBuscado = admcon.buscarMasPesado(contacto1, contacto2);
		
		System.out.println("El mas pesado es "+masBuscado.getNombre()+" "+masBuscado.getApellido()+" con "+masBuscado.getPeso()+ " de peso");

		boolean comparados=admcon.compararOperadoras(contacto1, contacto2);
		
		System.out.println(comparados);
	}

}
