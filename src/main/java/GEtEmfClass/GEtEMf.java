package GEtEmfClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GEtEMf {
	
	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("empUnit");
	}
	
	public static EntityManager  getEm() {
		EntityManager em=emf.createEntityManager();
		return em;
	}
	

}
