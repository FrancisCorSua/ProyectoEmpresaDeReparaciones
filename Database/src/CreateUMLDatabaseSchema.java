/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateUMLDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(UMLPersistentManager.instance());
			UMLPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
