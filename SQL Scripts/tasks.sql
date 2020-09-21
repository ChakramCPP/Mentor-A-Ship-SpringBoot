CREATE TABLE tasks(tid INT AUTO_INCREMENT PRIMARY KEY,
				   tname VARCHAR(255) DEFAULT NULL,
                   associate_id INT UNSIGNED NOT NULL,
				   tdate VARCHAR(20) DEFAULT NULL,
                   task_status INT DEFAULT 0,
                   task_type VARCHAR(20) DEFAULT "TASK",
                   FOREIGN KEY (associate_id)
						REFERENCES associate (ass_id)
						ON UPDATE RESTRICT ON DELETE CASCADE);
                   
SHOW ENGINE INNODB STATUS;  

select * from tasks;  

insert into tasks VALUES(2,"rama",1,"14/09/1999",10,"course");

alter table tasks CHANGE column `associate_id` `associateid` INT UNSIGNED NOT NULL;