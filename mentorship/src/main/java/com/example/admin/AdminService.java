package com.example.admin;

import java.util.List;

public interface AdminService {
	
	public List<Admin> listAdmins();
	public String mapMentors(Integer mentor,Integer associate_id);
	public String updateAdmin(Admin a);
	public List<Integer>availableMentors();
}
