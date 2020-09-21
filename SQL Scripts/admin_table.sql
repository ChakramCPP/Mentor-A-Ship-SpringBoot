CREATE TABLE admins( ad_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
					 ad_name VARCHAR(20) NOT NULL,
                     ad_email VARCHAR(30) NOT NULL UNIQUE,
                     ad_pwd VARCHAR(255) NOT NULL,
                     ad_photograph BLOB DEFAULT NULL);
                     
select * from admins;
use mentorship;

insert into admins(ad_name,ad_email,ad_pwd) values("Krishna","rao@gmail.com","rao@gmail.com");