package com.cursojava1.fundamentos;

import java.util.Scanner;

public class Aula50DesafioCalculadora {

	public static void main(String[] args) {
		
		System.out.println("============ Calculadora 1.0 ===========");
		// ler um numero
		System.out.println("Informe o primeiro número: ");
		Scanner entrada = new Scanner(System.in);
		double num1 = entrada.nextDouble();
		
		// ler segundo numero
		System.out.println("Informe o segundo número: ");
		double num2 = entrada.nextDouble();
		
		// ler o operador
		System.out.println("Escolha uma operação (+, -, /, *, %): ");
		String operador = entrada.next();
		
		entrada.close();
		
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("O resultado de %.2f %s %.2f é %.2f", num1, operador, num2, resultado);
		
	}

}
