package ReinoAnimal;

import javax.swing.JOptionPane;

import ReinoAnimal.Teste.*;

public class testeMain {

	public static void main(String[] RedHunter) {

		Humano humano = new Humano();
		Lobo lobo = new Lobo();
		Abelha abelha = new Abelha();
		Aguia aguia = new Aguia();
		Avestruz avestruz = new Avestruz();
		Baleia baleia = new Baleia();
		Ornitorrinco ornitorrinco = new Ornitorrinco();
		Tartaruga tartaruga = new Tartaruga();
		TiranossauroRex tiranossauroRex = new TiranossauroRex();
		Tubarao tubarao = new Tubarao();
		int opc = -1, opc2 = -1;
		while (opc != 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção "
					+ "\n1 - Cadastrar"
					+ "\n0 - Sair"));

			while (opc2 != 0) {
				opc2 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção  "
						+ "\n1 - Humano 	  | 2 - Abelha" + "\n3 - Águia        |  4 - Avestruz"
						+ "\n5 - Baleia   	  | 6 - Lobo" + "\n7 - Ornitorrinco | 8 - Tartaruga"
						+ "\n9 - Tubarão	  | 10 - Tiranossauro Rex" + "\n0 - Sair"));

				if (opc2 < 0 | opc2 > 10) {
					JOptionPane.showMessageDialog(null,
							"Só são aceitos números de 0 até 10, por favor digite novamente!");
				}
				switch (opc2) {

				case 1:
					humano.inprimir();
					System.out.println();
					break;

				case 2:
					abelha.inprimir();
					System.out.println();
					break;

				case 3:
					aguia.inprimir();
					System.out.println();
					break;

				case 4:
					avestruz.inprimir();
					System.out.println();
					break;

				case 5:
					baleia.inprimir();
					System.out.println();
					break;

				case 6:
					lobo.inprimir();
					System.out.println();
					break;

				case 7:
					ornitorrinco.inprimir();
					System.out.println();
					break;

				case 8:
					tartaruga.inprimir();
					System.out.println();
					break;

				case 9:
					tubarao.inprimir();
					System.out.println();
					break;

				case 10:
					tiranossauroRex.inprimir();
					System.out.println();
					break;

				}
			}
			
			switch (opc) {
			case 1:
				System.out.println("esta aqui");
				break;

			default:
				break;
			}

		}

	}

}
