package com.cursojava1.fundamentos;

import java.util.Scanner;

public class Aula32DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o salário do 1º funcionário");
		double strSalario1 = Double.parseDouble(entrada.next().replace(",", "."));
		
		System.out.println("Digite o salário do 2º funcionário");
		double strSalario2 = Double.parseDouble(entrada.next().replace(",", "."));
		
		System.out.println("Digite o salário do 3º funcionário");
		double strSalario3 = Double.parseDouble(entrada.next().replace(",", "."));
		
		double salarios = strSalario1 + strSalario2 + strSalario3;
		System.out.println(String.format("A média dos salários é %.2f", salarios / 3.0));
		
		entrada.close();
	}
	
}
