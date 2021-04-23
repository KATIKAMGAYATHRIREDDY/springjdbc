package basic;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import basic.dao.StudentDao;
import basic.model.Student;
@Service("studentDaoHelper")
public class StudentDaoHelper {
	@Autowired

	StudentDao studentDaoImpl;
	
void insertStudents() {
	Student s1=new Student(1,"stuname1",1,11);
	Student s2=new Student(2,"stuname2",1,11);
	Student s3=new Student(3,"stuname3",1,11);
	Student s4=new Student(4,"stuname4",1,11);
	Student s5=new Student(5,"stuname5",1,11);
	ArrayList<Student> students=new ArrayList<>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	students.add(s5);
	studentDaoImpl.insert(students);
	System.out.println("batch updated completed...");


}
}
