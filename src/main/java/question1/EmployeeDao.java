package question1;

import java.util.List;

import Exceptionclass.DepartmentException;
import Exceptionclass.EmployeeException;

public interface EmployeeDao {
	
	public void addDepartment(Department dept);
    public void addEmployee(Employee emp);
    
    public void registerEmployeeTODepartment(int empId, int deptId)throws Exception;
    
     List<Employee> getAllEmployeeWithDeptName(String deptName)throws  Exception;
   


}
