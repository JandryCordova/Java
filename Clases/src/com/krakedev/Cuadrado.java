package com.krakedev;

public class Cuadrado {
	private int lado;
	
	public Cuadrado(int lado) {
		this.lado=lado;
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		double Area = lado*lado;
		return Area;
	}
	
	public double calcularPerimetro() {
		double Perimetro = lado*4;
		return Perimetro;
	}
}
