package org.miproyecto.reparaciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, String> clienteNombre;
	public static volatile SingularAttribute<Cliente, String> clienteTelefono;
	public static volatile SingularAttribute<Cliente, Integer> clienteID;
	public static volatile SingularAttribute<Cliente, String> codigoPostal;
	public static volatile CollectionAttribute<Cliente, Problema> problemaCollection;
	public static volatile CollectionAttribute<Cliente, Evaluacionservicio> evaluacionservicioCollection;
	public static volatile SingularAttribute<Cliente, String> clienteUsuario;
	public static volatile SingularAttribute<Cliente, String> clienteContrasena;

}

