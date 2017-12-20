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
public class EvaluacionServicio implements Serializable {
	public EvaluacionServicio() {
	}
	
	public static EvaluacionServicio loadEvaluacionServicioByORMID(int evaluacionID) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadEvaluacionServicioByORMID(session, evaluacionID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio getEvaluacionServicioByORMID(int evaluacionID) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return getEvaluacionServicioByORMID(session, evaluacionID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio loadEvaluacionServicioByORMID(int evaluacionID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadEvaluacionServicioByORMID(session, evaluacionID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio getEvaluacionServicioByORMID(int evaluacionID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return getEvaluacionServicioByORMID(session, evaluacionID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio loadEvaluacionServicioByORMID(PersistentSession session, int evaluacionID) throws PersistentException {
		try {
			return (EvaluacionServicio) session.load(EvaluacionServicio.class, new Integer(evaluacionID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio getEvaluacionServicioByORMID(PersistentSession session, int evaluacionID) throws PersistentException {
		try {
			return (EvaluacionServicio) session.get(EvaluacionServicio.class, new Integer(evaluacionID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio loadEvaluacionServicioByORMID(PersistentSession session, int evaluacionID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EvaluacionServicio) session.load(EvaluacionServicio.class, new Integer(evaluacionID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio getEvaluacionServicioByORMID(PersistentSession session, int evaluacionID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EvaluacionServicio) session.get(EvaluacionServicio.class, new Integer(evaluacionID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvaluacionServicio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return queryEvaluacionServicio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvaluacionServicio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return queryEvaluacionServicio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio[] listEvaluacionServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return listEvaluacionServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio[] listEvaluacionServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return listEvaluacionServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvaluacionServicio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EvaluacionServicio as EvaluacionServicio");
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
	
	public static List queryEvaluacionServicio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EvaluacionServicio as EvaluacionServicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EvaluacionServicio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio[] listEvaluacionServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEvaluacionServicio(session, condition, orderBy);
			return (EvaluacionServicio[]) list.toArray(new EvaluacionServicio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio[] listEvaluacionServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEvaluacionServicio(session, condition, orderBy, lockMode);
			return (EvaluacionServicio[]) list.toArray(new EvaluacionServicio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio loadEvaluacionServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadEvaluacionServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio loadEvaluacionServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadEvaluacionServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio loadEvaluacionServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EvaluacionServicio[] evaluacionServicios = listEvaluacionServicioByQuery(session, condition, orderBy);
		if (evaluacionServicios != null && evaluacionServicios.length > 0)
			return evaluacionServicios[0];
		else
			return null;
	}
	
	public static EvaluacionServicio loadEvaluacionServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EvaluacionServicio[] evaluacionServicios = listEvaluacionServicioByQuery(session, condition, orderBy, lockMode);
		if (evaluacionServicios != null && evaluacionServicios.length > 0)
			return evaluacionServicios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEvaluacionServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return iterateEvaluacionServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEvaluacionServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return iterateEvaluacionServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEvaluacionServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EvaluacionServicio as EvaluacionServicio");
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
	
	public static java.util.Iterator iterateEvaluacionServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EvaluacionServicio as EvaluacionServicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EvaluacionServicio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EvaluacionServicio loadEvaluacionServicioByCriteria(EvaluacionServicioCriteria evaluacionServicioCriteria) {
		EvaluacionServicio[] evaluacionServicios = listEvaluacionServicioByCriteria(evaluacionServicioCriteria);
		if(evaluacionServicios == null || evaluacionServicios.length == 0) {
			return null;
		}
		return evaluacionServicios[0];
	}
	
	public static EvaluacionServicio[] listEvaluacionServicioByCriteria(EvaluacionServicioCriteria evaluacionServicioCriteria) {
		return evaluacionServicioCriteria.listEvaluacionServicio();
	}
	
	public static EvaluacionServicio createEvaluacionServicio() {
		return new EvaluacionServicio();
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
			if(getCliente() != null) {
				getCliente().evaluacion.remove(this);
			}
			
			Problema[] lProblemass = problemas.toArray();
			for(int i = 0; i < lProblemass.length; i++) {
				lProblemass[i].setEvaluacion(null);
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
			if(getCliente() != null) {
				getCliente().evaluacion.remove(this);
			}
			
			Problema[] lProblemass = problemas.toArray();
			for(int i = 0; i < lProblemass.length; i++) {
				lProblemass[i].setEvaluacion(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EVALUACIONSERVICIO_PROBLEMAS) {
			return ORM_problemas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVALUACIONSERVICIO_CLIENTE) {
			this.cliente = (Cliente) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int evaluacionID;
	
	private Cliente cliente;
	
	private int calificacion;
	
	private String nota;
	
	private java.util.Set ORM_problemas = new java.util.HashSet();
	
	private void setEvaluacionID(int value) {
		this.evaluacionID = value;
	}
	
	public int getEvaluacionID() {
		return evaluacionID;
	}
	
	public int getORMID() {
		return getEvaluacionID();
	}
	
	public void setCalificacion(int value) {
		this.calificacion = value;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public void setNota(String value) {
		this.nota = value;
	}
	
	public String getNota() {
		return nota;
	}
	
	public void setCliente(Cliente value) {
		if (cliente != null) {
			cliente.evaluacion.remove(this);
		}
		if (value != null) {
			value.evaluacion.add(this);
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
	
	private void setORM_Problemas(java.util.Set value) {
		this.ORM_problemas = value;
	}
	
	private java.util.Set getORM_Problemas() {
		return ORM_problemas;
	}
	
	public final ProblemaSetCollection problemas = new ProblemaSetCollection(this, _ormAdapter, ORMConstants.KEY_EVALUACIONSERVICIO_PROBLEMAS, ORMConstants.KEY_PROBLEMA_EVALUACION, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getEvaluacionID());
	}
	
}
