package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName LIKE 'S%'";
		String hql = "from co.edureka.hibernate.entity.Student where studentId IN (101, 202, 105, 300, 106, 108)";
		
		Query<Student> q = session.createQuery(hql, Student.class);
		List<Student> students = q.getResultList();
		printStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?1 and ?2"; //positional parameters		
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter(1, 101);
		q.setParameter(2, 105);
		List<Student> students = q.getResultList();
		printStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters		
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter("minsid", 105);
		q.setParameter("maxsid", 300);
		List<Student> students = q.getResultList();
		printStudents(students);
		*/
		
		//-------- DML operation (update) with HQL ----------
		String hql = "update co.edureka.hibernate.entity.Student set studentName='Srinivas Reddy', studentEmail='srinu@edureka.co' where studentId=111";
		session.beginTransaction();
		Query q = session.createQuery(hql);
		int n = q.executeUpdate();
		System.out.println("students updated = " + n);
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}

	private static void printStudents(List<Student> students) {
		for(Student st : students) {
			System.out.println(st);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
	}

}
