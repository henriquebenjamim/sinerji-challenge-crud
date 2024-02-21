package org.hbenjamim.controle;

import org.hbenjamim.dao.EnderecoDAO;
import org.hbenjamim.modelo.Endereco;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class EnderecoBean implements Serializable {

    @EJB
    private EnderecoDAO enderecoDAO;
    private Endereco endereco = new Endereco();
    private List<Endereco> enderecos;

    public void salvar() {
        enderecoDAO.salvar(endereco);
        endereco = new Endereco();
        listarEnderecos();
    }

    public void atualizar(Endereco endereco) {
        enderecoDAO.atualizar(endereco);
        listarEnderecos();
    }

    public void deletar(Endereco endereco) {
        enderecoDAO.deletar(endereco);
        listarEnderecos();
    }

    public void listarEnderecos() {
        enderecos = enderecoDAO.listarTodos();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
