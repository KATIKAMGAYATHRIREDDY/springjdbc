package basic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.dao.StudentDao;
import basic.dao.StudentDaoImpl;
import basic.model.Student;
public class PlayJdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDaoHelper helper=context.getBean("studentDaoHelper",StudentDaoHelper.class);
		helper.insertStudents();

		//StudentDaoImpl studentDao = (StudentDaoImpl) context.getBean("studentDao");
		//studentDao.delRecordById(13);
		//insertStudent(studentDao);
		//studentDao.cleanUp();
		//studentDao.delRecordByNameSem("Gayathri", 5);


		
	}

	
	private static void insertStudent(StudentDao studentDao) {
		Student Student1 = new Student(1, "Gayathri", 5, 55);
		Student Student2 = new Student(2,"Akhila",6,66);
		Student Student3 = new Student(3,"Yogitha",7,77);
		Student Student4 = new Student(4,"Amitha",8,88);
		Student Student5 = new Student(5,"Divya",9,99);

		//= new StudentDaoImpl();
		studentDao.insert(Student2);
	}

}
