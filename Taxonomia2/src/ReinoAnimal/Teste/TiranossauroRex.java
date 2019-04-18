package ReinoAnimal.Teste;

import ReinoAnimal.Animal;
import ReinoAnimal.Classe.Reptil;
import ReinoAnimal.Especie.Oviparo;
import ReinoAnimal.Familia.Tyrannosauridae;
import ReinoAnimal.Genero.Terrestre;
import ReinoAnimal.Ordem.Carnivora;

public class TiranossauroRex extends Animal implements Reptil, Carnivora, Terrestre, Tyrannosauridae, Oviparo{

	@Override
	public void oviparidade() {
		System.out.println("Põe ovos: sim");
		
	}

	@Override
	public void monstruoso() {
		System.out.println("É monstruoso: sim");
		
	}

	@Override
	public void andar() {
		System.out.println("Anda: sim");
		
	}

	@Override
	public void comerCarne() {
		System.out.println("Come carne: sim");
		
	}

	@Override
	public void vertebrado() {
		System.out.println("Tetrápode: sim");
		
	}

	@Override
	public void ectotermicos() {
		System.out.println("Sangue fria: sim");
		
	}
	@Override
	public void inprimir () {
		System.out.println("TiranossauroRex da Clase Reptil");
		TiranossauroRex.this.vertebrado();
		TiranossauroRex.this.ectotermicos();
		System.out.println("TiranossauroRex do genero Terrestre");
		TiranossauroRex.this.andar();
		System.out.println("TiranossauroRex da Ordem Carnivoro");
		TiranossauroRex.this.comerCarne();
		System.out.println("TiranossauroRex da Familia Tyrannosauridae");
		TiranossauroRex.this.monstruoso();
		System.out.println("TiranossauroRex da Especie Oviparo");
		TiranossauroRex.this.oviparidade();
		
	}

}
