package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telefono1 = new Telefono("movi","999999999",593);
		
		System.out.println(telefono1.getOperadora()+"/+"+telefono1.getCodigo()+" "+telefono1.getNumero()+"/"+telefono1.isTieneWhatsapp());

	}

}
