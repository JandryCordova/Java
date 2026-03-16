package com.cmc.repaso.entidades;

public class Estudiante {
	public String nombre;
	public double nota;
	public String resultado;
	
	public Estudiante(String nombre) {
		this.nombre=nombre;
	}
	
	public void calificar (double nota) {
		this.nota=nota;
		if (nota>0 && nota<8) {
			resultado="F";
		}else if(nota>=8 && nota<=10) {
			resultado="A";
		}else {
			System.out.println("Nota invalidad");
		}
		
	}
	
	public void mostrarInfo () {
		System.out.println("Nombre: "+nombre);
		System.out.println("Nota: "+nota);
		System.out.println("Resultado: "+resultado);
	}
}
