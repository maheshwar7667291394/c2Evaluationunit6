package question4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import GEtEmfClass.GEtEMf;

public class GetsalariedEmp {
	public static void main(String[] args) {
		EntityManager em=GEtEMf.getEm();
		
		String jpql="from SalariedEmployee";
		
		Query q=em.createQuery(jpql);
		
		List<SalariedEmployee[] > se=q.getResultList();
//		 for(SalariedEmployee[] sle:se) {
//			 System.out.println(sle);
//		 }
		System.out.println(se);
	}

}
