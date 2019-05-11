package ReinoAnimal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class DAOImpl implements DAO {

	private List<Animal> dados;

	public DAOImpl() {

		this.dados = new ArrayList<Animal>();
	}

	@Override
	public Animal inserir(Animal a) {
		for (Animal animal : dados) {
			if (animal.getId() == a.getId()) {
				return null;
			}
		}

		dados.add(a);
		return a;
	}

	@Override
	public void alterar(Animal a) {
		for (Animal animal : dados) {
			if(animal.getId() != a.getId()) {
				JOptionPane.showMessageDialog(null, "O Id não tem animal cadastrado, gostaria de cadastrar?");
			}else {
				JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
			}
			
		}

	}

	@Override
	public int excluir(int... ids) {
		List<Integer> lista = new ArrayList<Integer>();
		for(int id: ids) {
			for (int i = 0; i < dados.size(); i++) {
				if(dados.get(i).getId() == id) {
					dados.remove(i);
					JOptionPane.showMessageDialog(null, "Animal excluido com sucesso!");
				}
				
			}
			
			
		}
		return lista.size();
	}

	@Override
	public AnimalImpl pesquisar(int id) {
		for (Animal animal: dados) {
			if(animal.getId() == id) {
				return (AnimalImpl) animal;
			}
		} 
		return null;
	}

	@Override
	public List<Animal> listarTodos() {
		return dados;
	}

}
