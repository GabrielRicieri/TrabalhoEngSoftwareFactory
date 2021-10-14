package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.FactoryMethod.Genero;
import br.edu.univas.FactoryMethod.GeneroFactory;

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
				
				
				
				
					
					
					while(opcao < 0 || opcao > 5) {
						System.out.println("Digite um numero para listar os respectivos cantores de cada genero");
						opcao = scanner.nextInt();
					}
					
					switch(opcao) {
					
						case 1:
							Genero Sertanejo = GeneroFactory.ListGenero(1);
							Sertanejo.getDescription();
							break;
					
						case 2:
							Genero Funk = GeneroFactory.ListGenero(2);
							Funk.getDescription();
							
							break;
						
						case 3:
							Genero Rock = GeneroFactory.ListGenero(3);
							Rock.getDescription();
							break;
						
						case 4:
							Genero Pagode = GeneroFactory.ListGenero(4);
							Pagode.getDescription();
							break;
						case 5:
							Genero Pop = GeneroFactory.ListGenero(5);
							Pop.getDescription();
							break;
					
				    }
			
			 } while(opcao != 0);
			System.out.println("\n Generos Listados*");
			scanner.close();
	}
}
