package in.ineuron.main;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.Model.Employee;
import in.ineuron.util.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session =HibernateUtil.getSession();
		
		/*try {
			
			//Using list method to get the records
			//Query<Employee> query= session.createQuery("FROM in.ineuron.Model.Employee");
			//	List<Employee> employees = query.list();
			//  employees.forEach(employee->System.out.println(employee));
			
			
			//Using getResultList() to get the records
			Query<Employee> query= session.createQuery("FROM in.ineuron.Model.Employee WHERE eno>=:id1 AND eno<=:id2");
			query.setParameter("id1", 1);
			query.setParameter("id2", 8);
			List<Employee> empRecords = query.getResultList();
			empRecords.forEach(emp->System.out.println(emp));
			
			
		}*/
		
		// using iterate() to retrive the records
		try {
			Query<Employee> query= session.createQuery("FROM in.ineuron.Model.Employee");
			Iterator<Employee> itr = query.iterate();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
