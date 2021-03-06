package com.example.admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//CREATE TABLE admins( adid INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
//		 adname VARCHAR(20) NOT NULL,
//        ademail VARCHAR(30) NOT NULL UNIQUE,
//        adpwd VARCHAR(255) NOT NULL,
//        adphotograph varchar DEFAULT NULL);

@Entity
@Table(name="admins")
public class Admin {
	
	@Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Integer adid;
	  
	  private String adname;

	  private String ademail;
	  
	  private String adpwd;
	  
	  private String adphotograph;
	
	public Integer getAdid() {
		return adid;
	}

	public void setAdid(Integer adid) {
		this.adid = adid;
	}

	public String getAdname() {
		return adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
	}

	public String getAdemail() {
		return ademail;
	}

	public void setAdemail(String ademail) {
		this.ademail = ademail;
	}

	public String getAdpwd() {
		return adpwd;
	}

	public void setAdpwd(String adpwd) {
		this.adpwd = adpwd;
	}

	public String getAdphotograph() {
		return adphotograph;
	}

	public void setAdphotograph(String adphotograph) {
		this.adphotograph = adphotograph;
	}

  


  
}
