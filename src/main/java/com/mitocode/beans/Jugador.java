package com.mitocode.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Jugador {
	
	private String numero;
	private String nombre;
	
	@Autowired //La anotacion puede ser sobre la propiedad o sobre el metodo set
	@Qualifier("barcelonaQualifier")
	private IEquipo equipo;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	
	@Required //La anotacion es sobre el metodo set
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	
	
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

}
