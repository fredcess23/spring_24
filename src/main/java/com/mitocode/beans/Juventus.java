package com.mitocode.beans;

import org.springframework.stereotype.Component;


@Component("Juventus")

public class Juventus implements IEquipo{

	public String mostrar() {
		return "Juventus";
	}

}
