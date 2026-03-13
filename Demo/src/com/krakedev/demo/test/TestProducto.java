package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(632946,"Lavadora");
		
		producto1.setDescripcion("Es color blanca");
		producto1.setPeso(125.35);
		
		System.out.println("El codigo es: "+producto1.getCodigo());
		System.out.println("El nombre es: "+producto1.getNombre());
		System.out.println("La descripcion es: "+producto1.getDescripcion());
		System.out.println("El peso es: "+producto1.getPeso());

	}

}
