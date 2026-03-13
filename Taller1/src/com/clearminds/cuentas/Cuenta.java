package com.clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double precio;
	
	public Cuenta (String id) {
		this.id=id;
		this.tipo="A";
	}
	
	public Cuenta (String id, String tipo, double precio) {
		this.id=id;
		this.tipo=tipo;
		this.precio=precio;
	}
	
	public void ImprimirConMiEstilo () {
		System.out.println("********************************");
		System.out.println("CUENTA");
		System.out.println("********************************");
		System.out.println("Numero de Cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD "+precio);
		System.out.println("********************************");
	}
	
	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
