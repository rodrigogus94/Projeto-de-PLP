package ReinoAnimal;

import java.util.List;

public interface DAO {
	
	Animal inserir(Animal a);
	void alterar(Animal a);
	int excluir(int... ids);
	AnimalImpl pesquisar(int id);
	List<Animal> listarTodos();
}
