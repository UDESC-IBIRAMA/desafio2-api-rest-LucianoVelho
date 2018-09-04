package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Veiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-04T19:34:41")
@StaticMetamodel(Montadora.class)
public class Montadora_ { 

    public static volatile SingularAttribute<Montadora, Long> id_montadora;
    public static volatile CollectionAttribute<Montadora, Veiculo> veiculo;
    public static volatile SingularAttribute<Montadora, String> nome;

}