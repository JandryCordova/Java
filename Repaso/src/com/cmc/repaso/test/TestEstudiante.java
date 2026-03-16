package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Jandry");
		Estudiante estudiante2 = new Estudiante("Emily");
		
		 estudiante1.calificar(10);
		 estudiante1.mostrarInfo();
		 
		 estudiante2.calificar(5.5);
		 estudiante2.mostrarInfo();
		
		
		

	}

}
