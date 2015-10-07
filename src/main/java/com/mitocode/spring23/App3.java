package com.mitocode.spring23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Calle;
import com.mitocode.beans.Circulo;
import com.mitocode.beans.Cuadrado;
import com.mitocode.beans.Mundo;
import com.mitocode.beans.Persona;
import com.mitocode.beans.Persona2;
import com.mitocode.beans.Punto;
import com.mitocode.beans.Triangulo;
import com.mitocode.beans.Triangulo2;
import com.mitocode.beans.Triangulo3;
import com.mitocode.beans.Triangulo4;

public class App3 {

	
	public static void main(String[] args) {
	
	
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		Triangulo p = (Triangulo) appContext.getBean("triangulo1"); //factory design
		System.out.println("Herencia de BEANS");
		System.out.println(p.getPuntoA().getX() + " " + p.getPuntoA().getY() + " " + p.getPuntoC().getY() );


		Cuadrado c = (Cuadrado) appContext.getBean("cuadrado1"); //factory design
		System.out.println("Herencia de BEANS ejemplo 2");
		
		for(Punto punto : c.getPuntos()){
			System.out.println(punto.getX() + " - " + punto.getY());
		}
		
		//Accediendo al application Context atraves de la implementacion
		Circulo circulo = (Circulo) appContext.getBean("circulo"); //factory design
		System.out.println("Accediendo al application Context atraves de la implementacion");
		circulo.dibujar();
		
		//sigleton - crea misma instancia
		//prototype crea instancias diferentes
		//por defecto es singleton
		// singleton : se inicializan los beans con la carga del xml
		//prototype: hacemos las instancias a medida que solicitamos por el metodo get
		
		Persona2 personaScope1 = (Persona2) appContext.getBean("personaScope"); //factory design
		Persona2 personaScope2 = (Persona2) appContext.getBean("personaScope"); //factory design

		System.out.println("BEAN SCOPE --> Diferencias entre Singleton y Prototype");
		System.out.println(personaScope1);
		System.out.println(personaScope2);

		//Callbacks al ciclo de vida
		AbstractApplicationContext appContext3 = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		appContext3.registerShutdownHook(); //destruir todos los beans necesarios, se usa en app de escritorio, en web es auto
		
		Triangulo2 triangulo2 = (Triangulo2) appContext3.getBean("triangulo2"); //factory design
		Triangulo3 triangulo3 = (Triangulo3) appContext.getBean("triangulo3"); //factory design
		Triangulo4 triangulo4 = (Triangulo4) appContext.getBean("triangulo4"); //factory design

		
	}

		
}
