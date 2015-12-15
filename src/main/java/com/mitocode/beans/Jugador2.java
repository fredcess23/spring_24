package com.mitocode.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
The use and behavior is the same

	@Component  -> Generic bean
	@Repository -> By Good practice, DAO 
	@Controller ->  Controller layer
	@Service    -> Service Layer

Just to point out the layers (Good practices)

Jugador2 is the default id of the bean
However we can define a name by using : @Component("neymar")
Every @component is a bean
*/

@Component("neymar")
public class Jugador2 {
	
	@Value("11")
	private String numero;
	@Value("Neymar *")
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
