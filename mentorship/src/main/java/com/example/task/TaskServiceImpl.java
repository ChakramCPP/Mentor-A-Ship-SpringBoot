package com.example.task;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	TaskRepositroy taskRepository;
	
	@Override
	@Transactional
	public List<Task> listTasks() {
		// TODO Auto-generated method stub
		
		
		return (List<Task>) taskRepository.findAll();
	}

	@Override
	@Transactional
	public String addTask(Task t) {
		
		taskRepository.save(t);
		return "Task added: "+t.getTname();
	}

	@Override
	@Transactional
	public String updateStatus(Integer id, Integer status) {
		
		if(taskRepository.updateTaskStatus(id, status) != null) {
			return "update successful";
		};
		return "update failed";
	}

	@Override
	@Transactional
	public List<Task> getAssociateTasks(Integer id) {
		Integer foo[] = {id};
		Iterable<Integer> fooBar = Arrays.asList(foo);
		//return taskRepository.findAllById(fooBar);
		return taskRepository.findByAssociateid(id);
		//taskRepository.findAll
	}

}
