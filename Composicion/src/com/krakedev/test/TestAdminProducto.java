package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		AdminProducto admin = new AdminProducto();
		Producto productoA = new Producto("Barriletes",0.25);
		Producto productoB = new Producto("Galletas",0.50);
		Producto mc =admin.buscarMayor(productoA, productoB);
		if (mc == null) {
			System.out.println("Son Iguales");
		}else {
			System.out.println("El más caro es: "+mc.getNombre());
		}

	}

}
