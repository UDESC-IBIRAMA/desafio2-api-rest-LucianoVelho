package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Veiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-04T19:34:41")
@StaticMetamodel(Modelo.class)
public class Modelo_ { 

    public static volatile CollectionAttribute<Modelo, Veiculo> veiculo;
    public static volatile SingularAttribute<Modelo, Long> id_modelo;
    public static volatile SingularAttribute<Modelo, String> nome;

}