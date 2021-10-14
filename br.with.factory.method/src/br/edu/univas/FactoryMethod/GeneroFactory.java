package br.edu.univas.FactoryMethod;

import br.edu.univas.FactoryMethod.Generos.Funk;
import br.edu.univas.FactoryMethod.Generos.Pagode;
import br.edu.univas.FactoryMethod.Generos.Pop;
import br.edu.univas.FactoryMethod.Generos.Rock;
import br.edu.univas.FactoryMethod.Generos.Sertanejo;

public class GeneroFactory {

	public static Genero ListGenero(int genero) {
		
		if(genero == 1) {
			return new Sertanejo();
		} else if(genero == 2) {
			return new Funk();
		} else if(genero == 3) {
			return new Pagode();
		} else if(genero == 4) {
				return new Rock();
		} else if(genero == 5) {
			return new Pop();
		}else {
			return null;
		}
		
	}
}
