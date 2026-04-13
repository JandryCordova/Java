package com.universidad.usuarios;

public class Estudiante {
	private String nombre;
	private String matricula;
	private String carrera;
	private int semestre;
	
	public Estudiante(String nombre, String matricula, String carrera, int semestre) {
		this.nombre=nombre;
		this.matricula=matricula;
		this.carrera=carrera;
		this.semestre=semestre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre( String nombre) {
		this.nombre=nombre;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public void presentar(String nombre, String carrera, int semestre) {
		System.out.println("Hola, Soy "+nombre+", estudiante de "+carrera+" en el semestre "+semestre);
	}
	
	public void estudiar(String nombre, String matricula) {
		System.out.println("El estudiante "+nombre+" (Matricula: "+matricula+") esta estudiando para sus examenes");
	}
	

}
