package ReinoAnimal.Teste;

import ReinoAnimal.AnimalImpl;
import ReinoAnimal.Classe.Mamifero;
import ReinoAnimal.Especie.Viviparo;
import ReinoAnimal.Familia.Canideos;
import ReinoAnimal.Genero.Terrestre;
import ReinoAnimal.Ordem.Carnivora;

public class Lobo extends AnimalImpl implements Mamifero, Carnivora, Canideos, Terrestre, Viviparo {

	@Override
	public void parir() {
		System.out.println("pari: sim");
		
	}

	@Override
	public void andar() {
		System.out.println("anda: sim");
		
	}

	@Override
	public void uivar() {
		System.out.println("Uiva: sim");
		
	}

	@Override
	public void comerCarne() {
		System.out.println("Comer Carne: sim");
		
	}

	@Override
	public void mamar() {
		System.out.println("mama: sim");
		
	}
	
	@Override
	public void inprimir () {
		System.out.println("Lobo da Clase Mamifero");
		Lobo.this.mamar();
		System.out.println("Lobo do Genero Terrestre");
		Lobo.this.andar();
		System.out.println("Lobo da Ordem Carnivora");
		Lobo.this.comerCarne();
		System.out.println("Lobo da Familia Canideos");
		Lobo.this.uivar();
		System.out.println("Lobo da Especie Viviparo");
		Lobo.this.parir();
		
	}

}
