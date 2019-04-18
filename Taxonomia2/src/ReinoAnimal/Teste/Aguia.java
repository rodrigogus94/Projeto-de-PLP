package ReinoAnimal.Teste;

import ReinoAnimal.Animal;
import ReinoAnimal.Classe.Aves;
import ReinoAnimal.Especie.Oviparo;
import ReinoAnimal.Familia.Accipitridae;
import ReinoAnimal.Genero.Aereo;
import ReinoAnimal.Ordem.Carnivora;

public class Aguia extends Animal implements Aves, Carnivora, Accipitridae, Aereo, Oviparo {

	@Override
	public void voar() {
		System.out.println("Voa: Sim");
		
	}

	@Override
	public void rapina() {
		System.out.println("Ccça: Sim");
		
	}

	@Override
	public void comerCarne() {
		System.out.println("Come Carne: Sim");
		
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
		System.out.println("Águia da Clase Aves");
		Aguia.this.bico();
		Aguia.this.pena();
		System.out.println("Águia do Genero Aereo");
		Aguia.this.voar();
		System.out.println("Águia da Ordem Carnivora");
		Aguia.this.comerCarne();
		System.out.println("Águia da Familia Accipitridae");
		Aguia.this.rapina();
		System.out.println("Águia da Especie Oviparo");
		Aguia.this.oviparidade();

	}


}
