package com.example.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.associate.Associate;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	@Transactional
	public List<Admin> listAdmins() {
		
		return adminRepository.findAll();
	}
	
	@Override
	@Transactional
	public String mapMentors(Integer mentor,Integer associate_id) {
		
		 System.out.println(adminRepository.mapMentor(mentor, associate_id));
		 return "ok";
	}

	@Override
	@Transactional
	public String updateAdmin(Admin a) {
		
		adminRepository.save(a);
		return "updated"+a.getAdname();
	}
	
	@Override
	@Transactional
	public List<Integer> availableMentors() {
		
		//System.out.println(adminRepository.availableMentors());
		return adminRepository.availableMentors();
	}
	
}
