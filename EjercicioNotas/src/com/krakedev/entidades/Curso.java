package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiante;

	public ArrayList<Estudiante> getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(ArrayList<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}
	
	public String buscarEstudiantePorCedula( Estudiante Alumno) {
		if ( Alumno == null || Alumno.getCedula() == null) {
			return null;
		}
		for ( Estudiante encontrado : estudiante) {
			if (encontrado.getCedula().equals(Alumno.getCedula())) {
				System.out.println("Estudiante ya esta inscrito");
			}
		}
		return null;
	}
	
	public void matricularEstudiante(Estudiante alumno) {
		String estuEncontrado= buscarEstudiantePorCedula(alumno);
		if (estuEncontrado == null) {
			estudiante.add(alumno);
			System.out.println("Estudiante Matriculado con exito");
		}else {
			System.out.println(estuEncontrado);
		}
	}
	
	public Double calcularPromedioCurso() {
		double totalPromedioCurso = 0;
		int contador = 0;
		for ( Estudiante promedios : estudiante) {
			Double promedioRecuperado = promedios.calcularPromedioNotasEstudiante();
			if ( promedioRecuperado != null) {
				totalPromedioCurso += promedioRecuperado;
				contador +=1;
			}
		}
		return totalPromedioCurso / contador;
	}
	
	public void mostrar() {
	    System.out.println("===== Información del Curso =====");
	    System.out.println("Número de estudiantes: " + estudiante.size());
	    System.out.println("Listado de estudiantes:");

	    for (Estudiante e : estudiante) {
	        System.out.println(" - " + e.getNombre() + " | Cédula: " + e.getCedula() 
	                           + " | Promedio: " + e.calcularPromedioNotasEstudiante());
	    }
	}
}
