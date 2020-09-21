package com.example.task;

import java.util.List;
import java.util.Optional;

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

import com.example.admin.AdminController;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="/task")
public class TaskController {

	@Autowired 
	private TaskServiceImpl taskService;
	private static Logger logger = LogManager.getLogger(TaskController.class);

	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewTask(@RequestBody Task t) {
		logger.info("INFO new Task assigned to an Associate");

		return taskService.addTask(t);

	}

	@GetMapping(path="/all")
	public @ResponseBody List<Task> getAllUsers() {
	
			return taskService.listTasks();
	}
	
	@GetMapping(path="")
	public @ResponseBody List<Task> getAssTasks(@RequestParam Integer id) {
	
			return taskService.getAssociateTasks(id);
	}
	
	@PutMapping(path="") // Map ONLY POST Requests
	public @ResponseBody String updateStatus(
			@RequestParam Integer id,@RequestParam Integer status) {
		logger.info("INFO Associate updated the task status");
		 	System.out.println("update Task status");
			return taskService.updateStatus(id, status);
		
	}
	
}