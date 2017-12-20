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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TrabajadorCriteria extends AbstractORMCriteria {
	public final IntegerExpression trabajadorID;
	public final StringExpression trabajadorUsuario;
	public final StringExpression trabajadorContrasena;
	public final StringExpression trabajadorNombre;
	public final IntegerExpression trabajadorCategoria;
	public final CollectionExpression problema;
	
	public TrabajadorCriteria(Criteria criteria) {
		super(criteria);
		trabajadorID = new IntegerExpression("trabajadorID", this);
		trabajadorUsuario = new StringExpression("trabajadorUsuario", this);
		trabajadorContrasena = new StringExpression("trabajadorContrasena", this);
		trabajadorNombre = new StringExpression("trabajadorNombre", this);
		trabajadorCategoria = new IntegerExpression("trabajadorCategoria", this);
		problema = new CollectionExpression("ORM_Problema", this);
	}
	
	public TrabajadorCriteria(PersistentSession session) {
		this(session.createCriteria(Trabajador.class));
	}
	
	public TrabajadorCriteria() throws PersistentException {
		this(UMLPersistentManager.instance().getSession());
	}
	
	public ProblemaCriteria createProblemaCriteria() {
		return new ProblemaCriteria(createCriteria("ORM_Problema"));
	}
	
	public Trabajador uniqueTrabajador() {
		return (Trabajador) super.uniqueResult();
	}
	
	public Trabajador[] listTrabajador() {
		java.util.List list = super.list();
		return (Trabajador[]) list.toArray(new Trabajador[list.size()]);
	}
}

