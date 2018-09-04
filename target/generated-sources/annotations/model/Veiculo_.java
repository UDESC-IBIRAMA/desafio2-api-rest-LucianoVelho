package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Modelo;
import model.Montadora;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-04T19:34:41")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, String> motor;
    public static volatile SingularAttribute<Veiculo, Long> id_veiculo;
    public static volatile SingularAttribute<Veiculo, String> tipo;
    public static volatile SingularAttribute<Veiculo, String> cor;
    public static volatile SingularAttribute<Veiculo, Montadora> montadora;
    public static volatile SingularAttribute<Veiculo, Double> Quilometragem;
    public static volatile SingularAttribute<Veiculo, Modelo> modelo;

}