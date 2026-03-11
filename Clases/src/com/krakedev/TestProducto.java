package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre="Licuadora";
		productoA.descripcion="Las mas baratas del Pais";
		productoA.precio=25.55;
		productoA.stockActual=199;
		
		productoB.nombre="Focos";
		productoB.descripcion="Luz amarilla y blanca";
		productoB.precio=1.55;
		productoB.stockActual=299;
		
		productoC.nombre="Mouse";
		productoC.descripcion="De todos los colores";
		productoC.precio=2.55;
		productoC.stockActual=599;
		
		System.out.println("Nombre: "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("Stock Actual: "+productoA.stockActual);
		System.out.println("-------------------------------------");
		System.out.println("Nombre: "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("Stock Actual: "+productoB.stockActual);
		System.out.println("-------------------------------------");
		System.out.println("Nombre: "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Precio: "+productoC.precio);
		System.out.println("Stock Actual: "+productoC.stockActual);
		

	}

}
