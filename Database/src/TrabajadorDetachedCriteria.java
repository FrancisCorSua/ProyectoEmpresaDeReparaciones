/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TrabajadorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression trabajadorID;
	public final StringExpression trabajadorUsuario;
	public final StringExpression trabajadorContrasena;
	public final StringExpression trabajadorNombre;
	public final IntegerExpression trabajadorCategoria;
	public final CollectionExpression problema;
	
	public TrabajadorDetachedCriteria() {
		super(Trabajador.class, TrabajadorCriteria.class);
		trabajadorID = new IntegerExpression("trabajadorID", this.getDetachedCriteria());
		trabajadorUsuario = new StringExpression("trabajadorUsuario", this.getDetachedCriteria());
		trabajadorContrasena = new StringExpression("trabajadorContrasena", this.getDetachedCriteria());
		trabajadorNombre = new StringExpression("trabajadorNombre", this.getDetachedCriteria());
		trabajadorCategoria = new IntegerExpression("trabajadorCategoria", this.getDetachedCriteria());
		problema = new CollectionExpression("ORM_Problema", this.getDetachedCriteria());
	}
	
	public TrabajadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TrabajadorCriteria.class);
		trabajadorID = new IntegerExpression("trabajadorID", this.getDetachedCriteria());
		trabajadorUsuario = new StringExpression("trabajadorUsuario", this.getDetachedCriteria());
		trabajadorContrasena = new StringExpression("trabajadorContrasena", this.getDetachedCriteria());
		trabajadorNombre = new StringExpression("trabajadorNombre", this.getDetachedCriteria());
		trabajadorCategoria = new IntegerExpression("trabajadorCategoria", this.getDetachedCriteria());
		problema = new CollectionExpression("ORM_Problema", this.getDetachedCriteria());
	}
	
	public ProblemaDetachedCriteria createProblemaCriteria() {
		return new ProblemaDetachedCriteria(createCriteria("ORM_Problema"));
	}
	
	public Trabajador uniqueTrabajador(PersistentSession session) {
		return (Trabajador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Trabajador[] listTrabajador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Trabajador[]) list.toArray(new Trabajador[list.size()]);
	}
}

