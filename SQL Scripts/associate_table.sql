CREATE TABLE associate( ass_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
					 aname VARCHAR(20) NOT NULL,
                     email VARCHAR(30) NOT NULL UNIQUE,
                     pwd VARCHAR(255) NOT NULL,
                     photograph BLOB DEFAULT NULL);
                     

SELECT * FROM associate;
use mentorship;
describe associate;
insert into associate VALUES(4,"rama","haree@iskcon.com",
							"harekrishna",2,null);
                            
drop table associate;

alter table associate drop column photograph;

alter table associate add column image varchar(255);

update associate set mentor=2 where mentor=null;

