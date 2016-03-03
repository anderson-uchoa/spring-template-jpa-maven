package br.quixada.projeto.repository.jpa;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import br.quixada.projeto.model.Usuario;
import br.quixada.projeto.repository.UsuarioRepository;


@Named
public class UsuarioRepositoryImpl implements UsuarioRepository {
	
	protected EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Usuario> findAll() {
		Query query = em.createQuery("from Usuario");
		return query.getResultList();
	}

	@Override
	@Transactional
	public void salvar(Usuario usuario) {
		em.persist(usuario);
	}

	@Override
	public Usuario findById(Integer id) {
		return em.find(Usuario.class, id);
	}

	@Override
	@Transactional
	public void remover(Usuario usuario) {
		em.remove(em.merge(usuario));
		
	}

}
