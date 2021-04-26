package assignment.basic;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignment.basic.dao.EmployeeDao;
import assignment.basic.dao.EmployeeDaoImpl;
import assignment.basic.model.Employee;
import basic.dao.StudentDao;
import basic.dao.StudentDaoImpl;
import basic.model.Student;

public class PlayJDBC {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		

		EmployeeDaoImpl employeeDao = (EmployeeDaoImpl) context.getBean("employeeDao");
		//EmployeeDaoHelper helper=context.getBean("employeeDaoHelper",EmployeeDaoHelper.class);
		//helper.insertEmployees();
		//System.out.println(employeeDao.findEmployeeById(3));
		
		//List<Employee> employees=employeeDao.getAllEmployees();
		//printEmployees(employees);
		//employeeDao.delRecordById(13);
		//insertEmployee(employeeDao);
		//employeeDao.cleanUp();
		//employeeDao.delRecordByNameSem("Gayathri", 23);


		
	}

	
	private static void printEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub
		for(Employee e: employees) {
			System.out.println(e);

		}
	}


	private static void insertEmployee(EmployeeDaoImpl employeeDao) {
		Employee Employee1 = new Employee(1, "Gayathri", 22, 80000);
		Employee Employee2 = new Employee(2, "Akhila", 23, 60000);
		Employee Employee3 = new Employee(3, "Yogitha", 24, 60000);
		Employee Employee4 = new Employee(4, "Divya", 21, 50000);
		Employee Employee5 = new Employee(5, "Amitha", 25, 70000);


		
		employeeDao.insert(Employee5);
	}

}
