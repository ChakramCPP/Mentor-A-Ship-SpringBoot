package com.example.task;

import java.util.List;
import java.util.Optional;

//tid INT AUTO_INCREMENT PRIMARY KEY,
////tname VARCHAR(255) DEFAULT NULL,
////associate_id INT UNSIGNED NOT NULL,
////tdate VARCHAR(20) DEFAULT NULL,
////task_status INT DEFAULT 0,
////task_type VARCHAR(20) DEFAULT "TASK",
////FOREIGN KEY (associate_id)
////		REFERENCES associate (ass_id)
////		ON UPDATE RESTRICT ON DELETE CASCADE

public interface TaskService {
	public List<Task> listTasks();
	public String addTask(Task t);
	public String updateStatus(Integer id,Integer status);
	public List<Task> getAssociateTasks(Integer id);
}
