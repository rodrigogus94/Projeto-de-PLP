package ReinoAnimal.Teste;

import ReinoAnimal.Animal;
import ReinoAnimal.Classe.Reptil;
import ReinoAnimal.Especie.Oviparo;
import ReinoAnimal.Familia.Cheloniidae;
import ReinoAnimal.Genero.Aquaticos;
import ReinoAnimal.Ordem.Omnivoro;

public class Tartaruga extends Animal implements Reptil, Omnivoro, Aquaticos, Cheloniidae, Oviparo{

	@Override
	public void comevegetal() {
		System.out.println("come vegetais: sim" );
		
	}

	@Override
	public void comerCarne() {
		System.out.println("come carne: sim");
		
	}

	@Override
	public void oviparidade() {
		System.out.println("Põe ovos: sim");
		
	}

	@Override
	public void concha() {
		System.out.println("Tem concha: sim");
		
	}

	@Override
	public void nada() {
		System.out.println("nada: sim");
		
	}

	@Override
	public void comer() {
		System.out.println("come: sim");
		
	}

	@Override
	public void vertebrado() {
		System.out.println("tetrápode: sim");
		
	}

	@Override
	public void ectotermicos() {
		System.out.println("sangue frio: sim");
		
	}
	
	@Override
	public void inprimir () {
		System.out.println("Tartaruga da Clase Reptil");
		Tartaruga.this.vertebrado();
		Tartaruga.this.ectotermicos();
		System.out.println("Tartaruga do Genero Aquatico");
		Tartaruga.this.nada();
		System.out.println("Tartaruga da Ordem Omnivoro");
		Tartaruga.this.comerCarne();
		Tartaruga.this.comevegetal();
		System.out.println("Tartaruga da Familia Cheloniidae");
		Tartaruga.this.concha();
		System.out.println("Tartaruga da Especie Oviparo");
		Tartaruga.this.oviparidade();
		
	}

}
