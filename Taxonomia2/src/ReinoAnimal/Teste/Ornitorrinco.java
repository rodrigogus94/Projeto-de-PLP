package ReinoAnimal.Teste;

import ReinoAnimal.AnimalImpl;
import ReinoAnimal.Classe.Mamifero;
import ReinoAnimal.Especie.Oviparo;
import ReinoAnimal.Familia.Ornithorhynchidae;
import ReinoAnimal.Genero.Aquaticos;
import ReinoAnimal.Ordem.Carnivora;

public class Ornitorrinco extends AnimalImpl implements Mamifero, Carnivora, Aquaticos, Ornithorhynchidae, Oviparo{

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
	public void oviparidade() {
		System.out.println("Põe ovos: sim");
		
	}
	
	@Override
	public void semiaquático() {
		System.out.println("Terrestre também: sim");
		
	}
	
	@Override
	public void inprimir () {
		System.out.println("Ornitorrinco da Clase Mamifero");
		Ornitorrinco.this.mamar();
		System.out.println("Ornitorrinco do Genero Aquaticos");
		Ornitorrinco.this.nada();
		System.out.println("Lobo da Ordem Carnivora");
		Ornitorrinco.this.comerCarne();
		System.out.println("Lobo da Familia Ornithorhynchidae");
		Ornitorrinco.this.semiaquático();
		System.out.println("Lobo da Especie Oviparo");
		Ornitorrinco.this.oviparidade();
		
	}

	

}
