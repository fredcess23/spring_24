package com.mitocode.spring23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mitocode.beans.IEquipo;
import com.mitocode.beans.Jugador;
import com.mitocode.beans.Jugador2;


public class App4 {

	
	public static void main(String[] args) {
	
	
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		Jugador j = (Jugador) appContext.getBean("messi"); //factory design
		System.out.println("Interfaces !");
		
		System.out.println(j.getNumero() + j.getNombre() + j.getEquipo().mostrar());

		
		IEquipo eq = (IEquipo) appContext.getBean("barcelona");
		System.out.println(eq.mostrar());
		eq = (IEquipo) appContext.getBean("manchester"); //Just change the bean instead of the java class,  
															// use of interfaces !
		System.out.println(eq.mostrar());

		
		//STEREOTYPES
		System.out.println("STEREOTYPES !");

		//Jugador2 j2 = (Jugador2) appContext.getBean("jugador2"); //default bean name
		Jugador2 j2 = (Jugador2) appContext.getBean("neymar"); // bean name using @component

		System.out.println(j2.getNumero() + j2.getNombre() + j2.getEquipo().mostrar());

		

		
	}

		
}
