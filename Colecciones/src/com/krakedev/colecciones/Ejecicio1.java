package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejecicio1 {

	public static void main(String[] args) {
		ArrayList<String> cadenas = new ArrayList<>();
		String valorRecuperado;
		//Size es para ver el tamaño de la cadena
		System.out.println("Tamaño de la cadena es: "+cadenas.size());
		//Agregamos valores a la cadena
		cadenas.add("Uno");
		cadenas.add("Dos");
		System.out.println("Tamaño de la cadena es: "+cadenas.size());
		
		valorRecuperado=cadenas.get(0);
		
		System.out.println(valorRecuperado);
		
		valorRecuperado=cadenas.get(1);
		
		System.out.println(valorRecuperado);
		
		String cadena;
		
		for(int a=0;a<cadenas.size();a++) {
			cadena=cadenas.get(a);
			System.out.println("Estan dentro del for: "+cadena);
		}
	}

}
