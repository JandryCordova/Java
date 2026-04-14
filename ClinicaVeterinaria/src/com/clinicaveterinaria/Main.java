package com.clinicaveterinaria;

public class Main {

	public static void main(String[] args) {
		Mascota masco1 = new Mascota("Taylor","Macho","Golden",6,25.5);
		masco1.toString();
		masco1.esAdulto();
		masco1.estaEnPesoNormal(10.2, 50.6);

	}

}
