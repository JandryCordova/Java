package com.clinicaveterinaria;

public class Mascota {
	private String nombre;
	private String especie;
	private String raza;
	private int edad;
	private double peso;
	
	public Mascota(String nombre, String especie, String raza, int edad, double peso) {
		setNombre(nombre);
		setEspecie(especie);
		setRaza(raza);
		setEdad(edad);
		setPeso(peso);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = (nombre == null || nombre.trim().isEmpty())
				? "Sin nombre": nombre.trim();
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = (especie == null || especie.trim().isEmpty())
				? "Desconocida" : especie.trim();
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = (raza == null || raza.trim().isEmpty())
				? "Mestizo" : raza.trim();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad<0) {
			this.edad=0;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso<=0) {
			this.peso=0.1;
		}
	}
	
	public boolean esAdulto() {
		return edad >=3;
	}
	
	public boolean estaEnPesoNormal(double pesoMin, double pesoMax) {
		return peso >= pesoMin && peso <= pesoMax;
	}
	
	public String toString() {
        return "Mascota: " + nombre + " | Especie: " + especie +
               " | Raza: " + raza + " | Edad: " + edad +
               " años | Peso: " + peso + " kg";
    }
}
