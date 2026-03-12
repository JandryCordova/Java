package com.krakedev;

public class Cuadrado {
	public int lado;
	
	public double calcularArea() {
		double Area = lado*lado;
		return Area;
	}
	
	public double calcularPerimetro() {
		double Perimetro = lado*4;
		return Perimetro;
	}
}
