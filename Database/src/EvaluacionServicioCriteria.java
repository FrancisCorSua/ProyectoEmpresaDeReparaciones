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

public class EvaluacionServicioCriteria extends AbstractORMCriteria {
	public final IntegerExpression evaluacionID;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression calificacion;
	public final StringExpression nota;
	public final CollectionExpression problemas;
	
	public EvaluacionServicioCriteria(Criteria criteria) {
		super(criteria);
		evaluacionID = new IntegerExpression("evaluacionID", this);
		clienteId = new IntegerExpression("cliente.clienteID", this);
		cliente = new AssociationExpression("cliente", this);
		calificacion = new IntegerExpression("calificacion", this);
		nota = new StringExpression("nota", this);
		problemas = new CollectionExpression("ORM_Problemas", this);
	}
	
	public EvaluacionServicioCriteria(PersistentSession session) {
		this(session.createCriteria(EvaluacionServicio.class));
	}
	
	public EvaluacionServicioCriteria() throws PersistentException {
		this(UMLPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public ProblemaCriteria createProblemasCriteria() {
		return new ProblemaCriteria(createCriteria("ORM_Problemas"));
	}
	
	public EvaluacionServicio uniqueEvaluacionServicio() {
		return (EvaluacionServicio) super.uniqueResult();
	}
	
	public EvaluacionServicio[] listEvaluacionServicio() {
		java.util.List list = super.list();
		return (EvaluacionServicio[]) list.toArray(new EvaluacionServicio[list.size()]);
	}
}

