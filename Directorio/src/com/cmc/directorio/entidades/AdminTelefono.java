package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora()=="movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	public int contarMovi (Telefono telefono1, Telefono telefono2, Telefono telefono3) {
		int contador=0;
		if (telefono1.getOperadora()=="movi") {
			contador+=1;
			
		}
		if (telefono2.getOperadora()=="movi") {
			contador+=1;
		}
		if (telefono3.getOperadora()=="movi") {
			contador+=1;
		}
		
		return contador;
	}
	
	public int contarClaro (Telefono telefono1, Telefono telefono2, Telefono telefono3, Telefono telefono4) {
		int contador=0;
		if (telefono1.getOperadora()=="claro") {
			contador+=1;
		}
		if (telefono2.getOperadora()=="claro") {
			contador+=1;
		}
		if (telefono3.getOperadora()=="claro") {
			contador+=1;
		}
		if (telefono4.getOperadora()=="claro") {
			contador+=1;
		}
		return contador;
	}

}
