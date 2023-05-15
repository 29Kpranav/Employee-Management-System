package com.third.spring3.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.third.spring3.entity.manager;
import com.third.spring3.service.managerService;

@RestController       //springBoot
public class managerController {

	@Autowired          //spring
	private managerService ms;
	
	@GetMapping("alldetails")
	public List<manager> getAllManagerDetails(){
		System.out.println("In method");
		return ms.getAllManagerDetails();
	}
	@PostMapping("insertManager")
	public String insertManager(@RequestBody manager m) {
		return ms.insertManager(m);
	}
	@PutMapping("updateManager")
	public String updateManager(@RequestBody manager m) {
		return ms.updateManager(m);
	}
	@DeleteMapping("deleteManager")
	public String DeleteManager(@RequestBody manager m) {
		return ms.updateManager(m);
	}
}
