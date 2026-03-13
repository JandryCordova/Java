package com.krakedev.Test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(5);
		Cuadrado c2 = new Cuadrado(10);
		Cuadrado c3 = new Cuadrado(15);
		
		System.out.println("El lado del cuadrado es: "+c1.getLado());
		System.out.println("El lado del cuadrado es: "+c2.getLado());
		System.out.println("El lado del cuadrado es: "+c3.getLado());
		
		c1.setLado(5);
		c2.setLado(10);
		c3.setLado(2);
		
		double AreaC1 = c1.calcularArea();
		double AreaC2 = c2.calcularArea();
		double AreaC3 = c3.calcularArea();
		
		double PerimetroC1 = c1.calcularPerimetro();
		double PerimetroC2 = c2.calcularPerimetro();
		double PerimetroC3 = c3.calcularPerimetro();
		
		System.out.println("El area del cuadrado C1 es: "+AreaC1);
		System.out.println("EL area del cuadrado C2 es: "+AreaC2);
		System.out.println("El area del cuadrado C3 es: "+AreaC3);
		System.out.println("El perimetro del cuadrado C1 es: "+PerimetroC1);
		System.out.println("El perimetro del cuadrado C2 es: "+PerimetroC2);
		System.out.println("El perimetro del cuadrado C3 es: "+PerimetroC3);
		

	}

}
