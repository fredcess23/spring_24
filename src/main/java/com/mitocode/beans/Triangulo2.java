package com.mitocode.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangulo2 implements InitializingBean, DisposableBean{

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
	public void afterPropertiesSet() throws Exception {

		System.out.println("Inicializando bean implementando InitializingBean class");
	}
	public void destroy() throws Exception {

		System.out.println("Destruyendo bean implementando DisposableBean class");

	}
	
	
	
}
