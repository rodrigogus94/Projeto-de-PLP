package ReinoAnimal.Teste;


import ReinoAnimal.AnimalImpl;
import ReinoAnimal.Classe.Condrictions;
import ReinoAnimal.Especie.Ovoviviparos;
import ReinoAnimal.Familia.Lamnidae;
import ReinoAnimal.Genero.Aquaticos;
import ReinoAnimal.Ordem.Carnivora;

public class Tubarao extends AnimalImpl implements Condrictions, Carnivora, Aquaticos, Lamnidae, Ovoviviparos {

	@Override
	public void oviparidade() {
		System.out.println("Põe ovos: sim");
		
	}

	@Override
	public void parir() {
		System.out.println("pari: também");
		
	}

	@Override
	public void nascer() {
		System.out.println("Nasci: tanto de parto com de ovo depemde da espécie");
		
	}

	@Override
	public void focinho() {
		System.out.println("Tem um focinha pontiagudo: sim");
		
	}

	@Override
	public void nadadeiraAlta() {
		System.out.println("Nadadeira alta: sim");
		
	}

	@Override
	public void nada() {
		System.out.println("nada: sim");
		
	}

	@Override
	public void comerCarne() {
		System.out.println("Come carne: sim");
		
	}

	@Override
	public void cartilagem() {
		System.out.println("ossos com cartilagem: sim");
		
	}
	

	@Override
	public void inprimir () {
		System.out.println("Tubarao da Clase Condrictions");
		Tubarao.this.cartilagem();
		System.out.println("Tubarao do Genero Aquatico");
		Tubarao.this.nada();
		System.out.println("Tubarao da Ordem Carnivora");
		Tubarao.this.comerCarne();
		System.out.println("Tubarao da Familia Lamnidae");
		Tubarao.this.focinho();
		Tubarao.this.nadadeiraAlta();
		System.out.println("Tubarao da Especie Ovoviviparos");
		Tubarao.this.nascer();
		
	}

}
