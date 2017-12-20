package org.miproyecto.reparaciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Evaluacionservicio.class)
public abstract class Evaluacionservicio_ {

	public static volatile SingularAttribute<Evaluacionservicio, Integer> calificacion;
	public static volatile CollectionAttribute<Evaluacionservicio, Problema> problemaCollection;
	public static volatile SingularAttribute<Evaluacionservicio, Integer> evaluacionID;
	public static volatile SingularAttribute<Evaluacionservicio, String> nota;
	public static volatile SingularAttribute<Evaluacionservicio, Cliente> clienteClienteID;

}

