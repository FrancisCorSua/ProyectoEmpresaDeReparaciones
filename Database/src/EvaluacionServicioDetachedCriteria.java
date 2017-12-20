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

public class EvaluacionServicioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression evaluacionID;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression calificacion;
	public final StringExpression nota;
	public final CollectionExpression problemas;
	
	public EvaluacionServicioDetachedCriteria() {
		super(EvaluacionServicio.class, EvaluacionServicioCriteria.class);
		evaluacionID = new IntegerExpression("evaluacionID", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.clienteID", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		calificacion = new IntegerExpression("calificacion", this.getDetachedCriteria());
		nota = new StringExpression("nota", this.getDetachedCriteria());
		problemas = new CollectionExpression("ORM_Problemas", this.getDetachedCriteria());
	}
	
	public EvaluacionServicioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, EvaluacionServicioCriteria.class);
		evaluacionID = new IntegerExpression("evaluacionID", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.clienteID", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		calificacion = new IntegerExpression("calificacion", this.getDetachedCriteria());
		nota = new StringExpression("nota", this.getDetachedCriteria());
		problemas = new CollectionExpression("ORM_Problemas", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public ProblemaDetachedCriteria createProblemasCriteria() {
		return new ProblemaDetachedCriteria(createCriteria("ORM_Problemas"));
	}
	
	public EvaluacionServicio uniqueEvaluacionServicio(PersistentSession session) {
		return (EvaluacionServicio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EvaluacionServicio[] listEvaluacionServicio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EvaluacionServicio[]) list.toArray(new EvaluacionServicio[list.size()]);
	}
}

