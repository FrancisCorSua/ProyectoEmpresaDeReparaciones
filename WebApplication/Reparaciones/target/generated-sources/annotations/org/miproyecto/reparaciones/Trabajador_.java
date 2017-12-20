package org.miproyecto.reparaciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trabajador.class)
public abstract class Trabajador_ {

	public static volatile SingularAttribute<Trabajador, String> trabajadorContrasena;
	public static volatile SingularAttribute<Trabajador, String> trabajadorUsuario;
	public static volatile SingularAttribute<Trabajador, Integer> trabajadorCategoria;
	public static volatile SingularAttribute<Trabajador, String> trabajadorNombre;
	public static volatile SingularAttribute<Trabajador, Integer> trabajadorID;
	public static volatile CollectionAttribute<Trabajador, Problema> problemaCollection;

}

