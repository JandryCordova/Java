package com.krakedev;

public class Rectangulo {
	private int base;
	private int altura;
	
	public int getBase() {
		return base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setBase(int base) {
		this.base =  base;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularArea() {
		int area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double Perimetro = (base * 2)+(altura*2);
		return Perimetro;
	}
}
