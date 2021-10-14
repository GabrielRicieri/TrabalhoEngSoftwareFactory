package br.without.factory;

import java.util.Scanner;

public class StartApp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n********Generos Musicais*********");
			System.out.println("\nEscolha um Genero Musical: ");
			System.out.println("1 - Sertanejo");
			System.out.println("2 - Funk");
			System.out.println("3 - Pagode");
			System.out.println("4 - Rock");
			System.out.println("5 - Pop");
			System.out.println("0 - Para sair");
			
			opcao = scanner.nextInt();
			
			
			
			
				
				
				while(opcao < 0 || opcao > 4) {
					System.out.println("Digite um numero para listar os respectivos cantores de cada genero");
					opcao = scanner.nextInt();
				}
				
				switch(opcao) {
				
					case 1:
						System.out.println("Gustavo Lima, Luan Santana, Jorge e Matheus");
						break;
				
					case 2:
						System.out.println("MC Poze, MC Guime, MC Catra");
						
						break;
					
					case 3:
						System.out.println("Grupo mais é menos, Tiaguinho, Pericles");
						break;
					
					case 4:
						System.out.println("Metalica, Iron maiden, ACDC");

						break;
					case 5:
						System.out.println("Brunos Mars, Draken, The Wekend");

						break;
				
			    }
		
		 } while(opcao != 0);
		System.out.println("\n Generos Listados*");
		scanner.close();
	}
}
