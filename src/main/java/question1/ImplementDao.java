package question1;

import java.util.List;

import javax.persistence.EntityManager;

import com.mysql.cj.Query;

import Exceptionclass.DepartmentException;
import Exceptionclass.EmployeeException;
import GEtEmfClass.GEtEMf;

public class ImplementDao implements EmployeeDao{

	@Override
	public void addDepartment(Department dept) {
	EntityManager em=GEtEMf.getEm();
	em.getTransaction().begin();
	em.persist(dept);
	em.getTransaction().commit();
	em.close();
	System.out.println("department inserted");
		
	}

	@Override
	public void addEmployee(Employee emp) {
		EntityManager em=GEtEMf.getEm();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
		System.out.println("employee is added");
		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws Exception {
		EntityManager em=GEtEMf.getEm();
		Department d=em.find(Department.class, deptId);
		if(d==null) {
			DepartmentException dex=new DepartmentException("department not faoun");
			throw dex;
		}
		else {
			Employee emp=em.find(Employee.class, empId);
			if(emp!=null) {
				throw new EmployeeException("Employee already exist provide other ID");
			}
			else {
				d.getEmp().add(emp);
			}
			
		}
		System.out.println("registration sussfull");
		
		
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws Exception {
		EntityManager em=GEtEMf.getEm();
		String jpql="select emp from Department where deptName=:nm";
		javax.persistence.Query q=em.createQuery(jpql);
		
		List<Employee> emp=q.getResultList();
		return emp;
		
	}

}
