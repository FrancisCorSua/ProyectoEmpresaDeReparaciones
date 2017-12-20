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

public class ProblemaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ProblemaDetachedCriteria() {
		super(Problema.class, ProblemaCriteria.class);
		problemaID = new IntegerExpression("problemaID", this.getDetachedCriteria());
		evaluacionId = new IntegerExpression("evaluacion.evaluacionID", this.getDetachedCriteria());
		evaluacion = new AssociationExpression("evaluacion", this.getDetachedCriteria());
		trabajadorId = new IntegerExpression("trabajador.trabajadorID", this.getDetachedCriteria());
		trabajador = new AssociationExpression("trabajador", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.clienteID", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		problemaCategoria = new IntegerExpression("problemaCategoria", this.getDetachedCriteria());
		problemaNota = new StringExpression("problemaNota", this.getDetachedCriteria());
		problemaEstado = new IntegerExpression("problemaEstado", this.getDetachedCriteria());
		trabajadorSolicitado = new StringExpression("trabajadorSolicitado", this.getDetachedCriteria());
	}
	
	public ProblemaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ProblemaCriteria.class);
		problemaID = new IntegerExpression("problemaID", this.getDetachedCriteria());
		evaluacionId = new IntegerExpression("evaluacion.evaluacionID", this.getDetachedCriteria());
		evaluacion = new AssociationExpression("evaluacion", this.getDetachedCriteria());
		trabajadorId = new IntegerExpression("trabajador.trabajadorID", this.getDetachedCriteria());
		trabajador = new AssociationExpression("trabajador", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.clienteID", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		problemaCategoria = new IntegerExpression("problemaCategoria", this.getDetachedCriteria());
		problemaNota = new StringExpression("problemaNota", this.getDetachedCriteria());
		problemaEstado = new IntegerExpression("problemaEstado", this.getDetachedCriteria());
		trabajadorSolicitado = new StringExpression("trabajadorSolicitado", this.getDetachedCriteria());
	}
	
	public EvaluacionServicioDetachedCriteria createEvaluacionCriteria() {
		return new EvaluacionServicioDetachedCriteria(createCriteria("evaluacion"));
	}
	
	public TrabajadorDetachedCriteria createTrabajadorCriteria() {
		return new TrabajadorDetachedCriteria(createCriteria("trabajador"));
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public Problema uniqueProblema(PersistentSession session) {
		return (Problema) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Problema[] listProblema(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Problema[]) list.toArray(new Problema[list.size()]);
	}
}

