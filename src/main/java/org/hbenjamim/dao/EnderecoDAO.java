package org.hbenjamim.dao;

import org.hbenjamim.modelo.Endereco;

import javax.persistence.EntityManager;
import java.util.List;

public class EnderecoDAO {

    private EntityManager entityManager;

    public EnderecoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void salvar(Endereco endereco) {
        entityManager.getTransaction().begin();
        entityManager.persist(endereco);
        entityManager.getTransaction().commit();
    }

    public Endereco buscarPorId(Long id) {
        return entityManager.find(Endereco.class, id);
    }

    public List<Endereco> listarTodos() {
        return entityManager.createQuery("SELECT e FROM Endereco e", Endereco.class).getResultList();
    }

    public void atualizar(Endereco endereco) {
        entityManager.getTransaction().begin();
        entityManager.merge(endereco);
        entityManager.getTransaction().commit();
    }

    public void deletar(Endereco endereco) {
        entityManager.getTransaction().begin();
        entityManager.remove(endereco);
        entityManager.getTransaction().commit();
    }
}
