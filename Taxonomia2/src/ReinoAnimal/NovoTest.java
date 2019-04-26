package ReinoAnimal;

import javax.swing.JOptionPane;

public class NovoTest {

	public static void main(String[] redHunter) {

		DAO dao = new DAOImpl();
		Animal a = new AnimalImpl();
		int opc = -1;
		while (opc != 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção " + "\n1 - Cadastrar" + "\n2 - Alterar"
					+ "\n3 - Deletar" + "\n4 - Pesquisar" + "\n5 - Mostrar todos" + "\n0 - Sair"));

			if (opc < 0 | opc > 5) {
				JOptionPane.showMessageDialog(null, "Só são aceitos números de 0 até 5, por favor digite novamente!");
			}
			switch (opc) {

			case 1:

				int quantidade = Integer
						.parseInt(JOptionPane.showInputDialog("Digite a quantidade de animais para cadastra:"));

				for (int i = 0; i < quantidade; i++) {

					int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do animal"));
					a.setId(id);

					String nome = JOptionPane.showInputDialog("Digite o nome do animal");
					a.setNome(nome);

					String classe = JOptionPane.showInputDialog("Digite a classe do animal");
					a.setClasse(classe);

					String genero = JOptionPane.showInputDialog("Digite o genero do animal");
					a.setGenero(genero);

					String ordem = JOptionPane.showInputDialog("Digite a ordem do animal");
					a.setOrdem(ordem);

					String familia = JOptionPane.showInputDialog("Digite a familia do animal");
					a.setFamilia(familia);

					String especie = JOptionPane.showInputDialog("Digite a especie do animal");
					a.setEspecie(especie);

					if (dao.inserir(a) != null) {
						JOptionPane.showMessageDialog(null, a.getNome() + " cadastrado com sucesso!");
					}

				}
				break;

			case 2:
				int opc2 = -1;
				int id = Integer.parseInt(JOptionPane.showInputDialog("Digite a ID do animais para alteração:"));
				if (a.getId() == id) {
					opc2 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção para alterar " + a.getNome()
							+ "\n1 - ID  |  2 - Nome " + " \n3 - classe |  4 - genero" + " \n5 - ordem |  6 - especie"
							+ " \n7 - familia  | 0 - sair"));
					if (opc2 == 1) {
						id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do animal"));
						a.setId(id);

					} else if (opc2 == 2) {

					} else if (opc2 == 3) {

					} else if (opc2 == 4) {

					} else if (opc2 == 5) {

					} else if (opc2 == 6) {

					} else if (opc2 == 7) {

					} else if (opc2 == 8) {

					} else if (opc2 == 0) {

					}
				} else {
						JOptionPane.showMessageDialog(null, "O Id não tem animal cadastrado, gostaria de cadastrar?");
					
						
				}
				break;

			case 3:

			case 4:

			case 5:

			}
		}

	}

}
