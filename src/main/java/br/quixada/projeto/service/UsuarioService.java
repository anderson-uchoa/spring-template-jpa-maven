package br.quixada.projeto.service;

import java.util.List;

import br.quixada.projeto.model.Usuario;


public interface UsuarioService {
	
	List<Usuario> findAll();
	
	void salvar(Usuario usuario);
	
	void remover(Integer id);

}
