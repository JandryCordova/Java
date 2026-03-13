package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion = new Validacion();
		
		validacion.validarMonto(23);
		validacion.validarMonto(-50);
		validacion.validarMonto(0);

	}

}
