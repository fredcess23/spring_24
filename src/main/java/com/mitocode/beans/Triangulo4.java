package com.mitocode.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Triangulo4 {

	Punto puntoA;
	Punto puntoB;
	Punto puntoC;

	@PostConstruct
	public void miInicializacion() {
		System.out.println("Inicializando bean usando @PostConstruct...");
	}

	@PreDestroy
	public void miDestruccion()  {
		System.out.println("Destruyendo bean usando @PreDestroy...");
	}	
	
	public Punto getPuntoC() {
		return puntoC;
	}
	public void setPuntoC(Punto puntoC) {
		this.puntoC = puntoC;
	}
	public Punto getPuntoA() {
		return puntoA;
	}
	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}
	public Punto getPuntoB() {
		return puntoB;
	}
	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}
	
	
}
