package com.cmc.repaso.entidades;

public class Item {
	public String nombre;
	public int productosActuales;
	public int productosDevueltos;
	public int productosVendidos;
	
	public void imprimir () {
		System.out.println("Productos Actuales: "+productosActuales);
		System.out.println("Prodcutos Devueltos: "+productosDevueltos);
		System.out.println("Productos Vendidos: "+productosVendidos);
	}
	
	public void Vender(int productosVendidos) {
		this.productosActuales -= productosVendidos;
		this.productosVendidos += productosVendidos;
	}
	
	public void Devolver(int productosVendidos) {
		this.productosActuales += productosVendidos;
		this.productosVendidos -= productosVendidos;
		this.productosDevueltos += productosVendidos;
	}
}
