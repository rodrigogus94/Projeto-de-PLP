package ReinoAnimal.Teste;

import ReinoAnimal.Animal;
import ReinoAnimal.Classe.Aves;
import ReinoAnimal.Especie.Oviparo;
import ReinoAnimal.Familia.Struthionidae;
import ReinoAnimal.Genero.Terrestre;
import ReinoAnimal.Ordem.Herbivoro;

public class Avestruz extends Animal implements Aves, Herbivoro, Terrestre, Struthionidae, Oviparo {

	@Override
	public void camelus() {
		System.out.println("Pernas longas: Sim");
		
	}

	@Override
	public void andar() {
		System.out.println("Anda: Sim");
		
	}

	@Override
	public void comevegetal() {
		System.out.println("Come Vegetais: Sim");
		
	}

	@Override
	public void bico() {
		System.out.println("Tem bico: Sim");
		
	}

	@Override
	public void pena() {
		System.out.println("Tem pena: Sim");
		
	}

	@Override
	public void oviparidade() {
		System.out.println("Põe ovos: Sim");
		
	}
	
	@Override
	public void inprimir() {
		System.out.println("Avestruz da Clase Aves");
		Avestruz.this.bico();
		Avestruz.this.pena();
		System.out.println("Avestruz do Genero Terrestre");
		Avestruz.this.andar();
		System.out.println("Avestruz da Ordem Herbivoro");
		Avestruz.this.comevegetal();
		System.out.println("Avestruz da Familia Struthionidae");
		Avestruz.this.camelus();
		System.out.println("Avestruz da Especie Oviparo");
		Avestruz.this.oviparidade();

	}

}
