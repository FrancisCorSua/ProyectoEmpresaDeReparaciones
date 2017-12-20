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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
public class Problema implements Serializable {
	public Problema() {
	}
	
	public static Problema loadProblemaByORMID(int problemaID) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadProblemaByORMID(session, problemaID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema getProblemaByORMID(int problemaID) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return getProblemaByORMID(session, problemaID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema loadProblemaByORMID(int problemaID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadProblemaByORMID(session, problemaID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema getProblemaByORMID(int problemaID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return getProblemaByORMID(session, problemaID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema loadProblemaByORMID(PersistentSession session, int problemaID) throws PersistentException {
		try {
			return (Problema) session.load(Problema.class, new Integer(problemaID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema getProblemaByORMID(PersistentSession session, int problemaID) throws PersistentException {
		try {
			return (Problema) session.get(Problema.class, new Integer(problemaID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema loadProblemaByORMID(PersistentSession session, int problemaID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Problema) session.load(Problema.class, new Integer(problemaID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema getProblemaByORMID(PersistentSession session, int problemaID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Problema) session.get(Problema.class, new Integer(problemaID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProblema(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return queryProblema(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProblema(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return queryProblema(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema[] listProblemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return listProblemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema[] listProblemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return listProblemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProblema(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Problema as Problema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProblema(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Problema as Problema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Problema", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema[] listProblemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProblema(session, condition, orderBy);
			return (Problema[]) list.toArray(new Problema[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema[] listProblemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProblema(session, condition, orderBy, lockMode);
			return (Problema[]) list.toArray(new Problema[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema loadProblemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadProblemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema loadProblemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadProblemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema loadProblemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Problema[] problemas = listProblemaByQuery(session, condition, orderBy);
		if (problemas != null && problemas.length > 0)
			return problemas[0];
		else
			return null;
	}
	
	public static Problema loadProblemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Problema[] problemas = listProblemaByQuery(session, condition, orderBy, lockMode);
		if (problemas != null && problemas.length > 0)
			return problemas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProblemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return iterateProblemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProblemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return iterateProblemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProblemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Problema as Problema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProblemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Problema as Problema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Problema", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Problema loadProblemaByCriteria(ProblemaCriteria problemaCriteria) {
		Problema[] problemas = listProblemaByCriteria(problemaCriteria);
		if(problemas == null || problemas.length == 0) {
			return null;
		}
		return problemas[0];
	}
	
	public static Problema[] listProblemaByCriteria(ProblemaCriteria problemaCriteria) {
		return problemaCriteria.listProblema();
	}
	
	public static Problema createProblema() {
		return new Problema();
	}
	
	public boolean save() throws PersistentException {
		try {
			UMLPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			UMLPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			UMLPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			UMLPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getEvaluacion() != null) {
				getEvaluacion().problemas.remove(this);
			}
			
			if(getTrabajador() != null) {
				getTrabajador().problema.remove(this);
			}
			
			if(getCliente() != null) {
				getCliente().problema.remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getEvaluacion() != null) {
				getEvaluacion().problemas.remove(this);
			}
			
			if(getTrabajador() != null) {
				getTrabajador().problema.remove(this);
			}
			
			if(getCliente() != null) {
				getCliente().problema.remove(this);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PROBLEMA_CLIENTE) {
			this.cliente = (Cliente) owner;
		}
		
		else if (key == ORMConstants.KEY_PROBLEMA_EVALUACION) {
			this.evaluacion = (EvaluacionServicio) owner;
		}
		
		else if (key == ORMConstants.KEY_PROBLEMA_TRABAJADOR) {
			this.trabajador = (Trabajador) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int problemaID;
	
	private EvaluacionServicio evaluacion;
	
	private Trabajador trabajador;
	
	private Cliente cliente;
	
	private Integer problemaCategoria;
	
	private String problemaNota;
	
	private Integer problemaEstado;
	
	private date problemaFecha;
	
	private String trabajadorSolicitado;
	
	private void setProblemaID(int value) {
		this.problemaID = value;
	}
	
	public int getProblemaID() {
		return problemaID;
	}
	
	public int getORMID() {
		return getProblemaID();
	}
	
	public void setProblemaCategoria(int value) {
		setProblemaCategoria(new Integer(value));
	}
	
	public void setProblemaCategoria(Integer value) {
		this.problemaCategoria = value;
	}
	
	public Integer getProblemaCategoria() {
		return problemaCategoria;
	}
	
	public void setProblemaNota(String value) {
		this.problemaNota = value;
	}
	
	public String getProblemaNota() {
		return problemaNota;
	}
	
	public void setProblemaEstado(int value) {
		setProblemaEstado(new Integer(value));
	}
	
	public void setProblemaEstado(Integer value) {
		this.problemaEstado = value;
	}
	
	public Integer getProblemaEstado() {
		return problemaEstado;
	}
	
	public void setProblemaFecha(date value) {
		this.problemaFecha = value;
	}
	
	public date getProblemaFecha() {
		return problemaFecha;
	}
	
	public void setTrabajadorSolicitado(String value) {
		this.trabajadorSolicitado = value;
	}
	
	public String getTrabajadorSolicitado() {
		return trabajadorSolicitado;
	}
	
	public void setCliente(Cliente value) {
		if (cliente != null) {
			cliente.problema.remove(this);
		}
		if (value != null) {
			value.problema.add(this);
		}
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Cliente(Cliente value) {
		this.cliente = value;
	}
	
	private Cliente getORM_Cliente() {
		return cliente;
	}
	
	public void setEvaluacion(EvaluacionServicio value) {
		if (evaluacion != null) {
			evaluacion.problemas.remove(this);
		}
		if (value != null) {
			value.problemas.add(this);
		}
	}
	
	public EvaluacionServicio getEvaluacion() {
		return evaluacion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Evaluacion(EvaluacionServicio value) {
		this.evaluacion = value;
	}
	
	private EvaluacionServicio getORM_Evaluacion() {
		return evaluacion;
	}
	
	public void setTrabajador(Trabajador value) {
		if (trabajador != null) {
			trabajador.problema.remove(this);
		}
		if (value != null) {
			value.problema.add(this);
		}
	}
	
	public Trabajador getTrabajador() {
		return trabajador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Trabajador(Trabajador value) {
		this.trabajador = value;
	}
	
	private Trabajador getORM_Trabajador() {
		return trabajador;
	}
	
	public String toString() {
		return String.valueOf(getProblemaID());
	}
	
}
