package com.universidad.infraestructura;

public class Laboratorio {
	private String nombreLab;
	private int capacidad;
	private boolean equiposEncendidos;
	
	public Laboratorio(String nombreLab, int capacidad) {
		this.nombreLab=nombreLab;
		this.capacidad=capacidad;
		equiposEncendidos=false;
	}
	public String getNombreLab() {
		return nombreLab;
	}
	public void setNombreLab(String nombreLab) {
		this.nombreLab = nombreLab;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isEquiposEncendidos() {
		return equiposEncendidos;
	}
	public void setEquiposEncendidos(boolean equiposEncendidos) {
		this.equiposEncendidos = equiposEncendidos;
	}
	
	public void abrirLaboratorio(String nombreLab) {
		equiposEncendidos=true;
		System.out.println("El laboratorio "+nombreLab+" ha sido abierto. ¿Equipos Encendidos? "+equiposEncendidos);
	}
	
	
}
