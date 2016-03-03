package br.quixada.projeto.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.quixada.projeto.model.Usuario;
import br.quixada.projeto.repository.UsuarioRepository;
import br.quixada.projeto.service.UsuarioService;


@Named
public class UsuarioServiceImpl implements UsuarioService {
	
	@Inject
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public void salvar(Usuario usuario) {
		usuarioRepository.salvar(usuario);
		
	}

	@Override
	public void remover(Integer id) {
		Usuario usuario = usuarioRepository.findById(id);
		usuarioRepository.remover(usuario);
	}

	


}
