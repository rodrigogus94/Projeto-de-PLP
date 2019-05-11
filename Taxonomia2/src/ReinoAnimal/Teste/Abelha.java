package ReinoAnimal.Teste;

import ReinoAnimal.AnimalImpl;
import ReinoAnimal.Classe.Inseto;
import ReinoAnimal.Especie.Oviparo;
import ReinoAnimal.Familia.Hymenoptera;
import ReinoAnimal.Genero.Aereo;
import ReinoAnimal.Ordem.Nectarivoros;

public class Abelha extends AnimalImpl implements Inseto, Nectarivoros, Aereo, Hymenoptera, Oviparo {

	@Override
	public void oviparidade() {
		System.out.println("Põe Ovos: sim");

	}

	@Override
	public void asas() {
		System.out.println("Asas: sim");

	}

	@Override
	public void voar() {
		System.out.println("Voa: sim");

	}

	@Override
	public void comeNectar() {
		System.out.println("Come Nectar: sim");

	}

	@Override
	public void exoesqueleto() {
		System.out.println("Exoesqueleto: sim");

	}

	@Override
	public void inprimir() {
		System.out.println("Abelha da Clase Inseto");
		Abelha.this.exoesqueleto();
		System.out.println("Abelha do Genero Aereo");
		Abelha.this.voar();
		System.out.println("Abelha da Ordem Ncetarivoros");
		Abelha.this.comeNectar();
		System.out.println("Abelha da Familia Hymenoptera");
		Abelha.this.asas();
		System.out.println("Abelha da Especie Oviparo");
		Abelha.this.oviparidade();

	}

}
