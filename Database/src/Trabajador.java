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
public class Trabajador implements Serializable {
	public Trabajador() {
	}
	
	public static Trabajador loadTrabajadorByORMID(int trabajadorID) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadTrabajadorByORMID(session, trabajadorID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador getTrabajadorByORMID(int trabajadorID) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return getTrabajadorByORMID(session, trabajadorID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador loadTrabajadorByORMID(int trabajadorID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadTrabajadorByORMID(session, trabajadorID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador getTrabajadorByORMID(int trabajadorID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return getTrabajadorByORMID(session, trabajadorID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador loadTrabajadorByORMID(PersistentSession session, int trabajadorID) throws PersistentException {
		try {
			return (Trabajador) session.load(Trabajador.class, new Integer(trabajadorID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador getTrabajadorByORMID(PersistentSession session, int trabajadorID) throws PersistentException {
		try {
			return (Trabajador) session.get(Trabajador.class, new Integer(trabajadorID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador loadTrabajadorByORMID(PersistentSession session, int trabajadorID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Trabajador) session.load(Trabajador.class, new Integer(trabajadorID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador getTrabajadorByORMID(PersistentSession session, int trabajadorID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Trabajador) session.get(Trabajador.class, new Integer(trabajadorID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTrabajador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return queryTrabajador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTrabajador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return queryTrabajador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador[] listTrabajadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return listTrabajadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador[] listTrabajadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return listTrabajadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTrabajador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Trabajador as Trabajador");
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
	
	public static List queryTrabajador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Trabajador as Trabajador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Trabajador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador[] listTrabajadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTrabajador(session, condition, orderBy);
			return (Trabajador[]) list.toArray(new Trabajador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador[] listTrabajadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTrabajador(session, condition, orderBy, lockMode);
			return (Trabajador[]) list.toArray(new Trabajador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador loadTrabajadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadTrabajadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador loadTrabajadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadTrabajadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador loadTrabajadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Trabajador[] trabajadors = listTrabajadorByQuery(session, condition, orderBy);
		if (trabajadors != null && trabajadors.length > 0)
			return trabajadors[0];
		else
			return null;
	}
	
	public static Trabajador loadTrabajadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Trabajador[] trabajadors = listTrabajadorByQuery(session, condition, orderBy, lockMode);
		if (trabajadors != null && trabajadors.length > 0)
			return trabajadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTrabajadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return iterateTrabajadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTrabajadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return iterateTrabajadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTrabajadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Trabajador as Trabajador");
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
	
	public static java.util.Iterator iterateTrabajadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Trabajador as Trabajador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Trabajador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Trabajador loadTrabajadorByCriteria(TrabajadorCriteria trabajadorCriteria) {
		Trabajador[] trabajadors = listTrabajadorByCriteria(trabajadorCriteria);
		if(trabajadors == null || trabajadors.length == 0) {
			return null;
		}
		return trabajadors[0];
	}
	
	public static Trabajador[] listTrabajadorByCriteria(TrabajadorCriteria trabajadorCriteria) {
		return trabajadorCriteria.listTrabajador();
	}
	
	public static Trabajador createTrabajador() {
		return new Trabajador();
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
			Problema[] lProblemas = problema.toArray();
			for(int i = 0; i < lProblemas.length; i++) {
				lProblemas[i].setTrabajador(null);
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
			Problema[] lProblemas = problema.toArray();
			for(int i = 0; i < lProblemas.length; i++) {
				lProblemas[i].setTrabajador(null);
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
		if (key == ORMConstants.KEY_TRABAJADOR_PROBLEMA) {
			return ORM_problema;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int trabajadorID;
	
	private String trabajadorUsuario;
	
	private String trabajadorContrasena;
	
	private String trabajadorNombre;
	
	private Integer trabajadorCategoria;
	
	private java.util.Set ORM_problema = new java.util.HashSet();
	
	private void setTrabajadorID(int value) {
		this.trabajadorID = value;
	}
	
	public int getTrabajadorID() {
		return trabajadorID;
	}
	
	public int getORMID() {
		return getTrabajadorID();
	}
	
	public void setTrabajadorUsuario(String value) {
		this.trabajadorUsuario = value;
	}
	
	public String getTrabajadorUsuario() {
		return trabajadorUsuario;
	}
	
	public void setTrabajadorContrasena(String value) {
		this.trabajadorContrasena = value;
	}
	
	public String getTrabajadorContrasena() {
		return trabajadorContrasena;
	}
	
	public void setTrabajadorNombre(String value) {
		this.trabajadorNombre = value;
	}
	
	public String getTrabajadorNombre() {
		return trabajadorNombre;
	}
	
	public void setTrabajadorCategoria(int value) {
		setTrabajadorCategoria(new Integer(value));
	}
	
	public void setTrabajadorCategoria(Integer value) {
		this.trabajadorCategoria = value;
	}
	
	public Integer getTrabajadorCategoria() {
		return trabajadorCategoria;
	}
	
	private void setORM_Problema(java.util.Set value) {
		this.ORM_problema = value;
	}
	
	private java.util.Set getORM_Problema() {
		return ORM_problema;
	}
	
	public final ProblemaSetCollection problema = new ProblemaSetCollection(this, _ormAdapter, ORMConstants.KEY_TRABAJADOR_PROBLEMA, ORMConstants.KEY_PROBLEMA_TRABAJADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getTrabajadorID());
	}
	
}
