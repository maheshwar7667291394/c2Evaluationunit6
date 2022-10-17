package question1;

import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.ComponentInputMapUIResource;

public class Main {
	
	public static void main(String[] args) {
		
		EmployeeDao emdao=new ImplementDao();
		System.out.println("Enter 1 to perform addDepartment(Department dept)");
		System.out.println("Enter 2 to perfor addEmployee(Employee emp)");
		System.out.println("Enter 3 Fro Registration employee");
		System.out.println("Enter 4 for List Employee ");
		
		Scanner input=new Scanner(System.in);
		int sc=input.nextInt();
		
		Address add=new Address();
		add.setCity("patna");
		add.setPincode("889");
		add.setState("rajsthan");
		
		
		
		switch(sc) {
		case 1:
		
			Department dept=new Department();
			dept.setDeptName("HR");
			dept.setLocation("patna");
			emdao.addDepartment(dept);
			break;
				
		case 2:
			  Employee emp=new Employee();
			  emp.setEmpName("mahesh");
			  emp.setSalary(45858);
			  emp.setAddress(add);
			  emdao.addEmployee(emp);
			  break;
			  
		case 3:
			System.out.println("Ënter DeptId");
			int depId=input.nextInt();
			
			System.out.println("Enter EmpId");
			int empId=input.nextInt();
			try {
				emdao.registerEmployeeTODepartment(empId, depId);
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			 System.out.println("Enter dname");
			 String name=input.next();
			 try {
			List<Employee> emp1=emdao.getAllEmployeeWithDeptName(name);
			  emp1.forEach(m->{
				  System.out.println(m.getEmpName());
				  System.out.println(m.getSalary());
				  System.out.println(m.getAddress());
				  System.out.println("===========");
			  });
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			 
			   
			  
			  
			
			default:
				System.out.println("no operation performed");
		}
		
		
	}

}
