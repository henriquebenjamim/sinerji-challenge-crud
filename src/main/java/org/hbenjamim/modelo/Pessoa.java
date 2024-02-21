package org.hbenjamim.modelo;

import org.hbenjamim.modelo.Endereco;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @Temporal(TemporalType.DATE)
    private Date idade;
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;


}
