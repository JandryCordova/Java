package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.marca="Toyota";
		auto1.anio=2024;
		auto1.precio=14.899;
		
		auto2.marca="Kia";
		auto2.anio=2025;
		auto2.precio=17.999;
		
		System.out.println("Marca: "+auto1.marca);
		System.out.println("Anio: "+auto1.anio);
		System.out.println("Precio: "+auto1.precio);
		System.out.println("-------------------------");
		System.out.println("Marca: "+auto2.marca);
		System.out.println("Anio: "+auto2.anio);
		System.out.println("Precio: "+auto2.precio);

	}

}
