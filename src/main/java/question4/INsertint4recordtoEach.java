package question4;

import javax.persistence.EntityManager;

import GEtEmfClass.GEtEMf;

public class INsertint4recordtoEach {
	
	public static void main(String[] args) {
		EntityManager em=GEtEMf.getEm();
		
		Employee emp=new Employee();
		emp.setEmpName("ramlal");
		
		SalariedEmployee emp1=new SalariedEmployee();
		emp1.setEmpName("hiralal");
		emp1.setEmail("M@.com");
		emp1.setSalary(8500);
		
		SalariedEmployee emp2=new SalariedEmployee();
		emp1.setEmpName("khirala");
		emp1.setEmail("M@.com");
		emp1.setSalary(8500);
		
		SalariedEmployee emp3=new SalariedEmployee();
		emp1.setEmpName("Ramirala");
		emp1.setEmail("M@.com");
		emp1.setSalary(8500);
		
		SalariedEmployee emp4=new SalariedEmployee();
		emp1.setEmpName("banawarilal");
		emp1.setEmail("M@.com");
		emp1.setSalary(8500);
		
		
		ConractualEmployee con=new ConractualEmployee();
		con.setEmpName("mohan");
		con.setCostofperday(300);
		con.setMobileNumber(89890);
		con.setNoOfWorkingDays(10);
		
		ConractualEmployee con2=new ConractualEmployee();
		con.setEmpName("hira");
		con.setCostofperday(1300);
		con.setMobileNumber(89890);
		con.setNoOfWorkingDays(10);
		
		ConractualEmployee con3=new ConractualEmployee();
		con.setEmpName("ramnlal");
		con.setCostofperday(300);
		con.setMobileNumber(89890);
		con.setNoOfWorkingDays(10);
		
		ConractualEmployee con4=new ConractualEmployee();
		con.setEmpName("sanjay");
		con.setCostofperday(300);
		con.setMobileNumber(89890);
		con.setNoOfWorkingDays(10);
		
		em.getTransaction().begin();
//		    em.persist(emp);
			em.persist(emp1);
			em.persist(emp2);
			em.persist(emp3);
			em.persist(emp4);
			
			em.persist(con);
			em.persist(con2);
			em.persist(con3);
			em.persist(con4);
			
			em.getTransaction().commit();
			em.close();
			
			System.out.println("done.....");
	
		
	}

}
