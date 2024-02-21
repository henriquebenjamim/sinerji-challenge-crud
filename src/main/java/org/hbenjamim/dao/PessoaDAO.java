package org.hbenjamim.dao;

import org.hbenjamim.modelo.Pessoa;

import javax.persistence.EntityManager;
import java.util.List;

public class PessoaDAO {

    private EntityManager entityManager;

    public PessoaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void salvar(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.persist(pessoa);
        entityManager.getTransaction().commit();
    }

    public Pessoa buscarPorId(Long id) {
        return entityManager.find(Pessoa.class, id);
    }

    public List<Pessoa> listarTodos() {
        return entityManager.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList();
    }

    public void atualizar(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.merge(pessoa);
        entityManager.getTransaction().commit();
    }

    public void deletar(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.remove(pessoa);
        entityManager.getTransaction().commit();
    }
}
