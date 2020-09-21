package com.example.task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

//CREATE TABLE tasks(tid INT AUTO_INCREMENT PRIMARY KEY,
//		   tname VARCHAR(255) DEFAULT NULL,
//        associate_id INT UNSIGNED NOT NULL,
//		   tdate VARCHAR(20) DEFAULT NULL,
//        task_status INT DEFAULT 0,
//        task_type VARCHAR(20) DEFAULT "TASK",
//        FOREIGN KEY (associate_id)
//				REFERENCES associate (ass_id)
//				ON UPDATE RESTRICT ON DELETE CASCADE);

@Entity
@Table(name="tasks")
@DynamicInsert

public class Task {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer tid;
  
  private String tname;
  
  private Integer associateid;
  
  private String tdate;
  
  @Column(columnDefinition = "int default 0")
  private Integer task_status;
  
  @Column(columnDefinition = "varchar(20) default 'task'")
  private String task_type;

  
  public Integer getTid() {
	return tid;
}

public void setTid(Integer tid) {
	this.tid = tid;
}


@Override
public String toString() {
	return "Task [tid=" + tid + ", tname=" + tname + ", associate_id=" + associateid + ", tdate=" + tdate
			+ ", task_status=" + task_status + ", task_type=" + task_type + "]";
}

public String getTdate() {
	return tdate;
}

public void setTdate(String tdate) {
	this.tdate = tdate;
}

public Integer getTask_status() {
	return task_status;
}

public void setTask_status(Integer task_status) {
	this.task_status = task_status;
}

public String getTask_type() {
	return task_type;
}

public void setTask_type(String task_type) {
	this.task_type = task_type;
}


public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public Integer getAssociateid() {
	return associateid;
}

public void setAssociateid(Integer associateid) {
	this.associateid = associateid;
}
  
  

}

