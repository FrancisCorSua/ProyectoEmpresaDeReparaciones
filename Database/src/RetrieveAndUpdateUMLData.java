/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class RetrieveAndUpdateUMLData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = UMLPersistentManager.instance().getSession().beginTransaction();
		try {
			Cliente cliente = Cliente.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			cliente.save();
			Trabajador trabajador = Trabajador.loadTrabajadorByQuery(null, null);
			// Update the properties of the persistent object
			trabajador.save();
			Problema problema = Problema.loadProblemaByQuery(null, null);
			// Update the properties of the persistent object
			problema.save();
			EvaluacionServicio evaluacionServicio = EvaluacionServicio.loadEvaluacionServicioByQuery(null, null);
			// Update the properties of the persistent object
			evaluacionServicio.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Cliente by ClienteCriteria");
		ClienteCriteria clienteCriteria = new ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//clienteCriteria.clienteID.eq();
		System.out.println(clienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Trabajador by TrabajadorCriteria");
		TrabajadorCriteria trabajadorCriteria = new TrabajadorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//trabajadorCriteria.trabajadorID.eq();
		System.out.println(trabajadorCriteria.uniqueTrabajador());
		
		System.out.println("Retrieving Problema by ProblemaCriteria");
		ProblemaCriteria problemaCriteria = new ProblemaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//problemaCriteria.problemaID.eq();
		System.out.println(problemaCriteria.uniqueProblema());
		
		System.out.println("Retrieving EvaluacionServicio by EvaluacionServicioCriteria");
		EvaluacionServicioCriteria evaluacionServicioCriteria = new EvaluacionServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//evaluacionServicioCriteria.evaluacionID.eq();
		System.out.println(evaluacionServicioCriteria.uniqueEvaluacionServicio());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateUMLData retrieveAndUpdateUMLData = new RetrieveAndUpdateUMLData();
			try {
				retrieveAndUpdateUMLData.retrieveAndUpdateTestData();
				//retrieveAndUpdateUMLData.retrieveByCriteria();
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
