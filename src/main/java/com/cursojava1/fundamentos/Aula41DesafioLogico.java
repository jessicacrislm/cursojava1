package com.cursojava1.fundamentos;

import java.util.Scanner;

public class Aula41DesafioLogico {

	public static void main(String[] args) {

		// trabalho terça (v ou f)
		// trabalho terça (v ou f)
		// v v -> comprar tv 50
		// v f ou f v -> comprar tv 32
		// f f -> ficar em casa
		// compra tv 50 ou compra tv 23 -> tomar sorvete
		System.out.println("Trabalhou terça? 1 - Sim, 2 - Não");
		Scanner entrada = new Scanner(System.in);
		boolean trabalhoTerca = String.valueOf(entrada.next()).equals("1");
		
		System.out.println("Trabalhou quinta? 1 - Sim, 2 - Não");
		boolean trabalhoQuinta = String.valueOf(entrada.next()).equals("1");
		
		entrada.close();
		
		boolean comprarTv50 = trabalhoTerca && trabalhoQuinta;
		boolean comprarTv32 = trabalhoTerca || trabalhoQuinta;
		
		if (comprarTv50) {
			System.out.println("A família comprará uma tv 50 polegadas e tomará um sorvete.");
		} else if (comprarTv32) {
			System.out.println("A família comprará uma tv 30 polegadas e tomará um sorvete.");
		} else {
			System.out.println("A família ficará em casa sem tv e sem sorvete");
		}
	}

}
