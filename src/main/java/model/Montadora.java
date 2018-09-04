/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucia
 */
@Entity
@XmlRootElement
public class Montadora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_montadora")
    private Long id_montadora;
    private String nome;
    @OneToMany( mappedBy = "montadora")
    private Collection <Veiculo> veiculo;

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public Long getId() {
        return id_montadora;
    }

    public void setId(Long id) {
        this.id_montadora = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_montadora != null ? id_montadora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Montadora)) {
            return false;
        }
        Montadora other = (Montadora) object;
        if ((this.id_montadora == null && other.id_montadora != null) || (this.id_montadora != null && !this.id_montadora.equals(other.id_montadora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Montadora[ id=" + id_montadora + " ]";
    }
    
}
