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

public class ClienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression clienteID;
	public final StringExpression clienteUsuario;
	public final StringExpression clienteContrasena;
	public final StringExpression clienteNombre;
	public final StringExpression codigoPostal;
	public final StringExpression clienteTelefono;
	public final CollectionExpression problema;
	public final CollectionExpression evaluacion;
	
	public ClienteDetachedCriteria() {
		super(Cliente.class, ClienteCriteria.class);
		clienteID = new IntegerExpression("clienteID", this.getDetachedCriteria());
		clienteUsuario = new StringExpression("clienteUsuario", this.getDetachedCriteria());
		clienteContrasena = new StringExpression("clienteContrasena", this.getDetachedCriteria());
		clienteNombre = new StringExpression("clienteNombre", this.getDetachedCriteria());
		codigoPostal = new StringExpression("codigoPostal", this.getDetachedCriteria());
		clienteTelefono = new StringExpression("clienteTelefono", this.getDetachedCriteria());
		problema = new CollectionExpression("ORM_Problema", this.getDetachedCriteria());
		evaluacion = new CollectionExpression("ORM_Evaluacion", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ClienteCriteria.class);
		clienteID = new IntegerExpression("clienteID", this.getDetachedCriteria());
		clienteUsuario = new StringExpression("clienteUsuario", this.getDetachedCriteria());
		clienteContrasena = new StringExpression("clienteContrasena", this.getDetachedCriteria());
		clienteNombre = new StringExpression("clienteNombre", this.getDetachedCriteria());
		codigoPostal = new StringExpression("codigoPostal", this.getDetachedCriteria());
		clienteTelefono = new StringExpression("clienteTelefono", this.getDetachedCriteria());
		problema = new CollectionExpression("ORM_Problema", this.getDetachedCriteria());
		evaluacion = new CollectionExpression("ORM_Evaluacion", this.getDetachedCriteria());
	}
	
	public ProblemaDetachedCriteria createProblemaCriteria() {
		return new ProblemaDetachedCriteria(createCriteria("ORM_Problema"));
	}
	
	public EvaluacionServicioDetachedCriteria createEvaluacionCriteria() {
		return new EvaluacionServicioDetachedCriteria(createCriteria("ORM_Evaluacion"));
	}
	
	public Cliente uniqueCliente(PersistentSession session) {
		return (Cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente[] listCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

