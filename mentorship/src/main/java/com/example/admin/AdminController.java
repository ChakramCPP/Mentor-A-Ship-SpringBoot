package com.example.admin;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.associate.Associate;
import com.example.associate.AssociateRepository;
import com.example.mentor.MentorRepository;

@Controller
@CrossOrigin(origins = "http://localhost:4200")// This means that this class is a Controller
@RequestMapping(path="/admin") // This means URL's start with /demo (after Application path)
public class AdminController {

	@Autowired // This means to get the bean called userRepository
	private AdminServiceImpl adminService;

	private static Logger logger = LogManager.getLogger(AdminController.class);
	
	@GetMapping(path="/all")
	public @ResponseBody List<Admin> getAllAdmins() {
		return adminService.listAdmins();
	}
	
	@GetMapping(path="/available")
	public @ResponseBody List<Integer> availableMentors() {
		return adminService.availableMentors();
	}
	
	@PutMapping(path="/map")
	public @ResponseBody String mapMentors(@RequestParam Integer mid,
										   @RequestParam Integer asid){
		adminService.mapMentors(mid, asid);
		logger.info("INFO new Associate mapped to Mentor");
		return "ok";
	}
	
	@PutMapping(path="/update") 
	public @ResponseBody String update(@RequestBody Admin a) {
		
					return adminService.updateAdmin(a);
			}
	
}