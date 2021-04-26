package assignment.basic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import assignment.basic.model.Employee;



public class EmployeeRowMapper {
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		int empid = rs.getInt("empid");
		String name = rs.getString("name");
		int age = rs.getInt("age");
		int salary = rs.getInt("salary");
		Employee newEmployee = new Employee(empid,name,age,salary);
		System.out.println("maprow method called");
		return newEmployee;
	}
}
