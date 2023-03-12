package in.ineuron.main;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.Model.Employee;
import in.ineuron.util.HibernateUtil;

public class SelectRecordApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session =HibernateUtil.getSession();
		
		try {
			
			
			Query query= session.createQuery("SELECT ename FROM in.ineuron.Model.Employee WHERE eno=:id");
	        query.setParameter("id", 9);
	        List<String> list = query.getResultList();
	        if (!list.isEmpty()) {
				System.out.println("Name of the employee is :: "+list.get(0));
			}else {
				System.out.println("No Record found");
			}
				
		}
		
		/*try {
			
			
			Query query= session.createQuery("SELECT ename FROM in.ineuron.Model.Employee WHERE eno=:id");
	        query.setParameter("id", 9);
	        Object obj = query.getResultList();
	        if (obj!=null) {
				System.out.println("Name of the employee is :: "+obj);
			}else {
				System.out.println("No Record found");
			}
				
		}*/catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
