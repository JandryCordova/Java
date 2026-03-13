package com.krakedev.Test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu=new Calculadora();
		int ResultadoSuma=calcu.sumar(5, 8);
		double ResultadoResta=calcu.resta(100, 56);
		double ResultadoMultiplicar=calcu.multiplicar(10, 9);
		double ResultadoDividir=calcu.dividir(100, 2);
		double ResultadoPromedio=calcu.promedio(9, 8, 7);
		
		System.out.println("Resultado Suma: "+ResultadoSuma);
		System.out.println("Resultado Resta: "+ResultadoResta);
		System.out.println("Resultado Multiplicacion: "+ResultadoMultiplicar);
		System.out.println("Resultado Division: "+ResultadoDividir);
		System.out.println("Resultado Promedio: "+ResultadoPromedio);
		calcu.mostrarResultado();
	}

}
