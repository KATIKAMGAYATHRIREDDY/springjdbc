package assignment.basic.dao;

import java.util.List;

import assignment.basic.model.Employee;
import basic.model.Student;

public interface EmployeeDao {
	void insert(Employee employee);
	void insert(List<Employee> employees);
	void delRecordById(int empid);
	int delRecordByNameORSem(String employeename, int age);
	//List<Employee> getAllEmployees();
	Employee findEmployeeById(int empid);
}
