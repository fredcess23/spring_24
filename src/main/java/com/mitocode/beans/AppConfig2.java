package com.mitocode.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

	@Bean
	public Mundo2 marte(){
		return new Mundo2();
	}
}
