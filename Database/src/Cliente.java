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
public class Cliente implements Serializable {
	public Cliente() {
	}
	
	public static Cliente loadClienteByORMID(int clienteID) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadClienteByORMID(session, clienteID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente getClienteByORMID(int clienteID) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return getClienteByORMID(session, clienteID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByORMID(int clienteID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadClienteByORMID(session, clienteID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente getClienteByORMID(int clienteID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return getClienteByORMID(session, clienteID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByORMID(PersistentSession session, int clienteID) throws PersistentException {
		try {
			return (Cliente) session.load(Cliente.class, new Integer(clienteID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente getClienteByORMID(PersistentSession session, int clienteID) throws PersistentException {
		try {
			return (Cliente) session.get(Cliente.class, new Integer(clienteID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByORMID(PersistentSession session, int clienteID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cliente) session.load(Cliente.class, new Integer(clienteID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente getClienteByORMID(PersistentSession session, int clienteID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cliente) session.get(Cliente.class, new Integer(clienteID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCliente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return queryCliente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCliente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return queryCliente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente[] listClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return listClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente[] listClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return listClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCliente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cliente as Cliente");
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
	
	public static List queryCliente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cliente as Cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cliente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente[] listClienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCliente(session, condition, orderBy);
			return (Cliente[]) list.toArray(new Cliente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente[] listClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCliente(session, condition, orderBy, lockMode);
			return (Cliente[]) list.toArray(new Cliente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return loadClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cliente[] clientes = listClienteByQuery(session, condition, orderBy);
		if (clientes != null && clientes.length > 0)
			return clientes[0];
		else
			return null;
	}
	
	public static Cliente loadClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cliente[] clientes = listClienteByQuery(session, condition, orderBy, lockMode);
		if (clientes != null && clientes.length > 0)
			return clientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return iterateClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = UMLPersistentManager.instance().getSession();
			return iterateClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cliente as Cliente");
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
	
	public static java.util.Iterator iterateClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cliente as Cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cliente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByCriteria(ClienteCriteria clienteCriteria) {
		Cliente[] clientes = listClienteByCriteria(clienteCriteria);
		if(clientes == null || clientes.length == 0) {
			return null;
		}
		return clientes[0];
	}
	
	public static Cliente[] listClienteByCriteria(ClienteCriteria clienteCriteria) {
		return clienteCriteria.listCliente();
	}
	
	public static Cliente createCliente() {
		return new Cliente();
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
				lProblemas[i].setCliente(null);
			}
			EvaluacionServicio[] lEvaluacions = evaluacion.toArray();
			for(int i = 0; i < lEvaluacions.length; i++) {
				lEvaluacions[i].setCliente(null);
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
				lProblemas[i].setCliente(null);
			}
			EvaluacionServicio[] lEvaluacions = evaluacion.toArray();
			for(int i = 0; i < lEvaluacions.length; i++) {
				lEvaluacions[i].setCliente(null);
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
		if (key == ORMConstants.KEY_CLIENTE_PROBLEMA) {
			return ORM_problema;
		}
		else if (key == ORMConstants.KEY_CLIENTE_EVALUACION) {
			return ORM_evaluacion;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int clienteID;
	
	private String clienteUsuario;
	
	private String clienteContrasena;
	
	private String clienteNombre;
	
	private String codigoPostal;
	
	private String clienteTelefono;
	
	private java.util.Set ORM_problema = new java.util.HashSet();
	
	private java.util.Set ORM_evaluacion = new java.util.HashSet();
	
	private void setClienteID(int value) {
		this.clienteID = value;
	}
	
	public int getClienteID() {
		return clienteID;
	}
	
	public int getORMID() {
		return getClienteID();
	}
	
	public void setClienteUsuario(String value) {
		this.clienteUsuario = value;
	}
	
	public String getClienteUsuario() {
		return clienteUsuario;
	}
	
	public void setClienteContrasena(String value) {
		this.clienteContrasena = value;
	}
	
	public String getClienteContrasena() {
		return clienteContrasena;
	}
	
	public void setClienteNombre(String value) {
		this.clienteNombre = value;
	}
	
	public String getClienteNombre() {
		return clienteNombre;
	}
	
	public void setCodigoPostal(String value) {
		this.codigoPostal = value;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setClienteTelefono(String value) {
		this.clienteTelefono = value;
	}
	
	public String getClienteTelefono() {
		return clienteTelefono;
	}
	
	private void setORM_Problema(java.util.Set value) {
		this.ORM_problema = value;
	}
	
	private java.util.Set getORM_Problema() {
		return ORM_problema;
	}
	
	public final ProblemaSetCollection problema = new ProblemaSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_PROBLEMA, ORMConstants.KEY_PROBLEMA_CLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Evaluacion(java.util.Set value) {
		this.ORM_evaluacion = value;
	}
	
	private java.util.Set getORM_Evaluacion() {
		return ORM_evaluacion;
	}
	
	public final EvaluacionServicioSetCollection evaluacion = new EvaluacionServicioSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_EVALUACION, ORMConstants.KEY_EVALUACIONSERVICIO_CLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getClienteID());
	}
	
}
