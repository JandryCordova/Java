package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(2000,12,25);
		
		System.out.println(fecha1.getAnio()+"/"+fecha1.getMes()+"/"+fecha1.getDia());
		
		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(30);
		
		System.out.println(fecha1.getAnio());
		System.out.println(fecha1.getMes());
		System.out.println(fecha1.getDia());
		System.out.println(fecha1.getAnio()+"/"+fecha1.getMes()+"/"+fecha1.getDia());

	}

}
