package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu=new Calculadora();
		int ResultadoSuma=calcu.sumar(5, 8);
		double ResultadoResta=calcu.resta(100, 56);
		System.out.println("Resultado Suma: "+ResultadoSuma);
		System.out.println("Resultado Resta: "+ResultadoResta);
	}

}
