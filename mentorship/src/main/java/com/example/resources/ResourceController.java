package com.example.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="/resource")
public class ResourceController {

	@Autowired // This means to get the bean called userRepository
	private ResourceServiceImpl resourceService;

	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewResource(@RequestBody Resource r) {
		return resourceService.addResource(r);
			}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Resource> getAllUsers() {
	// This returns a JSON or XML with the users
	return resourceService.listResources();
	}
}