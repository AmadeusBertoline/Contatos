package dao;
import java.util.List;
import model.Contato;

public interface ContatoDAO {

	void criar(Contato c); //CREATE
	List<Contato> lerTodos(); //READ
	void atualizar(long id, Contato c); //UPDATE
	void apagar (long ide); //DELETE
	
}
