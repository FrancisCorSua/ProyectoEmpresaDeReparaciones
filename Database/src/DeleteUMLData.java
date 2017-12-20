/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class DeleteUMLData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = UMLPersistentManager.instance().getSession().beginTransaction();
		try {
			Cliente cliente = Cliente.loadClienteByQuery(null, null);
			cliente.delete();
			Trabajador trabajador = Trabajador.loadTrabajadorByQuery(null, null);
			trabajador.delete();
			Problema problema = Problema.loadProblemaByQuery(null, null);
			problema.delete();
			EvaluacionServicio evaluacionServicio = EvaluacionServicio.loadEvaluacionServicioByQuery(null, null);
			evaluacionServicio.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteUMLData deleteUMLData = new DeleteUMLData();
			try {
				deleteUMLData.deleteTestData();
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
