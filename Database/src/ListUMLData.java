/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class ListUMLData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cliente...");
		Cliente[] clientes = Cliente.listClienteByQuery(null, null);
		int length = Math.min(clientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Trabajador...");
		Trabajador[] trabajadors = Trabajador.listTrabajadorByQuery(null, null);
		length = Math.min(trabajadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(trabajadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Problema...");
		Problema[] problemas = Problema.listProblemaByQuery(null, null);
		length = Math.min(problemas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(problemas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EvaluacionServicio...");
		EvaluacionServicio[] evaluacionServicios = EvaluacionServicio.listEvaluacionServicioByQuery(null, null);
		length = Math.min(evaluacionServicios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(evaluacionServicios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Cliente by Criteria...");
		ClienteCriteria clienteCriteria = new ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//clienteCriteria.clienteID.eq();
		clienteCriteria.setMaxResults(ROW_COUNT);
		Cliente[] clientes = clienteCriteria.listCliente();
		int length =clientes== null ? 0 : Math.min(clientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(clientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Trabajador by Criteria...");
		TrabajadorCriteria trabajadorCriteria = new TrabajadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//trabajadorCriteria.trabajadorID.eq();
		trabajadorCriteria.setMaxResults(ROW_COUNT);
		Trabajador[] trabajadors = trabajadorCriteria.listTrabajador();
		length =trabajadors== null ? 0 : Math.min(trabajadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(trabajadors[i]);
		}
		System.out.println(length + " Trabajador record(s) retrieved."); 
		
		System.out.println("Listing Problema by Criteria...");
		ProblemaCriteria problemaCriteria = new ProblemaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//problemaCriteria.problemaID.eq();
		problemaCriteria.setMaxResults(ROW_COUNT);
		Problema[] problemas = problemaCriteria.listProblema();
		length =problemas== null ? 0 : Math.min(problemas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(problemas[i]);
		}
		System.out.println(length + " Problema record(s) retrieved."); 
		
		System.out.println("Listing EvaluacionServicio by Criteria...");
		EvaluacionServicioCriteria evaluacionServicioCriteria = new EvaluacionServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//evaluacionServicioCriteria.evaluacionID.eq();
		evaluacionServicioCriteria.setMaxResults(ROW_COUNT);
		EvaluacionServicio[] evaluacionServicios = evaluacionServicioCriteria.listEvaluacionServicio();
		length =evaluacionServicios== null ? 0 : Math.min(evaluacionServicios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(evaluacionServicios[i]);
		}
		System.out.println(length + " EvaluacionServicio record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListUMLData listUMLData = new ListUMLData();
			try {
				listUMLData.listTestData();
				//listUMLData.listByCriteria();
			}
			finally {
				UMLPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
