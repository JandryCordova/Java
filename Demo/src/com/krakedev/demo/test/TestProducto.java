package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(1234,"Licuadora");
		
		producto1.setDescripcion("Es color blanco");
		producto1.setPeso(35.25);
		
		System.out.println("El Codigo es: "+producto1.getCodigo());
		System.out.println("El nombre es: "+producto1.getNombre());
		System.out.println("La descripcion es: "+producto1.getDescripcion());
		System.out.println("El peso es: "+producto1.getPeso());

	}

}
