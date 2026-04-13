package com.universidad.principal;

import com.universidad.infraestructura.Laboratorio;
import com.universidad.usuarios.Estudiante;

public class SistemaCampus {

	public static void main(String[] args) {
		Estudiante estu1 = new Estudiante("Juan Perez", "PEAH-6-7" , "Pedagogia", 6);
		Estudiante estu2 = new Estudiante("Pedro Narvaez", "CKAH-9-1" , "Cisco", 9);
		Laboratorio labo1 = new Laboratorio("Matematicas",600);
		labo1.mostrarInformacion();
		labo1.abrirLaboratorio();
		estu1.presentar();
		estu1.estudiar();
		estu2.presentar();

	}

}
