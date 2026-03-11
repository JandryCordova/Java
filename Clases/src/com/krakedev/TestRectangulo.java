package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		r1.base=10;
		r1.altura=5;
		
		r2.base=6;
		r2.altura=2;
		
		int AreaR1=r1.calcularArea();
		int AreaR2=r2.calcularArea();
		
		System.out.println("El Area del Rectangulo 1 es: "+AreaR1);
		System.out.println("El area del rectangulo 2 es: "+AreaR2);

	}

}
