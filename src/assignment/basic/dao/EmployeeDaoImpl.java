package assignment.basic.dao;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import assignment.basic.model.Employee;


@Repository("employeeDao")
public class EmployeeDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate ;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




	
	public void insert(Employee employee) {
		
		String sql = "INSERT INTO employee VALUES (?,?,?,?)";
		Object[] objects =	{employee.getempid(),employee.getname(),employee.getage(),employee.getsalary()};

		int no_rows_inserted =	jdbcTemplate.update(sql,objects);
		System.out.println("no of rows inserted  is"+ no_rows_inserted);
	}




	
	public void delRecordById(int empid) {
		String delSql = "DELETE FROM employee WHERE empid = ?";
		int noRecordsDeleted = jdbcTemplate.update(delSql,empid);
		System.out.println("no of records deleted = "+ noRecordsDeleted);
	}




	
	public int delRecordByNameORSem(String employeename, int age) {
		String sql = "DELETE FROM employee WHERE name = ? OR age = ?"; //replace OR with AND and see the results
		Object[] objects = {employeename,age};
		int noRecordsDeleted = jdbcTemplate.update(sql, objects);
		System.out.println("no of records deleted ="+ noRecordsDeleted);
		return noRecordsDeleted;
	}

	public void cleanUp() {
		String sql = "TRUNCATE TABLE employee";
		jdbcTemplate.update(sql);
		System.out.println("table cleaned");
	}




	
	public void insert(List<Employee> employees) {
		String sql = "INSERT INTO employee VALUES (?,?,?,?)";
		ArrayList<Object[]> sqlArgs = new ArrayList<>();
		for(Employee employee : employees) {
			Object[] employeeData =	{employee.getempid(),employee.getname(),employee.getage(),employee.getsalary()};
			sqlArgs.add(employeeData);
		}
		
		jdbcTemplate.batchUpdate(sql, sqlArgs);
	}




	/*
	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM employee";
		List<Employee> employees = jdbcTemplate.query(sql,new EmployeeResultSetExtractor());
			
		return employees;
	}     */




	
	public Employee findEmployeeById(int empid) {
		String sql = "SELECT * FROM employee WHERE empid = ?";
		Employee employee =	jdbcTemplate.queryForObject(sql, 
				new BeanPropertyRowMapper<Employee>(Employee.class),empid);
		return employee;
	}
	



}
