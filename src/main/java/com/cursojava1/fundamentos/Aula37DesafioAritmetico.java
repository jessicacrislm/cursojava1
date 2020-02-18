package com.cursojava1.fundamentos;

public class Aula37DesafioAritmetico {

	
	public static void main(String[] args) {
		
		double numA = Math.pow(6.0 * (3 + 2), 2);
		double denA = 3.0 * 2;
		
		double numB = (1.0 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superiorParcial = superiorA - superiorB;
		double superior = Math.pow(superiorParcial, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
	}
	
}
