package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto(); 
		Auto auto2 = new Auto();
		
		auto1.setMarca("Toyota");
		auto1.setAnio(2024);
		auto1.setPrecio(14.899);
		
		auto2.setMarca("Kia");
		auto2.setAnio(2025);
		auto2.setPrecio(17.999);
		
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Anio: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		System.out.println("-------------------------");
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Anio: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());

	}

}
