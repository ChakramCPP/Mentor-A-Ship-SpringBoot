CREATE TABLE resources(rid INT auto_increment primary key,
					   tid INT NOT NULL,
					   rname VARCHAR(255) NOT NULL,
                       link VARCHAR(255) DEFAULT NULL,
                       FOREIGN KEY (tid)
						REFERENCES tasks (tid)
						ON UPDATE RESTRICT ON DELETE CASCADE);
                        
SELECT * FROM resources;
insert into resources VALUES(1,1,"book","asitis.com");