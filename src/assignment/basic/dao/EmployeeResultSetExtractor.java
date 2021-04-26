package assignment.basic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;

import assignment.basic.model.Employee;



public class EmployeeResultSetExtractor {
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		System.out.println("extractData method called");
		List<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			Employee employee = new Employee();
			employee.setempid(rs.getInt("id"));
			employee.setname(rs.getString("name"));
			employee.setage(rs.getInt("sem"));
			employee.setsalary(rs.getInt("average"));
			employees.add(employee);
		}
		
		return employees;
	}

}
