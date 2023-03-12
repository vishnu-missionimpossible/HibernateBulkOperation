package in.ineuron.main;


import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.Model.Employee;
import in.ineuron.util.HibernateUtil;

public class SelectRecordApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session =HibernateUtil.getSession();
		
		try {
			
			
			Query<Employee> query= session.createQuery("FROM in.ineuron.Model.Employee WHERE eno=:id");
	        query.setParameter("id", 9);
	        Optional<Employee> optional= query.uniqueResultOptional();
	        if (optional.isPresent()) {
				Employee employee = optional.get();
				System.out.println(employee);
			}else {
				System.out.println("No Record found");
			}
				
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
