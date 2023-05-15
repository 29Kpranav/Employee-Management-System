package com.third.spring3.dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.third.spring3.entity.manager;

@Repository
public class managerDao {

	@Autowired            //creating object as well as establish connection 
	private SessionFactory sf;
	
	public  List<manager> getAllManagerDetails() {
		 Session session = sf.openSession();
		 Criteria criteria = session.createCriteria(manager.class);
		 List<manager> al = criteria.list();
		 return al;
	}

	public String insertManager(manager m) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(manager.class);
		Transaction tr = session.beginTransaction();
		session.save(m);
		tr.commit();
		return "Inserted Succesfully";
	}
	
	public String updateManager(manager m) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(manager.class);
		Transaction tr = session.beginTransaction();
		session.update(m);
		tr.commit();
		return "Updated Succesfully";
	}
	
	public String deleteManager(manager m) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(manager.class);
		Transaction tr = session.beginTransaction();
		manager x = session.load(manager.class, m.getId());
		session.delete(x);
		tr.commit();
		return "Deleted Succesfully";
	}
	
}






//@component
//@componentScan("com") for outside spring3 package