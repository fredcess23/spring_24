package com.mitocode.beans;

/**
 * @author CeCruz
 *
 */
public class Persona {

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	
	public Persona(int id, String nombre, String apodo){
		this.id=id;
		this.nombre=nombre;
		this.apodo=apodo;
	}
	
	public Persona(int id){
		this.id=id;
	}
	
	public Persona(String apodo){
		this.apodo=apodo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
}
