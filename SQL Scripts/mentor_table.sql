CREATE TABLE mentor( mentor_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
					 mname VARCHAR(20) NOT NULL,
                     email VARCHAR(30) NOT NULL,
                     organization VARCHAR(20) DEFAULT NULL,
                     role VARCHAR(20) DEFAULT NULL,
                     aoi VARCHAR(30) DEFAULT NULL,
                     expertise VARCHAR(30) DEFAULT NULL,
                     pwd VARCHAR(255) NOT NULL,
                     photograph BLOB DEFAULT NULL);
                     
SELECT * FROM mentor;

ALTER TABLE mentor
ADD UNIQUE (email);

insert into mentor VALUES(3,"krishna","hare1@iskcon.com","iskcon","preacher","chanting","lecture",
							"harekrishna",null);