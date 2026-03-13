package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(5,6);
		Rectangulo r2 = new Rectangulo(10,2);
		
		System.out.println("Base: "+r1.getBase()+" y Alttura: "+r1.getAltura());
		System.out.println("Base: "+r2.getBase()+" y Alttura: "+r2.getAltura());
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(5);
		r2.setAltura(2);
		
		int AreaR1=r1.calcularArea();
		int AreaR2=r2.calcularArea();
		double PerimetroR1=r1.calcularPerimetro();
		double PerimetroR2=r2.calcularPerimetro();
		
		System.out.println("El Area del Rectangulo 1 es: "+AreaR1);
		System.out.println("El area del rectangulo 2 es: "+AreaR2);
		System.out.println("El perimetro del rectangulo 1 es: "+PerimetroR1);
		System.out.println("El perimetro del rectangulo 1 es: "+PerimetroR2);

	}

}
