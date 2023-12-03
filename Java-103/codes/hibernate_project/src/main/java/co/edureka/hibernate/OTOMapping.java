package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Address;
import co.edureka.hibernate.entity.Employee;
import co.edureka.hibernate.utils.HibernateUtils;

public class OTOMapping {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("Sunil Joseph");
		
		Address addr = new Address("Mothinagar", "Hyderabad", "Telangana");
		emp.setAddress(addr);
		
		session.save(emp);
		
		tx.commit();
		
		session.close();
		sfactory.close();		

	}

}
