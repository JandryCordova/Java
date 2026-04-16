package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	public Producto (String codigo, String nombre, double precio ) {
		setNombre(nombre);
		setPrecio(precio);
		setCodigo(codigo);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre( String nombre) {
		this.nombre=nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void incrementarPrecio(int porcentaje) {
		double resulPorce=(precio*porcentaje)/100;
		precio+=resulPorce;
	}
	
	public void disminuirPrecio( double descuento) {
		precio-=descuento;
	}

}
