package br.quixada.projeto.repository;

import java.util.List;

import br.quixada.projeto.model.Usuario;


public interface UsuarioRepository {
	
	List<Usuario> findAll();
	
	void salvar(Usuario usuario);
	
	Usuario findById(Integer id);
	
	void remover(Usuario usuario);

}
