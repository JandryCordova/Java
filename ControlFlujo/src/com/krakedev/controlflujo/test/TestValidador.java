package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador = new Validador();
		
		validador.validarEdad(0);
		validador.validarEdad(5);
		validador.validarEdad(12);
		validador.validarEdad(35);

	}

}
