package ReinoAnimal.Teste;

import ReinoAnimal.AnimalImpl;
import ReinoAnimal.Classe.Mamifero;
import ReinoAnimal.Especie.Viviparo;
import ReinoAnimal.Familia.Delphinidae;
import ReinoAnimal.Genero.Aquaticos;
import ReinoAnimal.Ordem.Carnivora;

public class Baleia extends AnimalImpl implements Mamifero, Carnivora, Aquaticos, Delphinidae, Viviparo{

	@Override
	public void parir() {
		System.out.println("Pari: sim");
		
	}

	@Override
	public void acrobacia() {
		System.out.println("Sobe para a superfície para respirar: sim");
		
	}

	@Override
	public void nada() {
		System.out.println("Nada: sim");
		
	}

	@Override
	public void comerCarne() {
		System.out.println("Come carne: sim");
		
	}

	@Override
	public void mamar() {
		System.out.println("mama: sim");
		
	}
	

	@Override
	public void inprimir () {
		System.out.println("Baleia da Clase Mamifero");
		Baleia.this.mamar();
		System.out.println("Baleia do Genero Aquatico");
		Baleia.this.nada();
		System.out.println("Baleia da Ordem Carnivora");
		Baleia.this.comerCarne();
		System.out.println("Baleia da Familia Delphinidae");
		Baleia.this.acrobacia();
		System.out.println("Baleia da Especie Viviparo");
		Baleia.this.parir();
		
	}


}
