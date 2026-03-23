package com.krakedev.composicion;

public class AdminProducto {
	 public Producto buscarMayor(Producto p1, Producto p2) {
		 if (p1.getPrecio()>p2.getPrecio()) {
			 return p1;
		 }else if (p1.getPrecio()<p2.getPrecio()) {
			 return p2;
		 }else {
			 return null;
		 }
	 }
}
