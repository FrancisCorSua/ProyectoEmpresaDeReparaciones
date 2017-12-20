/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateUMLData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = UMLPersistentManager.instance().getSession().beginTransaction();
		try {
			Cliente cliente = Cliente.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evaluacion, problema
			cliente.save();
			Trabajador trabajador = Trabajador.createTrabajador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : problema
			trabajador.save();
			Problema problema = Problema.createProblema();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cliente, trabajador, evaluacion
			problema.save();
			EvaluacionServicio evaluacionServicio = EvaluacionServicio.createEvaluacionServicio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : problemas, calificacion, cliente
			evaluacionServicio.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateUMLData createUMLData = new CreateUMLData();
			try {
				createUMLData.createTestData();
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
