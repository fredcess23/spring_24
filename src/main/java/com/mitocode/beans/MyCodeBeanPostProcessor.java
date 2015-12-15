package com.mitocode.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCodeBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Antes de la inicializacion " + beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Despues de la inicializacion " + beanName);
		return bean;
	}

}
