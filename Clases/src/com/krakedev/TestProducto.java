package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("Licudora");
		productoA.setDescripcion("Las mas baratas del Pais");
		productoA.setPrecio(25.55);
		productoA.setStockActual(199);
		
		productoB.setNombre("Focos");
		productoB.setDescripcion("Luz amarilla y blanca");
		productoB.setPrecio(1.55);
		productoB.setStockActual(299);
		
		productoC.setNombre("Mouse");
		productoC.setDescripcion("De todos los colores");
		productoC.setPrecio(2.55);
		productoC.setStockActual(599);
		
		System.out.println("Nombre: "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: "+productoA.getPrecio());
		System.out.println("Stock Actual: "+productoA.getStockActual());
		System.out.println("-------------------------------------");
		System.out.println("Nombre: "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: "+productoB.getPrecio());
		System.out.println("Stock Actual: "+productoB.getStockActual());
		System.out.println("-------------------------------------");
		System.out.println("Nombre: "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: "+productoC.getPrecio());
		System.out.println("Stock Actual: "+productoC.getStockActual());
	}

}
