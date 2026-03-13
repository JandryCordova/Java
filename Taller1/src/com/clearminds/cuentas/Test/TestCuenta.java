package com.clearminds.cuentas.Test;

import com.clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("03476");
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		Cuenta cuenta3 = new Cuenta("03476");
		Cuenta cuenta4 = new Cuenta("0987");
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		Cuenta cuenta6 = new Cuenta("0666");
		
		cuenta1.setPrecio(675);
		cuenta3.setTipo("C");
		
		System.out.println("*******VALORES INICIALES******");
		
		System.out.println(cuenta1.getId());
		System.out.println(cuenta1.getTipo());
		System.out.println(cuenta1.getPrecio());
		
		System.out.println("******************************");
		
		System.out.println(cuenta2.getId());
		System.out.println(cuenta2.getTipo());
		System.out.println(cuenta2.getPrecio());
		
		System.out.println("******************************");
		
		System.out.println(cuenta3.getId());
		System.out.println(cuenta3.getTipo());
		System.out.println(cuenta3.getPrecio());
		
		System.out.println("******VALORES MODIFICADO******");
		
		cuenta1.setPrecio(444);
		cuenta3.setPrecio(567);
		cuenta2.setTipo("D");
		
		System.out.println(cuenta1.getId());
		System.out.println(cuenta1.getTipo());
		System.out.println(cuenta1.getPrecio());
		
		System.out.println("******************************");
		
		System.out.println(cuenta2.getId());
		System.out.println(cuenta2.getTipo());
		System.out.println(cuenta2.getPrecio());
		
		System.out.println("******************************");
		
		System.out.println(cuenta3.getId());
		System.out.println(cuenta3.getTipo());
		System.out.println(cuenta3.getPrecio());
		
		System.out.println("*********CUARTA CUENTA********");
		
		cuenta4.setPrecio(10);
		
		cuenta4.ImprimirConMiEstilo();
		
		System.out.println("*********QUINTA CUENTA********");
		
		cuenta5.ImprimirConMiEstilo();
		
		System.out.println("*********SEXTA CUENTA*********");
		
		cuenta6.ImprimirConMiEstilo();
		
		
	}

}
