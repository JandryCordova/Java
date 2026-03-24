package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi","9484654",20);
		Contacto c= new Contacto("Jandry","Cordova",telef,12.30);
		
		System.out.println(c.getNombre()+" "+c.getApellido()+"/+"+telef.getCodigo()+" "+telef.getNumero()+"/"+c.getPeso()+"/"+c.isActivo());
	}

}
