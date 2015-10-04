package com.mitocode.beans;


public class Triangulo3 {

	Punto puntoA;
	Punto puntoB;
	Punto puntoC;
	
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
	public void miInicializacion() {

		System.out.println("Inicializando mi bean...");
	}
	public void miDestruccion()  {

		System.out.println("Destruyendo mi bean...");

	}
	
	
	
}
