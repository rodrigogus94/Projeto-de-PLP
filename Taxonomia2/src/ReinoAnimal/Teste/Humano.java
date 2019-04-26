package ReinoAnimal.Teste;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

import ReinoAnimal.AnimalImpl;
import ReinoAnimal.Classe.Mamifero;
import ReinoAnimal.Especie.Viviparo;
import ReinoAnimal.Familia.Homininae;
import ReinoAnimal.Genero.Terrestre;
import ReinoAnimal.Ordem.Omnivoro;

public class Humano extends AnimalImpl implements Mamifero, Omnivoro, Homininae, Terrestre, Viviparo {

	@Override
	public void andar() {
		System.out.println("Andar: Sim");
	
	}

	@Override
	public void comer() {
		System.out.println("Comer: Sim");
		
	}

	@Override
	public void mamar() {
		System.out.println("Mamar: Sim");
		
	}

	@Override
	public void comevegetal() {
		System.out.println("Comer Vegetais: Sim");
		
	}

	@Override
	public void comerCarne() {
		System.out.println("Comer Carne: sim");
		
	}

	@Override
	public void think() {
		System.out.println("Think: Até demais");
		
	}

	@Override
	public void parir() {
		System.out.println("Parir: sim");
		
	}

	@Override
	public void inprimir () {
		System.out.println("Humano da Clase Mamifero");
		Humano.this.mamar();
		System.out.println("Humano do Genero Terrestre");
		Humano.this.andar();
		System.out.println("Humano da Ordem Omnivoro" );
		Humano.this.comerCarne();
		Humano.this.comevegetal();
		System.out.println("Humano da Familia Homininae");
		Humano.this.think();
		System.out.println("Humano da Especie Viviparo");
		Humano.this.parir();
		
	}

}
