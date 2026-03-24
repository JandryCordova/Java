package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi","9616516",10);
		Telefono telf2 = new Telefono("claro","8945616",20);
		Telefono telf3 = new Telefono("claro","7655515",30);
		Telefono telf4 = new Telefono("claro","3568845",40);
		AdminTelefono adm = new AdminTelefono();
		int contador=adm.contarClaro(telf1, telf2, telf3, telf4);
		
		System.out.println(contador+" son las operadoras de claro");

	}

}
