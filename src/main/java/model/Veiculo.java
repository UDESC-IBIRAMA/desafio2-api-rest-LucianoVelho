/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucia
 */
@Entity
@XmlRootElement
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_veiculo")
    private Long id_veiculo;
    private String motor ;
    private String cor ;
    private double Quilometragem ;
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "id_modelo")
    private Modelo modelo;
    @ManyToOne
     @JoinColumn(name = "id_montadora")
    private Montadora montadora;


    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return Quilometragem;
    }

    public void setQuilometragem(double Quilometragem) {
        this.Quilometragem = Quilometragem;
    }

    public Long getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(Long id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    

    

    public Long getId() {
        return id_veiculo;
    }

    public void setId(Long id) {
        this.id_veiculo
                = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_veiculo != null ? id_veiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id_veiculo == null && other.id_veiculo != null) || (this.id_veiculo != null && !this.id_veiculo.equals(other.id_veiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Veiculo[ id=" + id_veiculo + " ]";
    }
    
}
