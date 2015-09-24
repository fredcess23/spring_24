package com.mitocode.spring23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Calle;
import com.mitocode.beans.Mundo;
import com.mitocode.beans.Persona;
import com.mitocode.beans.Persona2;

public class App2 {

	
	public static void main(String[] args) {
	
		//Entry point to test Persona.class
		
		// (inyeccion por constructor)
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		Persona p = (Persona) appContext.getBean("personaBean"); //factory design
		//Mundo ma = appContext.getBean(Mundo.class);
		System.out.println(p.getId() + " " + p.getNombre() + " " + p.getApodo() );

		
		// (inyeccion de objetos)
		ApplicationContext appContext2 = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		Persona2 p2 = (Persona2) appContext2.getBean("personaAlias"); //factory design
		
		String strCalles = "";
		for(Calle calle:p2.getPais().getCiudad().getCalles()){
			strCalles += calle.getNombre() + "-";
		}
		
		
		System.out.println(p2.getId() + " " + p2.getNombre() + " " + p2.getApodo() + " " + p2.getPais().getNombre() + " " +
				 p2.getPais().getCiudad().getNombre() + " " + p2.getPais().getCiudad().getColonia().getNombre() + " " +strCalles);

		
		System.out.println("---------------------------------");
		Persona2 p2auto = (Persona2) appContext.getBean("persona2PorAuto"); //factory design
		System.out.println(p2auto.getId() + " " + p2auto.getNombre() + " " + p2auto.getApodo() );

		
	}

		
}
