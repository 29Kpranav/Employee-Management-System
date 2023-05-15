package com.third.spring3.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.third.spring3.dao.managerDao;
import com.third.spring3.entity.manager;

@Service      //spring annotation
public class managerService {

	@Autowired
	private managerDao dao;
	
	public List<manager> getAllManagerDetails() {
		return dao.getAllManagerDetails();
	}

	public String insertManager(manager m) {
		return dao.insertManager(m);
	}
	
	public String updateManager(manager m) {
		return dao.updateManager(m);
	}
	
	public String DeleteManager(manager m) {
		return dao.updateManager(m);
	}
}
