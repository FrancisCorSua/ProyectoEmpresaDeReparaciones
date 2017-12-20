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

public class ProblemaCriteria extends AbstractORMCriteria {
	public final IntegerExpression problemaID;
	public final IntegerExpression evaluacionId;
	public final AssociationExpression evaluacion;
	public final IntegerExpression trabajadorId;
	public final AssociationExpression trabajador;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression problemaCategoria;
	public final StringExpression problemaNota;
	public final IntegerExpression problemaEstado;
	public final StringExpression trabajadorSolicitado;
	
	public ProblemaCriteria(Criteria criteria) {
		super(criteria);
		problemaID = new IntegerExpression("problemaID", this);
		evaluacionId = new IntegerExpression("evaluacion.evaluacionID", this);
		evaluacion = new AssociationExpression("evaluacion", this);
		trabajadorId = new IntegerExpression("trabajador.trabajadorID", this);
		trabajador = new AssociationExpression("trabajador", this);
		clienteId = new IntegerExpression("cliente.clienteID", this);
		cliente = new AssociationExpression("cliente", this);
		problemaCategoria = new IntegerExpression("problemaCategoria", this);
		problemaNota = new StringExpression("problemaNota", this);
		problemaEstado = new IntegerExpression("problemaEstado", this);
		trabajadorSolicitado = new StringExpression("trabajadorSolicitado", this);
	}
	
	public ProblemaCriteria(PersistentSession session) {
		this(session.createCriteria(Problema.class));
	}
	
	public ProblemaCriteria() throws PersistentException {
		this(UMLPersistentManager.instance().getSession());
	}
	
	public EvaluacionServicioCriteria createEvaluacionCriteria() {
		return new EvaluacionServicioCriteria(createCriteria("evaluacion"));
	}
	
	public TrabajadorCriteria createTrabajadorCriteria() {
		return new TrabajadorCriteria(createCriteria("trabajador"));
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public Problema uniqueProblema() {
		return (Problema) super.uniqueResult();
	}
	
	public Problema[] listProblema() {
		java.util.List list = super.list();
		return (Problema[]) list.toArray(new Problema[list.size()]);
	}
}

