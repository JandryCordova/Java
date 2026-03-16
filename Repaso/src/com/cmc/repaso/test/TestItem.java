package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item();
		
		item1.nombre="Jabon";
		item1.productosActuales=300;
		
		item1.imprimir();
		System.out.println("********************************");
		item1.Vender(30);
		
		item1.imprimir();
		System.out.println("********************************");
		item1.Devolver(15);
		
		item1.imprimir();
		
		

	}

}
