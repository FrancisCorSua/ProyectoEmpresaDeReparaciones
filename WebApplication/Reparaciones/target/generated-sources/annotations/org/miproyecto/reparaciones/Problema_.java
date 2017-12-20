package org.miproyecto.reparaciones;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Problema.class)
public abstract class Problema_ {

	public static volatile SingularAttribute<Problema, Integer> problemaID;
	public static volatile SingularAttribute<Problema, Evaluacionservicio> evaluacionServicioEvaluacionID;
	public static volatile SingularAttribute<Problema, Trabajador> trabajadorTrabajadorID;
	public static volatile SingularAttribute<Problema, Integer> problemaCategoria;
	public static volatile SingularAttribute<Problema, Date> problemaFecha;
	public static volatile SingularAttribute<Problema, String> problemaNota;
	public static volatile SingularAttribute<Problema, String> trabajadorSolicitado;
	public static volatile SingularAttribute<Problema, Integer> problemaEstado;
	public static volatile SingularAttribute<Problema, Cliente> clienteClienteID;

}

