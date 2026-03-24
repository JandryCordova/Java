package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi","9615561516",10);
		Telefono telf2 = new Telefono("claro","3654288685",20);
		Telefono telf3 = new Telefono("tuenti","8655115351",30);
		AdminTelefono Adm = new AdminTelefono();
		
		int Contador=Adm.contarMovi(telf1, telf2, telf3);
		System.out.println(Contador+" son los numeros con la operadora movi");

	}

}
