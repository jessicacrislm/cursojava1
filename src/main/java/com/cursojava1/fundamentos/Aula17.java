package com.cursojava1.fundamentos;

public class Aula17 {

	public static void main(String[] args) {
		final double FATOR = 5/9.0;
		final int AJUSTE = 32;
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(fahrenheit + "°F são equivalentes a " + celsius + "°C.");
		
	}

}
