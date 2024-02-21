package org.hbenjamim.controle;

import org.hbenjamim.dao.PessoaDAO;
import org.hbenjamim.modelo.Pessoa;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class PessoaBean implements Serializable {

    @EJB
    private PessoaDAO pessoaDAO;
    private Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoas;

    public void salvar() {
        pessoaDAO.salvar(pessoa);
        pessoa = new Pessoa();
        listarPessoas();
    }

    public void atualizar(Pessoa pessoa) {
        pessoaDAO.atualizar(pessoa);
        listarPessoas();
    }

    public void deletar(Pessoa pessoa) {
        pessoaDAO.deletar(pessoa);
        listarPessoas();
    }

    public void listarPessoas() {
        pessoas = pessoaDAO.listarTodos();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

}
