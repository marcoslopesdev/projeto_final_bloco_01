package livraria.repository;

import livraria.model.Principal;

public interface Repository {

	// CRUD da Livraria
	public void procurarPorCodigo(int codigo);
	public void listarTodos();
	public void cadastrar(Repository livro);
	public void atualizar(Repository livro);
	public void deletar(int codigo);
	
}