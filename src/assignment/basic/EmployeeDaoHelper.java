package assignment.basic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment.basic.dao.EmployeeDao;
import assignment.basic.model.Employee;
import basic.dao.StudentDao;
import basic.model.Student;

@Service("employeeDaoHelper")
public class EmployeeDaoHelper {
	@Autowired
	EmployeeDao employeeDaoImpl;
	void insertEmployees(){
		Employee e1 = new Employee(1, "employees name1", 22, 10000);
		Employee e2 = new Employee(2, "employees name2", 20, 30000);
		Employee e3 = new Employee(3, "employees name3", 21, 20000);
		Employee e4 = new Employee(4, "employees name4", 23, 40000);
		Employee e5 = new Employee(5, "employees name5", 24, 50000);

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);

		employeeDaoImpl.insert(employees);
		System.out.println("batch updated complete..");

	}
}
