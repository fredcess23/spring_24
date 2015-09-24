package com.mitocode.spring23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Mundo;
import com.mitocode.beans.Mundo2;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundo"); //factory design
		//Mundo ma = appContext.getBean(Mundo.class);
		System.out.println(m.getSaludo());
		
		//Anotations !
		
		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
		Mundo2 m2 = (Mundo2)appContext2.getBean("marte"); //factory design , any bean in any appConfig class
		System.out.println(m2.getSaludo());
		
		
		AnnotationConfigApplicationContext appContext3 = new AnnotationConfigApplicationContext();
		appContext3.register(AppConfig.class);
		appContext3.register(AppConfig2.class);
		appContext3.refresh();
		Mundo2 m3 = (Mundo2)appContext3.getBean("marte"); //factory design , any bean in any appConfig class
		System.out.println(m3.getSaludo());
		
		
	}

}
