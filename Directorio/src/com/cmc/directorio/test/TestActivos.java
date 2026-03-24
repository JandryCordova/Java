package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telefono1 = new Telefono("claro","16815161561",52);
		Contacto contacto1 = new Contacto("Felipe","Sanchez",telefono1,152.36);
		AdminContactos admcon =  new AdminContactos();
		System.out.println(contacto1.getNombre()+" "+contacto1.getApellido()+" Tiene Whatsapp: "+contacto1.getTelefono().isTieneWhatsapp());
		admcon.activarUsuario(contacto1);
		System.out.println(contacto1.getNombre()+" "+contacto1.getApellido()+" "+contacto1.getPeso()+" "+contacto1.isActivo()+" "+
		contacto1.getTelefono().getOperadora()+" "+contacto1.getTelefono().getCodigo()+" "+contacto1.getTelefono().getNumero()+" "+
		contacto1.getTelefono().isTieneWhatsapp());
		
		telefono1.setTieneWhatsapp(true);
		admcon.activarUsuario(contacto1);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(contacto1.getNombre()+" "+contacto1.getApellido()+" "+contacto1.getPeso()+" "+contacto1.isActivo()+" "+
		contacto1.getTelefono().getOperadora()+" "+contacto1.getTelefono().getCodigo()+" "+contacto1.getTelefono().getNumero()+" "+
		contacto1.getTelefono().isTieneWhatsapp());
		
	}

}
