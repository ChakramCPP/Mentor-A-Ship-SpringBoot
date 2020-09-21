package com.example.task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepositroy extends JpaRepository<Task, Integer> {
	
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Task t SET t.task_status = :task_status WHERE t.tid = :tid")
	Integer updateTaskStatus(@Param("tid") Integer id, @Param("task_status") Integer status);

	List<Task> findByAssociateid(Integer id);

}
