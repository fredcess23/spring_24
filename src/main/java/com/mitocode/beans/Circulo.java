package com.mitocode.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//Accediendo al applicatioContext a traves de la implementacion --> ApplicationContextAware
//Para recuperar el nombre del bean -> BeanNameAware
public class Circulo implements ApplicationContextAware, BeanNameAware{

	ApplicationContext context = null;
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
	
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
	}

	public void dibujar(){
		Punto puntoA = (Punto) context.getBean("puntoA");
		Punto puntoB = (Punto) context.getBean("puntoB");
		Punto puntoC = (Punto) context.getBean("puntoC");
		
		System.out.println(puntoA.getX() + " - " + puntoA.getY());
		System.out.println(puntoB.getX() + " - " + puntoB.getY());
		System.out.println(puntoC.getX() + " - " + puntoC.getY());

	}
	public void setBeanName(String beanName) {
		System.out.println("--> El nombre del bean es: " + beanName);
	}
}
