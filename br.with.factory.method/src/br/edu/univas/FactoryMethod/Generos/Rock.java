package br.edu.univas.FactoryMethod.Generos;

import br.edu.univas.FactoryMethod.Genero;

public class Rock implements Genero{

	@Override
	public void getDescription() {
		System.out.println("Metalica, Iron maiden, ACDC");
	}

}
