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

public class ClienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression clienteID;
	public final StringExpression clienteUsuario;
	public final StringExpression clienteContrasena;
	public final StringExpression clienteNombre;
	public final StringExpression codigoPostal;
	public final StringExpression clienteTelefono;
	public final CollectionExpression problema;
	public final CollectionExpression evaluacion;
	
	public ClienteCriteria(Criteria criteria) {
		super(criteria);
		clienteID = new IntegerExpression("clienteID", this);
		clienteUsuario = new StringExpression("clienteUsuario", this);
		clienteContrasena = new StringExpression("clienteContrasena", this);
		clienteNombre = new StringExpression("clienteNombre", this);
		codigoPostal = new StringExpression("codigoPostal", this);
		clienteTelefono = new StringExpression("clienteTelefono", this);
		problema = new CollectionExpression("ORM_Problema", this);
		evaluacion = new CollectionExpression("ORM_Evaluacion", this);
	}
	
	public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}
	
	public ClienteCriteria() throws PersistentException {
		this(UMLPersistentManager.instance().getSession());
	}
	
	public ProblemaCriteria createProblemaCriteria() {
		return new ProblemaCriteria(createCriteria("ORM_Problema"));
	}
	
	public EvaluacionServicioCriteria createEvaluacionCriteria() {
		return new EvaluacionServicioCriteria(createCriteria("ORM_Evaluacion"));
	}
	
	public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}
	
	public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

