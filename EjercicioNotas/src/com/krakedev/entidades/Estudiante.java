package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre( String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public void agregarNota( Nota nota) {
		if ( nota != null && nota.getCalificacion()>=0 && nota.getCalificacion() <=10) {
			boolean existe = false;
			for ( int a=0;a<notas.size();a++) {
				Nota notaRecuperada = notas.get(a);
				if (notaRecuperada.getMateria().equals(nota.getMateria())) {
					existe = true;
					break;
				}
			}
			if (!existe) {
				notas.add(nota);
			}
		}
	}
	
	public void modificarNota ( String codigo, Double nuevaNota) {
		if (codigo == null) {
			System.out.println("Codigo no existe");
			return;
		}
		if ( nuevaNota != null && nuevaNota >=0 && nuevaNota<=10 ) {
			boolean existe = false;
			for ( int a=0;a<notas.size();a++) {
				Nota valorRecuperado = notas.get(a);
				if (valorRecuperado.getMateria().equals(codigo)) {
					valorRecuperado.setCalificacion(nuevaNota);
					existe = true;
					break;
				}
			}
			if  ( !existe) {
				System.out.println("No se encontro la Materia  con el codigo: "+codigo);
			}
		}else {
			System.out.println("La nueva nota debe de estar entre 0 y 10");
		}
	}
	
	public Double calcularPromedioNotasEstudiante() {
		double totalCalificaciones=0.0;
		for ( int a=0;a<notas.size();a++) {
			Nota valorRecuperado = notas.get(a);
			double notaRecuperada = valorRecuperado.getCalificacion();
			totalCalificaciones += notaRecuperada;
		}
		double promedio = totalCalificaciones/notas.size();
		return promedio;
	}
	
	public void mostrar() {
		
		for (Nota valorRecuperado : notas) {
			int posicion = notas.size()+1;
			System.out.println(posicion+"| Tiene: "+valorRecuperado.getCalificacion()+" en "+valorRecuperado.getMateria());
		}
	}
}
