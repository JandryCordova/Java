package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Jandry Cordova", 15.65);
		
		System.out.println("Preducto: "+producto1.getNombre());
		System.out.println("Precio: "+producto1.getPrecio());
		
		producto1.setPrecio(5);
		
		System.out.println("Precio modificado: "+producto1.getPrecio());
		
		double Total= producto1.calcularPrecioPromo(-10);
		
		System.out.println("Valor total ya con descuento: "+Total);
		
		
		

	}

}
